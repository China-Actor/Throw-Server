package generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.playmore.database.generator.ColumnMeta;
import com.playmore.database.generator.JavaKeyword;
import com.playmore.database.generator.TableMeta;
import com.playmore.database.generator.kit.StrKit;
import com.playmore.database.util.Str;

public class DaoModelGenerator {
	protected String packageTemplate = "package %s;%n%n";
	protected String importTemplate = "import java.sql.ResultSet;%nimport java.sql.SQLException;%nimport org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;%nimport com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;%nimport com.playmore.database.dao.MutiPrimaryKeyDBDaoImpl;%nimport com.playmore.database.dao.NoPrimaryKeyDBDaoImpl;%nimport com.playmore.database.dao.provider.SingleDBProvider;%nimport com.playmore.database.dao.provider.MutiDBProvider;%nimport java.util.ArrayList;%nimport java.util.Collection;%nimport java.util.Map;%nimport com.playmore.xysword.enumtype.DbType;%nimport java.util.concurrent.ConcurrentHashMap;%nimport %s.%s;%nimport java.util.List;%nimport com.playmore.util.DateUtil;%nimport org.springframework.stereotype.Component;%nimport org.springframework.beans.factory.annotation.Autowired;%n";
	protected String classDefineTemplate = "@Component%n";
	protected String factoryTemplate = "\tprivate static final %sDaoImpl DEFAULT = new\t%sDaoImpl();%n\tpublic static %sDaoImpl getDefault() {%n\t\treturn DEFAULT;%n\t}%n";
	protected String constructionTemplate = "\tprivate %sDaoImpl(int serverId){%n\t\tsuper(serverId);%n\t}%n";
	protected String supportMapTemplate = "\tprotected static Map<Integer, %sDaoImpl> supportMap = new ConcurrentHashMap<Integer, %sDaoImpl>();%n";
	protected String getDefaultTemplate = "\tpublic synchronized static %sDaoImpl getDefault(int serverId) {%n\t\t%sDaoImpl support = supportMap.get(serverId);%n\t\tif(support==null){%n\t\t\tsupport = new %sDaoImpl(serverId);%n\t\t\tsupportMap.put(serverId, support);%n\t\t}%n\t\treturn support;%n\t}%n";
	protected String mapRowTemplate_begin = "\tprotected %s createMapRow(ResultSet rs, int rowNum) throws SQLException{%n";
	protected String mapRowTemplate_data = "\t\t%s %s = rs.get%s(\"%s\");%n";
	protected String mapRowTemplate_create = "\t\t%s instance = new %s();%n";
	protected String mapRowTemplate_set = "\t\tinstance.set%s(%s);%n";
	protected String mapRowTemplate_end = "\t\treturn instance;%n\t}%n";
	protected String InsertSqlTemplate = "\tprotected String getInsertSql() {%n\t\treturn \"INSERT INTO %s (";
	protected String InsertSqlTemplate_values = ") VALUES(";
	protected String InsertSqlTemplate_end = ")\";%n\t}%n";
	protected String UpdateSqlTemplate = "\tprotected String getUpdateSql() {%n\t\treturn \"UPDATE %s SET ";
	protected String GetKeyTemplate = "\tprotected %s getKey(%s t){%n\t\treturn t.get%s();%n\t}%n";
	protected String GetKeyNameTemplate = "\tprotected String getKeyName(){%n\t\treturn \"%s\";%n\t}%n";
	protected String GetDbNameTemplate = "\tpublic String getDbName() {%n\t\treturn \"%s\";%n\t}%n";
	protected String GetDbTypeTemplate = "\tpublic String getDbType(){%n\t\treturn %s;%n\t}%n";
	protected String baseModelPackageName;
	protected String baseModelOutputDir;
	protected JavaKeyword javaKeyword = new JavaKeyword();
	String dbType = "";
	boolean isMutilDb = false;

	public DaoModelGenerator(String baseModelPackageName, String baseModelOutputDir) {
		if (StrKit.isBlank(baseModelPackageName)) {
			throw new IllegalArgumentException("baseModelPackageName can not be blank.");
		} else if (!baseModelPackageName.contains("/") && !baseModelPackageName.contains("\\")) {
			if (StrKit.isBlank(baseModelOutputDir)) {
				throw new IllegalArgumentException("baseModelOutputDir can not be blank.");
			} else {
				this.baseModelPackageName = baseModelPackageName;
				this.baseModelOutputDir = baseModelOutputDir;
			}
		} else {
			throw new IllegalArgumentException("baseModelPackageName error : " + baseModelPackageName);
		}
	}

	public void generate(List<TableMeta> tableMetas) throws Exception {
		System.out.println("Generate dao model ...");
		Iterator var3 = tableMetas.iterator();

		while (var3.hasNext()) {
			TableMeta tableMeta = (TableMeta) var3.next();
			this.genBaseModelContent(tableMeta);
		}

		this.wirtToFile(tableMetas);
	}

	protected void genBaseModelContent(TableMeta tableMeta) throws Exception {
		StringBuilder ret = new StringBuilder();
		this.genPackage(ret);
		this.genImport(tableMeta, ret);
		this.genClassDefine(tableMeta, ret);
		this.genSingleOrMutiDb(tableMeta, ret);
		if (!this.isMutilDb) {
			this.genFacotryMethod(tableMeta, ret);
		}

		if (this.isMutilDb) {
			this.genSupportMapMethod(tableMeta, ret);
		}

		if (this.isMutilDb) {
			this.genDefaultMethod(tableMeta, ret);
		}

		this.genMapRowBegin(tableMeta, ret);
		Iterator var4 = tableMeta.columnMetas.iterator();

		ColumnMeta columnMeta;
		while (var4.hasNext()) {
			columnMeta = (ColumnMeta) var4.next();
			this.genMapRowData(columnMeta, ret);
		}

		this.genMapRowCreate(tableMeta, ret);
		var4 = tableMeta.columnMetas.iterator();

		while (var4.hasNext()) {
			columnMeta = (ColumnMeta) var4.next();
			this.genMapRowSet(columnMeta, ret);
		}

		this.genMapRowEnd(tableMeta, ret);
		this.genInsertBegin(tableMeta, ret);
		int i = 0;

		Iterator var5;
		for (var5 = tableMeta.columnMetas.iterator(); var5.hasNext(); ++i) {
			columnMeta = (ColumnMeta) var5.next();
			ret.append("`" + columnMeta.name + "`");
			if (i != tableMeta.columnMetas.size() - 1) {
				ret.append(",");
			}
		}

		ret.append(this.InsertSqlTemplate_values);
		i = 0;

		for (var5 = tableMeta.columnMetas.iterator(); var5.hasNext(); ++i) {
			columnMeta = (ColumnMeta) var5.next();
			ret.append(":" + columnMeta.attrName);
			if (i != tableMeta.columnMetas.size() - 1) {
				ret.append(",");
			}
		}

		ret.append(String.format(this.InsertSqlTemplate_end));
		if (tableMeta.getPrimaryKeyCount() == 1) {
			this.genUpdateBegin(tableMeta, ret);
			this.genSinglePrimaryUpdateSql(tableMeta, ret);
		} else if (tableMeta.getPrimaryKeyCount() > 1) {
			this.genUpdateBegin(tableMeta, ret);
			this.genMutiPrimaryUpdateSql(tableMeta, ret);
		}

		this.genGetKey(tableMeta, ret);
		this.genGetKeyName(tableMeta, ret);
		this.genQueryByMutiPrimaryKey(tableMeta, ret);
		this.genGetDbName(tableMeta, ret);
		this.genGetDbTypeName(tableMeta, ret);
		ret.append(String.format("}%n"));
		tableMeta.baseModelContent = ret.toString();
	}

	private void genSinglePrimaryUpdateSql(TableMeta tableMeta, StringBuilder ret) throws Exception {
		int i = 0;
		Iterator var5 = tableMeta.columnMetas.iterator();

		while (var5.hasNext()) {
			ColumnMeta columnMeta = (ColumnMeta) var5.next();
			if (tableMeta.primaryKey.equals(columnMeta.name)) {
				++i;
			} else {
				ret.append("`" + columnMeta.name + "`");
				ret.append("=:" + columnMeta.attrName);
				if (i != tableMeta.columnMetas.size() - 1) {
					ret.append(",");
				}

				++i;
			}
		}

		ret.append(
				String.format(" WHERE %s=:%s\";%n\t}%n", tableMeta.primaryKey, tableMeta.getPrimaryColumnMeta().name));
	}

	private void genMutiPrimaryUpdateSql(TableMeta tableMeta, StringBuilder ret) {
		boolean isFirst = true;
		Iterator var5 = tableMeta.columnMetas.iterator();

		while (var5.hasNext()) {
			ColumnMeta columnMeta = (ColumnMeta) var5.next();
			if (!tableMeta.isPrimaryColumnMeta(columnMeta)) {
				if (isFirst) {
					isFirst = false;
				} else {
					ret.append(",");
				}

				ret.append("`" + columnMeta.name + "`");
				ret.append("=:" + columnMeta.attrName);
			}
		}

		ret.append(" WHERE ");
		Collection<ColumnMeta> primaryKeys = tableMeta.getAllPrimaryColumnMeta();
		isFirst = true;
		Iterator var6 = primaryKeys.iterator();

		while (true) {
			while (var6.hasNext()) {
				ColumnMeta columnMeta = (ColumnMeta) var6.next();
				if (isFirst) {
					isFirst = false;
				} else {
					ret.append(" AND ");
				}

				ret.append("`" + columnMeta.name + "`=");
				if (columnMeta.type != null && columnMeta.type.toLowerCase().endsWith("date")) {
					ret.append("date_format(:" + columnMeta.attrName + ",'%Y-%m-%d')");
				} else if (columnMeta.type == null || !columnMeta.type.toLowerCase().endsWith("datetime")
						&& !columnMeta.type.toLowerCase().endsWith("timestamp")) {
					ret.append(":" + columnMeta.attrName);
				} else {
					ret.append("date_format(:" + columnMeta.attrName + ",'%Y-%m-%d %h:%i:%s')");
				}
			}

			ret.append(String.format("\";%n\t}%n"));
			return;
		}
	}

	protected void genPackage(StringBuilder ret) {
		ret.append(String.format(this.packageTemplate, this.baseModelPackageName));
	}

	protected void genImport(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.importTemplate, StrKit.splitPackageName(this.baseModelPackageName),
				tableMeta.baseModelName));
	}

	protected void genClassDefine(TableMeta tableMeta, StringBuilder ret) throws Exception {
		String className;
		if (tableMeta.getPrimaryKeyCount() == 0) {
			className = "NoPrimaryKeyDBDaoImpl";
		} else if (tableMeta.getPrimaryKeyCount() == 1) {
			className = "SinglePrimaryKeyDBDaoImpl";
		} else {
			className = "MutiPrimaryKeyDBDaoImpl";
		}

		String str = this.classDefineTemplate + "public class %sDaoImpl extends " + className + "<%s>{%n%n";
		str+="\t@Autowired%n\tNamedParameterJdbcDaoSupport DaoSupport;%n%n";
		ret.append(String.format(str, tableMeta.baseModelName, tableMeta.baseModelName));
	}

	protected void genSingleOrMutiDb(TableMeta tableMeta, StringBuilder ret) {
		String str;
		if (this.isMutilDb) {
			str = "\tprivate int serverId;%n%n";
			ret.append(String.format(str));
			str = "\tprivate %sDaoImpl(int serverId){%n\t\tthis.serverId = serverId;%n\t}%n";
			ret.append(String.format(str, tableMeta.baseModelName));
			str = "\t@Override%n\tpublic NamedParameterJdbcDaoSupport getDaoSupport(String key) {%n\t\treturn MutiDBProvider.getDefault().getDaoSupport(key, serverId);%n\t}%n";
			ret.append(String.format(str));
		} else {
			str = "\t@Override%n\tpublic NamedParameterJdbcDaoSupport getDaoSupport(String key) {%n\t\treturn this.DaoSupport;%n\t}%n";
			ret.append(String.format(str));
		}

	}

	protected void genFacotryMethod(TableMeta tableMeta, StringBuilder ret) {
//		ret.append(String.format(this.factoryTemplate, tableMeta.baseModelName, tableMeta.baseModelName,
//				tableMeta.baseModelName));
	}

	protected void genSupportMapMethod(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.supportMapTemplate, tableMeta.baseModelName, tableMeta.baseModelName));
	}

	protected void genDefaultMethod(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.getDefaultTemplate, tableMeta.baseModelName, tableMeta.baseModelName,
				tableMeta.baseModelName));
	}

	protected void genMapRowBegin(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.mapRowTemplate_begin, tableMeta.baseModelName));
	}

	protected void genMapRowData(ColumnMeta columnMeta, StringBuilder ret) {
		String javaType = StrKit.getResultSet(columnMeta.javaType);
		ret.append(String.format(this.mapRowTemplate_data, columnMeta.javaType, columnMeta.attrName, javaType,
				columnMeta.name));
	}

	protected void genMapRowCreate(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.mapRowTemplate_create, tableMeta.baseModelName, tableMeta.baseModelName));
	}

	protected void genMapRowSet(ColumnMeta columnMeta, StringBuilder ret) {
		String columnName = StrKit.firstCharToUpperCase(columnMeta.attrName);
		ret.append(String.format(this.mapRowTemplate_set, columnName, columnMeta.attrName));
	}

	protected void genMapRowEnd(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.mapRowTemplate_end));
	}

	protected void genInsertBegin(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.InsertSqlTemplate, tableMeta.name));
	}

	protected void genUpdateBegin(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.UpdateSqlTemplate, tableMeta.name));
	}

	protected void genGetKey(TableMeta tableMeta, StringBuilder ret) throws Exception {
		if (tableMeta.getPrimaryKeyCount() != 0) {
			if (tableMeta.getPrimaryKeyCount() == 1) {
				ret.append(String.format(this.GetKeyTemplate, tableMeta.getPrimaryColumnMeta().javaType,
						tableMeta.baseModelName, Str.firstCharToUpperCase(tableMeta.getPrimaryColumnMeta().attrName)));
			} else {
				ret.append(String.format("\tprotected Object[] getKey(%s t){%n", tableMeta.baseModelName));
				ret.append("\t\treturn new Object[]{");
				Collection<ColumnMeta> allPrimary = tableMeta.getAllPrimaryColumnMeta();
				boolean isFirst = true;
				Iterator var6 = allPrimary.iterator();

				while (true) {
					while (var6.hasNext()) {
						ColumnMeta columnMeta = (ColumnMeta) var6.next();
						if (isFirst) {
							isFirst = false;
						} else {
							ret.append(",");
						}

						if (columnMeta.type != null && columnMeta.type.toLowerCase().endsWith("date")) {
							ret.append("DateUtil.date2FormatDate(");
							ret.append("t.get" + Str.firstCharToUpperCase(columnMeta.attrName) + "()");
							ret.append(",\"yyyy-MM-dd\")");
						} else if (columnMeta.type != null && (columnMeta.type.toLowerCase().endsWith("datetime")
								|| columnMeta.type.toLowerCase().endsWith("timestamp"))) {
							ret.append("DateUtil.date2FormatDate(");
							ret.append("t.get" + Str.firstCharToUpperCase(columnMeta.attrName) + "()");
							ret.append(",\"yyyy-MM-dd HH:mm:ss\")");
						} else {
							ret.append("t.get" + Str.firstCharToUpperCase(columnMeta.attrName) + "()");
						}
					}

					ret.append(String.format("};%n\t}%n"));
					break;
				}
			}

		}
	}

	protected void genGetKeyName(TableMeta tableMeta, StringBuilder ret) throws Exception {
		if (tableMeta.getPrimaryKeyCount() != 0) {
			if (tableMeta.getPrimaryKeyCount() == 1) {
				ret.append(String.format(this.GetKeyNameTemplate, tableMeta.getPrimaryColumnMeta().name,
						tableMeta.baseModelName));
			} else {
				ret.append(String.format("\tprotected Collection<String> getKeyName() {%n"));
				ret.append(String.format("\t\tCollection<String> list = new ArrayList<String>();%n"));
				Collection<ColumnMeta> allPrimary = tableMeta.getAllPrimaryColumnMeta();
				Iterator var5 = allPrimary.iterator();

				while (var5.hasNext()) {
					ColumnMeta meta = (ColumnMeta) var5.next();
					ret.append(String.format("\t\tlist.add(\"%s\");%n", meta.name));
				}

				ret.append(String.format("\t\treturn list;%n\t}%n"));
			}

		}
	}

	protected void genQueryByMutiPrimaryKey(TableMeta tableMeta, StringBuilder ret) {
		if (tableMeta.getPrimaryKeyCount() > 1) {
			ret.append(String.format("\tpublic Collection<%s> queryByPrimary(", tableMeta.baseModelName));
			Collection<ColumnMeta> allPrimary = tableMeta.getAllPrimaryColumnMeta();
			boolean isFirst = true;

			ColumnMeta columnMeta;
			Iterator var6;
			for (var6 = allPrimary.iterator(); var6.hasNext(); ret
					.append(columnMeta.javaType + " " + columnMeta.attrName)) {
				columnMeta = (ColumnMeta) var6.next();
				if (isFirst) {
					isFirst = false;
				} else {
					ret.append(",");
				}
			}

			ret.append(String.format("){%n"));
			ret.append("\t\treturn queryByKeys(getKeyName(), ");
			isFirst = true;
			var6 = allPrimary.iterator();

			while (true) {
				while (var6.hasNext()) {
					columnMeta = (ColumnMeta) var6.next();
					if (isFirst) {
						isFirst = false;
					} else {
						ret.append(",");
					}

					if (columnMeta.type != null && columnMeta.type.toLowerCase().endsWith("date")) {
						ret.append(" DateUtil.date2FormatDate(" + columnMeta.attrName + ",\"yyyy-MM-dd\")");
					} else if (columnMeta.type == null || !columnMeta.type.toLowerCase().endsWith("datetime")
							&& !columnMeta.type.toLowerCase().endsWith("timestamp")) {
						if (columnMeta.javaType.endsWith("String")) {
							ret.append(" " + columnMeta.attrName);
						} else {
							ret.append(" String.valueOf(" + columnMeta.attrName + ")");
						}
					} else {
						ret.append(" DateUtil.date2FormatDate(" + columnMeta.attrName + ",\"yyyy-MM-dd HH:mm:ss\")");
					}
				}

				ret.append(String.format(");%n"));
				ret.append(String.format("\t}%n"));
				return;
			}
		}
	}

	protected void genGetDbName(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.GetDbNameTemplate, tableMeta.name));
	}

	protected void genGetDbTypeName(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(this.GetDbTypeTemplate, this.dbType));
	}

	protected void wirtToFile(List<TableMeta> tableMetas) {
		try {
			Iterator var3 = tableMetas.iterator();

			while (var3.hasNext()) {
				TableMeta tableMeta = (TableMeta) var3.next();
				this.writeToFile(tableMeta);
			}

		} catch (IOException var4) {
			throw new RuntimeException(var4);
		}
	}

	protected void writeToFile(TableMeta tableMeta) throws IOException {
		File dir = new File(this.baseModelOutputDir);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		String target = this.baseModelOutputDir + File.separator + tableMeta.baseModelName + "DaoImpl" + ".java";
		FileWriter fw = new FileWriter(target);

		try {
			fw.write(tableMeta.baseModelContent);
		} finally {
			fw.close();
		}

	}

	public void setIsMutilDb(boolean isMutilDb) {
		this.isMutilDb = isMutilDb;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
}
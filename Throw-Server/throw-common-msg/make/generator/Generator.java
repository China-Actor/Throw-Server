package generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import com.jfinal.plugin.activerecord.dialect.Dialect;
import com.playmore.database.generator.LoggerGenerator;
import com.playmore.database.generator.MetaBuilder;
import com.playmore.database.generator.TableMeta;
import com.playmore.database.generator.TypeMapping;

public class Generator {
	protected MetaBuilder metaBuilder;
	protected BaseModelGenerator baseModelGenerator;
	protected DaoModelGenerator daoModelGenerator;
	protected DBQueueModelGenerator dBQueueModelGenerator;
	protected ManagerModelGenerator managerModelGenerator;
	protected LoggerGenerator loggerGenerator;
	private boolean isGenDao;
	private boolean isGenQueue;
	private boolean isGenManager;
	private boolean isGenLogger;
	private Filter filter;

	public void addFilter(Filter filter) {
		this.filter = filter;
	}

	public Generator(DataSource dataSource, String baseModelPackageName, String baseModelOutputDir) {
		this(dataSource, new BaseModelGenerator(baseModelPackageName, baseModelOutputDir),
				new DaoModelGenerator(baseModelPackageName + ".dao", baseModelOutputDir + "/dao"),
				new DBQueueModelGenerator(baseModelPackageName + ".queue", baseModelOutputDir + "/queue"),
				new ManagerModelGenerator(baseModelPackageName + ".manager", baseModelOutputDir + "/manager"),
				new LoggerGenerator(baseModelPackageName + ".logger", baseModelOutputDir + "/logger"));
	}

	private Generator(DataSource dataSource, BaseModelGenerator baseModelGenerator, DaoModelGenerator daoModelGenerator,
			DBQueueModelGenerator dBQueueModelGenerator, ManagerModelGenerator managerModelGenerator,
			LoggerGenerator loggerGenerator) {
		this.isGenDao = true;
		this.isGenQueue = true;
		this.isGenManager = false;
		this.isGenLogger = false;
		this.filter = null;
		if (dataSource == null) {
			throw new IllegalArgumentException("dataSource can not be null.");
		} else if (baseModelGenerator == null) {
			throw new IllegalArgumentException("baseModelGenerator can not be null.");
		} else {
			this.metaBuilder = new MetaBuilder(dataSource);
			this.baseModelGenerator = baseModelGenerator;
			this.daoModelGenerator = daoModelGenerator;
			this.dBQueueModelGenerator = dBQueueModelGenerator;
			this.managerModelGenerator = managerModelGenerator;
			this.loggerGenerator = loggerGenerator;
		}
	}

	public void setMetaBuilder(MetaBuilder metaBuilder) {
		if (metaBuilder != null) {
			this.metaBuilder = metaBuilder;
		}

	}

	public void setTypeMapping(TypeMapping typeMapping) {
		this.metaBuilder.setTypeMapping(typeMapping);
	}

	public void setDialect(Dialect dialect) {
		this.metaBuilder.setDialect(dialect);
	}

	public void setRemovedTableNamePrefixes(String... removedTableNamePrefixes) {
		this.metaBuilder.setRemovedTableNamePrefixes(removedTableNamePrefixes);
	}

	public void addExcludedTable(String... excludedTables) {
		this.metaBuilder.addExcludedTable(excludedTables);
	}

	public void generate() {
		long start = System.currentTimeMillis();
		List<TableMeta> temp = this.metaBuilder.build();
		if (temp.size() == 0) {
			System.out.println("TableMeta 数量为 0，不生成任何文件");
		} else {
			List<TableMeta> tableMetas = new ArrayList();
			Iterator var6 = temp.iterator();

			while (true) {
				TableMeta table;
				do {
					if (!var6.hasNext()) {
						try {
							this.baseModelGenerator.generate(tableMetas);
							if (this.isGenDao) {
								this.daoModelGenerator.generate(tableMetas);
							}

							if (this.isGenQueue) {
								this.dBQueueModelGenerator.generate(tableMetas);
							}

							if (this.isGenManager) {
								this.managerModelGenerator.generate(tableMetas);
							}

							if (this.isGenLogger) {
								this.loggerGenerator.generate(tableMetas);
							}

							long usedTime = (System.currentTimeMillis() - start) / 1000L;
							System.out.println("Generate complete in " + usedTime + " seconds.");
						} catch (Exception var7) {
							var7.printStackTrace();
						}

						return;
					}

					table = (TableMeta) var6.next();
				} while (this.filter != null && this.filter.isFilter(table.name));

				tableMetas.add(table);
			}
		}
	}

	public void setGenLogger(boolean isGenLogger) {
		this.isGenLogger = isGenLogger;
	}

	public void setGenDao(boolean isGenDao) {
		this.isGenDao = isGenDao;
	}

	public void setGenQueue(boolean isGenQueue) {
		this.isGenQueue = isGenQueue;
	}

	public void setGenManager(boolean isGenManager) {
		this.isGenManager = isGenManager;
	}

	public void setIsMutilDb(boolean isMutilDb) {
		this.daoModelGenerator.setIsMutilDb(isMutilDb);
	}

	public void setDbType(String dbType) {
		this.daoModelGenerator.setDbType(dbType);
	}
	
	public static abstract interface Filter
	  {
	    public abstract boolean isFilter(String paramString);
	  }
	
}
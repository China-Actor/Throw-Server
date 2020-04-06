package com.playmore.dbobject.staticdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;
import com.playmore.database.dao.MutiPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.NoPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.dao.provider.MutiDBProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.playmore.xysword.enumtype.DbType;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.GradeS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GradeSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GradeS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GradeSDaoImpl DEFAULT = new	GradeSDaoImpl();
	public static GradeSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GradeS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Float value = rs.getFloat("value");
		java.lang.String field = rs.getString("field");
		GradeS instance = new GradeS();
		instance.setId(id);
		instance.setValue(value);
		instance.setField(field);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO grade_s (`id`,`value`,`field`) VALUES(:id,:value,:field)";
	}
	protected String getUpdateSql() {
		return "UPDATE grade_s SET `value`=:value,`field`=:field WHERE id=:id";
	}
	protected java.lang.Integer getKey(GradeS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "grade_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

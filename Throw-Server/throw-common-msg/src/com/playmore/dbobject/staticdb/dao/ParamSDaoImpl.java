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
import com.playmore.dbobject.staticdb.ParamS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ParamSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ParamS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ParamSDaoImpl DEFAULT = new	ParamSDaoImpl();
	public static ParamSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ParamS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String key = rs.getString("key");
		java.lang.String param = rs.getString("param");
		java.lang.String desc = rs.getString("desc");
		ParamS instance = new ParamS();
		instance.setId(id);
		instance.setKey(key);
		instance.setParam(param);
		instance.setDesc(desc);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO param_s (`id`,`key`,`param`,`desc`) VALUES(:id,:key,:param,:desc)";
	}
	protected String getUpdateSql() {
		return "UPDATE param_s SET `key`=:key,`param`=:param,`desc`=:desc WHERE id=:id";
	}
	protected java.lang.Integer getKey(ParamS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "param_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

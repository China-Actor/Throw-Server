package com.playmore.dbobject.gameserver.dao;

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
import com.playmore.dbobject.gameserver.IdWorkerTime;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class IdWorkerTimeDaoImpl extends SinglePrimaryKeyDBDaoImpl<IdWorkerTime>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final IdWorkerTimeDaoImpl DEFAULT = new	IdWorkerTimeDaoImpl();
	public static IdWorkerTimeDaoImpl getDefault() {
		return DEFAULT;
	}
	protected IdWorkerTime createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String lastTimeStamp = rs.getString("last_time_stamp");
		IdWorkerTime instance = new IdWorkerTime();
		instance.setId(id);
		instance.setLastTimeStamp(lastTimeStamp);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO id_worker_time (`id`,`last_time_stamp`) VALUES(:id,:lastTimeStamp)";
	}
	protected String getUpdateSql() {
		return "UPDATE id_worker_time SET `last_time_stamp`=:lastTimeStamp WHERE id=:id";
	}
	protected java.lang.Integer getKey(IdWorkerTime t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "id_worker_time";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

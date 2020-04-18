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
import com.playmore.dbobject.gameserver.ServerTime;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerTimeDaoImpl extends SinglePrimaryKeyDBDaoImpl<ServerTime>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ServerTimeDaoImpl DEFAULT = new	ServerTimeDaoImpl();
	public static ServerTimeDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ServerTime createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String arenaReasonResetTime = rs.getString("arena_reason_reset_time");
		java.lang.String arenaResetTime = rs.getString("arena_reset_time");
		java.lang.String arenaHighTimeStart = rs.getString("arena_high_time_start");
		ServerTime instance = new ServerTime();
		instance.setId(id);
		instance.setArenaReasonResetTime(arenaReasonResetTime);
		instance.setArenaResetTime(arenaResetTime);
		instance.setArenaHighTimeStart(arenaHighTimeStart);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO server_time (`id`,`arena_reason_reset_time`,`arena_reset_time`,`arena_high_time_start`) VALUES(:id,:arenaReasonResetTime,:arenaResetTime,:arenaHighTimeStart)";
	}
	protected String getUpdateSql() {
		return "UPDATE server_time SET `arena_reason_reset_time`=:arenaReasonResetTime,`arena_reset_time`=:arenaResetTime,`arena_high_time_start`=:arenaHighTimeStart WHERE id=:id";
	}
	protected java.lang.Long getKey(ServerTime t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "server_time";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

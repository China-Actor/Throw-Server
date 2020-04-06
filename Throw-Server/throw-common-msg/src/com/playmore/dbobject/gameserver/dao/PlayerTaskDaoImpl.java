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
import com.playmore.dbobject.gameserver.PlayerTask;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTaskDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerTask>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerTaskDaoImpl DEFAULT = new	PlayerTaskDaoImpl();
	public static PlayerTaskDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerTask createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer taskId = rs.getInt("task_id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer cp = rs.getInt("cp");
		java.lang.Integer np = rs.getInt("np");
		java.lang.Integer value = rs.getInt("value");
		java.lang.Boolean receiveStatus = rs.getBoolean("receive_status");
		java.lang.String insertTime = rs.getString("insert_time");
		PlayerTask instance = new PlayerTask();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setTaskId(taskId);
		instance.setType(type);
		instance.setCp(cp);
		instance.setNp(np);
		instance.setValue(value);
		instance.setReceiveStatus(receiveStatus);
		instance.setInsertTime(insertTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_task (`id`,`player_id`,`task_id`,`type`,`cp`,`np`,`value`,`receive_status`,`insert_time`) VALUES(:id,:playerId,:taskId,:type,:cp,:np,:value,:receiveStatus,:insertTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_task SET `player_id`=:playerId,`task_id`=:taskId,`type`=:type,`cp`=:cp,`np`=:np,`value`=:value,`receive_status`=:receiveStatus,`insert_time`=:insertTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerTask t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_task";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

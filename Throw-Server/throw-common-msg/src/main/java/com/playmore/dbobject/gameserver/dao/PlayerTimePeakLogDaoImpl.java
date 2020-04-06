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
import com.playmore.dbobject.gameserver.PlayerTimePeakLog;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerTimePeakLogDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerTimePeakLog>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerTimePeakLog createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("playerId");
		java.lang.Integer mapId = rs.getInt("map_id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String languageKey = rs.getString("languageKey");
		java.lang.String params = rs.getString("params");
		java.lang.String createTime = rs.getString("create_time");
		PlayerTimePeakLog instance = new PlayerTimePeakLog();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setMapId(mapId);
		instance.setType(type);
		instance.setLanguageKey(languageKey);
		instance.setParams(params);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_time_peak_log (`id`,`playerId`,`map_id`,`type`,`languageKey`,`params`,`create_time`) VALUES(:id,:playerId,:mapId,:type,:languageKey,:params,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_time_peak_log SET `playerId`=:playerId,`map_id`=:mapId,`type`=:type,`languageKey`=:languageKey,`params`=:params,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerTimePeakLog t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_time_peak_log";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

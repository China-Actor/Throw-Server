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
import com.playmore.dbobject.gameserver.PlayerArena;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerArenaDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerArena>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerArena createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer totalScore = rs.getInt("total_score");
		java.lang.Long power = rs.getLong("power");
		java.lang.Integer count = rs.getInt("count");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String updateTime = rs.getString("update_time");
		PlayerArena instance = new PlayerArena();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setPlayerId(playerId);
		instance.setTotalScore(totalScore);
		instance.setPower(power);
		instance.setCount(count);
		instance.setCreateTime(createTime);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_arena (`id`,`server_id`,`player_id`,`total_score`,`power`,`count`,`create_time`,`update_time`) VALUES(:id,:serverId,:playerId,:totalScore,:power,:count,:createTime,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_arena SET `server_id`=:serverId,`player_id`=:playerId,`total_score`=:totalScore,`power`=:power,`count`=:count,`create_time`=:createTime,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerArena t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_arena";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

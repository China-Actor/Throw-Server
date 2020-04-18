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
import com.playmore.dbobject.gameserver.PlayerFriendApply;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerFriendApplyDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerFriendApply>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerFriendApply createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long applyPlayerId = rs.getLong("apply_player_id");
		java.lang.Integer applyServerId = rs.getInt("apply_server_id");
		java.lang.String createTime = rs.getString("create_time");
		PlayerFriendApply instance = new PlayerFriendApply();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setApplyPlayerId(applyPlayerId);
		instance.setApplyServerId(applyServerId);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_friend_apply (`id`,`player_id`,`apply_player_id`,`apply_server_id`,`create_time`) VALUES(:id,:playerId,:applyPlayerId,:applyServerId,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_friend_apply SET `player_id`=:playerId,`apply_player_id`=:applyPlayerId,`apply_server_id`=:applyServerId,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerFriendApply t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_friend_apply";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

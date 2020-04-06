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
import com.playmore.dbobject.gameserver.PlayerFriendBlack;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerFriendBlackDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerFriendBlack>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerFriendBlack createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long backPlayerId = rs.getLong("back_player_id");
		java.lang.Integer backServerId = rs.getInt("back_server_id");
		java.lang.String createTime = rs.getString("create_time");
		PlayerFriendBlack instance = new PlayerFriendBlack();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setBackPlayerId(backPlayerId);
		instance.setBackServerId(backServerId);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_friend_black (`id`,`player_id`,`back_player_id`,`back_server_id`,`create_time`) VALUES(:id,:playerId,:backPlayerId,:backServerId,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_friend_black SET `player_id`=:playerId,`back_player_id`=:backPlayerId,`back_server_id`=:backServerId,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerFriendBlack t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_friend_black";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerFriend;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerFriend>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerFriendDaoImpl DEFAULT = new	PlayerFriendDaoImpl();
	public static PlayerFriendDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerFriend createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long friendId = rs.getLong("friend_id");
		java.lang.Integer friendServerId = rs.getInt("friend_server_id");
		java.lang.String updateTime = rs.getString("update_time");
		PlayerFriend instance = new PlayerFriend();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setFriendId(friendId);
		instance.setFriendServerId(friendServerId);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_friend (`id`,`player_id`,`friend_id`,`friend_server_id`,`update_time`) VALUES(:id,:playerId,:friendId,:friendServerId,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_friend SET `player_id`=:playerId,`friend_id`=:friendId,`friend_server_id`=:friendServerId,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerFriend t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_friend";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

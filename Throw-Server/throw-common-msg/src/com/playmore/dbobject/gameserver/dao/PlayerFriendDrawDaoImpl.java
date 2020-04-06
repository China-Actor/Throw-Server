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
import com.playmore.dbobject.gameserver.PlayerFriendDraw;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendDrawDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerFriendDraw>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerFriendDrawDaoImpl DEFAULT = new	PlayerFriendDrawDaoImpl();
	public static PlayerFriendDrawDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerFriendDraw createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long friendId = rs.getLong("friend_id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Boolean draw = rs.getBoolean("draw");
		java.lang.String updateTime = rs.getString("update_time");
		PlayerFriendDraw instance = new PlayerFriendDraw();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setFriendId(friendId);
		instance.setServerId(serverId);
		instance.setDraw(draw);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_friend_draw (`id`,`player_id`,`friend_id`,`server_id`,`draw`,`update_time`) VALUES(:id,:playerId,:friendId,:serverId,:draw,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_friend_draw SET `player_id`=:playerId,`friend_id`=:friendId,`server_id`=:serverId,`draw`=:draw,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerFriendDraw t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_friend_draw";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

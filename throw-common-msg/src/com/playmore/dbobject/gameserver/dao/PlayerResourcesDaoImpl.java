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
import com.playmore.dbobject.gameserver.PlayerResources;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerResourcesDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerResources>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerResourcesDaoImpl DEFAULT = new	PlayerResourcesDaoImpl();
	public static PlayerResourcesDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerResources createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Long gold = rs.getLong("gold");
		java.lang.Integer diamondsPaid = rs.getInt("diamonds_paid");
		java.lang.Integer diamonds = rs.getInt("diamonds");
		java.lang.Integer liveElite = rs.getInt("live_elite");
		java.lang.Integer friendshipPoint = rs.getInt("friendship_point");
		java.lang.Integer guildCoin = rs.getInt("guild_coin");
		java.lang.Integer dismissCoin = rs.getInt("dismiss_coin");
		java.lang.Integer mazeCoin = rs.getInt("maze_coin");
		java.lang.Integer arenaCoin = rs.getInt("arena_coin");
		PlayerResources instance = new PlayerResources();
		instance.setPid(pid);
		instance.setGold(gold);
		instance.setDiamondsPaid(diamondsPaid);
		instance.setDiamonds(diamonds);
		instance.setLiveElite(liveElite);
		instance.setFriendshipPoint(friendshipPoint);
		instance.setGuildCoin(guildCoin);
		instance.setDismissCoin(dismissCoin);
		instance.setMazeCoin(mazeCoin);
		instance.setArenaCoin(arenaCoin);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_resources (`pid`,`gold`,`diamonds_paid`,`diamonds`,`live_elite`,`friendship_point`,`guild_coin`,`dismiss_coin`,`maze_coin`,`arena_coin`) VALUES(:pid,:gold,:diamondsPaid,:diamonds,:liveElite,:friendshipPoint,:guildCoin,:dismissCoin,:mazeCoin,:arenaCoin)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_resources SET `gold`=:gold,`diamonds_paid`=:diamondsPaid,`diamonds`=:diamonds,`live_elite`=:liveElite,`friendship_point`=:friendshipPoint,`guild_coin`=:guildCoin,`dismiss_coin`=:dismissCoin,`maze_coin`=:mazeCoin,`arena_coin`=:arenaCoin WHERE pid=:pid";
	}
	protected java.lang.Long getKey(PlayerResources t){
		return t.getPid();
	}
	protected String getKeyName(){
		return "pid";
	}
	public String getDbName() {
		return "player_resources";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

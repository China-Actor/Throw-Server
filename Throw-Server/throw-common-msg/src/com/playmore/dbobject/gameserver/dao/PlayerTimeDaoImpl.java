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
import com.playmore.dbobject.gameserver.PlayerTime;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTimeDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerTime>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerTimeDaoImpl DEFAULT = new	PlayerTimeDaoImpl();
	public static PlayerTimeDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerTime createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String mazeResetTime = rs.getString("maze_reset_time");
		java.lang.String taskDayResetTime = rs.getString("task_day_reset_time");
		java.lang.String taskWeekResetTime = rs.getString("task_week_reset_time");
		java.lang.String offerRewardResetTime = rs.getString("offer_reward_reset_time");
		java.lang.String arenaResetTime = rs.getString("arena_reset_time");
		java.lang.String arenaReasonResetTime = rs.getString("arena_reason_reset_time");
		java.lang.String battlePassTaskTime = rs.getString("battle_pass_task_time");
		java.lang.String battlePassMazeTime = rs.getString("battle_pass_maze_time");
		java.lang.String shopNormalEndTime = rs.getString("shop_normal_end_time");
		java.lang.String shopGuildEndTime = rs.getString("shop_guild_end_time");
		java.lang.String shopFriendEndTime = rs.getString("shop_friend_end_time");
		java.lang.String shopMazeEndTime = rs.getString("shop_maze_end_time");
		java.lang.String shopArenHighEndTime = rs.getString("shop_aren_high_end_time");
		PlayerTime instance = new PlayerTime();
		instance.setId(id);
		instance.setMazeResetTime(mazeResetTime);
		instance.setTaskDayResetTime(taskDayResetTime);
		instance.setTaskWeekResetTime(taskWeekResetTime);
		instance.setOfferRewardResetTime(offerRewardResetTime);
		instance.setArenaResetTime(arenaResetTime);
		instance.setArenaReasonResetTime(arenaReasonResetTime);
		instance.setBattlePassTaskTime(battlePassTaskTime);
		instance.setBattlePassMazeTime(battlePassMazeTime);
		instance.setShopNormalEndTime(shopNormalEndTime);
		instance.setShopGuildEndTime(shopGuildEndTime);
		instance.setShopFriendEndTime(shopFriendEndTime);
		instance.setShopMazeEndTime(shopMazeEndTime);
		instance.setShopArenHighEndTime(shopArenHighEndTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_time (`id`,`maze_reset_time`,`task_day_reset_time`,`task_week_reset_time`,`offer_reward_reset_time`,`arena_reset_time`,`arena_reason_reset_time`,`battle_pass_task_time`,`battle_pass_maze_time`,`shop_normal_end_time`,`shop_guild_end_time`,`shop_friend_end_time`,`shop_maze_end_time`,`shop_aren_high_end_time`) VALUES(:id,:mazeResetTime,:taskDayResetTime,:taskWeekResetTime,:offerRewardResetTime,:arenaResetTime,:arenaReasonResetTime,:battlePassTaskTime,:battlePassMazeTime,:shopNormalEndTime,:shopGuildEndTime,:shopFriendEndTime,:shopMazeEndTime,:shopArenHighEndTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_time SET `maze_reset_time`=:mazeResetTime,`task_day_reset_time`=:taskDayResetTime,`task_week_reset_time`=:taskWeekResetTime,`offer_reward_reset_time`=:offerRewardResetTime,`arena_reset_time`=:arenaResetTime,`arena_reason_reset_time`=:arenaReasonResetTime,`battle_pass_task_time`=:battlePassTaskTime,`battle_pass_maze_time`=:battlePassMazeTime,`shop_normal_end_time`=:shopNormalEndTime,`shop_guild_end_time`=:shopGuildEndTime,`shop_friend_end_time`=:shopFriendEndTime,`shop_maze_end_time`=:shopMazeEndTime,`shop_aren_high_end_time`=:shopArenHighEndTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerTime t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_time";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

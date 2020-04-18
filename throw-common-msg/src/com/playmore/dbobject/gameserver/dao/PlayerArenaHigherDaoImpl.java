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
import com.playmore.dbobject.gameserver.PlayerArenaHigher;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaHigherDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerArenaHigher>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerArenaHigherDaoImpl DEFAULT = new	PlayerArenaHigherDaoImpl();
	public static PlayerArenaHigherDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerArenaHigher createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer rankId = rs.getInt("rank_id");
		java.lang.Integer totalScore = rs.getInt("total_score");
		java.lang.Long defencePower = rs.getLong("defence_power");
		java.lang.Integer count = rs.getInt("count");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String updateTime = rs.getString("update_time");
		java.lang.String scoreUpdateTime = rs.getString("score_update_time");
		java.lang.String badgeUpdateTime = rs.getString("badge_update_time");
		java.lang.String boxReceiveTime = rs.getString("box_receive_time");
		java.lang.Integer dailyBuyCount = rs.getInt("daily_buy_count");
		java.lang.String buyTime = rs.getString("buy_time");
		PlayerArenaHigher instance = new PlayerArenaHigher();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setPlayerId(playerId);
		instance.setRankId(rankId);
		instance.setTotalScore(totalScore);
		instance.setDefencePower(defencePower);
		instance.setCount(count);
		instance.setCreateTime(createTime);
		instance.setUpdateTime(updateTime);
		instance.setScoreUpdateTime(scoreUpdateTime);
		instance.setBadgeUpdateTime(badgeUpdateTime);
		instance.setBoxReceiveTime(boxReceiveTime);
		instance.setDailyBuyCount(dailyBuyCount);
		instance.setBuyTime(buyTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_arena_higher (`id`,`server_id`,`player_id`,`rank_id`,`total_score`,`defence_power`,`count`,`create_time`,`update_time`,`score_update_time`,`badge_update_time`,`box_receive_time`,`daily_buy_count`,`buy_time`) VALUES(:id,:serverId,:playerId,:rankId,:totalScore,:defencePower,:count,:createTime,:updateTime,:scoreUpdateTime,:badgeUpdateTime,:boxReceiveTime,:dailyBuyCount,:buyTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_arena_higher SET `server_id`=:serverId,`player_id`=:playerId,`rank_id`=:rankId,`total_score`=:totalScore,`defence_power`=:defencePower,`count`=:count,`create_time`=:createTime,`update_time`=:updateTime,`score_update_time`=:scoreUpdateTime,`badge_update_time`=:badgeUpdateTime,`box_receive_time`=:boxReceiveTime,`daily_buy_count`=:dailyBuyCount,`buy_time`=:buyTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerArenaHigher t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_arena_higher";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

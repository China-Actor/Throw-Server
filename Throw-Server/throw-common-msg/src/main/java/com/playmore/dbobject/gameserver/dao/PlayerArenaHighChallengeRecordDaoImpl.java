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
import com.playmore.dbobject.gameserver.PlayerArenaHighChallengeRecord;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerArenaHighChallengeRecordDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerArenaHighChallengeRecord>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerArenaHighChallengeRecord createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long bePlayerId = rs.getLong("be_player_id");
		java.lang.Boolean isWin = rs.getBoolean("is_win");
		java.lang.Integer rankId = rs.getInt("rank_id");
		java.lang.Integer beRankId = rs.getInt("be_rank_id");
		java.lang.String chanllegeTime = rs.getString("chanllege_time");
		java.lang.String recordJson = rs.getString("record_json");
		PlayerArenaHighChallengeRecord instance = new PlayerArenaHighChallengeRecord();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setBePlayerId(bePlayerId);
		instance.setIsWin(isWin);
		instance.setRankId(rankId);
		instance.setBeRankId(beRankId);
		instance.setChanllegeTime(chanllegeTime);
		instance.setRecordJson(recordJson);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_arena_high_challenge_record (`id`,`player_id`,`be_player_id`,`is_win`,`rank_id`,`be_rank_id`,`chanllege_time`,`record_json`) VALUES(:id,:playerId,:bePlayerId,:isWin,:rankId,:beRankId,:chanllegeTime,:recordJson)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_arena_high_challenge_record SET `player_id`=:playerId,`be_player_id`=:bePlayerId,`is_win`=:isWin,`rank_id`=:rankId,`be_rank_id`=:beRankId,`chanllege_time`=:chanllegeTime,`record_json`=:recordJson WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerArenaHighChallengeRecord t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_arena_high_challenge_record";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerArenaChallengeRecord;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerArenaChallengeRecordDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerArenaChallengeRecord>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerArenaChallengeRecord createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long bePlayerId = rs.getLong("be_player_id");
		java.lang.Integer score = rs.getInt("score");
		java.lang.Integer beScore = rs.getInt("be_score");
		java.lang.Integer totalScore = rs.getInt("total_score");
		java.lang.Integer totalBeScore = rs.getInt("total_be_score");
		java.lang.String chanllegeTime = rs.getString("chanllege_time");
		PlayerArenaChallengeRecord instance = new PlayerArenaChallengeRecord();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setBePlayerId(bePlayerId);
		instance.setScore(score);
		instance.setBeScore(beScore);
		instance.setTotalScore(totalScore);
		instance.setTotalBeScore(totalBeScore);
		instance.setChanllegeTime(chanllegeTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_arena_challenge_record (`id`,`player_id`,`be_player_id`,`score`,`be_score`,`total_score`,`total_be_score`,`chanllege_time`) VALUES(:id,:playerId,:bePlayerId,:score,:beScore,:totalScore,:totalBeScore,:chanllegeTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_arena_challenge_record SET `player_id`=:playerId,`be_player_id`=:bePlayerId,`score`=:score,`be_score`=:beScore,`total_score`=:totalScore,`total_be_score`=:totalBeScore,`chanllege_time`=:chanllegeTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerArenaChallengeRecord t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_arena_challenge_record";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

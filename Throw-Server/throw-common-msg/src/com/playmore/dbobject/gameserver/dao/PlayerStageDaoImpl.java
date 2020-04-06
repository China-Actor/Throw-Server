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
import com.playmore.dbobject.gameserver.PlayerStage;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerStageDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerStage>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerStageDaoImpl DEFAULT = new	PlayerStageDaoImpl();
	public static PlayerStageDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerStage createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer chapterId = rs.getInt("chapter_id");
		java.lang.Integer stageId = rs.getInt("stage_id");
		java.lang.Long power = rs.getLong("power");
		java.lang.String lastChanllegeTime = rs.getString("last_chanllege_time");
		java.lang.String formationStr = rs.getString("formation_str");
		java.lang.Integer isCurentStage = rs.getInt("isCurentStage");
		PlayerStage instance = new PlayerStage();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setChapterId(chapterId);
		instance.setStageId(stageId);
		instance.setPower(power);
		instance.setLastChanllegeTime(lastChanllegeTime);
		instance.setFormationStr(formationStr);
		instance.setIsCurentStage(isCurentStage);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_stage (`id`,`player_id`,`chapter_id`,`stage_id`,`power`,`last_chanllege_time`,`formation_str`,`isCurentStage`) VALUES(:id,:playerId,:chapterId,:stageId,:power,:lastChanllegeTime,:formationStr,:isCurentStage)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_stage SET `player_id`=:playerId,`chapter_id`=:chapterId,`stage_id`=:stageId,`power`=:power,`last_chanllege_time`=:lastChanllegeTime,`formation_str`=:formationStr,`isCurentStage`=:isCurentStage WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerStage t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_stage";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

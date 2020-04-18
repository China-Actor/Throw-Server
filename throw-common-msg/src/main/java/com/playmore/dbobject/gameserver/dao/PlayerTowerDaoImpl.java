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
import com.playmore.dbobject.gameserver.PlayerTower;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerTowerDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerTower>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerTower createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer stageId = rs.getInt("stage_id");
		java.lang.Long power = rs.getLong("power");
		java.lang.String lastChanllegeTime = rs.getString("last_chanllege_time");
		java.lang.String formationStr = rs.getString("formation_str");
		java.lang.Integer isCurentStage = rs.getInt("isCurentStage");
		PlayerTower instance = new PlayerTower();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setStageId(stageId);
		instance.setPower(power);
		instance.setLastChanllegeTime(lastChanllegeTime);
		instance.setFormationStr(formationStr);
		instance.setIsCurentStage(isCurentStage);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_tower (`id`,`player_id`,`stage_id`,`power`,`last_chanllege_time`,`formation_str`,`isCurentStage`) VALUES(:id,:playerId,:stageId,:power,:lastChanllegeTime,:formationStr,:isCurentStage)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_tower SET `player_id`=:playerId,`stage_id`=:stageId,`power`=:power,`last_chanllege_time`=:lastChanllegeTime,`formation_str`=:formationStr,`isCurentStage`=:isCurentStage WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerTower t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_tower";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

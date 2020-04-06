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
import com.playmore.dbobject.gameserver.PlayerFormation;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFormationDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerFormation>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerFormationDaoImpl DEFAULT = new	PlayerFormationDaoImpl();
	public static PlayerFormationDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerFormation createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer slot1Pos = rs.getInt("slot1_pos");
		java.lang.Long slot1Card = rs.getLong("slot1_card");
		java.lang.Integer slot2Pos = rs.getInt("slot2_pos");
		java.lang.Long slot2Card = rs.getLong("slot2_card");
		java.lang.Integer slot3Pos = rs.getInt("slot3_pos");
		java.lang.Long slot3Card = rs.getLong("slot3_card");
		java.lang.Integer slot4Pos = rs.getInt("slot4_pos");
		java.lang.Long slot4Card = rs.getLong("slot4_card");
		java.lang.Integer slot5Pos = rs.getInt("slot5_pos");
		java.lang.Long slot5Card = rs.getLong("slot5_card");
		java.lang.Boolean useStrategy = rs.getBoolean("use_strategy");
		java.lang.Long power = rs.getLong("power");
		java.lang.Integer skillId = rs.getInt("skill_id");
		PlayerFormation instance = new PlayerFormation();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setType(type);
		instance.setSlot1Pos(slot1Pos);
		instance.setSlot1Card(slot1Card);
		instance.setSlot2Pos(slot2Pos);
		instance.setSlot2Card(slot2Card);
		instance.setSlot3Pos(slot3Pos);
		instance.setSlot3Card(slot3Card);
		instance.setSlot4Pos(slot4Pos);
		instance.setSlot4Card(slot4Card);
		instance.setSlot5Pos(slot5Pos);
		instance.setSlot5Card(slot5Card);
		instance.setUseStrategy(useStrategy);
		instance.setPower(power);
		instance.setSkillId(skillId);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_formation (`id`,`player_id`,`type`,`slot1_pos`,`slot1_card`,`slot2_pos`,`slot2_card`,`slot3_pos`,`slot3_card`,`slot4_pos`,`slot4_card`,`slot5_pos`,`slot5_card`,`use_strategy`,`power`,`skill_id`) VALUES(:id,:playerId,:type,:slot1Pos,:slot1Card,:slot2Pos,:slot2Card,:slot3Pos,:slot3Card,:slot4Pos,:slot4Card,:slot5Pos,:slot5Card,:useStrategy,:power,:skillId)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_formation SET `player_id`=:playerId,`type`=:type,`slot1_pos`=:slot1Pos,`slot1_card`=:slot1Card,`slot2_pos`=:slot2Pos,`slot2_card`=:slot2Card,`slot3_pos`=:slot3Pos,`slot3_card`=:slot3Card,`slot4_pos`=:slot4Pos,`slot4_card`=:slot4Card,`slot5_pos`=:slot5Pos,`slot5_card`=:slot5Card,`use_strategy`=:useStrategy,`power`=:power,`skill_id`=:skillId WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerFormation t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_formation";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

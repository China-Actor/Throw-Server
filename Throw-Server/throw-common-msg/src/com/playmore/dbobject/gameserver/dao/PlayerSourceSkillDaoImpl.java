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
import com.playmore.dbobject.gameserver.PlayerSourceSkill;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSourceSkillDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerSourceSkill>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerSourceSkillDaoImpl DEFAULT = new	PlayerSourceSkillDaoImpl();
	public static PlayerSourceSkillDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerSourceSkill createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer skillNumber = rs.getInt("skill_number");
		java.lang.Integer skillId = rs.getInt("skill_id");
		java.lang.String slotHeros = rs.getString("slot_heros");
		java.lang.String updateTime = rs.getString("update_time");
		PlayerSourceSkill instance = new PlayerSourceSkill();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setSkillNumber(skillNumber);
		instance.setSkillId(skillId);
		instance.setSlotHeros(slotHeros);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_source_skill (`id`,`player_id`,`skill_number`,`skill_id`,`slot_heros`,`update_time`) VALUES(:id,:playerId,:skillNumber,:skillId,:slotHeros,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_source_skill SET `player_id`=:playerId,`skill_number`=:skillNumber,`skill_id`=:skillId,`slot_heros`=:slotHeros,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerSourceSkill t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_source_skill";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

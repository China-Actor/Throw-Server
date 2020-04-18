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
import com.playmore.dbobject.gameserver.PlayerCard;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerCardDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerCard>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerCard createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer cardId = rs.getInt("card_id");
		java.lang.Integer qualityId = rs.getInt("quality_id");
		java.lang.Integer quality = rs.getInt("quality");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer levelResonance = rs.getInt("level_resonance");
		java.lang.Integer ordinarySkill = rs.getInt("ordinary_skill");
		java.lang.Integer skill1 = rs.getInt("skill1");
		java.lang.Integer skill2 = rs.getInt("skill2");
		java.lang.Integer skill3 = rs.getInt("skill3");
		java.lang.Integer skill4 = rs.getInt("skill4");
		java.lang.Integer occupation = rs.getInt("occupation");
		java.lang.Integer camp = rs.getInt("camp");
		java.lang.Integer nature = rs.getInt("nature");
		java.lang.Integer distance = rs.getInt("distance");
		java.lang.Integer hp = rs.getInt("hp");
		java.lang.Integer attack = rs.getInt("attack");
		java.lang.Integer defense = rs.getInt("defense");
		java.lang.Integer lockStatus = rs.getInt("lock_status");
		PlayerCard instance = new PlayerCard();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setCardId(cardId);
		instance.setQualityId(qualityId);
		instance.setQuality(quality);
		instance.setLevel(level);
		instance.setLevelResonance(levelResonance);
		instance.setOrdinarySkill(ordinarySkill);
		instance.setSkill1(skill1);
		instance.setSkill2(skill2);
		instance.setSkill3(skill3);
		instance.setSkill4(skill4);
		instance.setOccupation(occupation);
		instance.setCamp(camp);
		instance.setNature(nature);
		instance.setDistance(distance);
		instance.setHp(hp);
		instance.setAttack(attack);
		instance.setDefense(defense);
		instance.setLockStatus(lockStatus);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_card (`id`,`player_id`,`card_id`,`quality_id`,`quality`,`level`,`level_resonance`,`ordinary_skill`,`skill1`,`skill2`,`skill3`,`skill4`,`occupation`,`camp`,`nature`,`distance`,`hp`,`attack`,`defense`,`lock_status`) VALUES(:id,:playerId,:cardId,:qualityId,:quality,:level,:levelResonance,:ordinarySkill,:skill1,:skill2,:skill3,:skill4,:occupation,:camp,:nature,:distance,:hp,:attack,:defense,:lockStatus)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_card SET `player_id`=:playerId,`card_id`=:cardId,`quality_id`=:qualityId,`quality`=:quality,`level`=:level,`level_resonance`=:levelResonance,`ordinary_skill`=:ordinarySkill,`skill1`=:skill1,`skill2`=:skill2,`skill3`=:skill3,`skill4`=:skill4,`occupation`=:occupation,`camp`=:camp,`nature`=:nature,`distance`=:distance,`hp`=:hp,`attack`=:attack,`defense`=:defense,`lock_status`=:lockStatus WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerCard t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_card";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

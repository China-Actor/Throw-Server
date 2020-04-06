package com.playmore.dbobject.staticdb.dao;

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
import com.playmore.dbobject.staticdb.MonsterTeamS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MonsterTeamSDaoImpl extends SinglePrimaryKeyDBDaoImpl<MonsterTeamS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MonsterTeamSDaoImpl DEFAULT = new	MonsterTeamSDaoImpl();
	public static MonsterTeamSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MonsterTeamS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer makeBoss = rs.getInt("make_boss");
		java.lang.Integer monster1 = rs.getInt("monster1");
		java.lang.Integer monster1Level = rs.getInt("monster1_level");
		java.lang.Integer monster1Quality = rs.getInt("monster1_quality");
		java.lang.Integer percent1 = rs.getInt("percent1");
		java.lang.Integer monster2 = rs.getInt("monster2");
		java.lang.Integer monster2Level = rs.getInt("monster2_level");
		java.lang.Integer monster2Quality = rs.getInt("monster2_quality");
		java.lang.Integer percent2 = rs.getInt("percent2");
		java.lang.Integer monster3 = rs.getInt("monster3");
		java.lang.Integer monster3Level = rs.getInt("monster3_level");
		java.lang.Integer monster3Quality = rs.getInt("monster3_quality");
		java.lang.Integer percent3 = rs.getInt("percent3");
		java.lang.Integer monster4 = rs.getInt("monster4");
		java.lang.Integer monster4Level = rs.getInt("monster4_level");
		java.lang.Integer monster4Quality = rs.getInt("monster4_quality");
		java.lang.Integer percent4 = rs.getInt("percent4");
		java.lang.Integer monster5 = rs.getInt("monster5");
		java.lang.Integer monster5Level = rs.getInt("monster5_level");
		java.lang.Integer monster5Quality = rs.getInt("monster5_quality");
		java.lang.Integer percent5 = rs.getInt("percent5");
		java.lang.Integer isEquipment = rs.getInt("is_equipment");
		java.lang.Integer teamskill = rs.getInt("teamskill");
		MonsterTeamS instance = new MonsterTeamS();
		instance.setId(id);
		instance.setMakeBoss(makeBoss);
		instance.setMonster1(monster1);
		instance.setMonster1Level(monster1Level);
		instance.setMonster1Quality(monster1Quality);
		instance.setPercent1(percent1);
		instance.setMonster2(monster2);
		instance.setMonster2Level(monster2Level);
		instance.setMonster2Quality(monster2Quality);
		instance.setPercent2(percent2);
		instance.setMonster3(monster3);
		instance.setMonster3Level(monster3Level);
		instance.setMonster3Quality(monster3Quality);
		instance.setPercent3(percent3);
		instance.setMonster4(monster4);
		instance.setMonster4Level(monster4Level);
		instance.setMonster4Quality(monster4Quality);
		instance.setPercent4(percent4);
		instance.setMonster5(monster5);
		instance.setMonster5Level(monster5Level);
		instance.setMonster5Quality(monster5Quality);
		instance.setPercent5(percent5);
		instance.setIsEquipment(isEquipment);
		instance.setTeamskill(teamskill);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO monster_team_s (`id`,`make_boss`,`monster1`,`monster1_level`,`monster1_quality`,`percent1`,`monster2`,`monster2_level`,`monster2_quality`,`percent2`,`monster3`,`monster3_level`,`monster3_quality`,`percent3`,`monster4`,`monster4_level`,`monster4_quality`,`percent4`,`monster5`,`monster5_level`,`monster5_quality`,`percent5`,`is_equipment`,`teamskill`) VALUES(:id,:makeBoss,:monster1,:monster1Level,:monster1Quality,:percent1,:monster2,:monster2Level,:monster2Quality,:percent2,:monster3,:monster3Level,:monster3Quality,:percent3,:monster4,:monster4Level,:monster4Quality,:percent4,:monster5,:monster5Level,:monster5Quality,:percent5,:isEquipment,:teamskill)";
	}
	protected String getUpdateSql() {
		return "UPDATE monster_team_s SET `make_boss`=:makeBoss,`monster1`=:monster1,`monster1_level`=:monster1Level,`monster1_quality`=:monster1Quality,`percent1`=:percent1,`monster2`=:monster2,`monster2_level`=:monster2Level,`monster2_quality`=:monster2Quality,`percent2`=:percent2,`monster3`=:monster3,`monster3_level`=:monster3Level,`monster3_quality`=:monster3Quality,`percent3`=:percent3,`monster4`=:monster4,`monster4_level`=:monster4Level,`monster4_quality`=:monster4Quality,`percent4`=:percent4,`monster5`=:monster5,`monster5_level`=:monster5Level,`monster5_quality`=:monster5Quality,`percent5`=:percent5,`is_equipment`=:isEquipment,`teamskill`=:teamskill WHERE id=:id";
	}
	protected java.lang.Integer getKey(MonsterTeamS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "monster_team_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

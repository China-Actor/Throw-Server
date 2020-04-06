package main.java.com.playmore.dbobject.staticdb.dao;

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
import main.java.com.playmore.dbobject.staticdb.TeamskillS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TeamskillSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TeamskillS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TeamskillSDaoImpl DEFAULT = new	TeamskillSDaoImpl();
	public static TeamskillSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TeamskillS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer teamskillId = rs.getInt("teamskill_id");
		java.lang.String teamskillTitle = rs.getString("teamskill_title");
		java.lang.String teamskillName = rs.getString("teamskill_name");
		java.lang.String teamskillDesc = rs.getString("teamskill_desc");
		java.lang.String teamskillIcon = rs.getString("teamskill_icon");
		java.lang.Integer teamSkill = rs.getInt("team_skill");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer grade = rs.getInt("grade");
		java.lang.Integer hero1 = rs.getInt("hero1");
		java.lang.Integer hero2 = rs.getInt("hero2");
		java.lang.Integer hero3 = rs.getInt("hero3");
		java.lang.Integer hero4 = rs.getInt("hero4");
		java.lang.Integer hero5 = rs.getInt("hero5");
		java.lang.Integer unlockQuailty = rs.getInt("unlock_quailty");
		TeamskillS instance = new TeamskillS();
		instance.setId(id);
		instance.setTeamskillId(teamskillId);
		instance.setTeamskillTitle(teamskillTitle);
		instance.setTeamskillName(teamskillName);
		instance.setTeamskillDesc(teamskillDesc);
		instance.setTeamskillIcon(teamskillIcon);
		instance.setTeamSkill(teamSkill);
		instance.setLevel(level);
		instance.setGrade(grade);
		instance.setHero1(hero1);
		instance.setHero2(hero2);
		instance.setHero3(hero3);
		instance.setHero4(hero4);
		instance.setHero5(hero5);
		instance.setUnlockQuailty(unlockQuailty);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO teamskill_s (`id`,`teamskill_id`,`teamskill_title`,`teamskill_name`,`teamskill_desc`,`teamskill_icon`,`team_skill`,`level`,`grade`,`hero1`,`hero2`,`hero3`,`hero4`,`hero5`,`unlock_quailty`) VALUES(:id,:teamskillId,:teamskillTitle,:teamskillName,:teamskillDesc,:teamskillIcon,:teamSkill,:level,:grade,:hero1,:hero2,:hero3,:hero4,:hero5,:unlockQuailty)";
	}
	protected String getUpdateSql() {
		return "UPDATE teamskill_s SET `teamskill_id`=:teamskillId,`teamskill_title`=:teamskillTitle,`teamskill_name`=:teamskillName,`teamskill_desc`=:teamskillDesc,`teamskill_icon`=:teamskillIcon,`team_skill`=:teamSkill,`level`=:level,`grade`=:grade,`hero1`=:hero1,`hero2`=:hero2,`hero3`=:hero3,`hero4`=:hero4,`hero5`=:hero5,`unlock_quailty`=:unlockQuailty WHERE id=:id";
	}
	protected java.lang.Integer getKey(TeamskillS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "teamskill_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

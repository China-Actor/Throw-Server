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
import com.playmore.dbobject.staticdb.RobotlevelS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RobotlevelSDaoImpl extends SinglePrimaryKeyDBDaoImpl<RobotlevelS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final RobotlevelSDaoImpl DEFAULT = new	RobotlevelSDaoImpl();
	public static RobotlevelSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected RobotlevelS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer playLevel = rs.getInt("play_level");
		java.lang.Integer heroMinLevel = rs.getInt("hero_min_level");
		java.lang.Integer heroMaxLevel = rs.getInt("hero_max_level");
		java.lang.Integer pvpRunk = rs.getInt("pvp_runk");
		java.lang.Integer num = rs.getInt("num");
		java.lang.Integer realPlayerNum = rs.getInt("real_player_num");
		java.lang.String stage1 = rs.getString("stage1");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String teamskill = rs.getString("teamskill");
		RobotlevelS instance = new RobotlevelS();
		instance.setId(id);
		instance.setPlayLevel(playLevel);
		instance.setHeroMinLevel(heroMinLevel);
		instance.setHeroMaxLevel(heroMaxLevel);
		instance.setPvpRunk(pvpRunk);
		instance.setNum(num);
		instance.setRealPlayerNum(realPlayerNum);
		instance.setStage1(stage1);
		instance.setType(type);
		instance.setTeamskill(teamskill);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO robotlevel_s (`id`,`play_level`,`hero_min_level`,`hero_max_level`,`pvp_runk`,`num`,`real_player_num`,`stage1`,`type`,`teamskill`) VALUES(:id,:playLevel,:heroMinLevel,:heroMaxLevel,:pvpRunk,:num,:realPlayerNum,:stage1,:type,:teamskill)";
	}
	protected String getUpdateSql() {
		return "UPDATE robotlevel_s SET `play_level`=:playLevel,`hero_min_level`=:heroMinLevel,`hero_max_level`=:heroMaxLevel,`pvp_runk`=:pvpRunk,`num`=:num,`real_player_num`=:realPlayerNum,`stage1`=:stage1,`type`=:type,`teamskill`=:teamskill WHERE id=:id";
	}
	protected java.lang.Integer getKey(RobotlevelS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "robotlevel_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

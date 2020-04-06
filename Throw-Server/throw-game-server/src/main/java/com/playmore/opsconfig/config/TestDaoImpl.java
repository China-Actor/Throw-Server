package com.playmore.opsconfig.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.dbobject.gameserver.MazeRobot;
import com.playmore.xysword.enumtype.DbType;
/**
 * Do not touch! Close it Now!
 */
@Component
@SuppressWarnings("serial")
public class TestDaoImpl extends SinglePrimaryKeyDBDaoImpl<MazeRobot>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;
	
	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		System.out.println("数据库对象:"+DaoSupport);
		//return SingleDBProvider.getDefault().getDaoSupport(key);
		return this.DaoSupport;
	}
	private static final TestDaoImpl DEFAULT = new	TestDaoImpl();
	public static TestDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MazeRobot createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String formationJson = rs.getString("formation_json");
		java.lang.Integer playerLevel = rs.getInt("player_level");
		java.lang.Integer pvpRunk = rs.getInt("pvp_runk");
		java.lang.Long totalBattlePower = rs.getLong("total_battle_power");
		MazeRobot instance = new MazeRobot();
		instance.setId(id);
		instance.setFormationJson(formationJson);
		instance.setPlayerLevel(playerLevel);
		instance.setPvpRunk(pvpRunk);
		instance.setTotalBattlePower(totalBattlePower);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO maze_robot (`id`,`formation_json`,`player_level`,`pvp_runk`,`total_battle_power`) VALUES(:id,:formationJson,:playerLevel,:pvpRunk,:totalBattlePower)";
	}
	protected String getUpdateSql() {
		return "UPDATE maze_robot SET `formation_json`=:formationJson,`player_level`=:playerLevel,`pvp_runk`=:pvpRunk,`total_battle_power`=:totalBattlePower WHERE id=:id";
	}
	protected java.lang.Long getKey(MazeRobot t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "maze_robot";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

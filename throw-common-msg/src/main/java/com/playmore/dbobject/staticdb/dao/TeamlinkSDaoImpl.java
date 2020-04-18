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
import com.playmore.dbobject.staticdb.TeamlinkS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class TeamlinkSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TeamlinkS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected TeamlinkS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer teamlinkId = rs.getInt("teamlink_id");
		java.lang.String teamlinkName = rs.getString("teamlink_name");
		java.lang.String teamlinkDesc = rs.getString("teamlink_desc");
		java.lang.String teamlinkIcon = rs.getString("teamlink_icon");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer hero1 = rs.getInt("hero1");
		java.lang.Integer hero2 = rs.getInt("hero2");
		java.lang.Integer hero3 = rs.getInt("hero3");
		java.lang.Integer unlockQuailty = rs.getInt("unlock_quailty");
		java.lang.String value1 = rs.getString("value1");
		java.lang.String value2 = rs.getString("value2");
		java.lang.String value3 = rs.getString("value3");
		TeamlinkS instance = new TeamlinkS();
		instance.setId(id);
		instance.setTeamlinkId(teamlinkId);
		instance.setTeamlinkName(teamlinkName);
		instance.setTeamlinkDesc(teamlinkDesc);
		instance.setTeamlinkIcon(teamlinkIcon);
		instance.setLevel(level);
		instance.setHero1(hero1);
		instance.setHero2(hero2);
		instance.setHero3(hero3);
		instance.setUnlockQuailty(unlockQuailty);
		instance.setValue1(value1);
		instance.setValue2(value2);
		instance.setValue3(value3);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO teamlink_s (`id`,`teamlink_id`,`teamlink_name`,`teamlink_desc`,`teamlink_icon`,`level`,`hero1`,`hero2`,`hero3`,`unlock_quailty`,`value1`,`value2`,`value3`) VALUES(:id,:teamlinkId,:teamlinkName,:teamlinkDesc,:teamlinkIcon,:level,:hero1,:hero2,:hero3,:unlockQuailty,:value1,:value2,:value3)";
	}
	protected String getUpdateSql() {
		return "UPDATE teamlink_s SET `teamlink_id`=:teamlinkId,`teamlink_name`=:teamlinkName,`teamlink_desc`=:teamlinkDesc,`teamlink_icon`=:teamlinkIcon,`level`=:level,`hero1`=:hero1,`hero2`=:hero2,`hero3`=:hero3,`unlock_quailty`=:unlockQuailty,`value1`=:value1,`value2`=:value2,`value3`=:value3 WHERE id=:id";
	}
	protected java.lang.Integer getKey(TeamlinkS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "teamlink_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

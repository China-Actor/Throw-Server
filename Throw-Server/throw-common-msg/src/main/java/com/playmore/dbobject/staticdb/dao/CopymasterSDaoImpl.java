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
import com.playmore.dbobject.staticdb.CopymasterS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class CopymasterSDaoImpl extends SinglePrimaryKeyDBDaoImpl<CopymasterS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected CopymasterS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer burial = rs.getInt("burial");
		java.lang.Integer skilltype = rs.getInt("skilltype");
		java.lang.Integer hp = rs.getInt("hp");
		java.lang.Integer attack = rs.getInt("attack");
		java.lang.Integer defense = rs.getInt("defense");
		java.lang.Integer physicsReduce = rs.getInt("physics_reduce");
		java.lang.Integer magicReduce = rs.getInt("magic_reduce");
		java.lang.Integer recovery = rs.getInt("recovery");
		java.lang.Integer hit = rs.getInt("hit");
		java.lang.Integer dodge = rs.getInt("dodge");
		java.lang.Integer crit = rs.getInt("crit");
		java.lang.Integer rapidly = rs.getInt("rapidly");
		java.lang.Integer suck = rs.getInt("suck");
		java.lang.Integer injuredEnergy = rs.getInt("injured_energy");
		java.lang.String castShow = rs.getString("cast_show");
		java.lang.String deathShow = rs.getString("death_show");
		java.lang.Integer hitShow = rs.getInt("hit_show");
		CopymasterS instance = new CopymasterS();
		instance.setId(id);
		instance.setType(type);
		instance.setBurial(burial);
		instance.setSkilltype(skilltype);
		instance.setHp(hp);
		instance.setAttack(attack);
		instance.setDefense(defense);
		instance.setPhysicsReduce(physicsReduce);
		instance.setMagicReduce(magicReduce);
		instance.setRecovery(recovery);
		instance.setHit(hit);
		instance.setDodge(dodge);
		instance.setCrit(crit);
		instance.setRapidly(rapidly);
		instance.setSuck(suck);
		instance.setInjuredEnergy(injuredEnergy);
		instance.setCastShow(castShow);
		instance.setDeathShow(deathShow);
		instance.setHitShow(hitShow);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO copymaster_s (`id`,`type`,`burial`,`skilltype`,`hp`,`attack`,`defense`,`physics_reduce`,`magic_reduce`,`recovery`,`hit`,`dodge`,`crit`,`rapidly`,`suck`,`injured_energy`,`cast_show`,`death_show`,`hit_show`) VALUES(:id,:type,:burial,:skilltype,:hp,:attack,:defense,:physicsReduce,:magicReduce,:recovery,:hit,:dodge,:crit,:rapidly,:suck,:injuredEnergy,:castShow,:deathShow,:hitShow)";
	}
	protected String getUpdateSql() {
		return "UPDATE copymaster_s SET `type`=:type,`burial`=:burial,`skilltype`=:skilltype,`hp`=:hp,`attack`=:attack,`defense`=:defense,`physics_reduce`=:physicsReduce,`magic_reduce`=:magicReduce,`recovery`=:recovery,`hit`=:hit,`dodge`=:dodge,`crit`=:crit,`rapidly`=:rapidly,`suck`=:suck,`injured_energy`=:injuredEnergy,`cast_show`=:castShow,`death_show`=:deathShow,`hit_show`=:hitShow WHERE id=:id";
	}
	protected java.lang.Integer getKey(CopymasterS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "copymaster_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

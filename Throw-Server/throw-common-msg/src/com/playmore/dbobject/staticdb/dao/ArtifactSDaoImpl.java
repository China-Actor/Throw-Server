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
import com.playmore.dbobject.staticdb.ArtifactS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ArtifactSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ArtifactS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ArtifactSDaoImpl DEFAULT = new	ArtifactSDaoImpl();
	public static ArtifactSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ArtifactS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer artifactid = rs.getInt("artifactid");
		java.lang.Integer star = rs.getInt("star");
		java.lang.String name = rs.getString("name");
		java.lang.String desc = rs.getString("desc");
		java.lang.String icon = rs.getString("icon");
		java.lang.Integer position = rs.getInt("position");
		java.lang.Integer artifactskill1 = rs.getInt("artifactskill1");
		java.lang.Integer artifactskill2 = rs.getInt("artifactskill2");
		java.lang.Integer type1 = rs.getInt("type1");
		java.lang.Integer value1 = rs.getInt("value1");
		java.lang.Integer size1 = rs.getInt("size1");
		java.lang.Integer type2 = rs.getInt("type2");
		java.lang.Integer value2 = rs.getInt("value2");
		java.lang.Integer size2 = rs.getInt("size2");
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
		ArtifactS instance = new ArtifactS();
		instance.setId(id);
		instance.setArtifactid(artifactid);
		instance.setStar(star);
		instance.setName(name);
		instance.setDesc(desc);
		instance.setIcon(icon);
		instance.setPosition(position);
		instance.setArtifactskill1(artifactskill1);
		instance.setArtifactskill2(artifactskill2);
		instance.setType1(type1);
		instance.setValue1(value1);
		instance.setSize1(size1);
		instance.setType2(type2);
		instance.setValue2(value2);
		instance.setSize2(size2);
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
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO artifact_s (`id`,`artifactid`,`star`,`name`,`desc`,`icon`,`position`,`artifactskill1`,`artifactskill2`,`type1`,`value1`,`size1`,`type2`,`value2`,`size2`,`hp`,`attack`,`defense`,`physics_reduce`,`magic_reduce`,`recovery`,`hit`,`dodge`,`crit`,`rapidly`) VALUES(:id,:artifactid,:star,:name,:desc,:icon,:position,:artifactskill1,:artifactskill2,:type1,:value1,:size1,:type2,:value2,:size2,:hp,:attack,:defense,:physicsReduce,:magicReduce,:recovery,:hit,:dodge,:crit,:rapidly)";
	}
	protected String getUpdateSql() {
		return "UPDATE artifact_s SET `artifactid`=:artifactid,`star`=:star,`name`=:name,`desc`=:desc,`icon`=:icon,`position`=:position,`artifactskill1`=:artifactskill1,`artifactskill2`=:artifactskill2,`type1`=:type1,`value1`=:value1,`size1`=:size1,`type2`=:type2,`value2`=:value2,`size2`=:size2,`hp`=:hp,`attack`=:attack,`defense`=:defense,`physics_reduce`=:physicsReduce,`magic_reduce`=:magicReduce,`recovery`=:recovery,`hit`=:hit,`dodge`=:dodge,`crit`=:crit,`rapidly`=:rapidly WHERE id=:id";
	}
	protected java.lang.Integer getKey(ArtifactS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "artifact_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

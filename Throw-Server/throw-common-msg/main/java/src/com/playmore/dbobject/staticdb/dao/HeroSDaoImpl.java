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
import main.java.com.playmore.dbobject.staticdb.HeroS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class HeroSDaoImpl extends SinglePrimaryKeyDBDaoImpl<HeroS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final HeroSDaoImpl DEFAULT = new	HeroSDaoImpl();
	public static HeroSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected HeroS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String card = rs.getString("card");
		java.lang.String head = rs.getString("head");
		java.lang.String live2d = rs.getString("live2d");
		java.lang.String model = rs.getString("model");
		java.lang.String hero3d = rs.getString("hero3d");
		java.lang.String soul = rs.getString("soul");
		java.lang.Integer zoom = rs.getInt("zoom");
		java.lang.String describe = rs.getString("describe");
		java.lang.Integer occupation = rs.getInt("occupation");
		java.lang.Integer camp = rs.getInt("camp");
		java.lang.Integer nature = rs.getInt("nature");
		java.lang.Integer distance = rs.getInt("distance");
		java.lang.Integer old = rs.getInt("old");
		java.lang.String likes = rs.getString("likes");
		java.lang.String dislikes = rs.getString("dislikes");
		java.lang.String herodesc = rs.getString("herodesc");
		java.lang.Integer speed = rs.getInt("speed");
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
		java.lang.String skill = rs.getString("skill");
		java.lang.Integer open = rs.getInt("open");
		java.lang.String score = rs.getString("score");
		java.lang.Integer type = rs.getInt("type");
		HeroS instance = new HeroS();
		instance.setId(id);
		instance.setName(name);
		instance.setCard(card);
		instance.setHead(head);
		instance.setLive2d(live2d);
		instance.setModel(model);
		instance.setHero3d(hero3d);
		instance.setSoul(soul);
		instance.setZoom(zoom);
		instance.setDescribe(describe);
		instance.setOccupation(occupation);
		instance.setCamp(camp);
		instance.setNature(nature);
		instance.setDistance(distance);
		instance.setOld(old);
		instance.setLikes(likes);
		instance.setDislikes(dislikes);
		instance.setHerodesc(herodesc);
		instance.setSpeed(speed);
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
		instance.setSkill(skill);
		instance.setOpen(open);
		instance.setScore(score);
		instance.setType(type);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO hero_s (`id`,`name`,`card`,`head`,`live2d`,`model`,`hero3d`,`soul`,`zoom`,`describe`,`occupation`,`camp`,`nature`,`distance`,`old`,`likes`,`dislikes`,`herodesc`,`speed`,`hp`,`attack`,`defense`,`physics_reduce`,`magic_reduce`,`recovery`,`hit`,`dodge`,`crit`,`rapidly`,`suck`,`injured_energy`,`skill`,`open`,`score`,`type`) VALUES(:id,:name,:card,:head,:live2d,:model,:hero3d,:soul,:zoom,:describe,:occupation,:camp,:nature,:distance,:old,:likes,:dislikes,:herodesc,:speed,:hp,:attack,:defense,:physicsReduce,:magicReduce,:recovery,:hit,:dodge,:crit,:rapidly,:suck,:injuredEnergy,:skill,:open,:score,:type)";
	}
	protected String getUpdateSql() {
		return "UPDATE hero_s SET `name`=:name,`card`=:card,`head`=:head,`live2d`=:live2d,`model`=:model,`hero3d`=:hero3d,`soul`=:soul,`zoom`=:zoom,`describe`=:describe,`occupation`=:occupation,`camp`=:camp,`nature`=:nature,`distance`=:distance,`old`=:old,`likes`=:likes,`dislikes`=:dislikes,`herodesc`=:herodesc,`speed`=:speed,`hp`=:hp,`attack`=:attack,`defense`=:defense,`physics_reduce`=:physicsReduce,`magic_reduce`=:magicReduce,`recovery`=:recovery,`hit`=:hit,`dodge`=:dodge,`crit`=:crit,`rapidly`=:rapidly,`suck`=:suck,`injured_energy`=:injuredEnergy,`skill`=:skill,`open`=:open,`score`=:score,`type`=:type WHERE id=:id";
	}
	protected java.lang.Integer getKey(HeroS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "hero_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

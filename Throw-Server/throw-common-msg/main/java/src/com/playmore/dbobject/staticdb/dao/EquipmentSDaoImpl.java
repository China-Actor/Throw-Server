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
import main.java.com.playmore.dbobject.staticdb.EquipmentS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class EquipmentSDaoImpl extends SinglePrimaryKeyDBDaoImpl<EquipmentS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final EquipmentSDaoImpl DEFAULT = new	EquipmentSDaoImpl();
	public static EquipmentSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected EquipmentS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String desc = rs.getString("desc");
		java.lang.String icon = rs.getString("icon");
		java.lang.Integer position = rs.getInt("position");
		java.lang.Integer occupation = rs.getInt("occupation");
		java.lang.Integer camp = rs.getInt("camp");
		java.lang.Integer quality = rs.getInt("quality");
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
		java.lang.Integer exp = rs.getInt("exp");
		java.lang.Integer maxstar = rs.getInt("maxstar");
		EquipmentS instance = new EquipmentS();
		instance.setId(id);
		instance.setName(name);
		instance.setDesc(desc);
		instance.setIcon(icon);
		instance.setPosition(position);
		instance.setOccupation(occupation);
		instance.setCamp(camp);
		instance.setQuality(quality);
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
		instance.setExp(exp);
		instance.setMaxstar(maxstar);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO equipment_s (`id`,`name`,`desc`,`icon`,`position`,`occupation`,`camp`,`quality`,`hp`,`attack`,`defense`,`physics_reduce`,`magic_reduce`,`recovery`,`hit`,`dodge`,`crit`,`rapidly`,`exp`,`maxstar`) VALUES(:id,:name,:desc,:icon,:position,:occupation,:camp,:quality,:hp,:attack,:defense,:physicsReduce,:magicReduce,:recovery,:hit,:dodge,:crit,:rapidly,:exp,:maxstar)";
	}
	protected String getUpdateSql() {
		return "UPDATE equipment_s SET `name`=:name,`desc`=:desc,`icon`=:icon,`position`=:position,`occupation`=:occupation,`camp`=:camp,`quality`=:quality,`hp`=:hp,`attack`=:attack,`defense`=:defense,`physics_reduce`=:physicsReduce,`magic_reduce`=:magicReduce,`recovery`=:recovery,`hit`=:hit,`dodge`=:dodge,`crit`=:crit,`rapidly`=:rapidly,`exp`=:exp,`maxstar`=:maxstar WHERE id=:id";
	}
	protected java.lang.Integer getKey(EquipmentS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "equipment_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import main.java.com.playmore.dbobject.staticdb.ShieldS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ShieldSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ShieldS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ShieldSDaoImpl DEFAULT = new	ShieldSDaoImpl();
	public static ShieldSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ShieldS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String shieldType = rs.getString("shield_type");
		java.lang.String valueType = rs.getString("value_type");
		java.lang.Integer value = rs.getInt("value");
		java.lang.String shieldShow = rs.getString("shield_show");
		java.lang.String effect1Show = rs.getString("effect1_show");
		java.lang.String effect1Type = rs.getString("effect1_type");
		java.lang.String effect1Param1 = rs.getString("effect1_param1");
		java.lang.String effect1Param2 = rs.getString("effect1_param2");
		java.lang.String effect1Target = rs.getString("effect1_target");
		java.lang.Integer effect1TargetParam = rs.getInt("effect1_target_param");
		java.lang.Integer effect1Condition = rs.getInt("effect1_condition");
		java.lang.Integer effect1Conparam = rs.getInt("effect1_conparam");
		java.lang.Integer effect2Show = rs.getInt("effect2_show");
		java.lang.String effect2Type = rs.getString("effect2_type");
		java.lang.Integer effect2Param1 = rs.getInt("effect2_param1");
		java.lang.Integer effect2Param2 = rs.getInt("effect2_param2");
		java.lang.String effect2Target = rs.getString("effect2_target");
		java.lang.Integer effect2TargetParam = rs.getInt("effect2_target_param");
		java.lang.Integer effect2Condition = rs.getInt("effect2_condition");
		java.lang.Integer effect2Conparam = rs.getInt("effect2_conparam");
		java.lang.Integer deathShow = rs.getInt("death_show");
		java.lang.Integer effect3Show = rs.getInt("effect3_show");
		java.lang.String effect3Type = rs.getString("effect3_type");
		java.lang.String effect3Param1 = rs.getString("effect3_param1");
		java.lang.Integer effect3Param2 = rs.getInt("effect3_param2");
		java.lang.String effect3Target = rs.getString("effect3_target");
		java.lang.Integer effect3Targetparam = rs.getInt("effect3_targetparam");
		java.lang.Integer effect3Condition = rs.getInt("effect3_condition");
		java.lang.Integer effect3Conparam = rs.getInt("effect3_conparam");
		ShieldS instance = new ShieldS();
		instance.setId(id);
		instance.setShieldType(shieldType);
		instance.setValueType(valueType);
		instance.setValue(value);
		instance.setShieldShow(shieldShow);
		instance.setEffect1Show(effect1Show);
		instance.setEffect1Type(effect1Type);
		instance.setEffect1Param1(effect1Param1);
		instance.setEffect1Param2(effect1Param2);
		instance.setEffect1Target(effect1Target);
		instance.setEffect1TargetParam(effect1TargetParam);
		instance.setEffect1Condition(effect1Condition);
		instance.setEffect1Conparam(effect1Conparam);
		instance.setEffect2Show(effect2Show);
		instance.setEffect2Type(effect2Type);
		instance.setEffect2Param1(effect2Param1);
		instance.setEffect2Param2(effect2Param2);
		instance.setEffect2Target(effect2Target);
		instance.setEffect2TargetParam(effect2TargetParam);
		instance.setEffect2Condition(effect2Condition);
		instance.setEffect2Conparam(effect2Conparam);
		instance.setDeathShow(deathShow);
		instance.setEffect3Show(effect3Show);
		instance.setEffect3Type(effect3Type);
		instance.setEffect3Param1(effect3Param1);
		instance.setEffect3Param2(effect3Param2);
		instance.setEffect3Target(effect3Target);
		instance.setEffect3Targetparam(effect3Targetparam);
		instance.setEffect3Condition(effect3Condition);
		instance.setEffect3Conparam(effect3Conparam);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO shield_s (`id`,`shield_type`,`value_type`,`value`,`shield_show`,`effect1_show`,`effect1_type`,`effect1_param1`,`effect1_param2`,`effect1_target`,`effect1_target_param`,`effect1_condition`,`effect1_conparam`,`effect2_show`,`effect2_type`,`effect2_param1`,`effect2_param2`,`effect2_target`,`effect2_target_param`,`effect2_condition`,`effect2_conparam`,`death_show`,`effect3_show`,`effect3_type`,`effect3_param1`,`effect3_param2`,`effect3_target`,`effect3_targetparam`,`effect3_condition`,`effect3_conparam`) VALUES(:id,:shieldType,:valueType,:value,:shieldShow,:effect1Show,:effect1Type,:effect1Param1,:effect1Param2,:effect1Target,:effect1TargetParam,:effect1Condition,:effect1Conparam,:effect2Show,:effect2Type,:effect2Param1,:effect2Param2,:effect2Target,:effect2TargetParam,:effect2Condition,:effect2Conparam,:deathShow,:effect3Show,:effect3Type,:effect3Param1,:effect3Param2,:effect3Target,:effect3Targetparam,:effect3Condition,:effect3Conparam)";
	}
	protected String getUpdateSql() {
		return "UPDATE shield_s SET `shield_type`=:shieldType,`value_type`=:valueType,`value`=:value,`shield_show`=:shieldShow,`effect1_show`=:effect1Show,`effect1_type`=:effect1Type,`effect1_param1`=:effect1Param1,`effect1_param2`=:effect1Param2,`effect1_target`=:effect1Target,`effect1_target_param`=:effect1TargetParam,`effect1_condition`=:effect1Condition,`effect1_conparam`=:effect1Conparam,`effect2_show`=:effect2Show,`effect2_type`=:effect2Type,`effect2_param1`=:effect2Param1,`effect2_param2`=:effect2Param2,`effect2_target`=:effect2Target,`effect2_target_param`=:effect2TargetParam,`effect2_condition`=:effect2Condition,`effect2_conparam`=:effect2Conparam,`death_show`=:deathShow,`effect3_show`=:effect3Show,`effect3_type`=:effect3Type,`effect3_param1`=:effect3Param1,`effect3_param2`=:effect3Param2,`effect3_target`=:effect3Target,`effect3_targetparam`=:effect3Targetparam,`effect3_condition`=:effect3Condition,`effect3_conparam`=:effect3Conparam WHERE id=:id";
	}
	protected java.lang.Integer getKey(ShieldS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "shield_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

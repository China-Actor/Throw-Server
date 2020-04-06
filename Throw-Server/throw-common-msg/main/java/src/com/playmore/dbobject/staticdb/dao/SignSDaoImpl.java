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
import main.java.com.playmore.dbobject.staticdb.SignS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SignSDaoImpl extends SinglePrimaryKeyDBDaoImpl<SignS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final SignSDaoImpl DEFAULT = new	SignSDaoImpl();
	public static SignSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected SignS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer time = rs.getInt("time");
		java.lang.Integer layer = rs.getInt("layer");
		java.lang.Integer clean = rs.getInt("clean");
		java.lang.String triggerType = rs.getString("trigger_type");
		java.lang.String triggerValue = rs.getString("trigger_value");
		java.lang.String disappear = rs.getString("disappear");
		java.lang.Integer signShow = rs.getInt("sign_show");
		java.lang.String signType = rs.getString("sign_type");
		java.lang.Integer signParam = rs.getInt("sign_param");
		java.lang.Integer signValue = rs.getInt("sign_value");
		java.lang.Integer effect1Show = rs.getInt("effect1_show");
		java.lang.String effect1Type = rs.getString("effect1_type");
		java.lang.String effect1Param1 = rs.getString("effect1_param1");
		java.lang.Integer effect1Param2 = rs.getInt("effect1_param2");
		java.lang.String effect1Target = rs.getString("effect1_target");
		java.lang.Integer effect1TargetParam = rs.getInt("effect1_target_param");
		java.lang.Integer effect1Condition = rs.getInt("effect1_condition");
		java.lang.Integer effect1Conparam = rs.getInt("effect1_conparam");
		java.lang.Integer effect2Show = rs.getInt("effect2_show");
		java.lang.String effect2Type = rs.getString("effect2_type");
		java.lang.String effect2Param1 = rs.getString("effect2_param1");
		java.lang.Integer effect2Param2 = rs.getInt("effect2_param2");
		java.lang.String effect2Target = rs.getString("effect2_target");
		java.lang.Integer effect2TargetParam = rs.getInt("effect2_target_param");
		java.lang.Integer effect2Condition = rs.getInt("effect2_condition");
		java.lang.Integer effect2Conparam = rs.getInt("effect2_conparam");
		SignS instance = new SignS();
		instance.setId(id);
		instance.setTime(time);
		instance.setLayer(layer);
		instance.setClean(clean);
		instance.setTriggerType(triggerType);
		instance.setTriggerValue(triggerValue);
		instance.setDisappear(disappear);
		instance.setSignShow(signShow);
		instance.setSignType(signType);
		instance.setSignParam(signParam);
		instance.setSignValue(signValue);
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
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO sign_s (`id`,`time`,`layer`,`clean`,`trigger_type`,`trigger_value`,`disappear`,`sign_show`,`sign_type`,`sign_param`,`sign_value`,`effect1_show`,`effect1_type`,`effect1_param1`,`effect1_param2`,`effect1_target`,`effect1_target_param`,`effect1_condition`,`effect1_conparam`,`effect2_show`,`effect2_type`,`effect2_param1`,`effect2_param2`,`effect2_target`,`effect2_target_param`,`effect2_condition`,`effect2_conparam`) VALUES(:id,:time,:layer,:clean,:triggerType,:triggerValue,:disappear,:signShow,:signType,:signParam,:signValue,:effect1Show,:effect1Type,:effect1Param1,:effect1Param2,:effect1Target,:effect1TargetParam,:effect1Condition,:effect1Conparam,:effect2Show,:effect2Type,:effect2Param1,:effect2Param2,:effect2Target,:effect2TargetParam,:effect2Condition,:effect2Conparam)";
	}
	protected String getUpdateSql() {
		return "UPDATE sign_s SET `time`=:time,`layer`=:layer,`clean`=:clean,`trigger_type`=:triggerType,`trigger_value`=:triggerValue,`disappear`=:disappear,`sign_show`=:signShow,`sign_type`=:signType,`sign_param`=:signParam,`sign_value`=:signValue,`effect1_show`=:effect1Show,`effect1_type`=:effect1Type,`effect1_param1`=:effect1Param1,`effect1_param2`=:effect1Param2,`effect1_target`=:effect1Target,`effect1_target_param`=:effect1TargetParam,`effect1_condition`=:effect1Condition,`effect1_conparam`=:effect1Conparam,`effect2_show`=:effect2Show,`effect2_type`=:effect2Type,`effect2_param1`=:effect2Param1,`effect2_param2`=:effect2Param2,`effect2_target`=:effect2Target,`effect2_target_param`=:effect2TargetParam,`effect2_condition`=:effect2Condition,`effect2_conparam`=:effect2Conparam WHERE id=:id";
	}
	protected java.lang.Integer getKey(SignS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "sign_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import main.java.com.playmore.dbobject.staticdb.SkillS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SkillSDaoImpl extends SinglePrimaryKeyDBDaoImpl<SkillS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final SkillSDaoImpl DEFAULT = new	SkillSDaoImpl();
	public static SkillSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected SkillS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String skillName = rs.getString("skill_name");
		java.lang.Integer unlockLevel = rs.getInt("unlock_level");
		java.lang.Integer skillLevel = rs.getInt("skill_level");
		java.lang.Integer skillPosition = rs.getInt("skill_position");
		java.lang.Integer skillType = rs.getInt("skill_type");
		java.lang.Integer energy = rs.getInt("energy");
		java.lang.Integer range = rs.getInt("range");
		java.lang.Integer beginCd = rs.getInt("begin_cd");
		java.lang.Integer coolCd = rs.getInt("cool_cd");
		java.lang.Integer duration = rs.getInt("duration");
		java.lang.Integer defaultCondition = rs.getInt("default_condition");
		java.lang.Integer decoParam = rs.getInt("deco_param");
		java.lang.Integer order = rs.getInt("order");
		java.lang.Integer icon = rs.getInt("icon");
		java.lang.String desc = rs.getString("desc");
		java.lang.Integer defaultTarget = rs.getInt("default_target");
		java.lang.Integer defaultTargetParam = rs.getInt("default_target_param");
		java.lang.String skillshow = rs.getString("skillshow");
		java.lang.Integer effect1Time = rs.getInt("effect1_time");
		java.lang.Integer effect1Type = rs.getInt("effect1_type");
		java.lang.Integer effect1Param1 = rs.getInt("effect1_param1");
		java.lang.String effect1Param2 = rs.getString("effect1_param2");
		java.lang.Integer effect1Target = rs.getInt("effect1_target");
		java.lang.Integer effect1Targetparam = rs.getInt("effect1_targetparam");
		java.lang.Integer effect1Condition = rs.getInt("effect1_condition");
		java.lang.Integer effect1Conparam = rs.getInt("effect1_conparam");
		java.lang.Integer effect1Show = rs.getInt("effect1_show");
		java.lang.Integer effect2Time = rs.getInt("effect2_time");
		java.lang.Integer effect2Timeparam = rs.getInt("effect2_timeparam");
		java.lang.Integer effect2Type = rs.getInt("effect2_type");
		java.lang.Integer effect2Param1 = rs.getInt("effect2_param1");
		java.lang.Integer effect2Param2 = rs.getInt("effect2_param2");
		java.lang.Integer effect2Target = rs.getInt("effect2_target");
		java.lang.Integer effect2Targetparam = rs.getInt("effect2_targetparam");
		java.lang.Integer effect2Condition = rs.getInt("effect2_condition");
		java.lang.Integer effect2Conparam = rs.getInt("effect2_conparam");
		java.lang.Integer effect2Show = rs.getInt("effect2_show");
		java.lang.Integer effect3Time = rs.getInt("effect3_time");
		java.lang.Integer effect3Timeparam = rs.getInt("effect3_timeparam");
		java.lang.Integer effect3Type = rs.getInt("effect3_type");
		java.lang.Integer effect3Param1 = rs.getInt("effect3_param1");
		java.lang.Integer effect3Param2 = rs.getInt("effect3_param2");
		java.lang.Integer effect3Target = rs.getInt("effect3_target");
		java.lang.Integer effect3Targetparam = rs.getInt("effect3_targetparam");
		java.lang.Integer effect3Condition = rs.getInt("effect3_condition");
		java.lang.Integer effect3Conparam = rs.getInt("effect3_conparam");
		java.lang.Integer effect3Show = rs.getInt("effect3_show");
		java.lang.Integer effect4Time = rs.getInt("effect4_time");
		java.lang.Integer effect4Timeparam = rs.getInt("effect4_timeparam");
		java.lang.Integer effect4Type = rs.getInt("effect4_type");
		java.lang.Integer effect4Param1 = rs.getInt("effect4_param1");
		java.lang.Integer effect4Param2 = rs.getInt("effect4_param2");
		java.lang.Integer effect4Target = rs.getInt("effect4_target");
		java.lang.Integer effect4Targetparam = rs.getInt("effect4_targetparam");
		java.lang.Integer effect4Condition = rs.getInt("effect4_condition");
		java.lang.Integer effect4Conparam = rs.getInt("effect4_conparam");
		java.lang.Integer effect4Show = rs.getInt("effect4_show");
		java.lang.Integer effect5Time = rs.getInt("effect5_time");
		java.lang.Integer effect5Timeparam = rs.getInt("effect5_timeparam");
		java.lang.Integer effect5Type = rs.getInt("effect5_type");
		java.lang.Integer effect5Param1 = rs.getInt("effect5_param1");
		java.lang.Integer effect5Param2 = rs.getInt("effect5_param2");
		java.lang.Integer effect5Target = rs.getInt("effect5_target");
		java.lang.Integer effect5Targetparam = rs.getInt("effect5_targetparam");
		java.lang.Integer effect5Condition = rs.getInt("effect5_condition");
		java.lang.Integer effect5Conparam = rs.getInt("effect5_conparam");
		java.lang.Integer effect5Show = rs.getInt("effect5_show");
		java.lang.Integer effect6Time = rs.getInt("effect6_time");
		java.lang.Integer effect6Timeparam = rs.getInt("effect6_timeparam");
		java.lang.Integer effect6Type = rs.getInt("effect6_type");
		java.lang.Integer effect6Param1 = rs.getInt("effect6_param1");
		java.lang.Integer effect6Param2 = rs.getInt("effect6_param2");
		java.lang.Integer effect6Target = rs.getInt("effect6_target");
		java.lang.Integer effect6Targetparam = rs.getInt("effect6_targetparam");
		java.lang.Integer effect6Condition = rs.getInt("effect6_condition");
		java.lang.Integer effect6Conparam = rs.getInt("effect6_conparam");
		java.lang.Integer effect6Show = rs.getInt("effect6_show");
		java.lang.Integer effect7Time = rs.getInt("effect7_time");
		java.lang.Integer effect7Timeparam = rs.getInt("effect7_timeparam");
		java.lang.Integer effect7Type = rs.getInt("effect7_type");
		java.lang.Integer effect7Param1 = rs.getInt("effect7_param1");
		java.lang.Integer effect7Param2 = rs.getInt("effect7_param2");
		java.lang.Integer effect7Target = rs.getInt("effect7_target");
		java.lang.Integer effect7Targetparam = rs.getInt("effect7_targetparam");
		java.lang.Integer effect7Condition = rs.getInt("effect7_condition");
		java.lang.Integer effect7Conparam = rs.getInt("effect7_conparam");
		java.lang.Integer effect7Show = rs.getInt("effect7_show");
		SkillS instance = new SkillS();
		instance.setId(id);
		instance.setSkillName(skillName);
		instance.setUnlockLevel(unlockLevel);
		instance.setSkillLevel(skillLevel);
		instance.setSkillPosition(skillPosition);
		instance.setSkillType(skillType);
		instance.setEnergy(energy);
		instance.setRange(range);
		instance.setBeginCd(beginCd);
		instance.setCoolCd(coolCd);
		instance.setDuration(duration);
		instance.setDefaultCondition(defaultCondition);
		instance.setDecoParam(decoParam);
		instance.setOrder(order);
		instance.setIcon(icon);
		instance.setDesc(desc);
		instance.setDefaultTarget(defaultTarget);
		instance.setDefaultTargetParam(defaultTargetParam);
		instance.setSkillshow(skillshow);
		instance.setEffect1Time(effect1Time);
		instance.setEffect1Type(effect1Type);
		instance.setEffect1Param1(effect1Param1);
		instance.setEffect1Param2(effect1Param2);
		instance.setEffect1Target(effect1Target);
		instance.setEffect1Targetparam(effect1Targetparam);
		instance.setEffect1Condition(effect1Condition);
		instance.setEffect1Conparam(effect1Conparam);
		instance.setEffect1Show(effect1Show);
		instance.setEffect2Time(effect2Time);
		instance.setEffect2Timeparam(effect2Timeparam);
		instance.setEffect2Type(effect2Type);
		instance.setEffect2Param1(effect2Param1);
		instance.setEffect2Param2(effect2Param2);
		instance.setEffect2Target(effect2Target);
		instance.setEffect2Targetparam(effect2Targetparam);
		instance.setEffect2Condition(effect2Condition);
		instance.setEffect2Conparam(effect2Conparam);
		instance.setEffect2Show(effect2Show);
		instance.setEffect3Time(effect3Time);
		instance.setEffect3Timeparam(effect3Timeparam);
		instance.setEffect3Type(effect3Type);
		instance.setEffect3Param1(effect3Param1);
		instance.setEffect3Param2(effect3Param2);
		instance.setEffect3Target(effect3Target);
		instance.setEffect3Targetparam(effect3Targetparam);
		instance.setEffect3Condition(effect3Condition);
		instance.setEffect3Conparam(effect3Conparam);
		instance.setEffect3Show(effect3Show);
		instance.setEffect4Time(effect4Time);
		instance.setEffect4Timeparam(effect4Timeparam);
		instance.setEffect4Type(effect4Type);
		instance.setEffect4Param1(effect4Param1);
		instance.setEffect4Param2(effect4Param2);
		instance.setEffect4Target(effect4Target);
		instance.setEffect4Targetparam(effect4Targetparam);
		instance.setEffect4Condition(effect4Condition);
		instance.setEffect4Conparam(effect4Conparam);
		instance.setEffect4Show(effect4Show);
		instance.setEffect5Time(effect5Time);
		instance.setEffect5Timeparam(effect5Timeparam);
		instance.setEffect5Type(effect5Type);
		instance.setEffect5Param1(effect5Param1);
		instance.setEffect5Param2(effect5Param2);
		instance.setEffect5Target(effect5Target);
		instance.setEffect5Targetparam(effect5Targetparam);
		instance.setEffect5Condition(effect5Condition);
		instance.setEffect5Conparam(effect5Conparam);
		instance.setEffect5Show(effect5Show);
		instance.setEffect6Time(effect6Time);
		instance.setEffect6Timeparam(effect6Timeparam);
		instance.setEffect6Type(effect6Type);
		instance.setEffect6Param1(effect6Param1);
		instance.setEffect6Param2(effect6Param2);
		instance.setEffect6Target(effect6Target);
		instance.setEffect6Targetparam(effect6Targetparam);
		instance.setEffect6Condition(effect6Condition);
		instance.setEffect6Conparam(effect6Conparam);
		instance.setEffect6Show(effect6Show);
		instance.setEffect7Time(effect7Time);
		instance.setEffect7Timeparam(effect7Timeparam);
		instance.setEffect7Type(effect7Type);
		instance.setEffect7Param1(effect7Param1);
		instance.setEffect7Param2(effect7Param2);
		instance.setEffect7Target(effect7Target);
		instance.setEffect7Targetparam(effect7Targetparam);
		instance.setEffect7Condition(effect7Condition);
		instance.setEffect7Conparam(effect7Conparam);
		instance.setEffect7Show(effect7Show);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO skill_s (`id`,`skill_name`,`unlock_level`,`skill_level`,`skill_position`,`skill_type`,`energy`,`range`,`begin_cd`,`cool_cd`,`duration`,`default_condition`,`deco_param`,`order`,`icon`,`desc`,`default_target`,`default_target_param`,`skillshow`,`effect1_time`,`effect1_type`,`effect1_param1`,`effect1_param2`,`effect1_target`,`effect1_targetparam`,`effect1_condition`,`effect1_conparam`,`effect1_show`,`effect2_time`,`effect2_timeparam`,`effect2_type`,`effect2_param1`,`effect2_param2`,`effect2_target`,`effect2_targetparam`,`effect2_condition`,`effect2_conparam`,`effect2_show`,`effect3_time`,`effect3_timeparam`,`effect3_type`,`effect3_param1`,`effect3_param2`,`effect3_target`,`effect3_targetparam`,`effect3_condition`,`effect3_conparam`,`effect3_show`,`effect4_time`,`effect4_timeparam`,`effect4_type`,`effect4_param1`,`effect4_param2`,`effect4_target`,`effect4_targetparam`,`effect4_condition`,`effect4_conparam`,`effect4_show`,`effect5_time`,`effect5_timeparam`,`effect5_type`,`effect5_param1`,`effect5_param2`,`effect5_target`,`effect5_targetparam`,`effect5_condition`,`effect5_conparam`,`effect5_show`,`effect6_time`,`effect6_timeparam`,`effect6_type`,`effect6_param1`,`effect6_param2`,`effect6_target`,`effect6_targetparam`,`effect6_condition`,`effect6_conparam`,`effect6_show`,`effect7_time`,`effect7_timeparam`,`effect7_type`,`effect7_param1`,`effect7_param2`,`effect7_target`,`effect7_targetparam`,`effect7_condition`,`effect7_conparam`,`effect7_show`) VALUES(:id,:skillName,:unlockLevel,:skillLevel,:skillPosition,:skillType,:energy,:range,:beginCd,:coolCd,:duration,:defaultCondition,:decoParam,:order,:icon,:desc,:defaultTarget,:defaultTargetParam,:skillshow,:effect1Time,:effect1Type,:effect1Param1,:effect1Param2,:effect1Target,:effect1Targetparam,:effect1Condition,:effect1Conparam,:effect1Show,:effect2Time,:effect2Timeparam,:effect2Type,:effect2Param1,:effect2Param2,:effect2Target,:effect2Targetparam,:effect2Condition,:effect2Conparam,:effect2Show,:effect3Time,:effect3Timeparam,:effect3Type,:effect3Param1,:effect3Param2,:effect3Target,:effect3Targetparam,:effect3Condition,:effect3Conparam,:effect3Show,:effect4Time,:effect4Timeparam,:effect4Type,:effect4Param1,:effect4Param2,:effect4Target,:effect4Targetparam,:effect4Condition,:effect4Conparam,:effect4Show,:effect5Time,:effect5Timeparam,:effect5Type,:effect5Param1,:effect5Param2,:effect5Target,:effect5Targetparam,:effect5Condition,:effect5Conparam,:effect5Show,:effect6Time,:effect6Timeparam,:effect6Type,:effect6Param1,:effect6Param2,:effect6Target,:effect6Targetparam,:effect6Condition,:effect6Conparam,:effect6Show,:effect7Time,:effect7Timeparam,:effect7Type,:effect7Param1,:effect7Param2,:effect7Target,:effect7Targetparam,:effect7Condition,:effect7Conparam,:effect7Show)";
	}
	protected String getUpdateSql() {
		return "UPDATE skill_s SET `skill_name`=:skillName,`unlock_level`=:unlockLevel,`skill_level`=:skillLevel,`skill_position`=:skillPosition,`skill_type`=:skillType,`energy`=:energy,`range`=:range,`begin_cd`=:beginCd,`cool_cd`=:coolCd,`duration`=:duration,`default_condition`=:defaultCondition,`deco_param`=:decoParam,`order`=:order,`icon`=:icon,`desc`=:desc,`default_target`=:defaultTarget,`default_target_param`=:defaultTargetParam,`skillshow`=:skillshow,`effect1_time`=:effect1Time,`effect1_type`=:effect1Type,`effect1_param1`=:effect1Param1,`effect1_param2`=:effect1Param2,`effect1_target`=:effect1Target,`effect1_targetparam`=:effect1Targetparam,`effect1_condition`=:effect1Condition,`effect1_conparam`=:effect1Conparam,`effect1_show`=:effect1Show,`effect2_time`=:effect2Time,`effect2_timeparam`=:effect2Timeparam,`effect2_type`=:effect2Type,`effect2_param1`=:effect2Param1,`effect2_param2`=:effect2Param2,`effect2_target`=:effect2Target,`effect2_targetparam`=:effect2Targetparam,`effect2_condition`=:effect2Condition,`effect2_conparam`=:effect2Conparam,`effect2_show`=:effect2Show,`effect3_time`=:effect3Time,`effect3_timeparam`=:effect3Timeparam,`effect3_type`=:effect3Type,`effect3_param1`=:effect3Param1,`effect3_param2`=:effect3Param2,`effect3_target`=:effect3Target,`effect3_targetparam`=:effect3Targetparam,`effect3_condition`=:effect3Condition,`effect3_conparam`=:effect3Conparam,`effect3_show`=:effect3Show,`effect4_time`=:effect4Time,`effect4_timeparam`=:effect4Timeparam,`effect4_type`=:effect4Type,`effect4_param1`=:effect4Param1,`effect4_param2`=:effect4Param2,`effect4_target`=:effect4Target,`effect4_targetparam`=:effect4Targetparam,`effect4_condition`=:effect4Condition,`effect4_conparam`=:effect4Conparam,`effect4_show`=:effect4Show,`effect5_time`=:effect5Time,`effect5_timeparam`=:effect5Timeparam,`effect5_type`=:effect5Type,`effect5_param1`=:effect5Param1,`effect5_param2`=:effect5Param2,`effect5_target`=:effect5Target,`effect5_targetparam`=:effect5Targetparam,`effect5_condition`=:effect5Condition,`effect5_conparam`=:effect5Conparam,`effect5_show`=:effect5Show,`effect6_time`=:effect6Time,`effect6_timeparam`=:effect6Timeparam,`effect6_type`=:effect6Type,`effect6_param1`=:effect6Param1,`effect6_param2`=:effect6Param2,`effect6_target`=:effect6Target,`effect6_targetparam`=:effect6Targetparam,`effect6_condition`=:effect6Condition,`effect6_conparam`=:effect6Conparam,`effect6_show`=:effect6Show,`effect7_time`=:effect7Time,`effect7_timeparam`=:effect7Timeparam,`effect7_type`=:effect7Type,`effect7_param1`=:effect7Param1,`effect7_param2`=:effect7Param2,`effect7_target`=:effect7Target,`effect7_targetparam`=:effect7Targetparam,`effect7_condition`=:effect7Condition,`effect7_conparam`=:effect7Conparam,`effect7_show`=:effect7Show WHERE id=:id";
	}
	protected java.lang.Integer getKey(SkillS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "skill_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

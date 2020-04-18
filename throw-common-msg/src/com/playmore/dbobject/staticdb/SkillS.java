package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SkillS implements Serializable {

	@DBFieldName(fieldName="技能ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="技能名称", isNullable="columnNullable")
	private String skillName;
	@DBFieldName(fieldName="技能解锁等级", isNullable="columnNullable")
	private int unlockLevel;
	@DBFieldName(fieldName="技能等级", isNullable="columnNullable")
	private int skillLevel;
	@DBFieldName(fieldName="技能位置", isNullable="columnNullable")
	private int skillPosition;
	@DBFieldName(fieldName="技能类型", isNullable="columnNullable")
	private int skillType;
	@DBFieldName(fieldName="能量值", isNullable="columnNullable")
	private int energy;
	@DBFieldName(fieldName="技能范围", isNullable="columnNullable")
	private int range;
	@DBFieldName(fieldName="开场CD", isNullable="columnNullable")
	private int beginCd;
	@DBFieldName(fieldName="间隔CD", isNullable="columnNullable")
	private int coolCd;
	@DBFieldName(fieldName="时间长度", isNullable="columnNullable")
	private int duration;
	@DBFieldName(fieldName="技能释放条件", isNullable="columnNullable")
	private int defaultCondition;
	@DBFieldName(fieldName="条件参数", isNullable="columnNullable")
	private int decoParam;
	@DBFieldName(fieldName="技能释放优先级", isNullable="columnNullable")
	private int order;
	@DBFieldName(fieldName="技能ICON", isNullable="columnNullable")
	private int icon;
	@DBFieldName(fieldName="技能描述", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="技能默认目标", isNullable="columnNullable")
	private int defaultTarget;
	@DBFieldName(fieldName="技能默认目标参数", isNullable="columnNullable")
	private int defaultTargetParam;
	@DBFieldName(fieldName="攻击效果", isNullable="columnNullable")
	private String skillshow;
	@DBFieldName(fieldName="技能效果1触发时机", isNullable="columnNullable")
	private int effect1Time;
	@DBFieldName(fieldName="技能效果1类型", isNullable="columnNullable")
	private int effect1Type;
	@DBFieldName(fieldName="技能效果1类型参数1", isNullable="columnNullable")
	private int effect1Param1;
	@DBFieldName(fieldName="技能效果1类型参数2", isNullable="columnNullable")
	private String effect1Param2;
	@DBFieldName(fieldName="技能效果1目标", isNullable="columnNullable")
	private int effect1Target;
	@DBFieldName(fieldName="技能效果1目标参数", isNullable="columnNullable")
	private int effect1Targetparam;
	@DBFieldName(fieldName="技能效果1释放条件", isNullable="columnNullable")
	private int effect1Condition;
	@DBFieldName(fieldName="技能效果1条件参数", isNullable="columnNullable")
	private int effect1Conparam;
	@DBFieldName(fieldName="技能效果1表现", isNullable="columnNullable")
	private int effect1Show;
	@DBFieldName(fieldName="技能效果2触发时机", isNullable="columnNullable")
	private int effect2Time;
	@DBFieldName(fieldName="触发时机参数", isNullable="columnNullable")
	private int effect2Timeparam;
	@DBFieldName(fieldName="技能效果2类型", isNullable="columnNullable")
	private int effect2Type;
	@DBFieldName(fieldName="技能效果2类型参数1", isNullable="columnNullable")
	private int effect2Param1;
	@DBFieldName(fieldName="技能效果2类型参数2", isNullable="columnNullable")
	private int effect2Param2;
	@DBFieldName(fieldName="技能效果2目标", isNullable="columnNullable")
	private int effect2Target;
	@DBFieldName(fieldName="技能效果2目标参数", isNullable="columnNullable")
	private int effect2Targetparam;
	@DBFieldName(fieldName="技能效果2释放条件", isNullable="columnNullable")
	private int effect2Condition;
	@DBFieldName(fieldName="技能效果2条件参数", isNullable="columnNullable")
	private int effect2Conparam;
	@DBFieldName(fieldName="技能效果2表现", isNullable="columnNullable")
	private int effect2Show;
	@DBFieldName(fieldName="技能效果3触发时机", isNullable="columnNullable")
	private int effect3Time;
	@DBFieldName(fieldName="触发时机参数", isNullable="columnNullable")
	private int effect3Timeparam;
	@DBFieldName(fieldName="技能效果3类型", isNullable="columnNullable")
	private int effect3Type;
	@DBFieldName(fieldName="技能效果3类型参数1", isNullable="columnNullable")
	private int effect3Param1;
	@DBFieldName(fieldName="技能效果3类型参数2", isNullable="columnNullable")
	private int effect3Param2;
	@DBFieldName(fieldName="技能效果3目标", isNullable="columnNullable")
	private int effect3Target;
	@DBFieldName(fieldName="技能效果3目标参数", isNullable="columnNullable")
	private int effect3Targetparam;
	@DBFieldName(fieldName="技能效果3释放条件", isNullable="columnNullable")
	private int effect3Condition;
	@DBFieldName(fieldName="技能效果3条件参数", isNullable="columnNullable")
	private int effect3Conparam;
	@DBFieldName(fieldName="技能效果3表现", isNullable="columnNullable")
	private int effect3Show;
	@DBFieldName(fieldName="技能效果4触发时机", isNullable="columnNullable")
	private int effect4Time;
	@DBFieldName(fieldName="触发时机参数", isNullable="columnNullable")
	private int effect4Timeparam;
	@DBFieldName(fieldName="技能效果4类型", isNullable="columnNullable")
	private int effect4Type;
	@DBFieldName(fieldName="技能效果4类型参数1", isNullable="columnNullable")
	private int effect4Param1;
	@DBFieldName(fieldName="技能效果4类型参数2", isNullable="columnNullable")
	private int effect4Param2;
	@DBFieldName(fieldName="技能效果4目标", isNullable="columnNullable")
	private int effect4Target;
	@DBFieldName(fieldName="技能效果4目标参数", isNullable="columnNullable")
	private int effect4Targetparam;
	@DBFieldName(fieldName="技能效果4释放条件", isNullable="columnNullable")
	private int effect4Condition;
	@DBFieldName(fieldName="技能效果4条件参数", isNullable="columnNullable")
	private int effect4Conparam;
	@DBFieldName(fieldName="技能效果4表现", isNullable="columnNullable")
	private int effect4Show;
	@DBFieldName(fieldName="技能效果5触发时机", isNullable="columnNullable")
	private int effect5Time;
	@DBFieldName(fieldName="触发时机参数", isNullable="columnNullable")
	private int effect5Timeparam;
	@DBFieldName(fieldName="技能效果5类型", isNullable="columnNullable")
	private int effect5Type;
	@DBFieldName(fieldName="技能效果5类型参数1", isNullable="columnNullable")
	private int effect5Param1;
	@DBFieldName(fieldName="技能效果5类型参数2", isNullable="columnNullable")
	private int effect5Param2;
	@DBFieldName(fieldName="技能效果5目标", isNullable="columnNullable")
	private int effect5Target;
	@DBFieldName(fieldName="技能效果5目标参数", isNullable="columnNullable")
	private int effect5Targetparam;
	@DBFieldName(fieldName="技能效果5释放条件", isNullable="columnNullable")
	private int effect5Condition;
	@DBFieldName(fieldName="技能效果5条件参数", isNullable="columnNullable")
	private int effect5Conparam;
	@DBFieldName(fieldName="技能效果5表现", isNullable="columnNullable")
	private int effect5Show;
	@DBFieldName(fieldName="技能效果6触发时机", isNullable="columnNullable")
	private int effect6Time;
	@DBFieldName(fieldName="触发时机参数", isNullable="columnNullable")
	private int effect6Timeparam;
	@DBFieldName(fieldName="技能效果6类型", isNullable="columnNullable")
	private int effect6Type;
	@DBFieldName(fieldName="技能效果6类型参数1", isNullable="columnNullable")
	private int effect6Param1;
	@DBFieldName(fieldName="技能效果6类型参数2", isNullable="columnNullable")
	private int effect6Param2;
	@DBFieldName(fieldName="技能效果6目标", isNullable="columnNullable")
	private int effect6Target;
	@DBFieldName(fieldName="技能效果6目标参数", isNullable="columnNullable")
	private int effect6Targetparam;
	@DBFieldName(fieldName="技能效果6释放条件", isNullable="columnNullable")
	private int effect6Condition;
	@DBFieldName(fieldName="技能效果6条件参数", isNullable="columnNullable")
	private int effect6Conparam;
	@DBFieldName(fieldName="技能效果6表现", isNullable="columnNullable")
	private int effect6Show;
	@DBFieldName(fieldName="技能效果7触发时机", isNullable="columnNullable")
	private int effect7Time;
	@DBFieldName(fieldName="触发时机参数", isNullable="columnNullable")
	private int effect7Timeparam;
	@DBFieldName(fieldName="技能效果7类型", isNullable="columnNullable")
	private int effect7Type;
	@DBFieldName(fieldName="技能效果7类型参数1", isNullable="columnNullable")
	private int effect7Param1;
	@DBFieldName(fieldName="技能效果7类型参数2", isNullable="columnNullable")
	private int effect7Param2;
	@DBFieldName(fieldName="技能效果7目标", isNullable="columnNullable")
	private int effect7Target;
	@DBFieldName(fieldName="技能效果7目标参数", isNullable="columnNullable")
	private int effect7Targetparam;
	@DBFieldName(fieldName="技能效果7释放条件", isNullable="columnNullable")
	private int effect7Condition;
	@DBFieldName(fieldName="技能效果7条件参数", isNullable="columnNullable")
	private int effect7Conparam;
	@DBFieldName(fieldName="技能效果7表现", isNullable="columnNullable")
	private int effect7Show;

	public SkillS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setSkillName(String skillName) {
		this.skillName=skillName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setUnlockLevel(int unlockLevel) {
		this.unlockLevel=unlockLevel;
	}

	public int getUnlockLevel() {
		return unlockLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel=skillLevel;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillPosition(int skillPosition) {
		this.skillPosition=skillPosition;
	}

	public int getSkillPosition() {
		return skillPosition;
	}

	public void setSkillType(int skillType) {
		this.skillType=skillType;
	}

	public int getSkillType() {
		return skillType;
	}

	public void setEnergy(int energy) {
		this.energy=energy;
	}

	public int getEnergy() {
		return energy;
	}

	public void setRange(int range) {
		this.range=range;
	}

	public int getRange() {
		return range;
	}

	public void setBeginCd(int beginCd) {
		this.beginCd=beginCd;
	}

	public int getBeginCd() {
		return beginCd;
	}

	public void setCoolCd(int coolCd) {
		this.coolCd=coolCd;
	}

	public int getCoolCd() {
		return coolCd;
	}

	public void setDuration(int duration) {
		this.duration=duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDefaultCondition(int defaultCondition) {
		this.defaultCondition=defaultCondition;
	}

	public int getDefaultCondition() {
		return defaultCondition;
	}

	public void setDecoParam(int decoParam) {
		this.decoParam=decoParam;
	}

	public int getDecoParam() {
		return decoParam;
	}

	public void setOrder(int order) {
		this.order=order;
	}

	public int getOrder() {
		return order;
	}

	public void setIcon(int icon) {
		this.icon=icon;
	}

	public int getIcon() {
		return icon;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDefaultTarget(int defaultTarget) {
		this.defaultTarget=defaultTarget;
	}

	public int getDefaultTarget() {
		return defaultTarget;
	}

	public void setDefaultTargetParam(int defaultTargetParam) {
		this.defaultTargetParam=defaultTargetParam;
	}

	public int getDefaultTargetParam() {
		return defaultTargetParam;
	}

	public void setSkillshow(String skillshow) {
		this.skillshow=skillshow;
	}

	public String getSkillshow() {
		return skillshow;
	}

	public void setEffect1Time(int effect1Time) {
		this.effect1Time=effect1Time;
	}

	public int getEffect1Time() {
		return effect1Time;
	}

	public void setEffect1Type(int effect1Type) {
		this.effect1Type=effect1Type;
	}

	public int getEffect1Type() {
		return effect1Type;
	}

	public void setEffect1Param1(int effect1Param1) {
		this.effect1Param1=effect1Param1;
	}

	public int getEffect1Param1() {
		return effect1Param1;
	}

	public void setEffect1Param2(String effect1Param2) {
		this.effect1Param2=effect1Param2;
	}

	public String getEffect1Param2() {
		return effect1Param2;
	}

	public void setEffect1Target(int effect1Target) {
		this.effect1Target=effect1Target;
	}

	public int getEffect1Target() {
		return effect1Target;
	}

	public void setEffect1Targetparam(int effect1Targetparam) {
		this.effect1Targetparam=effect1Targetparam;
	}

	public int getEffect1Targetparam() {
		return effect1Targetparam;
	}

	public void setEffect1Condition(int effect1Condition) {
		this.effect1Condition=effect1Condition;
	}

	public int getEffect1Condition() {
		return effect1Condition;
	}

	public void setEffect1Conparam(int effect1Conparam) {
		this.effect1Conparam=effect1Conparam;
	}

	public int getEffect1Conparam() {
		return effect1Conparam;
	}

	public void setEffect1Show(int effect1Show) {
		this.effect1Show=effect1Show;
	}

	public int getEffect1Show() {
		return effect1Show;
	}

	public void setEffect2Time(int effect2Time) {
		this.effect2Time=effect2Time;
	}

	public int getEffect2Time() {
		return effect2Time;
	}

	public void setEffect2Timeparam(int effect2Timeparam) {
		this.effect2Timeparam=effect2Timeparam;
	}

	public int getEffect2Timeparam() {
		return effect2Timeparam;
	}

	public void setEffect2Type(int effect2Type) {
		this.effect2Type=effect2Type;
	}

	public int getEffect2Type() {
		return effect2Type;
	}

	public void setEffect2Param1(int effect2Param1) {
		this.effect2Param1=effect2Param1;
	}

	public int getEffect2Param1() {
		return effect2Param1;
	}

	public void setEffect2Param2(int effect2Param2) {
		this.effect2Param2=effect2Param2;
	}

	public int getEffect2Param2() {
		return effect2Param2;
	}

	public void setEffect2Target(int effect2Target) {
		this.effect2Target=effect2Target;
	}

	public int getEffect2Target() {
		return effect2Target;
	}

	public void setEffect2Targetparam(int effect2Targetparam) {
		this.effect2Targetparam=effect2Targetparam;
	}

	public int getEffect2Targetparam() {
		return effect2Targetparam;
	}

	public void setEffect2Condition(int effect2Condition) {
		this.effect2Condition=effect2Condition;
	}

	public int getEffect2Condition() {
		return effect2Condition;
	}

	public void setEffect2Conparam(int effect2Conparam) {
		this.effect2Conparam=effect2Conparam;
	}

	public int getEffect2Conparam() {
		return effect2Conparam;
	}

	public void setEffect2Show(int effect2Show) {
		this.effect2Show=effect2Show;
	}

	public int getEffect2Show() {
		return effect2Show;
	}

	public void setEffect3Time(int effect3Time) {
		this.effect3Time=effect3Time;
	}

	public int getEffect3Time() {
		return effect3Time;
	}

	public void setEffect3Timeparam(int effect3Timeparam) {
		this.effect3Timeparam=effect3Timeparam;
	}

	public int getEffect3Timeparam() {
		return effect3Timeparam;
	}

	public void setEffect3Type(int effect3Type) {
		this.effect3Type=effect3Type;
	}

	public int getEffect3Type() {
		return effect3Type;
	}

	public void setEffect3Param1(int effect3Param1) {
		this.effect3Param1=effect3Param1;
	}

	public int getEffect3Param1() {
		return effect3Param1;
	}

	public void setEffect3Param2(int effect3Param2) {
		this.effect3Param2=effect3Param2;
	}

	public int getEffect3Param2() {
		return effect3Param2;
	}

	public void setEffect3Target(int effect3Target) {
		this.effect3Target=effect3Target;
	}

	public int getEffect3Target() {
		return effect3Target;
	}

	public void setEffect3Targetparam(int effect3Targetparam) {
		this.effect3Targetparam=effect3Targetparam;
	}

	public int getEffect3Targetparam() {
		return effect3Targetparam;
	}

	public void setEffect3Condition(int effect3Condition) {
		this.effect3Condition=effect3Condition;
	}

	public int getEffect3Condition() {
		return effect3Condition;
	}

	public void setEffect3Conparam(int effect3Conparam) {
		this.effect3Conparam=effect3Conparam;
	}

	public int getEffect3Conparam() {
		return effect3Conparam;
	}

	public void setEffect3Show(int effect3Show) {
		this.effect3Show=effect3Show;
	}

	public int getEffect3Show() {
		return effect3Show;
	}

	public void setEffect4Time(int effect4Time) {
		this.effect4Time=effect4Time;
	}

	public int getEffect4Time() {
		return effect4Time;
	}

	public void setEffect4Timeparam(int effect4Timeparam) {
		this.effect4Timeparam=effect4Timeparam;
	}

	public int getEffect4Timeparam() {
		return effect4Timeparam;
	}

	public void setEffect4Type(int effect4Type) {
		this.effect4Type=effect4Type;
	}

	public int getEffect4Type() {
		return effect4Type;
	}

	public void setEffect4Param1(int effect4Param1) {
		this.effect4Param1=effect4Param1;
	}

	public int getEffect4Param1() {
		return effect4Param1;
	}

	public void setEffect4Param2(int effect4Param2) {
		this.effect4Param2=effect4Param2;
	}

	public int getEffect4Param2() {
		return effect4Param2;
	}

	public void setEffect4Target(int effect4Target) {
		this.effect4Target=effect4Target;
	}

	public int getEffect4Target() {
		return effect4Target;
	}

	public void setEffect4Targetparam(int effect4Targetparam) {
		this.effect4Targetparam=effect4Targetparam;
	}

	public int getEffect4Targetparam() {
		return effect4Targetparam;
	}

	public void setEffect4Condition(int effect4Condition) {
		this.effect4Condition=effect4Condition;
	}

	public int getEffect4Condition() {
		return effect4Condition;
	}

	public void setEffect4Conparam(int effect4Conparam) {
		this.effect4Conparam=effect4Conparam;
	}

	public int getEffect4Conparam() {
		return effect4Conparam;
	}

	public void setEffect4Show(int effect4Show) {
		this.effect4Show=effect4Show;
	}

	public int getEffect4Show() {
		return effect4Show;
	}

	public void setEffect5Time(int effect5Time) {
		this.effect5Time=effect5Time;
	}

	public int getEffect5Time() {
		return effect5Time;
	}

	public void setEffect5Timeparam(int effect5Timeparam) {
		this.effect5Timeparam=effect5Timeparam;
	}

	public int getEffect5Timeparam() {
		return effect5Timeparam;
	}

	public void setEffect5Type(int effect5Type) {
		this.effect5Type=effect5Type;
	}

	public int getEffect5Type() {
		return effect5Type;
	}

	public void setEffect5Param1(int effect5Param1) {
		this.effect5Param1=effect5Param1;
	}

	public int getEffect5Param1() {
		return effect5Param1;
	}

	public void setEffect5Param2(int effect5Param2) {
		this.effect5Param2=effect5Param2;
	}

	public int getEffect5Param2() {
		return effect5Param2;
	}

	public void setEffect5Target(int effect5Target) {
		this.effect5Target=effect5Target;
	}

	public int getEffect5Target() {
		return effect5Target;
	}

	public void setEffect5Targetparam(int effect5Targetparam) {
		this.effect5Targetparam=effect5Targetparam;
	}

	public int getEffect5Targetparam() {
		return effect5Targetparam;
	}

	public void setEffect5Condition(int effect5Condition) {
		this.effect5Condition=effect5Condition;
	}

	public int getEffect5Condition() {
		return effect5Condition;
	}

	public void setEffect5Conparam(int effect5Conparam) {
		this.effect5Conparam=effect5Conparam;
	}

	public int getEffect5Conparam() {
		return effect5Conparam;
	}

	public void setEffect5Show(int effect5Show) {
		this.effect5Show=effect5Show;
	}

	public int getEffect5Show() {
		return effect5Show;
	}

	public void setEffect6Time(int effect6Time) {
		this.effect6Time=effect6Time;
	}

	public int getEffect6Time() {
		return effect6Time;
	}

	public void setEffect6Timeparam(int effect6Timeparam) {
		this.effect6Timeparam=effect6Timeparam;
	}

	public int getEffect6Timeparam() {
		return effect6Timeparam;
	}

	public void setEffect6Type(int effect6Type) {
		this.effect6Type=effect6Type;
	}

	public int getEffect6Type() {
		return effect6Type;
	}

	public void setEffect6Param1(int effect6Param1) {
		this.effect6Param1=effect6Param1;
	}

	public int getEffect6Param1() {
		return effect6Param1;
	}

	public void setEffect6Param2(int effect6Param2) {
		this.effect6Param2=effect6Param2;
	}

	public int getEffect6Param2() {
		return effect6Param2;
	}

	public void setEffect6Target(int effect6Target) {
		this.effect6Target=effect6Target;
	}

	public int getEffect6Target() {
		return effect6Target;
	}

	public void setEffect6Targetparam(int effect6Targetparam) {
		this.effect6Targetparam=effect6Targetparam;
	}

	public int getEffect6Targetparam() {
		return effect6Targetparam;
	}

	public void setEffect6Condition(int effect6Condition) {
		this.effect6Condition=effect6Condition;
	}

	public int getEffect6Condition() {
		return effect6Condition;
	}

	public void setEffect6Conparam(int effect6Conparam) {
		this.effect6Conparam=effect6Conparam;
	}

	public int getEffect6Conparam() {
		return effect6Conparam;
	}

	public void setEffect6Show(int effect6Show) {
		this.effect6Show=effect6Show;
	}

	public int getEffect6Show() {
		return effect6Show;
	}

	public void setEffect7Time(int effect7Time) {
		this.effect7Time=effect7Time;
	}

	public int getEffect7Time() {
		return effect7Time;
	}

	public void setEffect7Timeparam(int effect7Timeparam) {
		this.effect7Timeparam=effect7Timeparam;
	}

	public int getEffect7Timeparam() {
		return effect7Timeparam;
	}

	public void setEffect7Type(int effect7Type) {
		this.effect7Type=effect7Type;
	}

	public int getEffect7Type() {
		return effect7Type;
	}

	public void setEffect7Param1(int effect7Param1) {
		this.effect7Param1=effect7Param1;
	}

	public int getEffect7Param1() {
		return effect7Param1;
	}

	public void setEffect7Param2(int effect7Param2) {
		this.effect7Param2=effect7Param2;
	}

	public int getEffect7Param2() {
		return effect7Param2;
	}

	public void setEffect7Target(int effect7Target) {
		this.effect7Target=effect7Target;
	}

	public int getEffect7Target() {
		return effect7Target;
	}

	public void setEffect7Targetparam(int effect7Targetparam) {
		this.effect7Targetparam=effect7Targetparam;
	}

	public int getEffect7Targetparam() {
		return effect7Targetparam;
	}

	public void setEffect7Condition(int effect7Condition) {
		this.effect7Condition=effect7Condition;
	}

	public int getEffect7Condition() {
		return effect7Condition;
	}

	public void setEffect7Conparam(int effect7Conparam) {
		this.effect7Conparam=effect7Conparam;
	}

	public int getEffect7Conparam() {
		return effect7Conparam;
	}

	public void setEffect7Show(int effect7Show) {
		this.effect7Show=effect7Show;
	}

	public int getEffect7Show() {
		return effect7Show;
	}

	public String toString() {
		return "SkillS [id=" + id + " ,skillName=" + skillName + " ,unlockLevel=" + unlockLevel + " ,skillLevel=" + skillLevel + " ,skillPosition=" + skillPosition + " ,skillType=" + skillType + " ,energy=" + energy + " ,range=" + range + " ,beginCd=" + beginCd + " ,coolCd=" + coolCd + " ,duration=" + duration + " ,defaultCondition=" + defaultCondition + " ,decoParam=" + decoParam + " ,order=" + order + " ,icon=" + icon + " ,desc=" + desc + " ,defaultTarget=" + defaultTarget + " ,defaultTargetParam=" + defaultTargetParam + " ,skillshow=" + skillshow + " ,effect1Time=" + effect1Time + " ,effect1Type=" + effect1Type + " ,effect1Param1=" + effect1Param1 + " ,effect1Param2=" + effect1Param2 + " ,effect1Target=" + effect1Target + " ,effect1Targetparam=" + effect1Targetparam + " ,effect1Condition=" + effect1Condition + " ,effect1Conparam=" + effect1Conparam + " ,effect1Show=" + effect1Show + " ,effect2Time=" + effect2Time + " ,effect2Timeparam=" + effect2Timeparam + " ,effect2Type=" + effect2Type + " ,effect2Param1=" + effect2Param1 + " ,effect2Param2=" + effect2Param2 + " ,effect2Target=" + effect2Target + " ,effect2Targetparam=" + effect2Targetparam + " ,effect2Condition=" + effect2Condition + " ,effect2Conparam=" + effect2Conparam + " ,effect2Show=" + effect2Show + " ,effect3Time=" + effect3Time + " ,effect3Timeparam=" + effect3Timeparam + " ,effect3Type=" + effect3Type + " ,effect3Param1=" + effect3Param1 + " ,effect3Param2=" + effect3Param2 + " ,effect3Target=" + effect3Target + " ,effect3Targetparam=" + effect3Targetparam + " ,effect3Condition=" + effect3Condition + " ,effect3Conparam=" + effect3Conparam + " ,effect3Show=" + effect3Show + " ,effect4Time=" + effect4Time + " ,effect4Timeparam=" + effect4Timeparam + " ,effect4Type=" + effect4Type + " ,effect4Param1=" + effect4Param1 + " ,effect4Param2=" + effect4Param2 + " ,effect4Target=" + effect4Target + " ,effect4Targetparam=" + effect4Targetparam + " ,effect4Condition=" + effect4Condition + " ,effect4Conparam=" + effect4Conparam + " ,effect4Show=" + effect4Show + " ,effect5Time=" + effect5Time + " ,effect5Timeparam=" + effect5Timeparam + " ,effect5Type=" + effect5Type + " ,effect5Param1=" + effect5Param1 + " ,effect5Param2=" + effect5Param2 + " ,effect5Target=" + effect5Target + " ,effect5Targetparam=" + effect5Targetparam + " ,effect5Condition=" + effect5Condition + " ,effect5Conparam=" + effect5Conparam + " ,effect5Show=" + effect5Show + " ,effect6Time=" + effect6Time + " ,effect6Timeparam=" + effect6Timeparam + " ,effect6Type=" + effect6Type + " ,effect6Param1=" + effect6Param1 + " ,effect6Param2=" + effect6Param2 + " ,effect6Target=" + effect6Target + " ,effect6Targetparam=" + effect6Targetparam + " ,effect6Condition=" + effect6Condition + " ,effect6Conparam=" + effect6Conparam + " ,effect6Show=" + effect6Show + " ,effect7Time=" + effect7Time + " ,effect7Timeparam=" + effect7Timeparam + " ,effect7Type=" + effect7Type + " ,effect7Param1=" + effect7Param1 + " ,effect7Param2=" + effect7Param2 + " ,effect7Target=" + effect7Target + " ,effect7Targetparam=" + effect7Targetparam + " ,effect7Condition=" + effect7Condition + " ,effect7Conparam=" + effect7Conparam + " ,effect7Show=" + effect7Show+ "]";
	}
}

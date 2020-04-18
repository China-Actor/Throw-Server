package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SignS implements Serializable {

	@DBFieldName(fieldName="标记ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="持续时间", isNullable="columnNullable")
	private int time;
	@DBFieldName(fieldName="最大叠加层数", isNullable="columnNullable")
	private int layer;
	@DBFieldName(fieldName="是否能被净化（0不可，1可）", isNullable="columnNullable")
	private int clean;
	@DBFieldName(fieldName="标记触发类型（1叠加至X层数触发，2持有标记目标死亡触发，3标记持续时间结束后触发", isNullable="columnNullable")
	private String triggerType;
	@DBFieldName(fieldName="触发参数", isNullable="columnNullable")
	private String triggerValue;
	@DBFieldName(fieldName="触发后是否清除标记（0不清除，1清除）", isNullable="columnNullable")
	private String disappear;
	@DBFieldName(fieldName="标记表现效果", isNullable="columnNullable")
	private int signShow;
	@DBFieldName(fieldName="标记携带效果类型", isNullable="columnNullable")
	private String signType;
	@DBFieldName(fieldName="标记携带效果参数", isNullable="columnNullable")
	private int signParam;
	@DBFieldName(fieldName="标记携带效果值", isNullable="columnNullable")
	private int signValue;
	@DBFieldName(fieldName="触发技能表现1", isNullable="columnNullable")
	private int effect1Show;
	@DBFieldName(fieldName="标记触发技能效果1类型", isNullable="columnNullable")
	private String effect1Type;
	@DBFieldName(fieldName="标记触发技能效果1参数1", isNullable="columnNullable")
	private String effect1Param1;
	@DBFieldName(fieldName="标记触发技能效果1参数2", isNullable="columnNullable")
	private int effect1Param2;
	@DBFieldName(fieldName="标记触发技能1目标", isNullable="columnNullable")
	private String effect1Target;
	@DBFieldName(fieldName="标记触发技能1目标参数", isNullable="columnNullable")
	private int effect1TargetParam;
	@DBFieldName(fieldName="标记触发技能1释放条件", isNullable="columnNullable")
	private int effect1Condition;
	@DBFieldName(fieldName="标记触发技能1条件参数", isNullable="columnNullable")
	private int effect1Conparam;
	@DBFieldName(fieldName="触发技能表现2", isNullable="columnNullable")
	private int effect2Show;
	@DBFieldName(fieldName="标记触发技能效果2类型", isNullable="columnNullable")
	private String effect2Type;
	@DBFieldName(fieldName="标记触发技能效果2参数1", isNullable="columnNullable")
	private String effect2Param1;
	@DBFieldName(fieldName="标记触发技能效果2参数2", isNullable="columnNullable")
	private int effect2Param2;
	@DBFieldName(fieldName="标记触发技能2目标", isNullable="columnNullable")
	private String effect2Target;
	@DBFieldName(fieldName="标记触发技能2目标参数", isNullable="columnNullable")
	private int effect2TargetParam;
	@DBFieldName(fieldName="标记触发技能2释放条件", isNullable="columnNullable")
	private int effect2Condition;
	@DBFieldName(fieldName="标记触发技能2条件参数", isNullable="columnNullable")
	private int effect2Conparam;

	public SignS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setTime(int time) {
		this.time=time;
	}

	public int getTime() {
		return time;
	}

	public void setLayer(int layer) {
		this.layer=layer;
	}

	public int getLayer() {
		return layer;
	}

	public void setClean(int clean) {
		this.clean=clean;
	}

	public int getClean() {
		return clean;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType=triggerType;
	}

	public String getTriggerType() {
		return triggerType;
	}

	public void setTriggerValue(String triggerValue) {
		this.triggerValue=triggerValue;
	}

	public String getTriggerValue() {
		return triggerValue;
	}

	public void setDisappear(String disappear) {
		this.disappear=disappear;
	}

	public String getDisappear() {
		return disappear;
	}

	public void setSignShow(int signShow) {
		this.signShow=signShow;
	}

	public int getSignShow() {
		return signShow;
	}

	public void setSignType(String signType) {
		this.signType=signType;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignParam(int signParam) {
		this.signParam=signParam;
	}

	public int getSignParam() {
		return signParam;
	}

	public void setSignValue(int signValue) {
		this.signValue=signValue;
	}

	public int getSignValue() {
		return signValue;
	}

	public void setEffect1Show(int effect1Show) {
		this.effect1Show=effect1Show;
	}

	public int getEffect1Show() {
		return effect1Show;
	}

	public void setEffect1Type(String effect1Type) {
		this.effect1Type=effect1Type;
	}

	public String getEffect1Type() {
		return effect1Type;
	}

	public void setEffect1Param1(String effect1Param1) {
		this.effect1Param1=effect1Param1;
	}

	public String getEffect1Param1() {
		return effect1Param1;
	}

	public void setEffect1Param2(int effect1Param2) {
		this.effect1Param2=effect1Param2;
	}

	public int getEffect1Param2() {
		return effect1Param2;
	}

	public void setEffect1Target(String effect1Target) {
		this.effect1Target=effect1Target;
	}

	public String getEffect1Target() {
		return effect1Target;
	}

	public void setEffect1TargetParam(int effect1TargetParam) {
		this.effect1TargetParam=effect1TargetParam;
	}

	public int getEffect1TargetParam() {
		return effect1TargetParam;
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

	public void setEffect2Show(int effect2Show) {
		this.effect2Show=effect2Show;
	}

	public int getEffect2Show() {
		return effect2Show;
	}

	public void setEffect2Type(String effect2Type) {
		this.effect2Type=effect2Type;
	}

	public String getEffect2Type() {
		return effect2Type;
	}

	public void setEffect2Param1(String effect2Param1) {
		this.effect2Param1=effect2Param1;
	}

	public String getEffect2Param1() {
		return effect2Param1;
	}

	public void setEffect2Param2(int effect2Param2) {
		this.effect2Param2=effect2Param2;
	}

	public int getEffect2Param2() {
		return effect2Param2;
	}

	public void setEffect2Target(String effect2Target) {
		this.effect2Target=effect2Target;
	}

	public String getEffect2Target() {
		return effect2Target;
	}

	public void setEffect2TargetParam(int effect2TargetParam) {
		this.effect2TargetParam=effect2TargetParam;
	}

	public int getEffect2TargetParam() {
		return effect2TargetParam;
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

	public String toString() {
		return "SignS [id=" + id + " ,time=" + time + " ,layer=" + layer + " ,clean=" + clean + " ,triggerType=" + triggerType + " ,triggerValue=" + triggerValue + " ,disappear=" + disappear + " ,signShow=" + signShow + " ,signType=" + signType + " ,signParam=" + signParam + " ,signValue=" + signValue + " ,effect1Show=" + effect1Show + " ,effect1Type=" + effect1Type + " ,effect1Param1=" + effect1Param1 + " ,effect1Param2=" + effect1Param2 + " ,effect1Target=" + effect1Target + " ,effect1TargetParam=" + effect1TargetParam + " ,effect1Condition=" + effect1Condition + " ,effect1Conparam=" + effect1Conparam + " ,effect2Show=" + effect2Show + " ,effect2Type=" + effect2Type + " ,effect2Param1=" + effect2Param1 + " ,effect2Param2=" + effect2Param2 + " ,effect2Target=" + effect2Target + " ,effect2TargetParam=" + effect2TargetParam + " ,effect2Condition=" + effect2Condition + " ,effect2Conparam=" + effect2Conparam+ "]";
	}
}

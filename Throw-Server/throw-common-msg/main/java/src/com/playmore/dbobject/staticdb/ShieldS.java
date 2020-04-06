package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ShieldS implements Serializable {

	@DBFieldName(fieldName="护盾ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="护盾类型（0全部，1物理，2魔法，3空", isNullable="columnNullable")
	private String shieldType;
	@DBFieldName(fieldName="护盾值类型（1释放者攻击力百分比，2释放者最大生命值百分比，3护盾目标最大生命值百分比，4具体数值", isNullable="columnNullable")
	private String valueType;
	@DBFieldName(fieldName="值", isNullable="columnNullable")
	private int value;
	@DBFieldName(fieldName="护盾效果展示", isNullable="columnNullable")
	private String shieldShow;
	@DBFieldName(fieldName="护盾存在效果1表现", isNullable="columnNullable")
	private String effect1Show;
	@DBFieldName(fieldName="护盾存在时效果1类型", isNullable="columnNullable")
	private String effect1Type;
	@DBFieldName(fieldName="护盾存在时效果1类型参数1", isNullable="columnNullable")
	private String effect1Param1;
	@DBFieldName(fieldName="护盾存在时效果1类型参数2", isNullable="columnNullable")
	private String effect1Param2;
	@DBFieldName(fieldName="护盾存在时效果1目标", isNullable="columnNullable")
	private String effect1Target;
	@DBFieldName(fieldName="护盾存在时效果1目标参数", isNullable="columnNullable")
	private int effect1TargetParam;
	@DBFieldName(fieldName="护盾存在时效果1释放条件", isNullable="columnNullable")
	private int effect1Condition;
	@DBFieldName(fieldName="护盾存在时效果1条件参数", isNullable="columnNullable")
	private int effect1Conparam;
	@DBFieldName(fieldName="护盾存在效果2表现", isNullable="columnNullable")
	private int effect2Show;
	@DBFieldName(fieldName="护盾存在时效果2类型", isNullable="columnNullable")
	private String effect2Type;
	@DBFieldName(fieldName="护盾存在时效果2类型参数2", isNullable="columnNullable")
	private int effect2Param1;
	@DBFieldName(fieldName="护盾存在时效果2类型参数2", isNullable="columnNullable")
	private int effect2Param2;
	@DBFieldName(fieldName="护盾存在时效果2目标", isNullable="columnNullable")
	private String effect2Target;
	@DBFieldName(fieldName="护盾存在时效果2目标参数", isNullable="columnNullable")
	private int effect2TargetParam;
	@DBFieldName(fieldName="护盾存在时效果2释放条件", isNullable="columnNullable")
	private int effect2Condition;
	@DBFieldName(fieldName="护盾存在时效果2条件参数", isNullable="columnNullable")
	private int effect2Conparam;
	@DBFieldName(fieldName="护盾消失展示", isNullable="columnNullable")
	private int deathShow;
	@DBFieldName(fieldName="护盾消失效果1表现", isNullable="columnNullable")
	private int effect3Show;
	@DBFieldName(fieldName="护盾消失时效果3类型", isNullable="columnNullable")
	private String effect3Type;
	@DBFieldName(fieldName="护盾消失时效果1类型参数1", isNullable="columnNullable")
	private String effect3Param1;
	@DBFieldName(fieldName="护盾消失时效果1类型参数2", isNullable="columnNullable")
	private int effect3Param2;
	@DBFieldName(fieldName="护盾消失时效果1目标", isNullable="columnNullable")
	private String effect3Target;
	@DBFieldName(fieldName="护盾消失时效果1目标参数", isNullable="columnNullable")
	private int effect3Targetparam;
	@DBFieldName(fieldName="护盾消失时效果1释放条件", isNullable="columnNullable")
	private int effect3Condition;
	@DBFieldName(fieldName="护盾消失时效果1条件参数", isNullable="columnNullable")
	private int effect3Conparam;

	public ShieldS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setShieldType(String shieldType) {
		this.shieldType=shieldType;
	}

	public String getShieldType() {
		return shieldType;
	}

	public void setValueType(String valueType) {
		this.valueType=valueType;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValue(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setShieldShow(String shieldShow) {
		this.shieldShow=shieldShow;
	}

	public String getShieldShow() {
		return shieldShow;
	}

	public void setEffect1Show(String effect1Show) {
		this.effect1Show=effect1Show;
	}

	public String getEffect1Show() {
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

	public void setEffect1Param2(String effect1Param2) {
		this.effect1Param2=effect1Param2;
	}

	public String getEffect1Param2() {
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

	public void setDeathShow(int deathShow) {
		this.deathShow=deathShow;
	}

	public int getDeathShow() {
		return deathShow;
	}

	public void setEffect3Show(int effect3Show) {
		this.effect3Show=effect3Show;
	}

	public int getEffect3Show() {
		return effect3Show;
	}

	public void setEffect3Type(String effect3Type) {
		this.effect3Type=effect3Type;
	}

	public String getEffect3Type() {
		return effect3Type;
	}

	public void setEffect3Param1(String effect3Param1) {
		this.effect3Param1=effect3Param1;
	}

	public String getEffect3Param1() {
		return effect3Param1;
	}

	public void setEffect3Param2(int effect3Param2) {
		this.effect3Param2=effect3Param2;
	}

	public int getEffect3Param2() {
		return effect3Param2;
	}

	public void setEffect3Target(String effect3Target) {
		this.effect3Target=effect3Target;
	}

	public String getEffect3Target() {
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

	public String toString() {
		return "ShieldS [id=" + id + " ,shieldType=" + shieldType + " ,valueType=" + valueType + " ,value=" + value + " ,shieldShow=" + shieldShow + " ,effect1Show=" + effect1Show + " ,effect1Type=" + effect1Type + " ,effect1Param1=" + effect1Param1 + " ,effect1Param2=" + effect1Param2 + " ,effect1Target=" + effect1Target + " ,effect1TargetParam=" + effect1TargetParam + " ,effect1Condition=" + effect1Condition + " ,effect1Conparam=" + effect1Conparam + " ,effect2Show=" + effect2Show + " ,effect2Type=" + effect2Type + " ,effect2Param1=" + effect2Param1 + " ,effect2Param2=" + effect2Param2 + " ,effect2Target=" + effect2Target + " ,effect2TargetParam=" + effect2TargetParam + " ,effect2Condition=" + effect2Condition + " ,effect2Conparam=" + effect2Conparam + " ,deathShow=" + deathShow + " ,effect3Show=" + effect3Show + " ,effect3Type=" + effect3Type + " ,effect3Param1=" + effect3Param1 + " ,effect3Param2=" + effect3Param2 + " ,effect3Target=" + effect3Target + " ,effect3Targetparam=" + effect3Targetparam + " ,effect3Condition=" + effect3Condition + " ,effect3Conparam=" + effect3Conparam+ "]";
	}
}

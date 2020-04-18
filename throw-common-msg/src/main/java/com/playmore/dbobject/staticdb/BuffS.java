package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BuffS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="最大叠加层数", isNullable="columnNullable")
	private int layer;
	@DBFieldName(fieldName="是否能被净化（0不可，1可）", isNullable="columnNullable")
	private int clean;
	@DBFieldName(fieldName="是否为减益buff", isNullable="columnNullable")
	private int debuff;
	@DBFieldName(fieldName="buff效果1类型（1战斗属性的变化，2持续伤害，3持续治疗，4持续能量值变化，5特殊", isNullable="columnNullable")
	private String buff1Type;
	@DBFieldName(fieldName="buff效果1参数", isNullable="columnNullable")
	private String buff1Param;
	@DBFieldName(fieldName="buff效果1值", isNullable="columnNullable")
	private String buff1Value;
	@DBFieldName(fieldName="buff效果1表现", isNullable="columnNullable")
	private String buff1Show;
	@DBFieldName(fieldName="buff效果2类型（1战斗属性的变化，2持续伤害，3持续治疗，4持续能量值变化，5特殊", isNullable="columnNullable")
	private String buff2Type;
	@DBFieldName(fieldName="buff效果2参数", isNullable="columnNullable")
	private String buff2Param;
	@DBFieldName(fieldName="buff效果2值", isNullable="columnNullable")
	private int buff2Value;
	@DBFieldName(fieldName="buff效果2表现", isNullable="columnNullable")
	private String buff2Show;
	@DBFieldName(fieldName="buff效果3类型（1战斗属性的变化，2持续伤害，3持续治疗，4持续能量值变化，5特殊", isNullable="columnNullable")
	private String buff3Type;
	@DBFieldName(fieldName="buff效果3参数", isNullable="columnNullable")
	private String buff3Param;
	@DBFieldName(fieldName="buff效果3值", isNullable="columnNullable")
	private int buff3Value;
	@DBFieldName(fieldName="buff效果3表现", isNullable="columnNullable")
	private int buff3Show;

	public BuffS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
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

	public void setDebuff(int debuff) {
		this.debuff=debuff;
	}

	public int getDebuff() {
		return debuff;
	}

	public void setBuff1Type(String buff1Type) {
		this.buff1Type=buff1Type;
	}

	public String getBuff1Type() {
		return buff1Type;
	}

	public void setBuff1Param(String buff1Param) {
		this.buff1Param=buff1Param;
	}

	public String getBuff1Param() {
		return buff1Param;
	}

	public void setBuff1Value(String buff1Value) {
		this.buff1Value=buff1Value;
	}

	public String getBuff1Value() {
		return buff1Value;
	}

	public void setBuff1Show(String buff1Show) {
		this.buff1Show=buff1Show;
	}

	public String getBuff1Show() {
		return buff1Show;
	}

	public void setBuff2Type(String buff2Type) {
		this.buff2Type=buff2Type;
	}

	public String getBuff2Type() {
		return buff2Type;
	}

	public void setBuff2Param(String buff2Param) {
		this.buff2Param=buff2Param;
	}

	public String getBuff2Param() {
		return buff2Param;
	}

	public void setBuff2Value(int buff2Value) {
		this.buff2Value=buff2Value;
	}

	public int getBuff2Value() {
		return buff2Value;
	}

	public void setBuff2Show(String buff2Show) {
		this.buff2Show=buff2Show;
	}

	public String getBuff2Show() {
		return buff2Show;
	}

	public void setBuff3Type(String buff3Type) {
		this.buff3Type=buff3Type;
	}

	public String getBuff3Type() {
		return buff3Type;
	}

	public void setBuff3Param(String buff3Param) {
		this.buff3Param=buff3Param;
	}

	public String getBuff3Param() {
		return buff3Param;
	}

	public void setBuff3Value(int buff3Value) {
		this.buff3Value=buff3Value;
	}

	public int getBuff3Value() {
		return buff3Value;
	}

	public void setBuff3Show(int buff3Show) {
		this.buff3Show=buff3Show;
	}

	public int getBuff3Show() {
		return buff3Show;
	}

	public String toString() {
		return "BuffS [id=" + id + " ,layer=" + layer + " ,clean=" + clean + " ,debuff=" + debuff + " ,buff1Type=" + buff1Type + " ,buff1Param=" + buff1Param + " ,buff1Value=" + buff1Value + " ,buff1Show=" + buff1Show + " ,buff2Type=" + buff2Type + " ,buff2Param=" + buff2Param + " ,buff2Value=" + buff2Value + " ,buff2Show=" + buff2Show + " ,buff3Type=" + buff3Type + " ,buff3Param=" + buff3Param + " ,buff3Value=" + buff3Value + " ,buff3Show=" + buff3Show+ "]";
	}
}

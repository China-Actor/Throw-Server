package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TeamlinkS implements Serializable {

	@DBFieldName(fieldName="编号", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="源技能ID", isNullable="columnNullable")
	private int teamlinkId;
	@DBFieldName(fieldName="链接名称", isNullable="columnNullable")
	private String teamlinkName;
	@DBFieldName(fieldName="链接描述", isNullable="columnNullable")
	private String teamlinkDesc;
	@DBFieldName(fieldName="链接ICON", isNullable="columnNullable")
	private String teamlinkIcon;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="英雄1", isNullable="columnNullable")
	private int hero1;
	@DBFieldName(fieldName="英雄2", isNullable="columnNullable")
	private int hero2;
	@DBFieldName(fieldName="英雄3", isNullable="columnNullable")
	private int hero3;
	@DBFieldName(fieldName="解锁品质", isNullable="columnNullable")
	private int unlockQuailty;
	@DBFieldName(fieldName="属性增加值1", isNullable="columnNullable")
	private String value1;
	@DBFieldName(fieldName="属性增加值2", isNullable="columnNullable")
	private String value2;
	@DBFieldName(fieldName="属性增加值3", isNullable="columnNullable")
	private String value3;

	public TeamlinkS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setTeamlinkId(int teamlinkId) {
		this.teamlinkId=teamlinkId;
	}

	public int getTeamlinkId() {
		return teamlinkId;
	}

	public void setTeamlinkName(String teamlinkName) {
		this.teamlinkName=teamlinkName;
	}

	public String getTeamlinkName() {
		return teamlinkName;
	}

	public void setTeamlinkDesc(String teamlinkDesc) {
		this.teamlinkDesc=teamlinkDesc;
	}

	public String getTeamlinkDesc() {
		return teamlinkDesc;
	}

	public void setTeamlinkIcon(String teamlinkIcon) {
		this.teamlinkIcon=teamlinkIcon;
	}

	public String getTeamlinkIcon() {
		return teamlinkIcon;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setHero1(int hero1) {
		this.hero1=hero1;
	}

	public int getHero1() {
		return hero1;
	}

	public void setHero2(int hero2) {
		this.hero2=hero2;
	}

	public int getHero2() {
		return hero2;
	}

	public void setHero3(int hero3) {
		this.hero3=hero3;
	}

	public int getHero3() {
		return hero3;
	}

	public void setUnlockQuailty(int unlockQuailty) {
		this.unlockQuailty=unlockQuailty;
	}

	public int getUnlockQuailty() {
		return unlockQuailty;
	}

	public void setValue1(String value1) {
		this.value1=value1;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue2(String value2) {
		this.value2=value2;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue3(String value3) {
		this.value3=value3;
	}

	public String getValue3() {
		return value3;
	}

	public String toString() {
		return "TeamlinkS [id=" + id + " ,teamlinkId=" + teamlinkId + " ,teamlinkName=" + teamlinkName + " ,teamlinkDesc=" + teamlinkDesc + " ,teamlinkIcon=" + teamlinkIcon + " ,level=" + level + " ,hero1=" + hero1 + " ,hero2=" + hero2 + " ,hero3=" + hero3 + " ,unlockQuailty=" + unlockQuailty + " ,value1=" + value1 + " ,value2=" + value2 + " ,value3=" + value3+ "]";
	}
}

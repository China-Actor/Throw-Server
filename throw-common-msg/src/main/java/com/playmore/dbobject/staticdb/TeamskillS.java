package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TeamskillS implements Serializable {

	@DBFieldName(fieldName="编号", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="源技能ID", isNullable="columnNullable")
	private int teamskillId;
	@DBFieldName(fieldName="技能标题", isNullable="columnNullable")
	private String teamskillTitle;
	@DBFieldName(fieldName="技能名称", isNullable="columnNullable")
	private String teamskillName;
	@DBFieldName(fieldName="技能描述", isNullable="columnNullable")
	private String teamskillDesc;
	@DBFieldName(fieldName="技能ICON", isNullable="columnNullable")
	private String teamskillIcon;
	@DBFieldName(fieldName="源技能", isNullable="columnNullable")
	private int teamSkill;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="战斗力加成万分比", isNullable="columnNullable")
	private int grade;
	@DBFieldName(fieldName="解锁英雄1", isNullable="columnNullable")
	private int hero1;
	@DBFieldName(fieldName="解锁英雄2", isNullable="columnNullable")
	private int hero2;
	@DBFieldName(fieldName="解锁英雄3", isNullable="columnNullable")
	private int hero3;
	@DBFieldName(fieldName="解锁英雄4", isNullable="columnNullable")
	private int hero4;
	@DBFieldName(fieldName="解锁英雄5", isNullable="columnNullable")
	private int hero5;
	@DBFieldName(fieldName="解锁品质", isNullable="columnNullable")
	private int unlockQuailty;

	public TeamskillS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setTeamskillId(int teamskillId) {
		this.teamskillId=teamskillId;
	}

	public int getTeamskillId() {
		return teamskillId;
	}

	public void setTeamskillTitle(String teamskillTitle) {
		this.teamskillTitle=teamskillTitle;
	}

	public String getTeamskillTitle() {
		return teamskillTitle;
	}

	public void setTeamskillName(String teamskillName) {
		this.teamskillName=teamskillName;
	}

	public String getTeamskillName() {
		return teamskillName;
	}

	public void setTeamskillDesc(String teamskillDesc) {
		this.teamskillDesc=teamskillDesc;
	}

	public String getTeamskillDesc() {
		return teamskillDesc;
	}

	public void setTeamskillIcon(String teamskillIcon) {
		this.teamskillIcon=teamskillIcon;
	}

	public String getTeamskillIcon() {
		return teamskillIcon;
	}

	public void setTeamSkill(int teamSkill) {
		this.teamSkill=teamSkill;
	}

	public int getTeamSkill() {
		return teamSkill;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setGrade(int grade) {
		this.grade=grade;
	}

	public int getGrade() {
		return grade;
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

	public void setHero4(int hero4) {
		this.hero4=hero4;
	}

	public int getHero4() {
		return hero4;
	}

	public void setHero5(int hero5) {
		this.hero5=hero5;
	}

	public int getHero5() {
		return hero5;
	}

	public void setUnlockQuailty(int unlockQuailty) {
		this.unlockQuailty=unlockQuailty;
	}

	public int getUnlockQuailty() {
		return unlockQuailty;
	}

	public String toString() {
		return "TeamskillS [id=" + id + " ,teamskillId=" + teamskillId + " ,teamskillTitle=" + teamskillTitle + " ,teamskillName=" + teamskillName + " ,teamskillDesc=" + teamskillDesc + " ,teamskillIcon=" + teamskillIcon + " ,teamSkill=" + teamSkill + " ,level=" + level + " ,grade=" + grade + " ,hero1=" + hero1 + " ,hero2=" + hero2 + " ,hero3=" + hero3 + " ,hero4=" + hero4 + " ,hero5=" + hero5 + " ,unlockQuailty=" + unlockQuailty+ "]";
	}
}

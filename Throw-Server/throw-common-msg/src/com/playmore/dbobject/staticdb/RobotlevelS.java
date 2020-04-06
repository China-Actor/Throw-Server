package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RobotlevelS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="玩家等级", isNullable="columnNullable")
	private int playLevel;
	@DBFieldName(fieldName="英雄最低等级", isNullable="columnNullable")
	private int heroMinLevel;
	@DBFieldName(fieldName="英雄最高等级", isNullable="columnNullable")
	private int heroMaxLevel;
	@DBFieldName(fieldName="竞技场积分", isNullable="columnNullable")
	private int pvpRunk;
	@DBFieldName(fieldName="玩家数量", isNullable="columnNullable")
	private int num;
	@DBFieldName(fieldName="真实玩家", isNullable="columnNullable")
	private int realPlayerNum;
	@DBFieldName(fieldName="关卡", isNullable="columnNullable")
	private String stage1;
	@DBFieldName(fieldName="机器人类型（1迷宫，2竞技场，3高阶竞技场）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="源技能", isNullable="columnNullable")
	private String teamskill;

	public RobotlevelS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setPlayLevel(int playLevel) {
		this.playLevel=playLevel;
	}

	public int getPlayLevel() {
		return playLevel;
	}

	public void setHeroMinLevel(int heroMinLevel) {
		this.heroMinLevel=heroMinLevel;
	}

	public int getHeroMinLevel() {
		return heroMinLevel;
	}

	public void setHeroMaxLevel(int heroMaxLevel) {
		this.heroMaxLevel=heroMaxLevel;
	}

	public int getHeroMaxLevel() {
		return heroMaxLevel;
	}

	public void setPvpRunk(int pvpRunk) {
		this.pvpRunk=pvpRunk;
	}

	public int getPvpRunk() {
		return pvpRunk;
	}

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setRealPlayerNum(int realPlayerNum) {
		this.realPlayerNum=realPlayerNum;
	}

	public int getRealPlayerNum() {
		return realPlayerNum;
	}

	public void setStage1(String stage1) {
		this.stage1=stage1;
	}

	public String getStage1() {
		return stage1;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setTeamskill(String teamskill) {
		this.teamskill=teamskill;
	}

	public String getTeamskill() {
		return teamskill;
	}

	public String toString() {
		return "RobotlevelS [id=" + id + " ,playLevel=" + playLevel + " ,heroMinLevel=" + heroMinLevel + " ,heroMaxLevel=" + heroMaxLevel + " ,pvpRunk=" + pvpRunk + " ,num=" + num + " ,realPlayerNum=" + realPlayerNum + " ,stage1=" + stage1 + " ,type=" + type + " ,teamskill=" + teamskill+ "]";
	}
}

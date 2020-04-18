package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TowerS implements Serializable {

	@DBFieldName(fieldName="关卡ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="关卡名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="关卡类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="挑战时间", isNullable="columnNullable")
	private int time;
	@DBFieldName(fieldName="阵营限制", isNullable="columnNullable")
	private int camp;
	@DBFieldName(fieldName="解锁下一关", isNullable="columnNullable")
	private int nextStage;
	@DBFieldName(fieldName="怪物组ID", isNullable="columnNullable")
	private int teamId;
	@DBFieldName(fieldName="关卡挑战时长", isNullable="columnNullable")
	private int maxTime;
	@DBFieldName(fieldName="最大可上阵人数", isNullable="columnNullable")
	private int heroNum;
	@DBFieldName(fieldName="关卡掉落包", isNullable="columnNullable")
	private int dropId1;
	@DBFieldName(fieldName="关卡描述", isNullable="columnNullable")
	private String desc;

	public TowerS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setTime(int time) {
		this.time=time;
	}

	public int getTime() {
		return time;
	}

	public void setCamp(int camp) {
		this.camp=camp;
	}

	public int getCamp() {
		return camp;
	}

	public void setNextStage(int nextStage) {
		this.nextStage=nextStage;
	}

	public int getNextStage() {
		return nextStage;
	}

	public void setTeamId(int teamId) {
		this.teamId=teamId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime=maxTime;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setHeroNum(int heroNum) {
		this.heroNum=heroNum;
	}

	public int getHeroNum() {
		return heroNum;
	}

	public void setDropId1(int dropId1) {
		this.dropId1=dropId1;
	}

	public int getDropId1() {
		return dropId1;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return "TowerS [id=" + id + " ,name=" + name + " ,type=" + type + " ,time=" + time + " ,camp=" + camp + " ,nextStage=" + nextStage + " ,teamId=" + teamId + " ,maxTime=" + maxTime + " ,heroNum=" + heroNum + " ,dropId1=" + dropId1 + " ,desc=" + desc+ "]";
	}
}

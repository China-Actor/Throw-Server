package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RewardlevelS implements Serializable {

	@DBFieldName(fieldName="悬赏等级", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="升级需要完成个人任务品质", isNullable="columnNullable")
	private int singleQuailty;
	@DBFieldName(fieldName="升级需要完成个人任务数量", isNullable="columnNullable")
	private int singleNum;
	@DBFieldName(fieldName="升级需要完成团队任务品质", isNullable="columnNullable")
	private int teamQuailty;
	@DBFieldName(fieldName="升级需要完成团队任务数量", isNullable="columnNullable")
	private int teamNum;
	@DBFieldName(fieldName="可接任务品质", isNullable="columnNullable")
	private String taskQuality;

	public RewardlevelS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setSingleQuailty(int singleQuailty) {
		this.singleQuailty=singleQuailty;
	}

	public int getSingleQuailty() {
		return singleQuailty;
	}

	public void setSingleNum(int singleNum) {
		this.singleNum=singleNum;
	}

	public int getSingleNum() {
		return singleNum;
	}

	public void setTeamQuailty(int teamQuailty) {
		this.teamQuailty=teamQuailty;
	}

	public int getTeamQuailty() {
		return teamQuailty;
	}

	public void setTeamNum(int teamNum) {
		this.teamNum=teamNum;
	}

	public int getTeamNum() {
		return teamNum;
	}

	public void setTaskQuality(String taskQuality) {
		this.taskQuality=taskQuality;
	}

	public String getTaskQuality() {
		return taskQuality;
	}

	public String toString() {
		return "RewardlevelS [id=" + id + " ,singleQuailty=" + singleQuailty + " ,singleNum=" + singleNum + " ,teamQuailty=" + teamQuailty + " ,teamNum=" + teamNum + " ,taskQuality=" + taskQuality+ "]";
	}
}

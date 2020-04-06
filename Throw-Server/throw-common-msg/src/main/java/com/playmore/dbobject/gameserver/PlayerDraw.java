package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerDraw implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="卡池id", isNullable="columnNoNulls")
	private int drawId;
	@DBFieldName(fieldName="卡池保底次数", isNullable="columnNullable")
	private int leastNum;
	@DBFieldName(fieldName="抽奖总次数", isNullable="columnNullable")
	private int totalNum;
	@DBFieldName(fieldName="任务累计次数", isNullable="columnNullable")
	private int taskAccumulate;
	@DBFieldName(fieldName="(种族有效)开启标识字段", isNullable="columnNullable")
	private boolean raceFlag;
	@DBFieldName(fieldName="种族更新时间", isNullable="columnNullable")
	private String raceUpdateTime;

	public PlayerDraw(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setDrawId(int drawId) {
		this.drawId=drawId;
	}

	public int getDrawId() {
		return drawId;
	}

	public void setLeastNum(int leastNum) {
		this.leastNum=leastNum;
	}

	public int getLeastNum() {
		return leastNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum=totalNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTaskAccumulate(int taskAccumulate) {
		this.taskAccumulate=taskAccumulate;
	}

	public int getTaskAccumulate() {
		return taskAccumulate;
	}

	public void setRaceFlag(boolean raceFlag) {
		this.raceFlag=raceFlag;
	}

	public boolean getRaceFlag() {
		return raceFlag;
	}

	public void setRaceUpdateTime(String raceUpdateTime) {
		this.raceUpdateTime=raceUpdateTime;
	}

	public String getRaceUpdateTime() {
		return raceUpdateTime;
	}

	public String toString() {
		return "PlayerDraw [id=" + id + " ,pid=" + pid + " ,drawId=" + drawId + " ,leastNum=" + leastNum + " ,totalNum=" + totalNum + " ,taskAccumulate=" + taskAccumulate + " ,raceFlag=" + raceFlag + " ,raceUpdateTime=" + raceUpdateTime+ "]";
	}
}

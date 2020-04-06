package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerTask implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="任务id", isNullable="columnNullable")
	private int taskId;
	@DBFieldName(fieldName="系统类型（1.日常任务 2.周常任务 3.主线任务）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="当前进度", isNullable="columnNullable")
	private int cp;
	@DBFieldName(fieldName="所需进度", isNullable="columnNullable")
	private int np;
	@DBFieldName(fieldName="活跃值", isNullable="columnNullable")
	private int value;
	@DBFieldName(fieldName="领取状态", isNullable="columnNullable")
	private boolean receiveStatus;
	@DBFieldName(fieldName="添加时间", isNullable="columnNullable")
	private String insertTime;

	public PlayerTask(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setTaskId(int taskId) {
		this.taskId=taskId;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setCp(int cp) {
		this.cp=cp;
	}

	public int getCp() {
		return cp;
	}

	public void setNp(int np) {
		this.np=np;
	}

	public int getNp() {
		return np;
	}

	public void setValue(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setReceiveStatus(boolean receiveStatus) {
		this.receiveStatus=receiveStatus;
	}

	public boolean getReceiveStatus() {
		return receiveStatus;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime=insertTime;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public String toString() {
		return "PlayerTask [id=" + id + " ,playerId=" + playerId + " ,taskId=" + taskId + " ,type=" + type + " ,cp=" + cp + " ,np=" + np + " ,value=" + value + " ,receiveStatus=" + receiveStatus + " ,insertTime=" + insertTime+ "]";
	}
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class OfferrewardTask implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="playerId", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="任务id", isNullable="columnNullable")
	private int taskId;
	@DBFieldName(fieldName="奖励数量", isNullable="columnNullable")
	private int num;
	@DBFieldName(fieldName="类型(1个人2团队）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="所需阵营", isNullable="columnNullable")
	private String camps;
	@DBFieldName(fieldName="执行任务的英雄ids", isNullable="columnNullable")
	private String executeHeros;
	@DBFieldName(fieldName="状态", isNullable="columnNullable")
	private int status;
	@DBFieldName(fieldName="插入时间", isNullable="columnNullable")
	private String insertTime;
	@DBFieldName(fieldName="完成时间", isNullable="columnNullable")
	private String finishTime;
	@DBFieldName(fieldName="失效时间", isNullable="columnNullable")
	private String invalidTime;

	public OfferrewardTask(){
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

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setCamps(String camps) {
		this.camps=camps;
	}

	public String getCamps() {
		return camps;
	}

	public void setExecuteHeros(String executeHeros) {
		this.executeHeros=executeHeros;
	}

	public String getExecuteHeros() {
		return executeHeros;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime=insertTime;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime=finishTime;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setInvalidTime(String invalidTime) {
		this.invalidTime=invalidTime;
	}

	public String getInvalidTime() {
		return invalidTime;
	}

	public String toString() {
		return "OfferrewardTask [id=" + id + " ,playerId=" + playerId + " ,taskId=" + taskId + " ,num=" + num + " ,type=" + type + " ,camps=" + camps + " ,executeHeros=" + executeHeros + " ,status=" + status + " ,insertTime=" + insertTime + " ,finishTime=" + finishTime + " ,invalidTime=" + invalidTime+ "]";
	}
}

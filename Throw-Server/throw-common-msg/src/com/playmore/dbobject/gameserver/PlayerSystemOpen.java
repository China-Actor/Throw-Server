package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSystemOpen implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="模块id", isNullable="columnNoNulls")
	private int moduleId;
	@DBFieldName(fieldName="开放状态 （1 ：开放  0：未开放）", isNullable="columnNoNulls")
	private int openStatus;
	@DBFieldName(fieldName="时间", isNullable="columnNullable")
	private String createTime;

	public PlayerSystemOpen(){
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

	public void setModuleId(int moduleId) {
		this.moduleId=moduleId;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setOpenStatus(int openStatus) {
		this.openStatus=openStatus;
	}

	public int getOpenStatus() {
		return openStatus;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PlayerSystemOpen [id=" + id + " ,playerId=" + playerId + " ,moduleId=" + moduleId + " ,openStatus=" + openStatus + " ,createTime=" + createTime+ "]";
	}
}

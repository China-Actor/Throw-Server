package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerFriendApply implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="申请者Id", isNullable="columnNoNulls")
	private long applyPlayerId;
	private int applyServerId;
	@DBFieldName(fieldName="创建时间", isNullable="columnNoNulls")
	private String createTime;

	public PlayerFriendApply(){
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

	public void setApplyPlayerId(long applyPlayerId) {
		this.applyPlayerId=applyPlayerId;
	}

	public long getApplyPlayerId() {
		return applyPlayerId;
	}

	public void setApplyServerId(int applyServerId) {
		this.applyServerId=applyServerId;
	}

	public int getApplyServerId() {
		return applyServerId;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PlayerFriendApply [id=" + id + " ,playerId=" + playerId + " ,applyPlayerId=" + applyPlayerId + " ,applyServerId=" + applyServerId + " ,createTime=" + createTime+ "]";
	}
}

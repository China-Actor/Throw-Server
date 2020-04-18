package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendBlack implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="申请者Id", isNullable="columnNoNulls")
	private long backPlayerId;
	private int backServerId;
	@DBFieldName(fieldName="创建时间", isNullable="columnNoNulls")
	private String createTime;

	public PlayerFriendBlack(){
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

	public void setBackPlayerId(long backPlayerId) {
		this.backPlayerId=backPlayerId;
	}

	public long getBackPlayerId() {
		return backPlayerId;
	}

	public void setBackServerId(int backServerId) {
		this.backServerId=backServerId;
	}

	public int getBackServerId() {
		return backServerId;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PlayerFriendBlack [id=" + id + " ,playerId=" + playerId + " ,backPlayerId=" + backPlayerId + " ,backServerId=" + backServerId + " ,createTime=" + createTime+ "]";
	}
}

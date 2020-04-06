package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerFriendGive implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家ID", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="好友ID", isNullable="columnNoNulls")
	private long friendId;
	private int serverId;
	@DBFieldName(fieldName="更新时间", isNullable="columnNoNulls")
	private String updateTime;

	public PlayerFriendGive(){
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

	public void setFriendId(long friendId) {
		this.friendId=friendId;
	}

	public long getFriendId() {
		return friendId;
	}

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "PlayerFriendGive [id=" + id + " ,playerId=" + playerId + " ,friendId=" + friendId + " ,serverId=" + serverId + " ,updateTime=" + updateTime+ "]";
	}
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriend implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家ID", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="好友ID", isNullable="columnNoNulls")
	private long friendId;
	@DBFieldName(fieldName="serverid", isNullable="columnNoNulls")
	private int friendServerId;
	@DBFieldName(fieldName="更新时间", isNullable="columnNoNulls")
	private String updateTime;

	public PlayerFriend(){
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

	public void setFriendServerId(int friendServerId) {
		this.friendServerId=friendServerId;
	}

	public int getFriendServerId() {
		return friendServerId;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "PlayerFriend [id=" + id + " ,playerId=" + playerId + " ,friendId=" + friendId + " ,friendServerId=" + friendServerId + " ,updateTime=" + updateTime+ "]";
	}
}

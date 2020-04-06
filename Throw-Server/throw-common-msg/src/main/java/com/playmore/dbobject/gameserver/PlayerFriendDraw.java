package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerFriendDraw implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="好友ID", isNullable="columnNoNulls")
	private long friendId;
	private int serverId;
	@DBFieldName(fieldName="是否领取", isNullable="columnNoNulls")
	private boolean draw;
	@DBFieldName(fieldName="更新时间", isNullable="columnNoNulls")
	private String updateTime;

	public PlayerFriendDraw(){
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

	public void setDraw(boolean draw) {
		this.draw=draw;
	}

	public boolean getDraw() {
		return draw;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "PlayerFriendDraw [id=" + id + " ,playerId=" + playerId + " ,friendId=" + friendId + " ,serverId=" + serverId + " ,draw=" + draw + " ,updateTime=" + updateTime+ "]";
	}
}

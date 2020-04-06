package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerMailDraw implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="服务器邮件id", isNullable="columnNoNulls")
	private long serverMailId;
	@DBFieldName(fieldName="创建时间", isNullable="columnNoNulls")
	private String createTime;

	public PlayerMailDraw(){
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

	public void setServerMailId(long serverMailId) {
		this.serverMailId=serverMailId;
	}

	public long getServerMailId() {
		return serverMailId;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PlayerMailDraw [id=" + id + " ,playerId=" + playerId + " ,serverMailId=" + serverMailId + " ,createTime=" + createTime+ "]";
	}
}

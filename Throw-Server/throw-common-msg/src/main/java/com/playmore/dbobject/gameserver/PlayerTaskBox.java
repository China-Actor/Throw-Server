package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerTaskBox implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="1.日常任务 2.周常任务", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="宝箱id", isNullable="columnNullable")
	private int boxId;
	@DBFieldName(fieldName="是否打开过", isNullable="columnNullable")
	private boolean isOpen;

	public PlayerTaskBox(){
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

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setBoxId(int boxId) {
		this.boxId=boxId;
	}

	public int getBoxId() {
		return boxId;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen=isOpen;
	}

	public boolean getIsOpen() {
		return isOpen;
	}

	public String toString() {
		return "PlayerTaskBox [id=" + id + " ,playerId=" + playerId + " ,type=" + type + " ,boxId=" + boxId + " ,isOpen=" + isOpen+ "]";
	}
}

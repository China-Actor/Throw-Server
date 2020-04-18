package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeign implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="卡牌实例id", isNullable="columnNullable")
	private long playerCardId;
	@DBFieldName(fieldName="借出英雄id", isNullable="columnNullable")
	private long borrowPlayerId;
	@DBFieldName(fieldName="英雄品质", isNullable="columnNullable")
	private int quality;
	@DBFieldName(fieldName="状态", isNullable="columnNullable")
	private int status;
	@DBFieldName(fieldName="插入时间", isNullable="columnNullable")
	private String insertTime;

	public PlayerForeign(){
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

	public void setPlayerCardId(long playerCardId) {
		this.playerCardId=playerCardId;
	}

	public long getPlayerCardId() {
		return playerCardId;
	}

	public void setBorrowPlayerId(long borrowPlayerId) {
		this.borrowPlayerId=borrowPlayerId;
	}

	public long getBorrowPlayerId() {
		return borrowPlayerId;
	}

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
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

	public String toString() {
		return "PlayerForeign [id=" + id + " ,playerId=" + playerId + " ,playerCardId=" + playerCardId + " ,borrowPlayerId=" + borrowPlayerId + " ,quality=" + quality + " ,status=" + status + " ,insertTime=" + insertTime+ "]";
	}
}

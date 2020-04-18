package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeginAid implements Serializable {

	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="英雄实例id", isNullable="columnNullable")
	private long cardId;
	@DBFieldName(fieldName="英雄模板id", isNullable="columnNullable")
	private long cardTempId;
	@DBFieldName(fieldName="英雄品质", isNullable="columnNullable")
	private int quality;
	@DBFieldName(fieldName="时间", isNullable="columnNullable")
	private String createTime;

	public PlayerForeginAid(){
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

	public void setCardId(long cardId) {
		this.cardId=cardId;
	}

	public long getCardId() {
		return cardId;
	}

	public void setCardTempId(long cardTempId) {
		this.cardTempId=cardTempId;
	}

	public long getCardTempId() {
		return cardTempId;
	}

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PlayerForeginAid [id=" + id + " ,playerId=" + playerId + " ,cardId=" + cardId + " ,cardTempId=" + cardTempId + " ,quality=" + quality + " ,createTime=" + createTime+ "]";
	}
}

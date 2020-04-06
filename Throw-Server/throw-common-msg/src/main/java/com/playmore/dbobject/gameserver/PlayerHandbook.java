package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerHandbook implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="英雄id", isNullable="columnNoNulls")
	private int heroId;
	@DBFieldName(fieldName="是否领取奖励", isNullable="columnNullable")
	private boolean isReceive;

	public PlayerHandbook(){
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

	public void setHeroId(int heroId) {
		this.heroId=heroId;
	}

	public int getHeroId() {
		return heroId;
	}

	public void setIsReceive(boolean isReceive) {
		this.isReceive=isReceive;
	}

	public boolean getIsReceive() {
		return isReceive;
	}

	public String toString() {
		return "PlayerHandbook [id=" + id + " ,playerId=" + playerId + " ,heroId=" + heroId + " ,isReceive=" + isReceive+ "]";
	}
}

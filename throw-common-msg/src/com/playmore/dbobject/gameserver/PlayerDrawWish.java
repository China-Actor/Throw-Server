package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerDrawWish implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="组", isNullable="columnNullable")
	private int group;
	@DBFieldName(fieldName="槽位", isNullable="columnNullable")
	private int slot;
	@DBFieldName(fieldName="英雄id", isNullable="columnNullable")
	private int heroId;

	public PlayerDrawWish(){
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

	public void setGroup(int group) {
		this.group=group;
	}

	public int getGroup() {
		return group;
	}

	public void setSlot(int slot) {
		this.slot=slot;
	}

	public int getSlot() {
		return slot;
	}

	public void setHeroId(int heroId) {
		this.heroId=heroId;
	}

	public int getHeroId() {
		return heroId;
	}

	public String toString() {
		return "PlayerDrawWish [id=" + id + " ,playerId=" + playerId + " ,group=" + group + " ,slot=" + slot + " ,heroId=" + heroId+ "]";
	}
}

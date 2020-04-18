package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerGift implements Serializable {

	private long id;
	private long playerId;
	private String giftCode;
	private String createTime;
	private int type;

	public PlayerGift(){
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

	public void setGiftCode(String giftCode) {
		this.giftCode=giftCode;
	}

	public String getGiftCode() {
		return giftCode;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public String toString() {
		return "PlayerGift [id=" + id + " ,playerId=" + playerId + " ,giftCode=" + giftCode + " ,createTime=" + createTime + " ,type=" + type+ "]";
	}
}

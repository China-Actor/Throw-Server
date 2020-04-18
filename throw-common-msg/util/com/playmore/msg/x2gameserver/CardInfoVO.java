package com.playmore.msg.x2gameserver;

public class CardInfoVO {
	private int cardId ;             //卡牌id
	private int level ;				//阶等级
	private long id ;   				//卡牌实例id
	private int qualityId;		//品质id
	private int pos; // 位置
	private transient long playerId;
	
	
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getQualityId() {
		return qualityId;
	}
	public void setQualityId(int qualityId) {
		this.qualityId = qualityId;
	}


	
}

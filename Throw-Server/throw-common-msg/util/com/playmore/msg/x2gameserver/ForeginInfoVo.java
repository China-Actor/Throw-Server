package com.playmore.msg.x2gameserver;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ForeginInfoVo {

	private long playerId;
	private int serverId;
	private String name;
	private long cardId;
	private int cardTempId;
	private int cardLevel;
	private int qality;
	private int relation;		// 0: 自己  1: 好友  2:公会
	
	public int getRelation() {
		return relation;
	}
	public void setRelation(int relation) {
		this.relation = relation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCardId() {
		return cardId;
	}
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	public int getCardTempId() {
		return cardTempId;
	}
	public void setCardTempId(int cardTempId) {
		this.cardTempId = cardTempId;
	}

	public int getCardLevel() {
		return cardLevel;
	}
	public void setCardLevel(int cardLevel) {
		this.cardLevel = cardLevel;
	}
	public int getQality() {
		return qality;
	}
	public void setQality(int qality) {
		this.qality = qality;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	
	
}

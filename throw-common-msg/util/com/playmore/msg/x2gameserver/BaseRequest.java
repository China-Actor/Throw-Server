package com.playmore.msg.x2gameserver;

public class BaseRequest {
	private int serverId;
	private long playerId;
	private boolean isAllCardPower;
	private long playerIdA;
	public BaseRequest() {}
	
	public BaseRequest(int serverId, long playerId,long playerIdA,boolean isAllCardPower) {
		super();
		this.serverId = serverId;
		this.playerId = playerId;
		this.isAllCardPower = isAllCardPower;
		this.playerIdA = playerIdA;
	}
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public boolean isAllCardPower() {
		return isAllCardPower;
	}
	public void setAllCardPower(boolean isAllCardPower) {
		this.isAllCardPower = isAllCardPower;
	}

	public long getPlayerIdA() {
		return playerIdA;
	}

	public void setPlayerIdA(long playerIdA) {
		this.playerIdA = playerIdA;
	}
	
	
}

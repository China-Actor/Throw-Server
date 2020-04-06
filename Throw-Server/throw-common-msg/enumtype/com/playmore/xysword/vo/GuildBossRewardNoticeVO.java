package com.playmore.xysword.vo;

public class GuildBossRewardNoticeVO {
	private long guilId;
	private long playerId;
	private long hp;
	private int type;
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getGuilId() {
		return guilId;
	}
	public void setGuilId(long guilId) {
		this.guilId = guilId;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public long getHp() {
		return hp;
	}
	public void setHp(long hp) {
		this.hp = hp;
	}
	
	
}

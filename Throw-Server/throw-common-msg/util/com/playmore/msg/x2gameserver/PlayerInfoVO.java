package com.playmore.msg.x2gameserver;

public class PlayerInfoVO {
	private String name; // 名字
	private int level; // 等级
	private String playerId; // 玩家id
	private String head; // 头像
	private long power; // 战力
	private String guildName; // 公会名字
	private String guildTitle; // 公会职称
	private String area; // 地区
	private int serverId; // 服务器id
	private String stage; // 副本关卡
	private String describe; // 玩家描述
	private long maxPower;	// 所有卡牌战力
	private boolean online;	// 是否在线
	private int vip;	
	private String lastLoginTime;	// 最后一次登录时间
	private int sex;	// 性别
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public long getPower() {
		return power;
	}
	public void setPower(long power) {
		this.power = power;
	}
	public String getGuildName() {
		return guildName;
	}
	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}
	public String getGuildTitle() {
		return guildTitle;
	}
	public void setGuildTitle(String guildTitle) {
		this.guildTitle = guildTitle;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public long getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(long maxPower) {
		this.maxPower = maxPower;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
	
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerInfo implements Serializable {

	@DBFieldName(fieldName="playerid", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int serverId;
	@DBFieldName(fieldName="玩家名", isNullable="columnNoNulls")
	private String name;
	@DBFieldName(fieldName="userid", isNullable="columnNoNulls")
	private long userid;
	@DBFieldName(fieldName="渠道号编识", isNullable="columnNullable")
	private String thirdChannel;
	@DBFieldName(fieldName="性别", externalKey="SexType", isNullable="columnNoNulls")
	private boolean sex;
	@DBFieldName(fieldName="头像id", isNullable="columnNullable")
	private int head;
	@DBFieldName(fieldName="等级", isNullable="columnNoNulls")
	private int level;
	@DBFieldName(fieldName="英雄经验", isNullable="columnNoNulls")
	private long heroExp;
	@DBFieldName(fieldName="主角经验", isNullable="columnNullable")
	private long leadExp;
	@DBFieldName(fieldName="贵族经验", isNullable="columnNullable")
	private int nobleExp;
	@DBFieldName(fieldName="VIP等级", isNullable="columnNoNulls")
	private int vipLevel;
	@DBFieldName(fieldName="VIP经验", isNullable="columnNoNulls")
	private int vipExp;
	@DBFieldName(fieldName="悬赏任务等级", isNullable="columnNullable")
	private int offerrewardLevel;
	@DBFieldName(fieldName="个人任务数量", isNullable="columnNullable")
	private int singleExp;
	@DBFieldName(fieldName="团队任务数量", isNullable="columnNullable")
	private int teamExp;
	@DBFieldName(fieldName="创建日期", isNullable="columnNoNulls")
	private String createTime;
	@DBFieldName(fieldName="上次登录时间", isNullable="columnNoNulls")
	private String lastLoginTime;
	@DBFieldName(fieldName="登出时间", isNullable="columnNoNulls")
	private String logoutTime;
	@DBFieldName(fieldName="领取挂机奖励时间", isNullable="columnNullable")
	private String idleRewardTime;
	private String idleBeforeRewardTime;
	@DBFieldName(fieldName="今日在线秒下线更新", isNullable="columnNoNulls")
	private int todayOnlineSecond;
	private String resetTime;
	private int idleCount;
	@DBFieldName(fieldName="是否是机器人  0 不是  1是机器人", isNullable="columnNullable")
	private int isRobot;
	@DBFieldName(fieldName="聊天状态", isNullable="columnNullable")
	private boolean chatStatus;
	@DBFieldName(fieldName="聊天频道id", isNullable="columnNullable")
	private int chatChannelId;
	@DBFieldName(fieldName="语言id", isNullable="columnNullable")
	private int languageId;
	@DBFieldName(fieldName="年龄", isNullable="columnNullable")
	private int age;

	public PlayerInfo(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setUserid(long userid) {
		this.userid=userid;
	}

	public long getUserid() {
		return userid;
	}

	public void setThirdChannel(String thirdChannel) {
		this.thirdChannel=thirdChannel;
	}

	public String getThirdChannel() {
		return thirdChannel;
	}

	public void setSex(boolean sex) {
		this.sex=sex;
	}

	public boolean getSex() {
		return sex;
	}

	public void setHead(int head) {
		this.head=head;
	}

	public int getHead() {
		return head;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setHeroExp(long heroExp) {
		this.heroExp=heroExp;
	}

	public long getHeroExp() {
		return heroExp;
	}

	public void setLeadExp(long leadExp) {
		this.leadExp=leadExp;
	}

	public long getLeadExp() {
		return leadExp;
	}

	public void setNobleExp(int nobleExp) {
		this.nobleExp=nobleExp;
	}

	public int getNobleExp() {
		return nobleExp;
	}

	public void setVipLevel(int vipLevel) {
		this.vipLevel=vipLevel;
	}

	public int getVipLevel() {
		return vipLevel;
	}

	public void setVipExp(int vipExp) {
		this.vipExp=vipExp;
	}

	public int getVipExp() {
		return vipExp;
	}

	public void setOfferrewardLevel(int offerrewardLevel) {
		this.offerrewardLevel=offerrewardLevel;
	}

	public int getOfferrewardLevel() {
		return offerrewardLevel;
	}

	public void setSingleExp(int singleExp) {
		this.singleExp=singleExp;
	}

	public int getSingleExp() {
		return singleExp;
	}

	public void setTeamExp(int teamExp) {
		this.teamExp=teamExp;
	}

	public int getTeamExp() {
		return teamExp;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime=lastLoginTime;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLogoutTime(String logoutTime) {
		this.logoutTime=logoutTime;
	}

	public String getLogoutTime() {
		return logoutTime;
	}

	public void setIdleRewardTime(String idleRewardTime) {
		this.idleRewardTime=idleRewardTime;
	}

	public String getIdleRewardTime() {
		return idleRewardTime;
	}

	public void setIdleBeforeRewardTime(String idleBeforeRewardTime) {
		this.idleBeforeRewardTime=idleBeforeRewardTime;
	}

	public String getIdleBeforeRewardTime() {
		return idleBeforeRewardTime;
	}

	public void setTodayOnlineSecond(int todayOnlineSecond) {
		this.todayOnlineSecond=todayOnlineSecond;
	}

	public int getTodayOnlineSecond() {
		return todayOnlineSecond;
	}

	public void setResetTime(String resetTime) {
		this.resetTime=resetTime;
	}

	public String getResetTime() {
		return resetTime;
	}

	public void setIdleCount(int idleCount) {
		this.idleCount=idleCount;
	}

	public int getIdleCount() {
		return idleCount;
	}

	public void setIsRobot(int isRobot) {
		this.isRobot=isRobot;
	}

	public int getIsRobot() {
		return isRobot;
	}

	public void setChatStatus(boolean chatStatus) {
		this.chatStatus=chatStatus;
	}

	public boolean getChatStatus() {
		return chatStatus;
	}

	public void setChatChannelId(int chatChannelId) {
		this.chatChannelId=chatChannelId;
	}

	public int getChatChannelId() {
		return chatChannelId;
	}

	public void setLanguageId(int languageId) {
		this.languageId=languageId;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "PlayerInfo [id=" + id + " ,serverId=" + serverId + " ,name=" + name + " ,userid=" + userid + " ,thirdChannel=" + thirdChannel + " ,sex=" + sex + " ,head=" + head + " ,level=" + level + " ,heroExp=" + heroExp + " ,leadExp=" + leadExp + " ,nobleExp=" + nobleExp + " ,vipLevel=" + vipLevel + " ,vipExp=" + vipExp + " ,offerrewardLevel=" + offerrewardLevel + " ,singleExp=" + singleExp + " ,teamExp=" + teamExp + " ,createTime=" + createTime + " ,lastLoginTime=" + lastLoginTime + " ,logoutTime=" + logoutTime + " ,idleRewardTime=" + idleRewardTime + " ,idleBeforeRewardTime=" + idleBeforeRewardTime + " ,todayOnlineSecond=" + todayOnlineSecond + " ,resetTime=" + resetTime + " ,idleCount=" + idleCount + " ,isRobot=" + isRobot + " ,chatStatus=" + chatStatus + " ,chatChannelId=" + chatChannelId + " ,languageId=" + languageId + " ,age=" + age+ "]";
	}
}

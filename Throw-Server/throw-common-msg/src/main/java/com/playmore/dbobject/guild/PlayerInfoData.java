package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerInfoData implements Serializable {

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
	@DBFieldName(fieldName="VIP等级", isNullable="columnNoNulls")
	private int vipLevel;
	@DBFieldName(fieldName="创建日期", isNullable="columnNoNulls")
	private String createTime;
	@DBFieldName(fieldName="上次登录时间", isNullable="columnNoNulls")
	private String lastLoginTime;
	@DBFieldName(fieldName="登出时间", isNullable="columnNoNulls")
	private String logoutTime;
	@DBFieldName(fieldName="今日在线秒下线更新", isNullable="columnNoNulls")
	private int todayOnlineSecond;
	@DBFieldName(fieldName="是否在线", isNullable="columnNullable")
	private int isOnline;
	@DBFieldName(fieldName="关卡", isNullable="columnNullable")
	private String stageStr;
	@DBFieldName(fieldName="描述", isNullable="columnNullable")
	private String descript;
	private String cardInfo;
	@DBFieldName(fieldName="公会名称", isNullable="columnNullable")
	private String guildName;
	@DBFieldName(fieldName="公会职位", isNullable="columnNullable")
	private int guildDuty;
	@DBFieldName(fieldName="公会id", isNullable="columnNullable")
	private long guildId;
	@DBFieldName(fieldName="总战力", isNullable="columnNullable")
	private long totalPower;
	@DBFieldName(fieldName="阵容战力", isNullable="columnNullable")
	private long formationPower;
	@DBFieldName(fieldName="更新时间", isNullable="columnNullable")
	private String updateTime;

	public PlayerInfoData(){
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

	public void setVipLevel(int vipLevel) {
		this.vipLevel=vipLevel;
	}

	public int getVipLevel() {
		return vipLevel;
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

	public void setTodayOnlineSecond(int todayOnlineSecond) {
		this.todayOnlineSecond=todayOnlineSecond;
	}

	public int getTodayOnlineSecond() {
		return todayOnlineSecond;
	}

	public void setIsOnline(int isOnline) {
		this.isOnline=isOnline;
	}

	public int getIsOnline() {
		return isOnline;
	}

	public void setStageStr(String stageStr) {
		this.stageStr=stageStr;
	}

	public String getStageStr() {
		return stageStr;
	}

	public void setDescript(String descript) {
		this.descript=descript;
	}

	public String getDescript() {
		return descript;
	}

	public void setCardInfo(String cardInfo) {
		this.cardInfo=cardInfo;
	}

	public String getCardInfo() {
		return cardInfo;
	}

	public void setGuildName(String guildName) {
		this.guildName=guildName;
	}

	public String getGuildName() {
		return guildName;
	}

	public void setGuildDuty(int guildDuty) {
		this.guildDuty=guildDuty;
	}

	public int getGuildDuty() {
		return guildDuty;
	}

	public void setGuildId(long guildId) {
		this.guildId=guildId;
	}

	public long getGuildId() {
		return guildId;
	}

	public void setTotalPower(long totalPower) {
		this.totalPower=totalPower;
	}

	public long getTotalPower() {
		return totalPower;
	}

	public void setFormationPower(long formationPower) {
		this.formationPower=formationPower;
	}

	public long getFormationPower() {
		return formationPower;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "PlayerInfoData [id=" + id + " ,serverId=" + serverId + " ,name=" + name + " ,userid=" + userid + " ,thirdChannel=" + thirdChannel + " ,sex=" + sex + " ,head=" + head + " ,level=" + level + " ,vipLevel=" + vipLevel + " ,createTime=" + createTime + " ,lastLoginTime=" + lastLoginTime + " ,logoutTime=" + logoutTime + " ,todayOnlineSecond=" + todayOnlineSecond + " ,isOnline=" + isOnline + " ,stageStr=" + stageStr + " ,descript=" + descript + " ,cardInfo=" + cardInfo + " ,guildName=" + guildName + " ,guildDuty=" + guildDuty + " ,guildId=" + guildId + " ,totalPower=" + totalPower + " ,formationPower=" + formationPower + " ,updateTime=" + updateTime+ "]";
	}
}

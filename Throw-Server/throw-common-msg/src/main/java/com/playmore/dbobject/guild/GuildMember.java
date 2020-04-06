package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildMember implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家ID", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="serverId", isNullable="columnNullable")
	private int serverId;
	@DBFieldName(fieldName="公会id", isNullable="columnNoNulls")
	private long guildId;
	@DBFieldName(fieldName="职务", externalKey="GuildDuty", isNullable="columnNoNulls")
	private int duty;
	@DBFieldName(fieldName="总贡献", isNullable="columnNoNulls")
	private int dedication;
	@DBFieldName(fieldName="周贡献", isNullable="columnNoNulls")
	private int weekDedication;
	@DBFieldName(fieldName="累计贡献值", isNullable="columnNoNulls")
	private int totalDedication;
	@DBFieldName(fieldName="已领取的宝箱", isNullable="columnNullable")
	private String drawBoxs;
	@DBFieldName(fieldName="更新时间", isNullable="columnNoNulls")
	private String signTime;
	@DBFieldName(fieldName="创建时间", isNullable="columnNoNulls")
	private String createTime;
	@DBFieldName(fieldName="今日公会成员组队奖励", isNullable="columnNullable")
	private int teamReward;
	@DBFieldName(fieldName="组队奖励刷新时间", isNullable="columnNullable")
	private String teamRewardTime;
	@DBFieldName(fieldName="周贡献更新时间", isNullable="columnNoNulls")
	private String dedicationTime;
	private int dailyMail;
	private int dailyMailGroup;
	@DBFieldName(fieldName="普通boss挑战的次数", isNullable="columnNullable")
	private int bossBattleCount;
	@DBFieldName(fieldName="特殊boss 挑战次数", isNullable="columnNullable")
	private int specialBossBattleCount;

	public GuildMember(){
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

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setGuildId(long guildId) {
		this.guildId=guildId;
	}

	public long getGuildId() {
		return guildId;
	}

	public void setDuty(int duty) {
		this.duty=duty;
	}

	public int getDuty() {
		return duty;
	}

	public void setDedication(int dedication) {
		this.dedication=dedication;
	}

	public int getDedication() {
		return dedication;
	}

	public void setWeekDedication(int weekDedication) {
		this.weekDedication=weekDedication;
	}

	public int getWeekDedication() {
		return weekDedication;
	}

	public void setTotalDedication(int totalDedication) {
		this.totalDedication=totalDedication;
	}

	public int getTotalDedication() {
		return totalDedication;
	}

	public void setDrawBoxs(String drawBoxs) {
		this.drawBoxs=drawBoxs;
	}

	public String getDrawBoxs() {
		return drawBoxs;
	}

	public void setSignTime(String signTime) {
		this.signTime=signTime;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setTeamReward(int teamReward) {
		this.teamReward=teamReward;
	}

	public int getTeamReward() {
		return teamReward;
	}

	public void setTeamRewardTime(String teamRewardTime) {
		this.teamRewardTime=teamRewardTime;
	}

	public String getTeamRewardTime() {
		return teamRewardTime;
	}

	public void setDedicationTime(String dedicationTime) {
		this.dedicationTime=dedicationTime;
	}

	public String getDedicationTime() {
		return dedicationTime;
	}

	public void setDailyMail(int dailyMail) {
		this.dailyMail=dailyMail;
	}

	public int getDailyMail() {
		return dailyMail;
	}

	public void setDailyMailGroup(int dailyMailGroup) {
		this.dailyMailGroup=dailyMailGroup;
	}

	public int getDailyMailGroup() {
		return dailyMailGroup;
	}

	public void setBossBattleCount(int bossBattleCount) {
		this.bossBattleCount=bossBattleCount;
	}

	public int getBossBattleCount() {
		return bossBattleCount;
	}

	public void setSpecialBossBattleCount(int specialBossBattleCount) {
		this.specialBossBattleCount=specialBossBattleCount;
	}

	public int getSpecialBossBattleCount() {
		return specialBossBattleCount;
	}

	public String toString() {
		return "GuildMember [id=" + id + " ,playerId=" + playerId + " ,serverId=" + serverId + " ,guildId=" + guildId + " ,duty=" + duty + " ,dedication=" + dedication + " ,weekDedication=" + weekDedication + " ,totalDedication=" + totalDedication + " ,drawBoxs=" + drawBoxs + " ,signTime=" + signTime + " ,createTime=" + createTime + " ,teamReward=" + teamReward + " ,teamRewardTime=" + teamRewardTime + " ,dedicationTime=" + dedicationTime + " ,dailyMail=" + dailyMail + " ,dailyMailGroup=" + dailyMailGroup + " ,bossBattleCount=" + bossBattleCount + " ,specialBossBattleCount=" + specialBossBattleCount+ "]";
	}
}

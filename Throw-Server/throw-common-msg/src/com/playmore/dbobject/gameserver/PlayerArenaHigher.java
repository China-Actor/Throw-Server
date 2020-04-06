package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaHigher implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="serviceId", isNullable="columnNullable")
	private int serverId;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="排名id", isNullable="columnNullable")
	private int rankId;
	@DBFieldName(fieldName="积分", isNullable="columnNoNulls")
	private int totalScore;
	@DBFieldName(fieldName="战力（防守阵容的战力）", isNullable="columnNoNulls")
	private long defencePower;
	@DBFieldName(fieldName="每日挑战次数", isNullable="columnNullable")
	private int count;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createTime;
	@DBFieldName(fieldName="更新时间", isNullable="columnNullable")
	private String updateTime;
	@DBFieldName(fieldName="积分获得更新时间", isNullable="columnNullable")
	private String scoreUpdateTime;
	@DBFieldName(fieldName="徽章领取更新时间", isNullable="columnNullable")
	private String badgeUpdateTime;
	@DBFieldName(fieldName="宝箱领取时间", isNullable="columnNullable")
	private String boxReceiveTime;
	@DBFieldName(fieldName="购买门票次数", isNullable="columnNullable")
	private int dailyBuyCount;
	@DBFieldName(fieldName="购买时间", isNullable="columnNullable")
	private String buyTime;

	public PlayerArenaHigher(){
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

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setRankId(int rankId) {
		this.rankId=rankId;
	}

	public int getRankId() {
		return rankId;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore=totalScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setDefencePower(long defencePower) {
		this.defencePower=defencePower;
	}

	public long getDefencePower() {
		return defencePower;
	}

	public void setCount(int count) {
		this.count=count;
	}

	public int getCount() {
		return count;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setScoreUpdateTime(String scoreUpdateTime) {
		this.scoreUpdateTime=scoreUpdateTime;
	}

	public String getScoreUpdateTime() {
		return scoreUpdateTime;
	}

	public void setBadgeUpdateTime(String badgeUpdateTime) {
		this.badgeUpdateTime=badgeUpdateTime;
	}

	public String getBadgeUpdateTime() {
		return badgeUpdateTime;
	}

	public void setBoxReceiveTime(String boxReceiveTime) {
		this.boxReceiveTime=boxReceiveTime;
	}

	public String getBoxReceiveTime() {
		return boxReceiveTime;
	}

	public void setDailyBuyCount(int dailyBuyCount) {
		this.dailyBuyCount=dailyBuyCount;
	}

	public int getDailyBuyCount() {
		return dailyBuyCount;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime=buyTime;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public String toString() {
		return "PlayerArenaHigher [id=" + id + " ,serverId=" + serverId + " ,playerId=" + playerId + " ,rankId=" + rankId + " ,totalScore=" + totalScore + " ,defencePower=" + defencePower + " ,count=" + count + " ,createTime=" + createTime + " ,updateTime=" + updateTime + " ,scoreUpdateTime=" + scoreUpdateTime + " ,badgeUpdateTime=" + badgeUpdateTime + " ,boxReceiveTime=" + boxReceiveTime + " ,dailyBuyCount=" + dailyBuyCount + " ,buyTime=" + buyTime+ "]";
	}
}

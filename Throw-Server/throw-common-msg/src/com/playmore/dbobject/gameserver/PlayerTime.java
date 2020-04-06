package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTime implements Serializable {

	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="迷宫重置时间", isNullable="columnNullable")
	private String mazeResetTime;
	@DBFieldName(fieldName="日常任务重置", isNullable="columnNullable")
	private String taskDayResetTime;
	@DBFieldName(fieldName="周常任务重置", isNullable="columnNullable")
	private String taskWeekResetTime;
	@DBFieldName(fieldName="更新悬赏时间", isNullable="columnNullable")
	private String offerRewardResetTime;
	@DBFieldName(fieldName="竞技场初级重置时间", isNullable="columnNullable")
	private String arenaResetTime;
	@DBFieldName(fieldName="竞技场赛季时间", isNullable="columnNullable")
	private String arenaReasonResetTime;
	@DBFieldName(fieldName="犒赏令重置时间(任务)", isNullable="columnNullable")
	private String battlePassTaskTime;
	@DBFieldName(fieldName="犒赏令重置时间(迷宫)", isNullable="columnNullable")
	private String battlePassMazeTime;
	@DBFieldName(fieldName="商铺结束时间", isNullable="columnNullable")
	private String shopNormalEndTime;
	@DBFieldName(fieldName="公会商店结束时间", isNullable="columnNullable")
	private String shopGuildEndTime;
	@DBFieldName(fieldName="友情商店结束时间", isNullable="columnNullable")
	private String shopFriendEndTime;
	@DBFieldName(fieldName="迷宫商店结束时间", isNullable="columnNullable")
	private String shopMazeEndTime;
	@DBFieldName(fieldName="高阶竞技场结束时间", isNullable="columnNullable")
	private String shopArenHighEndTime;

	public PlayerTime(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setMazeResetTime(String mazeResetTime) {
		this.mazeResetTime=mazeResetTime;
	}

	public String getMazeResetTime() {
		return mazeResetTime;
	}

	public void setTaskDayResetTime(String taskDayResetTime) {
		this.taskDayResetTime=taskDayResetTime;
	}

	public String getTaskDayResetTime() {
		return taskDayResetTime;
	}

	public void setTaskWeekResetTime(String taskWeekResetTime) {
		this.taskWeekResetTime=taskWeekResetTime;
	}

	public String getTaskWeekResetTime() {
		return taskWeekResetTime;
	}

	public void setOfferRewardResetTime(String offerRewardResetTime) {
		this.offerRewardResetTime=offerRewardResetTime;
	}

	public String getOfferRewardResetTime() {
		return offerRewardResetTime;
	}

	public void setArenaResetTime(String arenaResetTime) {
		this.arenaResetTime=arenaResetTime;
	}

	public String getArenaResetTime() {
		return arenaResetTime;
	}

	public void setArenaReasonResetTime(String arenaReasonResetTime) {
		this.arenaReasonResetTime=arenaReasonResetTime;
	}

	public String getArenaReasonResetTime() {
		return arenaReasonResetTime;
	}

	public void setBattlePassTaskTime(String battlePassTaskTime) {
		this.battlePassTaskTime=battlePassTaskTime;
	}

	public String getBattlePassTaskTime() {
		return battlePassTaskTime;
	}

	public void setBattlePassMazeTime(String battlePassMazeTime) {
		this.battlePassMazeTime=battlePassMazeTime;
	}

	public String getBattlePassMazeTime() {
		return battlePassMazeTime;
	}

	public void setShopNormalEndTime(String shopNormalEndTime) {
		this.shopNormalEndTime=shopNormalEndTime;
	}

	public String getShopNormalEndTime() {
		return shopNormalEndTime;
	}

	public void setShopGuildEndTime(String shopGuildEndTime) {
		this.shopGuildEndTime=shopGuildEndTime;
	}

	public String getShopGuildEndTime() {
		return shopGuildEndTime;
	}

	public void setShopFriendEndTime(String shopFriendEndTime) {
		this.shopFriendEndTime=shopFriendEndTime;
	}

	public String getShopFriendEndTime() {
		return shopFriendEndTime;
	}

	public void setShopMazeEndTime(String shopMazeEndTime) {
		this.shopMazeEndTime=shopMazeEndTime;
	}

	public String getShopMazeEndTime() {
		return shopMazeEndTime;
	}

	public void setShopArenHighEndTime(String shopArenHighEndTime) {
		this.shopArenHighEndTime=shopArenHighEndTime;
	}

	public String getShopArenHighEndTime() {
		return shopArenHighEndTime;
	}

	public String toString() {
		return "PlayerTime [id=" + id + " ,mazeResetTime=" + mazeResetTime + " ,taskDayResetTime=" + taskDayResetTime + " ,taskWeekResetTime=" + taskWeekResetTime + " ,offerRewardResetTime=" + offerRewardResetTime + " ,arenaResetTime=" + arenaResetTime + " ,arenaReasonResetTime=" + arenaReasonResetTime + " ,battlePassTaskTime=" + battlePassTaskTime + " ,battlePassMazeTime=" + battlePassMazeTime + " ,shopNormalEndTime=" + shopNormalEndTime + " ,shopGuildEndTime=" + shopGuildEndTime + " ,shopFriendEndTime=" + shopFriendEndTime + " ,shopMazeEndTime=" + shopMazeEndTime + " ,shopArenHighEndTime=" + shopArenHighEndTime+ "]";
	}
}

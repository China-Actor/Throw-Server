package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerArena implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	private int serverId;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="积分", isNullable="columnNoNulls")
	private int totalScore;
	@DBFieldName(fieldName="战力（防守阵容的战力）", isNullable="columnNoNulls")
	private long power;
	private int count;
	@DBFieldName(fieldName="最近挑战时间", isNullable="columnNoNulls")
	private String createTime;
	private String updateTime;

	public PlayerArena(){
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

	public void setTotalScore(int totalScore) {
		this.totalScore=totalScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setPower(long power) {
		this.power=power;
	}

	public long getPower() {
		return power;
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

	public String toString() {
		return "PlayerArena [id=" + id + " ,serverId=" + serverId + " ,playerId=" + playerId + " ,totalScore=" + totalScore + " ,power=" + power + " ,count=" + count + " ,createTime=" + createTime + " ,updateTime=" + updateTime+ "]";
	}
}

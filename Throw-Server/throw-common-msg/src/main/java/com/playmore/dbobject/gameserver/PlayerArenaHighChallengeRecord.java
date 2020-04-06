package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerArenaHighChallengeRecord implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="被挑战的用户id", isNullable="columnNoNulls")
	private long bePlayerId;
	@DBFieldName(fieldName="是否挑战成功", isNullable="columnNullable")
	private boolean isWin;
	@DBFieldName(fieldName="自己的段位", isNullable="columnNoNulls")
	private int rankId;
	@DBFieldName(fieldName="对方段位", isNullable="columnNoNulls")
	private int beRankId;
	@DBFieldName(fieldName="最近挑战时间", isNullable="columnNoNulls")
	private String chanllegeTime;
	@DBFieldName(fieldName="战斗记录", isNullable="columnNullable")
	private String recordJson;

	public PlayerArenaHighChallengeRecord(){
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

	public void setBePlayerId(long bePlayerId) {
		this.bePlayerId=bePlayerId;
	}

	public long getBePlayerId() {
		return bePlayerId;
	}

	public void setIsWin(boolean isWin) {
		this.isWin=isWin;
	}

	public boolean getIsWin() {
		return isWin;
	}

	public void setRankId(int rankId) {
		this.rankId=rankId;
	}

	public int getRankId() {
		return rankId;
	}

	public void setBeRankId(int beRankId) {
		this.beRankId=beRankId;
	}

	public int getBeRankId() {
		return beRankId;
	}

	public void setChanllegeTime(String chanllegeTime) {
		this.chanllegeTime=chanllegeTime;
	}

	public String getChanllegeTime() {
		return chanllegeTime;
	}

	public void setRecordJson(String recordJson) {
		this.recordJson=recordJson;
	}

	public String getRecordJson() {
		return recordJson;
	}

	public String toString() {
		return "PlayerArenaHighChallengeRecord [id=" + id + " ,playerId=" + playerId + " ,bePlayerId=" + bePlayerId + " ,isWin=" + isWin + " ,rankId=" + rankId + " ,beRankId=" + beRankId + " ,chanllegeTime=" + chanllegeTime + " ,recordJson=" + recordJson+ "]";
	}
}

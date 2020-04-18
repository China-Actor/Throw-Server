package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaChallengeRecord implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="被挑战的用户id", isNullable="columnNoNulls")
	private long bePlayerId;
	@DBFieldName(fieldName="增加积分", isNullable="columnNoNulls")
	private int score;
	@DBFieldName(fieldName="被挑战者增加积分", isNullable="columnNoNulls")
	private int beScore;
	@DBFieldName(fieldName="总积分", isNullable="columnNoNulls")
	private int totalScore;
	@DBFieldName(fieldName="被挑战者总积分", isNullable="columnNoNulls")
	private int totalBeScore;
	@DBFieldName(fieldName="最近挑战时间", isNullable="columnNoNulls")
	private String chanllegeTime;

	public PlayerArenaChallengeRecord(){
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

	public void setScore(int score) {
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setBeScore(int beScore) {
		this.beScore=beScore;
	}

	public int getBeScore() {
		return beScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore=totalScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalBeScore(int totalBeScore) {
		this.totalBeScore=totalBeScore;
	}

	public int getTotalBeScore() {
		return totalBeScore;
	}

	public void setChanllegeTime(String chanllegeTime) {
		this.chanllegeTime=chanllegeTime;
	}

	public String getChanllegeTime() {
		return chanllegeTime;
	}

	public String toString() {
		return "PlayerArenaChallengeRecord [id=" + id + " ,playerId=" + playerId + " ,bePlayerId=" + bePlayerId + " ,score=" + score + " ,beScore=" + beScore + " ,totalScore=" + totalScore + " ,totalBeScore=" + totalBeScore + " ,chanllegeTime=" + chanllegeTime+ "]";
	}
}

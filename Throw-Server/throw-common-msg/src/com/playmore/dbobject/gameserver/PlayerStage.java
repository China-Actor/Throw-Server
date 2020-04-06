package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerStage implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="章节id", isNullable="columnNoNulls")
	private int chapterId;
	@DBFieldName(fieldName="关卡id", isNullable="columnNoNulls")
	private int stageId;
	@DBFieldName(fieldName="获得最大战力", isNullable="columnNoNulls")
	private long power;
	@DBFieldName(fieldName="最近挑战时间", isNullable="columnNoNulls")
	private String lastChanllegeTime;
	@DBFieldName(fieldName="当时的阵容", isNullable="columnNoNulls")
	private String formationStr;
	@DBFieldName(fieldName="是否是当前关卡  1 是当前关卡   0 不是当前关卡", isNullable="columnNullable")
	private int isCurentStage;

	public PlayerStage(){
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

	public void setChapterId(int chapterId) {
		this.chapterId=chapterId;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setStageId(int stageId) {
		this.stageId=stageId;
	}

	public int getStageId() {
		return stageId;
	}

	public void setPower(long power) {
		this.power=power;
	}

	public long getPower() {
		return power;
	}

	public void setLastChanllegeTime(String lastChanllegeTime) {
		this.lastChanllegeTime=lastChanllegeTime;
	}

	public String getLastChanllegeTime() {
		return lastChanllegeTime;
	}

	public void setFormationStr(String formationStr) {
		this.formationStr=formationStr;
	}

	public String getFormationStr() {
		return formationStr;
	}

	public void setIsCurentStage(int isCurentStage) {
		this.isCurentStage=isCurentStage;
	}

	public int getIsCurentStage() {
		return isCurentStage;
	}

	public String toString() {
		return "PlayerStage [id=" + id + " ,playerId=" + playerId + " ,chapterId=" + chapterId + " ,stageId=" + stageId + " ,power=" + power + " ,lastChanllegeTime=" + lastChanllegeTime + " ,formationStr=" + formationStr + " ,isCurentStage=" + isCurentStage+ "]";
	}
}

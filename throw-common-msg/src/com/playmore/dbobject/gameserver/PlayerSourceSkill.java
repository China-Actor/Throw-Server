package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSourceSkill implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="playerId", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="技能编号", isNullable="columnNullable")
	private int skillNumber;
	@DBFieldName(fieldName="激活源技能id", isNullable="columnNullable")
	private int skillId;
	@DBFieldName(fieldName="英雄ids", isNullable="columnNullable")
	private String slotHeros;
	@DBFieldName(fieldName="更新时间", isNullable="columnNullable")
	private String updateTime;

	public PlayerSourceSkill(){
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

	public void setSkillNumber(int skillNumber) {
		this.skillNumber=skillNumber;
	}

	public int getSkillNumber() {
		return skillNumber;
	}

	public void setSkillId(int skillId) {
		this.skillId=skillId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSlotHeros(String slotHeros) {
		this.slotHeros=slotHeros;
	}

	public String getSlotHeros() {
		return slotHeros;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "PlayerSourceSkill [id=" + id + " ,playerId=" + playerId + " ,skillNumber=" + skillNumber + " ,skillId=" + skillId + " ,slotHeros=" + slotHeros + " ,updateTime=" + updateTime+ "]";
	}
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSourceLink implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="playerId", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="源链接编号(叠加)", isNullable="columnNullable")
	private String linkNumber;
	@DBFieldName(fieldName="激活源链接id", isNullable="columnNullable")
	private int linkId;
	@DBFieldName(fieldName="槽位", isNullable="columnNullable")
	private int slotIndex;
	@DBFieldName(fieldName="英雄ids", isNullable="columnNullable")
	private long slotHero;
	@DBFieldName(fieldName="来源玩家id", isNullable="columnNullable")
	private long fromPlayerId;
	@DBFieldName(fieldName="serverId", isNullable="columnNullable")
	private int serverId;
	@DBFieldName(fieldName="0: 自己  1: 好友  2:公会", isNullable="columnNullable")
	private int relation;
	@DBFieldName(fieldName="更新时间", isNullable="columnNullable")
	private String updateTime;

	public PlayerSourceLink(){
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

	public void setLinkNumber(String linkNumber) {
		this.linkNumber=linkNumber;
	}

	public String getLinkNumber() {
		return linkNumber;
	}

	public void setLinkId(int linkId) {
		this.linkId=linkId;
	}

	public int getLinkId() {
		return linkId;
	}

	public void setSlotIndex(int slotIndex) {
		this.slotIndex=slotIndex;
	}

	public int getSlotIndex() {
		return slotIndex;
	}

	public void setSlotHero(long slotHero) {
		this.slotHero=slotHero;
	}

	public long getSlotHero() {
		return slotHero;
	}

	public void setFromPlayerId(long fromPlayerId) {
		this.fromPlayerId=fromPlayerId;
	}

	public long getFromPlayerId() {
		return fromPlayerId;
	}

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setRelation(int relation) {
		this.relation=relation;
	}

	public int getRelation() {
		return relation;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "PlayerSourceLink [id=" + id + " ,playerId=" + playerId + " ,linkNumber=" + linkNumber + " ,linkId=" + linkId + " ,slotIndex=" + slotIndex + " ,slotHero=" + slotHero + " ,fromPlayerId=" + fromPlayerId + " ,serverId=" + serverId + " ,relation=" + relation + " ,updateTime=" + updateTime+ "]";
	}
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerCrystalSlot implements Serializable {

	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="槽位", isNullable="columnNoNulls")
	private int slot;
	@DBFieldName(fieldName="空闲状态", isNullable="columnNullable")
	private boolean status;
	@DBFieldName(fieldName="卡牌id", isNullable="columnNullable")
	private long playerCardId;
	@DBFieldName(fieldName="插入时间", isNullable="columnNullable")
	private String insertTime;
	@DBFieldName(fieldName="消耗类型(1:水晶精华 2:钻石)", isNullable="columnNullable")
	private int costType;

	public PlayerCrystalSlot(){
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setSlot(int slot) {
		this.slot=slot;
	}

	public int getSlot() {
		return slot;
	}

	public void setStatus(boolean status) {
		this.status=status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setPlayerCardId(long playerCardId) {
		this.playerCardId=playerCardId;
	}

	public long getPlayerCardId() {
		return playerCardId;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime=insertTime;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setCostType(int costType) {
		this.costType=costType;
	}

	public int getCostType() {
		return costType;
	}

	public String toString() {
		return "PlayerCrystalSlot [pid=" + pid + " ,slot=" + slot + " ,status=" + status + " ,playerCardId=" + playerCardId + " ,insertTime=" + insertTime + " ,costType=" + costType+ "]";
	}
}

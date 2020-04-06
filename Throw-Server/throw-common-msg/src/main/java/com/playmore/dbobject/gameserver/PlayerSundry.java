package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerSundry implements Serializable {

	@DBFieldName(fieldName="playerId", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="购买英雄的槽位数量", isNullable="columnNullable")
	private int cardSlotNum;
	@DBFieldName(fieldName="购买英雄槽位次数", isNullable="columnNullable")
	private int cardSlotBuyCount;
	private String createDate;
	private String updateDate;

	public PlayerSundry(){
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setCardSlotNum(int cardSlotNum) {
		this.cardSlotNum=cardSlotNum;
	}

	public int getCardSlotNum() {
		return cardSlotNum;
	}

	public void setCardSlotBuyCount(int cardSlotBuyCount) {
		this.cardSlotBuyCount=cardSlotBuyCount;
	}

	public int getCardSlotBuyCount() {
		return cardSlotBuyCount;
	}

	public void setCreateDate(String createDate) {
		this.createDate=createDate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate=updateDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public String toString() {
		return "PlayerSundry [pid=" + pid + " ,cardSlotNum=" + cardSlotNum + " ,cardSlotBuyCount=" + cardSlotBuyCount + " ,createDate=" + createDate + " ,updateDate=" + updateDate+ "]";
	}
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class VipRecv implements Serializable {

	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="等级", isNullable="columnNoNulls")
	private int level;
	@DBFieldName(fieldName="领取时间", isNullable="columnNullable")
	private String receiveTime;

	public VipRecv(){
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime=receiveTime;
	}

	public String getReceiveTime() {
		return receiveTime;
	}

	public String toString() {
		return "VipRecv [pid=" + pid + " ,level=" + level + " ,receiveTime=" + receiveTime+ "]";
	}
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class IdWorkerTime implements Serializable {

	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="上次生成id时间", isNullable="columnNoNulls")
	private String lastTimeStamp;

	public IdWorkerTime(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setLastTimeStamp(String lastTimeStamp) {
		this.lastTimeStamp=lastTimeStamp;
	}

	public String getLastTimeStamp() {
		return lastTimeStamp;
	}

	public String toString() {
		return "IdWorkerTime [id=" + id + " ,lastTimeStamp=" + lastTimeStamp+ "]";
	}
}

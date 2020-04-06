package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerTime implements Serializable {

	private long id;
	private String arenaReasonResetTime;
	@DBFieldName(fieldName="竞技场每日重置", isNullable="columnNullable")
	private String arenaResetTime;
	@DBFieldName(fieldName="高阶竞技场开始时间", isNullable="columnNullable")
	private String arenaHighTimeStart;

	public ServerTime(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setArenaReasonResetTime(String arenaReasonResetTime) {
		this.arenaReasonResetTime=arenaReasonResetTime;
	}

	public String getArenaReasonResetTime() {
		return arenaReasonResetTime;
	}

	public void setArenaResetTime(String arenaResetTime) {
		this.arenaResetTime=arenaResetTime;
	}

	public String getArenaResetTime() {
		return arenaResetTime;
	}

	public void setArenaHighTimeStart(String arenaHighTimeStart) {
		this.arenaHighTimeStart=arenaHighTimeStart;
	}

	public String getArenaHighTimeStart() {
		return arenaHighTimeStart;
	}

	public String toString() {
		return "ServerTime [id=" + id + " ,arenaReasonResetTime=" + arenaReasonResetTime + " ,arenaResetTime=" + arenaResetTime + " ,arenaHighTimeStart=" + arenaHighTimeStart+ "]";
	}
}

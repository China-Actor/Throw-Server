package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeGateS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="事件组", isNullable="columnNullable")
	private int eventGroup;
	@DBFieldName(fieldName="事件id", isNullable="columnNullable")
	private int eventId;
	@DBFieldName(fieldName="权重", isNullable="columnNullable")
	private int percent;

	public MazeGateS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setEventGroup(int eventGroup) {
		this.eventGroup=eventGroup;
	}

	public int getEventGroup() {
		return eventGroup;
	}

	public void setEventId(int eventId) {
		this.eventId=eventId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setPercent(int percent) {
		this.percent=percent;
	}

	public int getPercent() {
		return percent;
	}

	public String toString() {
		return "MazeGateS [id=" + id + " ,eventGroup=" + eventGroup + " ,eventId=" + eventId + " ,percent=" + percent+ "]";
	}
}

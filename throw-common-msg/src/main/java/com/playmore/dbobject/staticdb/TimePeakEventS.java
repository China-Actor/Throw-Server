package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TimePeakEventS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="地图id", isNullable="columnNullable")
	private int mapId;
	@DBFieldName(fieldName="控件名称", isNullable="columnNullable")
	private String controlName;
	@DBFieldName(fieldName="事件描述", isNullable="columnNullable")
	private String eventInfo;
	@DBFieldName(fieldName="事件类型", isNullable="columnNullable")
	private int eventType;
	@DBFieldName(fieldName="触发日志id", isNullable="columnNullable")
	private int eventLog;
	@DBFieldName(fieldName="参数1", isNullable="columnNullable")
	private int param1;
	@DBFieldName(fieldName="参数2", isNullable="columnNullable")
	private int param2;
	@DBFieldName(fieldName="参数3", isNullable="columnNullable")
	private int param3;
	@DBFieldName(fieldName="参数4", isNullable="columnNullable")
	private int param4;

	public TimePeakEventS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setMapId(int mapId) {
		this.mapId=mapId;
	}

	public int getMapId() {
		return mapId;
	}

	public void setControlName(String controlName) {
		this.controlName=controlName;
	}

	public String getControlName() {
		return controlName;
	}

	public void setEventInfo(String eventInfo) {
		this.eventInfo=eventInfo;
	}

	public String getEventInfo() {
		return eventInfo;
	}

	public void setEventType(int eventType) {
		this.eventType=eventType;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventLog(int eventLog) {
		this.eventLog=eventLog;
	}

	public int getEventLog() {
		return eventLog;
	}

	public void setParam1(int param1) {
		this.param1=param1;
	}

	public int getParam1() {
		return param1;
	}

	public void setParam2(int param2) {
		this.param2=param2;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam3(int param3) {
		this.param3=param3;
	}

	public int getParam3() {
		return param3;
	}

	public void setParam4(int param4) {
		this.param4=param4;
	}

	public int getParam4() {
		return param4;
	}

	public String toString() {
		return "TimePeakEventS [id=" + id + " ,mapId=" + mapId + " ,controlName=" + controlName + " ,eventInfo=" + eventInfo + " ,eventType=" + eventType + " ,eventLog=" + eventLog + " ,param1=" + param1 + " ,param2=" + param2 + " ,param3=" + param3 + " ,param4=" + param4+ "]";
	}
}

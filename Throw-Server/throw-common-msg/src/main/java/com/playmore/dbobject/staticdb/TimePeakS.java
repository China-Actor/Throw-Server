package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TimePeakS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="章节名", isNullable="columnNullable")
	private String title;
	@DBFieldName(fieldName="关卡名", isNullable="columnNullable")
	private String stage;
	@DBFieldName(fieldName="关卡描述", isNullable="columnNullable")
	private String describe;
	@DBFieldName(fieldName="关卡背景球体", isNullable="columnNullable")
	private String backGround1;
	@DBFieldName(fieldName="关卡背景图", isNullable="columnNullable")
	private String backGround2;
	@DBFieldName(fieldName="所属章节", isNullable="columnNullable")
	private int titleOrder;
	@DBFieldName(fieldName="地图id", isNullable="columnNullable")
	private int mapId;
	@DBFieldName(fieldName="客户端文件名", isNullable="columnNullable")
	private String clientName;
	@DBFieldName(fieldName="服务器文件名", isNullable="columnNullable")
	private String serverNae;
	@DBFieldName(fieldName="关卡地图", isNullable="columnNullable")
	private String map;
	@DBFieldName(fieldName="解锁下一关", isNullable="columnNullable")
	private int nextStage;
	@DBFieldName(fieldName="（条件1）解锁关卡ID", isNullable="columnNullable")
	private int stageId;
	@DBFieldName(fieldName="（条件2）前置关卡历史进度（百分比）", isNullable="columnNullable")
	private int progress;

	public TimePeakS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setStage(String stage) {
		this.stage=stage;
	}

	public String getStage() {
		return stage;
	}

	public void setDescribe(String describe) {
		this.describe=describe;
	}

	public String getDescribe() {
		return describe;
	}

	public void setBackGround1(String backGround1) {
		this.backGround1=backGround1;
	}

	public String getBackGround1() {
		return backGround1;
	}

	public void setBackGround2(String backGround2) {
		this.backGround2=backGround2;
	}

	public String getBackGround2() {
		return backGround2;
	}

	public void setTitleOrder(int titleOrder) {
		this.titleOrder=titleOrder;
	}

	public int getTitleOrder() {
		return titleOrder;
	}

	public void setMapId(int mapId) {
		this.mapId=mapId;
	}

	public int getMapId() {
		return mapId;
	}

	public void setClientName(String clientName) {
		this.clientName=clientName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setServerNae(String serverNae) {
		this.serverNae=serverNae;
	}

	public String getServerNae() {
		return serverNae;
	}

	public void setMap(String map) {
		this.map=map;
	}

	public String getMap() {
		return map;
	}

	public void setNextStage(int nextStage) {
		this.nextStage=nextStage;
	}

	public int getNextStage() {
		return nextStage;
	}

	public void setStageId(int stageId) {
		this.stageId=stageId;
	}

	public int getStageId() {
		return stageId;
	}

	public void setProgress(int progress) {
		this.progress=progress;
	}

	public int getProgress() {
		return progress;
	}

	public String toString() {
		return "TimePeakS [id=" + id + " ,title=" + title + " ,stage=" + stage + " ,describe=" + describe + " ,backGround1=" + backGround1 + " ,backGround2=" + backGround2 + " ,titleOrder=" + titleOrder + " ,mapId=" + mapId + " ,clientName=" + clientName + " ,serverNae=" + serverNae + " ,map=" + map + " ,nextStage=" + nextStage + " ,stageId=" + stageId + " ,progress=" + progress+ "]";
	}
}

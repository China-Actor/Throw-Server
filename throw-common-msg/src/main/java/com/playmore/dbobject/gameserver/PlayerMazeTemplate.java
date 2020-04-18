package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMazeTemplate implements Serializable {

	private long id;
	@DBFieldName(fieldName="迷宫章节", isNullable="columnNullable")
	private int stageType;
	@DBFieldName(fieldName="副本主线关卡id", isNullable="columnNullable")
	private int stageId;
	@DBFieldName(fieldName="迷宫模板", isNullable="columnNullable")
	private String mazeData;
	@DBFieldName(fieldName="上阵过的英雄", isNullable="columnNullable")
	private String mazeCardData;
	@DBFieldName(fieldName="死亡的英雄", isNullable="columnNullable")
	private String mazeBagData;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createDate;
	@DBFieldName(fieldName="路径节点", isNullable="columnNullable")
	private String path;
	@DBFieldName(fieldName="状态(0 是默认  1：选中状态  2： 通过完成  3： 完成未领取奖励  )", isNullable="columnNullable")
	private int cellStatus;
	@DBFieldName(fieldName="最终boss生命值成长系数", isNullable="columnNullable")
	private double lifeRation;
	@DBFieldName(fieldName="胜利状态", isNullable="columnNullable")
	private boolean winStatus;

	public PlayerMazeTemplate(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setStageType(int stageType) {
		this.stageType=stageType;
	}

	public int getStageType() {
		return stageType;
	}

	public void setStageId(int stageId) {
		this.stageId=stageId;
	}

	public int getStageId() {
		return stageId;
	}

	public void setMazeData(String mazeData) {
		this.mazeData=mazeData;
	}

	public String getMazeData() {
		return mazeData;
	}

	public void setMazeCardData(String mazeCardData) {
		this.mazeCardData=mazeCardData;
	}

	public String getMazeCardData() {
		return mazeCardData;
	}

	public void setMazeBagData(String mazeBagData) {
		this.mazeBagData=mazeBagData;
	}

	public String getMazeBagData() {
		return mazeBagData;
	}

	public void setCreateDate(String createDate) {
		this.createDate=createDate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setPath(String path) {
		this.path=path;
	}

	public String getPath() {
		return path;
	}

	public void setCellStatus(int cellStatus) {
		this.cellStatus=cellStatus;
	}

	public int getCellStatus() {
		return cellStatus;
	}

	public void setLifeRation(double lifeRation) {
		this.lifeRation=lifeRation;
	}

	public double getLifeRation() {
		return lifeRation;
	}

	public void setWinStatus(boolean winStatus) {
		this.winStatus=winStatus;
	}

	public boolean getWinStatus() {
		return winStatus;
	}

	public String toString() {
		return "PlayerMazeTemplate [id=" + id + " ,stageType=" + stageType + " ,stageId=" + stageId + " ,mazeData=" + mazeData + " ,mazeCardData=" + mazeCardData + " ,mazeBagData=" + mazeBagData + " ,createDate=" + createDate + " ,path=" + path + " ,cellStatus=" + cellStatus + " ,lifeRation=" + lifeRation + " ,winStatus=" + winStatus+ "]";
	}
}

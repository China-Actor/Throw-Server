package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="章节ID", isNullable="columnNullable")
	private int mazeTitleId;
	@DBFieldName(fieldName="关卡ID", isNullable="columnNullable")
	private int gateId;
	@DBFieldName(fieldName="层数", isNullable="columnNullable")
	private int layerId;
	@DBFieldName(fieldName="关卡类型", isNullable="columnNullable")
	private int gateType;
	@DBFieldName(fieldName="选择关卡1", isNullable="columnNullable")
	private int nextGateId1;
	@DBFieldName(fieldName="选择关卡2", isNullable="columnNullable")
	private int nextGateId2;
	@DBFieldName(fieldName="事件组", isNullable="columnNullable")
	private int eventGroup;
	@DBFieldName(fieldName="迷宫币数量", isNullable="columnNullable")
	private int mazeCoin;
	@DBFieldName(fieldName="普通难度战力系数区间", isNullable="columnNullable")
	private int normalMin;
	@DBFieldName(fieldName="普通难度战力系数区间", isNullable="columnNullable")
	private int normalMax;
	@DBFieldName(fieldName="普通难度金币系数", isNullable="columnNullable")
	private int normalGold;
	@DBFieldName(fieldName="普通难度经验系数", isNullable="columnNullable")
	private int normalExp;
	@DBFieldName(fieldName="精英难度战力系数区间", isNullable="columnNullable")
	private int eliteMin;
	@DBFieldName(fieldName="精英难度战力系数区间", isNullable="columnNullable")
	private int eliteMax;
	@DBFieldName(fieldName="精英难度金币系数", isNullable="columnNullable")
	private int eliteGold;
	@DBFieldName(fieldName="精英难度经验系数", isNullable="columnNullable")
	private int eliteExp;
	@DBFieldName(fieldName="钻石掉落", isNullable="columnNullable")
	private int diamond;
	@DBFieldName(fieldName="普通难度遗物掉落", isNullable="columnNullable")
	private int normalCards;
	@DBFieldName(fieldName="精英难度遗物掉落", isNullable="columnNullable")
	private int eliteCards;
	@DBFieldName(fieldName="最终宝箱掉落", isNullable="columnNullable")
	private int dropBox;
	@DBFieldName(fieldName="犒赏令掉落", isNullable="columnNullable")
	private int battlepass;

	public MazeS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setMazeTitleId(int mazeTitleId) {
		this.mazeTitleId=mazeTitleId;
	}

	public int getMazeTitleId() {
		return mazeTitleId;
	}

	public void setGateId(int gateId) {
		this.gateId=gateId;
	}

	public int getGateId() {
		return gateId;
	}

	public void setLayerId(int layerId) {
		this.layerId=layerId;
	}

	public int getLayerId() {
		return layerId;
	}

	public void setGateType(int gateType) {
		this.gateType=gateType;
	}

	public int getGateType() {
		return gateType;
	}

	public void setNextGateId1(int nextGateId1) {
		this.nextGateId1=nextGateId1;
	}

	public int getNextGateId1() {
		return nextGateId1;
	}

	public void setNextGateId2(int nextGateId2) {
		this.nextGateId2=nextGateId2;
	}

	public int getNextGateId2() {
		return nextGateId2;
	}

	public void setEventGroup(int eventGroup) {
		this.eventGroup=eventGroup;
	}

	public int getEventGroup() {
		return eventGroup;
	}

	public void setMazeCoin(int mazeCoin) {
		this.mazeCoin=mazeCoin;
	}

	public int getMazeCoin() {
		return mazeCoin;
	}

	public void setNormalMin(int normalMin) {
		this.normalMin=normalMin;
	}

	public int getNormalMin() {
		return normalMin;
	}

	public void setNormalMax(int normalMax) {
		this.normalMax=normalMax;
	}

	public int getNormalMax() {
		return normalMax;
	}

	public void setNormalGold(int normalGold) {
		this.normalGold=normalGold;
	}

	public int getNormalGold() {
		return normalGold;
	}

	public void setNormalExp(int normalExp) {
		this.normalExp=normalExp;
	}

	public int getNormalExp() {
		return normalExp;
	}

	public void setEliteMin(int eliteMin) {
		this.eliteMin=eliteMin;
	}

	public int getEliteMin() {
		return eliteMin;
	}

	public void setEliteMax(int eliteMax) {
		this.eliteMax=eliteMax;
	}

	public int getEliteMax() {
		return eliteMax;
	}

	public void setEliteGold(int eliteGold) {
		this.eliteGold=eliteGold;
	}

	public int getEliteGold() {
		return eliteGold;
	}

	public void setEliteExp(int eliteExp) {
		this.eliteExp=eliteExp;
	}

	public int getEliteExp() {
		return eliteExp;
	}

	public void setDiamond(int diamond) {
		this.diamond=diamond;
	}

	public int getDiamond() {
		return diamond;
	}

	public void setNormalCards(int normalCards) {
		this.normalCards=normalCards;
	}

	public int getNormalCards() {
		return normalCards;
	}

	public void setEliteCards(int eliteCards) {
		this.eliteCards=eliteCards;
	}

	public int getEliteCards() {
		return eliteCards;
	}

	public void setDropBox(int dropBox) {
		this.dropBox=dropBox;
	}

	public int getDropBox() {
		return dropBox;
	}

	public void setBattlepass(int battlepass) {
		this.battlepass=battlepass;
	}

	public int getBattlepass() {
		return battlepass;
	}

	public String toString() {
		return "MazeS [id=" + id + " ,mazeTitleId=" + mazeTitleId + " ,gateId=" + gateId + " ,layerId=" + layerId + " ,gateType=" + gateType + " ,nextGateId1=" + nextGateId1 + " ,nextGateId2=" + nextGateId2 + " ,eventGroup=" + eventGroup + " ,mazeCoin=" + mazeCoin + " ,normalMin=" + normalMin + " ,normalMax=" + normalMax + " ,normalGold=" + normalGold + " ,normalExp=" + normalExp + " ,eliteMin=" + eliteMin + " ,eliteMax=" + eliteMax + " ,eliteGold=" + eliteGold + " ,eliteExp=" + eliteExp + " ,diamond=" + diamond + " ,normalCards=" + normalCards + " ,eliteCards=" + eliteCards + " ,dropBox=" + dropBox + " ,battlepass=" + battlepass+ "]";
	}
}

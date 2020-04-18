package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class StageS implements Serializable {

	@DBFieldName(fieldName="关卡ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="关卡名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="所属章节", isNullable="columnNullable")
	private int chapterId;
	@DBFieldName(fieldName="解锁下一关", isNullable="columnNullable")
	private int nextStage;
	@DBFieldName(fieldName="关卡编号", isNullable="columnNullable")
	private int stageNum;
	@DBFieldName(fieldName="父据点", isNullable="columnNullable")
	private int stageF;
	@DBFieldName(fieldName="子据点", isNullable="columnNullable")
	private int stageSon;
	@DBFieldName(fieldName="关卡类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="怪物组ID", isNullable="columnNullable")
	private int teamId;
	@DBFieldName(fieldName="关卡挑战时长", isNullable="columnNullable")
	private int maxTime;
	@DBFieldName(fieldName="最大可上阵人数", isNullable="columnNullable")
	private int heroNum;
	@DBFieldName(fieldName="关卡掉落包", isNullable="columnNullable")
	private int dropId1;
	@DBFieldName(fieldName="金币产出（分钟）", isNullable="columnNullable")
	private int gold;
	@DBFieldName(fieldName="英雄经验产出（分钟）", isNullable="columnNullable")
	private int heroExp;
	@DBFieldName(fieldName="主角经验产出（分钟）", isNullable="columnNullable")
	private int exp;
	@DBFieldName(fieldName="粉尘（多少秒产出1个）", isNullable="columnNullable")
	private int item1;
	@DBFieldName(fieldName="生命精华（多少秒产出1个）", isNullable="columnNullable")
	private int item2;
	@DBFieldName(fieldName="装备包掉落（多少秒产出1个）", isNullable="columnNullable")
	private int item3;
	@DBFieldName(fieldName="掉落装备包ID", isNullable="columnNullable")
	private int equipDrop;
	@DBFieldName(fieldName="关卡ID顺序", isNullable="columnNullable")
	private int orderId;
	@DBFieldName(fieldName="关卡描述", isNullable="columnNullable")
	private String desc;

	public StageS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setChapterId(int chapterId) {
		this.chapterId=chapterId;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setNextStage(int nextStage) {
		this.nextStage=nextStage;
	}

	public int getNextStage() {
		return nextStage;
	}

	public void setStageNum(int stageNum) {
		this.stageNum=stageNum;
	}

	public int getStageNum() {
		return stageNum;
	}

	public void setStageF(int stageF) {
		this.stageF=stageF;
	}

	public int getStageF() {
		return stageF;
	}

	public void setStageSon(int stageSon) {
		this.stageSon=stageSon;
	}

	public int getStageSon() {
		return stageSon;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setTeamId(int teamId) {
		this.teamId=teamId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime=maxTime;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setHeroNum(int heroNum) {
		this.heroNum=heroNum;
	}

	public int getHeroNum() {
		return heroNum;
	}

	public void setDropId1(int dropId1) {
		this.dropId1=dropId1;
	}

	public int getDropId1() {
		return dropId1;
	}

	public void setGold(int gold) {
		this.gold=gold;
	}

	public int getGold() {
		return gold;
	}

	public void setHeroExp(int heroExp) {
		this.heroExp=heroExp;
	}

	public int getHeroExp() {
		return heroExp;
	}

	public void setExp(int exp) {
		this.exp=exp;
	}

	public int getExp() {
		return exp;
	}

	public void setItem1(int item1) {
		this.item1=item1;
	}

	public int getItem1() {
		return item1;
	}

	public void setItem2(int item2) {
		this.item2=item2;
	}

	public int getItem2() {
		return item2;
	}

	public void setItem3(int item3) {
		this.item3=item3;
	}

	public int getItem3() {
		return item3;
	}

	public void setEquipDrop(int equipDrop) {
		this.equipDrop=equipDrop;
	}

	public int getEquipDrop() {
		return equipDrop;
	}

	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return "StageS [id=" + id + " ,name=" + name + " ,chapterId=" + chapterId + " ,nextStage=" + nextStage + " ,stageNum=" + stageNum + " ,stageF=" + stageF + " ,stageSon=" + stageSon + " ,type=" + type + " ,teamId=" + teamId + " ,maxTime=" + maxTime + " ,heroNum=" + heroNum + " ,dropId1=" + dropId1 + " ,gold=" + gold + " ,heroExp=" + heroExp + " ,exp=" + exp + " ,item1=" + item1 + " ,item2=" + item2 + " ,item3=" + item3 + " ,equipDrop=" + equipDrop + " ,orderId=" + orderId + " ,desc=" + desc+ "]";
	}
}

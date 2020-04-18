package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MonsterTeamS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="BOSS", isNullable="columnNullable")
	private int makeBoss;
	@DBFieldName(fieldName="1号位怪物", isNullable="columnNullable")
	private int monster1;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int monster1Level;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int monster1Quality;
	@DBFieldName(fieldName="调整系数", isNullable="columnNullable")
	private int percent1;
	@DBFieldName(fieldName="2号位怪物", isNullable="columnNullable")
	private int monster2;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int monster2Level;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int monster2Quality;
	@DBFieldName(fieldName="调整系数", isNullable="columnNullable")
	private int percent2;
	@DBFieldName(fieldName="3号位怪物", isNullable="columnNullable")
	private int monster3;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int monster3Level;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int monster3Quality;
	@DBFieldName(fieldName="调整系数", isNullable="columnNullable")
	private int percent3;
	@DBFieldName(fieldName="4号位怪物", isNullable="columnNullable")
	private int monster4;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int monster4Level;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int monster4Quality;
	@DBFieldName(fieldName="调整系数", isNullable="columnNullable")
	private int percent4;
	@DBFieldName(fieldName="5号位怪物", isNullable="columnNullable")
	private int monster5;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int monster5Level;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int monster5Quality;
	@DBFieldName(fieldName="调整系数", isNullable="columnNullable")
	private int percent5;
	@DBFieldName(fieldName="是否穿戴装备", isNullable="columnNullable")
	private int isEquipment;
	@DBFieldName(fieldName="源技能", isNullable="columnNullable")
	private int teamskill;

	public MonsterTeamS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setMakeBoss(int makeBoss) {
		this.makeBoss=makeBoss;
	}

	public int getMakeBoss() {
		return makeBoss;
	}

	public void setMonster1(int monster1) {
		this.monster1=monster1;
	}

	public int getMonster1() {
		return monster1;
	}

	public void setMonster1Level(int monster1Level) {
		this.monster1Level=monster1Level;
	}

	public int getMonster1Level() {
		return monster1Level;
	}

	public void setMonster1Quality(int monster1Quality) {
		this.monster1Quality=monster1Quality;
	}

	public int getMonster1Quality() {
		return monster1Quality;
	}

	public void setPercent1(int percent1) {
		this.percent1=percent1;
	}

	public int getPercent1() {
		return percent1;
	}

	public void setMonster2(int monster2) {
		this.monster2=monster2;
	}

	public int getMonster2() {
		return monster2;
	}

	public void setMonster2Level(int monster2Level) {
		this.monster2Level=monster2Level;
	}

	public int getMonster2Level() {
		return monster2Level;
	}

	public void setMonster2Quality(int monster2Quality) {
		this.monster2Quality=monster2Quality;
	}

	public int getMonster2Quality() {
		return monster2Quality;
	}

	public void setPercent2(int percent2) {
		this.percent2=percent2;
	}

	public int getPercent2() {
		return percent2;
	}

	public void setMonster3(int monster3) {
		this.monster3=monster3;
	}

	public int getMonster3() {
		return monster3;
	}

	public void setMonster3Level(int monster3Level) {
		this.monster3Level=monster3Level;
	}

	public int getMonster3Level() {
		return monster3Level;
	}

	public void setMonster3Quality(int monster3Quality) {
		this.monster3Quality=monster3Quality;
	}

	public int getMonster3Quality() {
		return monster3Quality;
	}

	public void setPercent3(int percent3) {
		this.percent3=percent3;
	}

	public int getPercent3() {
		return percent3;
	}

	public void setMonster4(int monster4) {
		this.monster4=monster4;
	}

	public int getMonster4() {
		return monster4;
	}

	public void setMonster4Level(int monster4Level) {
		this.monster4Level=monster4Level;
	}

	public int getMonster4Level() {
		return monster4Level;
	}

	public void setMonster4Quality(int monster4Quality) {
		this.monster4Quality=monster4Quality;
	}

	public int getMonster4Quality() {
		return monster4Quality;
	}

	public void setPercent4(int percent4) {
		this.percent4=percent4;
	}

	public int getPercent4() {
		return percent4;
	}

	public void setMonster5(int monster5) {
		this.monster5=monster5;
	}

	public int getMonster5() {
		return monster5;
	}

	public void setMonster5Level(int monster5Level) {
		this.monster5Level=monster5Level;
	}

	public int getMonster5Level() {
		return monster5Level;
	}

	public void setMonster5Quality(int monster5Quality) {
		this.monster5Quality=monster5Quality;
	}

	public int getMonster5Quality() {
		return monster5Quality;
	}

	public void setPercent5(int percent5) {
		this.percent5=percent5;
	}

	public int getPercent5() {
		return percent5;
	}

	public void setIsEquipment(int isEquipment) {
		this.isEquipment=isEquipment;
	}

	public int getIsEquipment() {
		return isEquipment;
	}

	public void setTeamskill(int teamskill) {
		this.teamskill=teamskill;
	}

	public int getTeamskill() {
		return teamskill;
	}

	public String toString() {
		return "MonsterTeamS [id=" + id + " ,makeBoss=" + makeBoss + " ,monster1=" + monster1 + " ,monster1Level=" + monster1Level + " ,monster1Quality=" + monster1Quality + " ,percent1=" + percent1 + " ,monster2=" + monster2 + " ,monster2Level=" + monster2Level + " ,monster2Quality=" + monster2Quality + " ,percent2=" + percent2 + " ,monster3=" + monster3 + " ,monster3Level=" + monster3Level + " ,monster3Quality=" + monster3Quality + " ,percent3=" + percent3 + " ,monster4=" + monster4 + " ,monster4Level=" + monster4Level + " ,monster4Quality=" + monster4Quality + " ,percent4=" + percent4 + " ,monster5=" + monster5 + " ,monster5Level=" + monster5Level + " ,monster5Quality=" + monster5Quality + " ,percent5=" + percent5 + " ,isEquipment=" + isEquipment + " ,teamskill=" + teamskill+ "]";
	}
}

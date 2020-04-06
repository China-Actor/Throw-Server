package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerCard implements Serializable {

	@DBFieldName(fieldName="卡牌实例id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家playerid", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="卡牌模板id", isNullable="columnNoNulls")
	private int cardId;
	@DBFieldName(fieldName="品阶id", isNullable="columnNullable")
	private int qualityId;
	@DBFieldName(fieldName="品质", isNullable="columnNoNulls")
	private int quality;
	@DBFieldName(fieldName="等级", isNullable="columnNoNulls")
	private int level;
	@DBFieldName(fieldName="共鸣水晶id", isNullable="columnNullable")
	private int levelResonance;
	@DBFieldName(fieldName="普通攻击", isNullable="columnNoNulls")
	private int ordinarySkill;
	@DBFieldName(fieldName="1技能id", isNullable="columnNoNulls")
	private int skill1;
	@DBFieldName(fieldName="2技能id", isNullable="columnNoNulls")
	private int skill2;
	@DBFieldName(fieldName="3技能id", isNullable="columnNoNulls")
	private int skill3;
	@DBFieldName(fieldName="4技能id", isNullable="columnNoNulls")
	private int skill4;
	@DBFieldName(fieldName="定位（0力量，1敏捷，2智力", isNullable="columnNullable")
	private int occupation;
	@DBFieldName(fieldName="阵营（1风，2水，3火，4地）", isNullable="columnNullable")
	private int camp;
	@DBFieldName(fieldName="物理法术（0物理，1法术", isNullable="columnNullable")
	private int nature;
	@DBFieldName(fieldName="位置（0近战，1远程", isNullable="columnNullable")
	private int distance;
	@DBFieldName(fieldName="生命", isNullable="columnNullable")
	private int hp;
	@DBFieldName(fieldName="攻击", isNullable="columnNullable")
	private int attack;
	@DBFieldName(fieldName="防御", isNullable="columnNullable")
	private int defense;
	@DBFieldName(fieldName="英雄锁住状态  0 是开放  1是锁住", isNullable="columnNullable")
	private int lockStatus;

	public PlayerCard(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setCardId(int cardId) {
		this.cardId=cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setQualityId(int qualityId) {
		this.qualityId=qualityId;
	}

	public int getQualityId() {
		return qualityId;
	}

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevelResonance(int levelResonance) {
		this.levelResonance=levelResonance;
	}

	public int getLevelResonance() {
		return levelResonance;
	}

	public void setOrdinarySkill(int ordinarySkill) {
		this.ordinarySkill=ordinarySkill;
	}

	public int getOrdinarySkill() {
		return ordinarySkill;
	}

	public void setSkill1(int skill1) {
		this.skill1=skill1;
	}

	public int getSkill1() {
		return skill1;
	}

	public void setSkill2(int skill2) {
		this.skill2=skill2;
	}

	public int getSkill2() {
		return skill2;
	}

	public void setSkill3(int skill3) {
		this.skill3=skill3;
	}

	public int getSkill3() {
		return skill3;
	}

	public void setSkill4(int skill4) {
		this.skill4=skill4;
	}

	public int getSkill4() {
		return skill4;
	}

	public void setOccupation(int occupation) {
		this.occupation=occupation;
	}

	public int getOccupation() {
		return occupation;
	}

	public void setCamp(int camp) {
		this.camp=camp;
	}

	public int getCamp() {
		return camp;
	}

	public void setNature(int nature) {
		this.nature=nature;
	}

	public int getNature() {
		return nature;
	}

	public void setDistance(int distance) {
		this.distance=distance;
	}

	public int getDistance() {
		return distance;
	}

	public void setHp(int hp) {
		this.hp=hp;
	}

	public int getHp() {
		return hp;
	}

	public void setAttack(int attack) {
		this.attack=attack;
	}

	public int getAttack() {
		return attack;
	}

	public void setDefense(int defense) {
		this.defense=defense;
	}

	public int getDefense() {
		return defense;
	}

	public void setLockStatus(int lockStatus) {
		this.lockStatus=lockStatus;
	}

	public int getLockStatus() {
		return lockStatus;
	}

	public String toString() {
		return "PlayerCard [id=" + id + " ,playerId=" + playerId + " ,cardId=" + cardId + " ,qualityId=" + qualityId + " ,quality=" + quality + " ,level=" + level + " ,levelResonance=" + levelResonance + " ,ordinarySkill=" + ordinarySkill + " ,skill1=" + skill1 + " ,skill2=" + skill2 + " ,skill3=" + skill3 + " ,skill4=" + skill4 + " ,occupation=" + occupation + " ,camp=" + camp + " ,nature=" + nature + " ,distance=" + distance + " ,hp=" + hp + " ,attack=" + attack + " ,defense=" + defense + " ,lockStatus=" + lockStatus+ "]";
	}
}

package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SummonedS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="召唤者死亡时是否陪葬", isNullable="columnNullable")
	private int burial;
	@DBFieldName(fieldName="战斗模型", isNullable="columnNullable")
	private String model;
	@DBFieldName(fieldName="定位（0力量，1敏捷，2智力）", isNullable="columnNullable")
	private int occupation;
	@DBFieldName(fieldName="阵营（1风，2水，3火，4地）", isNullable="columnNullable")
	private int camp;
	@DBFieldName(fieldName="物理法术（0物理，1法术", isNullable="columnNullable")
	private int nature;
	@DBFieldName(fieldName="位置（0近战，1远程）", isNullable="columnNullable")
	private int distance;
	@DBFieldName(fieldName="生命", isNullable="columnNullable")
	private int hp;
	@DBFieldName(fieldName="攻击", isNullable="columnNullable")
	private int attack;
	@DBFieldName(fieldName="防御", isNullable="columnNullable")
	private int defense;
	@DBFieldName(fieldName="物理减伤", isNullable="columnNullable")
	private int physicsReduce;
	@DBFieldName(fieldName="魔法减伤", isNullable="columnNullable")
	private int magicReduce;
	@DBFieldName(fieldName="每秒恢复", isNullable="columnNullable")
	private int recovery;
	@DBFieldName(fieldName="命中", isNullable="columnNullable")
	private int hit;
	@DBFieldName(fieldName="闪避", isNullable="columnNullable")
	private int dodge;
	@DBFieldName(fieldName="暴击", isNullable="columnNullable")
	private int crit;
	@DBFieldName(fieldName="急速", isNullable="columnNullable")
	private int rapidly;
	@DBFieldName(fieldName="吸血等级", isNullable="columnNullable")
	private int suck;
	@DBFieldName(fieldName="受伤回能", isNullable="columnNullable")
	private int injuredEnergy;
	@DBFieldName(fieldName="技能", isNullable="columnNullable")
	private String skill;
	@DBFieldName(fieldName="召唤效果", isNullable="columnNullable")
	private String castShow;
	@DBFieldName(fieldName="死亡效果", isNullable="columnNullable")
	private String deathShow;
	@DBFieldName(fieldName="受击表现", isNullable="columnNullable")
	private int hitShow;

	public SummonedS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setBurial(int burial) {
		this.burial=burial;
	}

	public int getBurial() {
		return burial;
	}

	public void setModel(String model) {
		this.model=model;
	}

	public String getModel() {
		return model;
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

	public void setPhysicsReduce(int physicsReduce) {
		this.physicsReduce=physicsReduce;
	}

	public int getPhysicsReduce() {
		return physicsReduce;
	}

	public void setMagicReduce(int magicReduce) {
		this.magicReduce=magicReduce;
	}

	public int getMagicReduce() {
		return magicReduce;
	}

	public void setRecovery(int recovery) {
		this.recovery=recovery;
	}

	public int getRecovery() {
		return recovery;
	}

	public void setHit(int hit) {
		this.hit=hit;
	}

	public int getHit() {
		return hit;
	}

	public void setDodge(int dodge) {
		this.dodge=dodge;
	}

	public int getDodge() {
		return dodge;
	}

	public void setCrit(int crit) {
		this.crit=crit;
	}

	public int getCrit() {
		return crit;
	}

	public void setRapidly(int rapidly) {
		this.rapidly=rapidly;
	}

	public int getRapidly() {
		return rapidly;
	}

	public void setSuck(int suck) {
		this.suck=suck;
	}

	public int getSuck() {
		return suck;
	}

	public void setInjuredEnergy(int injuredEnergy) {
		this.injuredEnergy=injuredEnergy;
	}

	public int getInjuredEnergy() {
		return injuredEnergy;
	}

	public void setSkill(String skill) {
		this.skill=skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setCastShow(String castShow) {
		this.castShow=castShow;
	}

	public String getCastShow() {
		return castShow;
	}

	public void setDeathShow(String deathShow) {
		this.deathShow=deathShow;
	}

	public String getDeathShow() {
		return deathShow;
	}

	public void setHitShow(int hitShow) {
		this.hitShow=hitShow;
	}

	public int getHitShow() {
		return hitShow;
	}

	public String toString() {
		return "SummonedS [id=" + id + " ,burial=" + burial + " ,model=" + model + " ,occupation=" + occupation + " ,camp=" + camp + " ,nature=" + nature + " ,distance=" + distance + " ,hp=" + hp + " ,attack=" + attack + " ,defense=" + defense + " ,physicsReduce=" + physicsReduce + " ,magicReduce=" + magicReduce + " ,recovery=" + recovery + " ,hit=" + hit + " ,dodge=" + dodge + " ,crit=" + crit + " ,rapidly=" + rapidly + " ,suck=" + suck + " ,injuredEnergy=" + injuredEnergy + " ,skill=" + skill + " ,castShow=" + castShow + " ,deathShow=" + deathShow + " ,hitShow=" + hitShow+ "]";
	}
}

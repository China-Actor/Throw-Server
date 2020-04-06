package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CopymasterS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="复制类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="召唤者死亡时是否陪葬", isNullable="columnNullable")
	private int burial;
	@DBFieldName(fieldName="继承技能类型", isNullable="columnNullable")
	private int skilltype;
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
	@DBFieldName(fieldName="召唤效果", isNullable="columnNullable")
	private String castShow;
	@DBFieldName(fieldName="死亡效果", isNullable="columnNullable")
	private String deathShow;
	@DBFieldName(fieldName="受击表现", isNullable="columnNullable")
	private int hitShow;

	public CopymasterS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setBurial(int burial) {
		this.burial=burial;
	}

	public int getBurial() {
		return burial;
	}

	public void setSkilltype(int skilltype) {
		this.skilltype=skilltype;
	}

	public int getSkilltype() {
		return skilltype;
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
		return "CopymasterS [id=" + id + " ,type=" + type + " ,burial=" + burial + " ,skilltype=" + skilltype + " ,hp=" + hp + " ,attack=" + attack + " ,defense=" + defense + " ,physicsReduce=" + physicsReduce + " ,magicReduce=" + magicReduce + " ,recovery=" + recovery + " ,hit=" + hit + " ,dodge=" + dodge + " ,crit=" + crit + " ,rapidly=" + rapidly + " ,suck=" + suck + " ,injuredEnergy=" + injuredEnergy + " ,castShow=" + castShow + " ,deathShow=" + deathShow + " ,hitShow=" + hitShow+ "]";
	}
}

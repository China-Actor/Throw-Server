package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class EquipmentS implements Serializable {

	@DBFieldName(fieldName="装备ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="装备名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="装备描述", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="装备图标", isNullable="columnNullable")
	private String icon;
	@DBFieldName(fieldName="部位（1武器，2衣服，3帽子，4鞋子）", isNullable="columnNullable")
	private int position;
	@DBFieldName(fieldName="定位（0力量，1敏捷，2智力）", isNullable="columnNullable")
	private int occupation;
	@DBFieldName(fieldName="种族（0无，1风，2水，3火，4地", isNullable="columnNullable")
	private int camp;
	@DBFieldName(fieldName="品质（0粗糙，1普通，2稀有，3稀有+，4精英，5精英+，6史诗，7史诗+，8传说，9传说+，10神话", isNullable="columnNullable")
	private int quality;
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
	@DBFieldName(fieldName="装备经验", isNullable="columnNullable")
	private int exp;
	@DBFieldName(fieldName="最大强化星数", isNullable="columnNullable")
	private int maxstar;

	public EquipmentS(){
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

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setIcon(String icon) {
		this.icon=icon;
	}

	public String getIcon() {
		return icon;
	}

	public void setPosition(int position) {
		this.position=position;
	}

	public int getPosition() {
		return position;
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

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
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

	public void setExp(int exp) {
		this.exp=exp;
	}

	public int getExp() {
		return exp;
	}

	public void setMaxstar(int maxstar) {
		this.maxstar=maxstar;
	}

	public int getMaxstar() {
		return maxstar;
	}

	public String toString() {
		return "EquipmentS [id=" + id + " ,name=" + name + " ,desc=" + desc + " ,icon=" + icon + " ,position=" + position + " ,occupation=" + occupation + " ,camp=" + camp + " ,quality=" + quality + " ,hp=" + hp + " ,attack=" + attack + " ,defense=" + defense + " ,physicsReduce=" + physicsReduce + " ,magicReduce=" + magicReduce + " ,recovery=" + recovery + " ,hit=" + hit + " ,dodge=" + dodge + " ,crit=" + crit + " ,rapidly=" + rapidly + " ,exp=" + exp + " ,maxstar=" + maxstar+ "]";
	}
}

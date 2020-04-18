package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class HeroS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="卡牌", isNullable="columnNullable")
	private String card;
	@DBFieldName(fieldName="头像", isNullable="columnNullable")
	private String head;
	@DBFieldName(fieldName="人物模型动画", isNullable="columnNullable")
	private String live2d;
	@DBFieldName(fieldName="战斗模型", isNullable="columnNullable")
	private String model;
	@DBFieldName(fieldName="3D模型卡牌", isNullable="columnNullable")
	private String hero3d;
	@DBFieldName(fieldName="源体", isNullable="columnNullable")
	private String soul;
	@DBFieldName(fieldName="缩放比例", isNullable="columnNullable")
	private int zoom;
	@DBFieldName(fieldName="长描述", isNullable="columnNullable")
	private String describe;
	@DBFieldName(fieldName="定位（0力量，1敏捷，2智力）", isNullable="columnNullable")
	private int occupation;
	@DBFieldName(fieldName="阵营（1风，2水，3火，4地）", isNullable="columnNullable")
	private int camp;
	@DBFieldName(fieldName="物理法术（1法术，2物理）", isNullable="columnNullable")
	private int nature;
	@DBFieldName(fieldName="位置（0近战，1远程）", isNullable="columnNullable")
	private int distance;
	@DBFieldName(fieldName="年龄", isNullable="columnNullable")
	private int old;
	@DBFieldName(fieldName="喜欢", isNullable="columnNullable")
	private String likes;
	@DBFieldName(fieldName="讨厌", isNullable="columnNullable")
	private String dislikes;
	@DBFieldName(fieldName="英雄描述", isNullable="columnNullable")
	private String herodesc;
	@DBFieldName(fieldName="移动速度", isNullable="columnNullable")
	private int speed;
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
	@DBFieldName(fieldName="是否开放（0不开放，1开放的英雄，2开放的怪物）", isNullable="columnNullable")
	private int open;
	@DBFieldName(fieldName="评分(进攻|防御|辅助）", isNullable="columnNullable")
	private String score;
	@DBFieldName(fieldName="角色类型（0普通角色，1血量递增的boss，2迷宫boss等级有成长机制", isNullable="columnNullable")
	private int type;

	public HeroS(){
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

	public void setCard(String card) {
		this.card=card;
	}

	public String getCard() {
		return card;
	}

	public void setHead(String head) {
		this.head=head;
	}

	public String getHead() {
		return head;
	}

	public void setLive2d(String live2d) {
		this.live2d=live2d;
	}

	public String getLive2d() {
		return live2d;
	}

	public void setModel(String model) {
		this.model=model;
	}

	public String getModel() {
		return model;
	}

	public void setHero3d(String hero3d) {
		this.hero3d=hero3d;
	}

	public String getHero3d() {
		return hero3d;
	}

	public void setSoul(String soul) {
		this.soul=soul;
	}

	public String getSoul() {
		return soul;
	}

	public void setZoom(int zoom) {
		this.zoom=zoom;
	}

	public int getZoom() {
		return zoom;
	}

	public void setDescribe(String describe) {
		this.describe=describe;
	}

	public String getDescribe() {
		return describe;
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

	public void setOld(int old) {
		this.old=old;
	}

	public int getOld() {
		return old;
	}

	public void setLikes(String likes) {
		this.likes=likes;
	}

	public String getLikes() {
		return likes;
	}

	public void setDislikes(String dislikes) {
		this.dislikes=dislikes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public void setHerodesc(String herodesc) {
		this.herodesc=herodesc;
	}

	public String getHerodesc() {
		return herodesc;
	}

	public void setSpeed(int speed) {
		this.speed=speed;
	}

	public int getSpeed() {
		return speed;
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

	public void setOpen(int open) {
		this.open=open;
	}

	public int getOpen() {
		return open;
	}

	public void setScore(String score) {
		this.score=score;
	}

	public String getScore() {
		return score;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public String toString() {
		return "HeroS [id=" + id + " ,name=" + name + " ,card=" + card + " ,head=" + head + " ,live2d=" + live2d + " ,model=" + model + " ,hero3d=" + hero3d + " ,soul=" + soul + " ,zoom=" + zoom + " ,describe=" + describe + " ,occupation=" + occupation + " ,camp=" + camp + " ,nature=" + nature + " ,distance=" + distance + " ,old=" + old + " ,likes=" + likes + " ,dislikes=" + dislikes + " ,herodesc=" + herodesc + " ,speed=" + speed + " ,hp=" + hp + " ,attack=" + attack + " ,defense=" + defense + " ,physicsReduce=" + physicsReduce + " ,magicReduce=" + magicReduce + " ,recovery=" + recovery + " ,hit=" + hit + " ,dodge=" + dodge + " ,crit=" + crit + " ,rapidly=" + rapidly + " ,suck=" + suck + " ,injuredEnergy=" + injuredEnergy + " ,skill=" + skill + " ,open=" + open + " ,score=" + score + " ,type=" + type+ "]";
	}
}

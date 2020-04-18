package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ArtifactS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="神器ID", isNullable="columnNullable")
	private int artifactid;
	@DBFieldName(fieldName="星级", isNullable="columnNullable")
	private int star;
	@DBFieldName(fieldName="神器名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="神器描述", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="神器图标", isNullable="columnNullable")
	private String icon;
	@DBFieldName(fieldName="部位", isNullable="columnNullable")
	private int position;
	@DBFieldName(fieldName="神器技能1", isNullable="columnNullable")
	private int artifactskill1;
	@DBFieldName(fieldName="神器技能2", isNullable="columnNullable")
	private int artifactskill2;
	@DBFieldName(fieldName="道具1Type", isNullable="columnNullable")
	private int type1;
	@DBFieldName(fieldName="道具1Value", isNullable="columnNullable")
	private int value1;
	@DBFieldName(fieldName="道具1Size", isNullable="columnNullable")
	private int size1;
	@DBFieldName(fieldName="道具2Type", isNullable="columnNullable")
	private int type2;
	@DBFieldName(fieldName="道具2Value", isNullable="columnNullable")
	private int value2;
	@DBFieldName(fieldName="道具2Size", isNullable="columnNullable")
	private int size2;
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

	public ArtifactS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setArtifactid(int artifactid) {
		this.artifactid=artifactid;
	}

	public int getArtifactid() {
		return artifactid;
	}

	public void setStar(int star) {
		this.star=star;
	}

	public int getStar() {
		return star;
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

	public void setArtifactskill1(int artifactskill1) {
		this.artifactskill1=artifactskill1;
	}

	public int getArtifactskill1() {
		return artifactskill1;
	}

	public void setArtifactskill2(int artifactskill2) {
		this.artifactskill2=artifactskill2;
	}

	public int getArtifactskill2() {
		return artifactskill2;
	}

	public void setType1(int type1) {
		this.type1=type1;
	}

	public int getType1() {
		return type1;
	}

	public void setValue1(int value1) {
		this.value1=value1;
	}

	public int getValue1() {
		return value1;
	}

	public void setSize1(int size1) {
		this.size1=size1;
	}

	public int getSize1() {
		return size1;
	}

	public void setType2(int type2) {
		this.type2=type2;
	}

	public int getType2() {
		return type2;
	}

	public void setValue2(int value2) {
		this.value2=value2;
	}

	public int getValue2() {
		return value2;
	}

	public void setSize2(int size2) {
		this.size2=size2;
	}

	public int getSize2() {
		return size2;
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

	public String toString() {
		return "ArtifactS [id=" + id + " ,artifactid=" + artifactid + " ,star=" + star + " ,name=" + name + " ,desc=" + desc + " ,icon=" + icon + " ,position=" + position + " ,artifactskill1=" + artifactskill1 + " ,artifactskill2=" + artifactskill2 + " ,type1=" + type1 + " ,value1=" + value1 + " ,size1=" + size1 + " ,type2=" + type2 + " ,value2=" + value2 + " ,size2=" + size2 + " ,hp=" + hp + " ,attack=" + attack + " ,defense=" + defense + " ,physicsReduce=" + physicsReduce + " ,magicReduce=" + magicReduce + " ,recovery=" + recovery + " ,hit=" + hit + " ,dodge=" + dodge + " ,crit=" + crit + " ,rapidly=" + rapidly+ "]";
	}
}

package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeCardsS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="遗物名称", isNullable="columnNullable")
	private String cardsName;
	@DBFieldName(fieldName="遗物描述", isNullable="columnNullable")
	private String cardsDesc;
	@DBFieldName(fieldName="遗物类型（1普通遗物，2英雄专属遗物，3恢复终端加成遗物）", isNullable="columnNullable")
	private int cardsType;
	@DBFieldName(fieldName="遗物品质", isNullable="columnNullable")
	private int cardsQuality;
	@DBFieldName(fieldName="遗物技能", isNullable="columnNullable")
	private int cardsSkill;
	@DBFieldName(fieldName="遗物ICON", isNullable="columnNullable")
	private String cardsIcon;
	@DBFieldName(fieldName="专属英雄ID", isNullable="columnNullable")
	private String hero;
	@DBFieldName(fieldName="值", isNullable="columnNullable")
	private String value;

	public MazeCardsS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setCardsName(String cardsName) {
		this.cardsName=cardsName;
	}

	public String getCardsName() {
		return cardsName;
	}

	public void setCardsDesc(String cardsDesc) {
		this.cardsDesc=cardsDesc;
	}

	public String getCardsDesc() {
		return cardsDesc;
	}

	public void setCardsType(int cardsType) {
		this.cardsType=cardsType;
	}

	public int getCardsType() {
		return cardsType;
	}

	public void setCardsQuality(int cardsQuality) {
		this.cardsQuality=cardsQuality;
	}

	public int getCardsQuality() {
		return cardsQuality;
	}

	public void setCardsSkill(int cardsSkill) {
		this.cardsSkill=cardsSkill;
	}

	public int getCardsSkill() {
		return cardsSkill;
	}

	public void setCardsIcon(String cardsIcon) {
		this.cardsIcon=cardsIcon;
	}

	public String getCardsIcon() {
		return cardsIcon;
	}

	public void setHero(String hero) {
		this.hero=hero;
	}

	public String getHero() {
		return hero;
	}

	public void setValue(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return "MazeCardsS [id=" + id + " ,cardsName=" + cardsName + " ,cardsDesc=" + cardsDesc + " ,cardsType=" + cardsType + " ,cardsQuality=" + cardsQuality + " ,cardsSkill=" + cardsSkill + " ,cardsIcon=" + cardsIcon + " ,hero=" + hero + " ,value=" + value+ "]";
	}
}

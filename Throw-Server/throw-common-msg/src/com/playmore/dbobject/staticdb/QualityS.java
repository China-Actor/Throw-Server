package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class QualityS implements Serializable {

	@DBFieldName(fieldName="品质ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="角色ID", isNullable="columnNullable")
	private int heroid;
	@DBFieldName(fieldName="进阶消耗类型", isNullable="columnNullable")
	private int consumeType;
	@DBFieldName(fieldName="进阶消耗品质", isNullable="columnNullable")
	private int consumeTypeQuality;
	@DBFieldName(fieldName="数量", isNullable="columnNullable")
	private int value;
	@DBFieldName(fieldName="进阶后角色ID", isNullable="columnNullable")
	private int heroid2;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int quality;
	@DBFieldName(fieldName="最大等级", isNullable="columnNullable")
	private int levelMax;
	@DBFieldName(fieldName="是否可作为机器人怪物", isNullable="columnNullable")
	private int open;
	@DBFieldName(fieldName="在共鸣水晶中可到达的最大等级", isNullable="columnNullable")
	private int levelMaxShare;

	public QualityS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setHeroid(int heroid) {
		this.heroid=heroid;
	}

	public int getHeroid() {
		return heroid;
	}

	public void setConsumeType(int consumeType) {
		this.consumeType=consumeType;
	}

	public int getConsumeType() {
		return consumeType;
	}

	public void setConsumeTypeQuality(int consumeTypeQuality) {
		this.consumeTypeQuality=consumeTypeQuality;
	}

	public int getConsumeTypeQuality() {
		return consumeTypeQuality;
	}

	public void setValue(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setHeroid2(int heroid2) {
		this.heroid2=heroid2;
	}

	public int getHeroid2() {
		return heroid2;
	}

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setLevelMax(int levelMax) {
		this.levelMax=levelMax;
	}

	public int getLevelMax() {
		return levelMax;
	}

	public void setOpen(int open) {
		this.open=open;
	}

	public int getOpen() {
		return open;
	}

	public void setLevelMaxShare(int levelMaxShare) {
		this.levelMaxShare=levelMaxShare;
	}

	public int getLevelMaxShare() {
		return levelMaxShare;
	}

	public String toString() {
		return "QualityS [id=" + id + " ,heroid=" + heroid + " ,consumeType=" + consumeType + " ,consumeTypeQuality=" + consumeTypeQuality + " ,value=" + value + " ,heroid2=" + heroid2 + " ,quality=" + quality + " ,levelMax=" + levelMax + " ,open=" + open + " ,levelMaxShare=" + levelMaxShare+ "]";
	}
}

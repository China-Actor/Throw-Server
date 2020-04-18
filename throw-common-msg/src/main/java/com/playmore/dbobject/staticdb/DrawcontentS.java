package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DrawcontentS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="卡池ID", isNullable="columnNullable")
	private int content;
	@DBFieldName(fieldName="道具掉落类型", isNullable="columnNullable")
	private int dropType;
	@DBFieldName(fieldName="道具掉落ID", isNullable="columnNullable")
	private int dropValue;
	@DBFieldName(fieldName="道具掉落数量", isNullable="columnNullable")
	private int dropNum;
	@DBFieldName(fieldName="权重", isNullable="columnNullable")
	private int weight;
	@DBFieldName(fieldName="保底池类", isNullable="columnNullable")
	private int least;
	@DBFieldName(fieldName="首X抽保底类", isNullable="columnNullable")
	private int firstLeast;
	@DBFieldName(fieldName="心愿单类", isNullable="columnNullable")
	private int wish;

	public DrawcontentS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setContent(int content) {
		this.content=content;
	}

	public int getContent() {
		return content;
	}

	public void setDropType(int dropType) {
		this.dropType=dropType;
	}

	public int getDropType() {
		return dropType;
	}

	public void setDropValue(int dropValue) {
		this.dropValue=dropValue;
	}

	public int getDropValue() {
		return dropValue;
	}

	public void setDropNum(int dropNum) {
		this.dropNum=dropNum;
	}

	public int getDropNum() {
		return dropNum;
	}

	public void setWeight(int weight) {
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setLeast(int least) {
		this.least=least;
	}

	public int getLeast() {
		return least;
	}

	public void setFirstLeast(int firstLeast) {
		this.firstLeast=firstLeast;
	}

	public int getFirstLeast() {
		return firstLeast;
	}

	public void setWish(int wish) {
		this.wish=wish;
	}

	public int getWish() {
		return wish;
	}

	public String toString() {
		return "DrawcontentS [id=" + id + " ,content=" + content + " ,dropType=" + dropType + " ,dropValue=" + dropValue + " ,dropNum=" + dropNum + " ,weight=" + weight + " ,least=" + least + " ,firstLeast=" + firstLeast + " ,wish=" + wish+ "]";
	}
}

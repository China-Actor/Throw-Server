package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DropS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="掉落ID", isNullable="columnNullable")
	private int dropId;
	@DBFieldName(fieldName="掉落组类型", isNullable="columnNullable")
	private int dropGroupType;
	@DBFieldName(fieldName="客户端预览", isNullable="columnNullable")
	private int isShow;
	@DBFieldName(fieldName="道具掉落类型", isNullable="columnNullable")
	private int dropType;
	@DBFieldName(fieldName="道具掉落ID", isNullable="columnNullable")
	private int dropValue;
	@DBFieldName(fieldName="道具掉落数量", isNullable="columnNullable")
	private int dropNum;
	@DBFieldName(fieldName="掉落概率(权重）", isNullable="columnNullable")
	private int percent;

	public DropS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setDropId(int dropId) {
		this.dropId=dropId;
	}

	public int getDropId() {
		return dropId;
	}

	public void setDropGroupType(int dropGroupType) {
		this.dropGroupType=dropGroupType;
	}

	public int getDropGroupType() {
		return dropGroupType;
	}

	public void setIsShow(int isShow) {
		this.isShow=isShow;
	}

	public int getIsShow() {
		return isShow;
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

	public void setPercent(int percent) {
		this.percent=percent;
	}

	public int getPercent() {
		return percent;
	}

	public String toString() {
		return "DropS [id=" + id + " ,dropId=" + dropId + " ,dropGroupType=" + dropGroupType + " ,isShow=" + isShow + " ,dropType=" + dropType + " ,dropValue=" + dropValue + " ,dropNum=" + dropNum + " ,percent=" + percent+ "]";
	}
}

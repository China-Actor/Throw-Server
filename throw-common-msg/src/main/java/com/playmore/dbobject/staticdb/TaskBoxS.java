package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TaskBoxS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="系统类型（1.日常任务 2.周常任务）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="宝箱进度", isNullable="columnNullable")
	private int stage;
	@DBFieldName(fieldName="道具1类型", isNullable="columnNullable")
	private int type1;
	@DBFieldName(fieldName="道具1值", isNullable="columnNullable")
	private int value1;
	@DBFieldName(fieldName="道具1数量", isNullable="columnNullable")
	private int size1;
	@DBFieldName(fieldName="道具2类型", isNullable="columnNullable")
	private int type2;
	@DBFieldName(fieldName="道具2值", isNullable="columnNullable")
	private int value2;
	@DBFieldName(fieldName="道具2数量", isNullable="columnNullable")
	private int size2;
	@DBFieldName(fieldName="道具3类型", isNullable="columnNullable")
	private int type3;
	@DBFieldName(fieldName="道具3值", isNullable="columnNullable")
	private int value3;
	@DBFieldName(fieldName="道具3数量", isNullable="columnNullable")
	private int size3;

	public TaskBoxS(){
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

	public void setStage(int stage) {
		this.stage=stage;
	}

	public int getStage() {
		return stage;
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

	public void setType3(int type3) {
		this.type3=type3;
	}

	public int getType3() {
		return type3;
	}

	public void setValue3(int value3) {
		this.value3=value3;
	}

	public int getValue3() {
		return value3;
	}

	public void setSize3(int size3) {
		this.size3=size3;
	}

	public int getSize3() {
		return size3;
	}

	public String toString() {
		return "TaskBoxS [id=" + id + " ,type=" + type + " ,stage=" + stage + " ,type1=" + type1 + " ,value1=" + value1 + " ,size1=" + size1 + " ,type2=" + type2 + " ,value2=" + value2 + " ,size2=" + size2 + " ,type3=" + type3 + " ,value3=" + value3 + " ,size3=" + size3+ "]";
	}
}

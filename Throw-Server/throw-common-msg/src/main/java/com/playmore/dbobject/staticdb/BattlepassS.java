package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BattlepassS implements Serializable {

	@DBFieldName(fieldName="犒赏ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="犒赏类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="需要犒赏令ID", isNullable="columnNullable")
	private int item;
	@DBFieldName(fieldName="需要犒赏令数量", isNullable="columnNullable")
	private int num;
	@DBFieldName(fieldName="普通奖励掉落ID", isNullable="columnNullable")
	private int drop1;
	@DBFieldName(fieldName="进阶奖励掉落ID", isNullable="columnNullable")
	private int drop2;

	public BattlepassS(){
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

	public void setItem(int item) {
		this.item=item;
	}

	public int getItem() {
		return item;
	}

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setDrop1(int drop1) {
		this.drop1=drop1;
	}

	public int getDrop1() {
		return drop1;
	}

	public void setDrop2(int drop2) {
		this.drop2=drop2;
	}

	public int getDrop2() {
		return drop2;
	}

	public String toString() {
		return "BattlepassS [id=" + id + " ,type=" + type + " ,item=" + item + " ,num=" + num + " ,drop1=" + drop1 + " ,drop2=" + drop2+ "]";
	}
}

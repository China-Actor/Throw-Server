package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildS implements Serializable {

	@DBFieldName(fieldName="公会等级", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="升级需要总活跃度", isNullable="columnNullable")
	private int exp;
	@DBFieldName(fieldName="公会人数", isNullable="columnNullable")
	private int num;

	public GuildS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setExp(int exp) {
		this.exp=exp;
	}

	public int getExp() {
		return exp;
	}

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public String toString() {
		return "GuildS [id=" + id + " ,exp=" + exp + " ,num=" + num+ "]";
	}
}

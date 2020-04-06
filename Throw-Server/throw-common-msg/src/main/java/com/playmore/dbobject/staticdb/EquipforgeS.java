package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class EquipforgeS implements Serializable {

	@DBFieldName(fieldName="装备品级ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="强化1星需要经验", isNullable="columnNullable")
	private int exp1;
	@DBFieldName(fieldName="强化2星需要经验", isNullable="columnNullable")
	private int exp2;
	@DBFieldName(fieldName="强化3星需要经验", isNullable="columnNullable")
	private int exp3;
	@DBFieldName(fieldName="强化4星需要经验", isNullable="columnNullable")
	private int exp4;
	@DBFieldName(fieldName="强化5星需要经验", isNullable="columnNullable")
	private int exp5;

	public EquipforgeS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setExp1(int exp1) {
		this.exp1=exp1;
	}

	public int getExp1() {
		return exp1;
	}

	public void setExp2(int exp2) {
		this.exp2=exp2;
	}

	public int getExp2() {
		return exp2;
	}

	public void setExp3(int exp3) {
		this.exp3=exp3;
	}

	public int getExp3() {
		return exp3;
	}

	public void setExp4(int exp4) {
		this.exp4=exp4;
	}

	public int getExp4() {
		return exp4;
	}

	public void setExp5(int exp5) {
		this.exp5=exp5;
	}

	public int getExp5() {
		return exp5;
	}

	public String toString() {
		return "EquipforgeS [id=" + id + " ,exp1=" + exp1 + " ,exp2=" + exp2 + " ,exp3=" + exp3 + " ,exp4=" + exp4 + " ,exp5=" + exp5+ "]";
	}
}

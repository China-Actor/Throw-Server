package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BossstageS implements Serializable {

	@DBFieldName(fieldName="阶段id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="bossid", isNullable="columnNullable")
	private int bossid;
	@DBFieldName(fieldName="血量", isNullable="columnNullable")
	private int hp;
	@DBFieldName(fieldName="货币掉落包", isNullable="columnNullable")
	private int drop1;
	@DBFieldName(fieldName="掉落装备包", isNullable="columnNullable")
	private int drop2;
	@DBFieldName(fieldName="掉落钻石包", isNullable="columnNullable")
	private int drop3;

	public BossstageS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setBossid(int bossid) {
		this.bossid=bossid;
	}

	public int getBossid() {
		return bossid;
	}

	public void setHp(int hp) {
		this.hp=hp;
	}

	public int getHp() {
		return hp;
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

	public void setDrop3(int drop3) {
		this.drop3=drop3;
	}

	public int getDrop3() {
		return drop3;
	}

	public String toString() {
		return "BossstageS [id=" + id + " ,bossid=" + bossid + " ,hp=" + hp + " ,drop1=" + drop1 + " ,drop2=" + drop2 + " ,drop3=" + drop3+ "]";
	}
}

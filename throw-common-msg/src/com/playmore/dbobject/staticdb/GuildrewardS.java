package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildrewardS implements Serializable {

	@DBFieldName(fieldName="奖励id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="公会bossid", isNullable="columnNullable")
	private int bossid;
	@DBFieldName(fieldName="血量", isNullable="columnNullable")
	private int hp;
	@DBFieldName(fieldName="奖励公会币数量", isNullable="columnNullable")
	private int reward;
	@DBFieldName(fieldName="掉落装备包", isNullable="columnNullable")
	private int drop1;
	@DBFieldName(fieldName="掉落钻石包", isNullable="columnNullable")
	private int drop2;

	public GuildrewardS(){
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

	public void setReward(int reward) {
		this.reward=reward;
	}

	public int getReward() {
		return reward;
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
		return "GuildrewardS [id=" + id + " ,bossid=" + bossid + " ,hp=" + hp + " ,reward=" + reward + " ,drop1=" + drop1 + " ,drop2=" + drop2+ "]";
	}
}

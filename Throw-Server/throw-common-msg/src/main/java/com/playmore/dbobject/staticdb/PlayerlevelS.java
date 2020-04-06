package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerlevelS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="主角经验", isNullable="columnNullable")
	private long exp;
	@DBFieldName(fieldName="送钻石数量", isNullable="columnNullable")
	private int reward;

	public PlayerlevelS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setExp(long exp) {
		this.exp=exp;
	}

	public long getExp() {
		return exp;
	}

	public void setReward(int reward) {
		this.reward=reward;
	}

	public int getReward() {
		return reward;
	}

	public String toString() {
		return "PlayerlevelS [id=" + id + " ,level=" + level + " ,exp=" + exp + " ,reward=" + reward+ "]";
	}
}

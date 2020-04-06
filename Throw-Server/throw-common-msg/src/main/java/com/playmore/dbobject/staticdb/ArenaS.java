package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ArenaS implements Serializable {

	@DBFieldName(fieldName="区间ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="分数段下", isNullable="columnNullable")
	private int region1;
	@DBFieldName(fieldName="分数段上", isNullable="columnNullable")
	private int region2;
	@DBFieldName(fieldName="elo系数", isNullable="columnNullable")
	private int elo;
	@DBFieldName(fieldName="胜利奖励", isNullable="columnNullable")
	private int winReward;
	@DBFieldName(fieldName="新赛季分数继承比例（但是继承后分数不会低于1000）", isNullable="columnNullable")
	private int inherit;

	public ArenaS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setRegion1(int region1) {
		this.region1=region1;
	}

	public int getRegion1() {
		return region1;
	}

	public void setRegion2(int region2) {
		this.region2=region2;
	}

	public int getRegion2() {
		return region2;
	}

	public void setElo(int elo) {
		this.elo=elo;
	}

	public int getElo() {
		return elo;
	}

	public void setWinReward(int winReward) {
		this.winReward=winReward;
	}

	public int getWinReward() {
		return winReward;
	}

	public void setInherit(int inherit) {
		this.inherit=inherit;
	}

	public int getInherit() {
		return inherit;
	}

	public String toString() {
		return "ArenaS [id=" + id + " ,region1=" + region1 + " ,region2=" + region2 + " ,elo=" + elo + " ,winReward=" + winReward + " ,inherit=" + inherit+ "]";
	}
}

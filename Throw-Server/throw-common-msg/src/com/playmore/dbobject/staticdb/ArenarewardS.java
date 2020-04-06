package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ArenarewardS implements Serializable {

	@DBFieldName(fieldName="奖励区间段", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="排名区间下", isNullable="columnNullable")
	private int region1;
	@DBFieldName(fieldName="排名区间上", isNullable="columnNullable")
	private int region2;
	@DBFieldName(fieldName="每日奖励掉落包", isNullable="columnNullable")
	private int reward1;
	@DBFieldName(fieldName="赛季奖励掉落包", isNullable="columnNullable")
	private int reward2;

	public ArenarewardS(){
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

	public void setReward1(int reward1) {
		this.reward1=reward1;
	}

	public int getReward1() {
		return reward1;
	}

	public void setReward2(int reward2) {
		this.reward2=reward2;
	}

	public int getReward2() {
		return reward2;
	}

	public String toString() {
		return "ArenarewardS [id=" + id + " ,region1=" + region1 + " ,region2=" + region2 + " ,reward1=" + reward1 + " ,reward2=" + reward2+ "]";
	}
}

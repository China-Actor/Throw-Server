package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class MazeRobot implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="阵容json", isNullable="columnNullable")
	private String formationJson;
	@DBFieldName(fieldName="玩家等级", isNullable="columnNullable")
	private int playerLevel;
	@DBFieldName(fieldName="竞技场积分", isNullable="columnNullable")
	private int pvpRunk;
	@DBFieldName(fieldName="总战斗力", isNullable="columnNullable")
	private long totalBattlePower;

	public MazeRobot(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setFormationJson(String formationJson) {
		this.formationJson=formationJson;
	}

	public String getFormationJson() {
		return formationJson;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel=playerLevel;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPvpRunk(int pvpRunk) {
		this.pvpRunk=pvpRunk;
	}

	public int getPvpRunk() {
		return pvpRunk;
	}

	public void setTotalBattlePower(long totalBattlePower) {
		this.totalBattlePower=totalBattlePower;
	}

	public long getTotalBattlePower() {
		return totalBattlePower;
	}

	public String toString() {
		return "MazeRobot [id=" + id + " ,formationJson=" + formationJson + " ,playerLevel=" + playerLevel + " ,pvpRunk=" + pvpRunk + " ,totalBattlePower=" + totalBattlePower+ "]";
	}
}

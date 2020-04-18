package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerCrystal implements Serializable {

	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="共鸣水晶等级", isNullable="columnNullable")
	private int crystalLevel;

	public PlayerCrystal(){
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setCrystalLevel(int crystalLevel) {
		this.crystalLevel=crystalLevel;
	}

	public int getCrystalLevel() {
		return crystalLevel;
	}

	public String toString() {
		return "PlayerCrystal [pid=" + pid + " ,crystalLevel=" + crystalLevel+ "]";
	}
}

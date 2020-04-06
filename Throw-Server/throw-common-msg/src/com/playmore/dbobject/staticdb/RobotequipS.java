package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RobotequipS implements Serializable {

	@DBFieldName(fieldName="怪物等级", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="怪物品质", isNullable="columnNullable")
	private int quality;
	@DBFieldName(fieldName="对应装备品质", isNullable="columnNullable")
	private int equipQuality;
	@DBFieldName(fieldName="对应装备强化等级", isNullable="columnNullable")
	private int equipLevel;

	public RobotequipS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setEquipQuality(int equipQuality) {
		this.equipQuality=equipQuality;
	}

	public int getEquipQuality() {
		return equipQuality;
	}

	public void setEquipLevel(int equipLevel) {
		this.equipLevel=equipLevel;
	}

	public int getEquipLevel() {
		return equipLevel;
	}

	public String toString() {
		return "RobotequipS [id=" + id + " ,quality=" + quality + " ,equipQuality=" + equipQuality + " ,equipLevel=" + equipLevel+ "]";
	}
}

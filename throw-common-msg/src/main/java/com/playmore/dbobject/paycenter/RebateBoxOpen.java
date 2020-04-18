package com.playmore.dbobject.paycenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RebateBoxOpen implements Serializable {

	@DBFieldName(fieldName="物品id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="打开次数", isNullable="columnNoNulls")
	private int nun;

	public RebateBoxOpen(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setNun(int nun) {
		this.nun=nun;
	}

	public int getNun() {
		return nun;
	}

	public String toString() {
		return "RebateBoxOpen [id=" + id + " ,nun=" + nun+ "]";
	}
}

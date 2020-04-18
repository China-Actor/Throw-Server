package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class StatusS implements Serializable {

	@DBFieldName(fieldName="状态类型", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="状态名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="状态表现效果", isNullable="columnNullable")
	private int show;
	@DBFieldName(fieldName="免疫控制", isNullable="columnNullable")
	private int immuneControl;
	@DBFieldName(fieldName="免疫伤害", isNullable="columnNullable")
	private int immuneHurt;

	public StatusS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setShow(int show) {
		this.show=show;
	}

	public int getShow() {
		return show;
	}

	public void setImmuneControl(int immuneControl) {
		this.immuneControl=immuneControl;
	}

	public int getImmuneControl() {
		return immuneControl;
	}

	public void setImmuneHurt(int immuneHurt) {
		this.immuneHurt=immuneHurt;
	}

	public int getImmuneHurt() {
		return immuneHurt;
	}

	public String toString() {
		return "StatusS [id=" + id + " ,name=" + name + " ,show=" + show + " ,immuneControl=" + immuneControl + " ,immuneHurt=" + immuneHurt+ "]";
	}
}

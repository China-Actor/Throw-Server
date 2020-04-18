package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildiconS implements Serializable {

	@DBFieldName(fieldName="图标id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="图片", isNullable="columnNullable")
	private String icon;
	@DBFieldName(fieldName="开启公会等级", isNullable="columnNullable")
	private int open;

	public GuildiconS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setIcon(String icon) {
		this.icon=icon;
	}

	public String getIcon() {
		return icon;
	}

	public void setOpen(int open) {
		this.open=open;
	}

	public int getOpen() {
		return open;
	}

	public String toString() {
		return "GuildiconS [id=" + id + " ,icon=" + icon + " ,open=" + open+ "]";
	}
}

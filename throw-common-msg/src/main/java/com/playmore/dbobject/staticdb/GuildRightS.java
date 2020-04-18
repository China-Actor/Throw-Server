package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildRightS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="公会职位", isNullable="columnNullable")
	private int guildjob;
	@DBFieldName(fieldName="功能显示位置", isNullable="columnNullable")
	private int guildshow;
	@DBFieldName(fieldName="公会特权", isNullable="columnNullable")
	private int guildright;

	public GuildRightS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setGuildjob(int guildjob) {
		this.guildjob=guildjob;
	}

	public int getGuildjob() {
		return guildjob;
	}

	public void setGuildshow(int guildshow) {
		this.guildshow=guildshow;
	}

	public int getGuildshow() {
		return guildshow;
	}

	public void setGuildright(int guildright) {
		this.guildright=guildright;
	}

	public int getGuildright() {
		return guildright;
	}

	public String toString() {
		return "GuildRightS [id=" + id + " ,guildjob=" + guildjob + " ,guildshow=" + guildshow + " ,guildright=" + guildright+ "]";
	}
}

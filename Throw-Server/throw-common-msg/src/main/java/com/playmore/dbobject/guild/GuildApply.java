package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildApply implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="公会ID", isNullable="columnNoNulls")
	private long guildId;
	@DBFieldName(fieldName="申请玩家ID", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="申请时间", isNullable="columnNoNulls")
	private String time;

	public GuildApply(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setGuildId(long guildId) {
		this.guildId=guildId;
	}

	public long getGuildId() {
		return guildId;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setTime(String time) {
		this.time=time;
	}

	public String getTime() {
		return time;
	}

	public String toString() {
		return "GuildApply [id=" + id + " ,guildId=" + guildId + " ,playerId=" + playerId + " ,time=" + time+ "]";
	}
}

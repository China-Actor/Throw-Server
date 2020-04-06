package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildActiveLog implements Serializable {

	private long id;
	private long playerId;
	private long guildId;
	private int active;
	private String createTime;

	public GuildActiveLog(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setGuildId(long guildId) {
		this.guildId=guildId;
	}

	public long getGuildId() {
		return guildId;
	}

	public void setActive(int active) {
		this.active=active;
	}

	public int getActive() {
		return active;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "GuildActiveLog [id=" + id + " ,playerId=" + playerId + " ,guildId=" + guildId + " ,active=" + active + " ,createTime=" + createTime+ "]";
	}
}

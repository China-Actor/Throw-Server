package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildBossHurt implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="公会id", isNullable="columnNullable")
	private long guildId;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="server_id", isNullable="columnNullable")
	private int serverId;
	@DBFieldName(fieldName="伤害血量", isNullable="columnNullable")
	private long hurtHp;
	@DBFieldName(fieldName="boss类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createTime;

	public GuildBossHurt(){
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

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setHurtHp(long hurtHp) {
		this.hurtHp=hurtHp;
	}

	public long getHurtHp() {
		return hurtHp;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "GuildBossHurt [id=" + id + " ,guildId=" + guildId + " ,playerId=" + playerId + " ,serverId=" + serverId + " ,hurtHp=" + hurtHp + " ,type=" + type + " ,createTime=" + createTime+ "]";
	}
}

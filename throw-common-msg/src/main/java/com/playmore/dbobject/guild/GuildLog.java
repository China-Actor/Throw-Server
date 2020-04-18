package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildLog implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="公会ID", isNullable="columnNoNulls")
	private long guildId;
	@DBFieldName(fieldName="日志类型", externalKey="GuildLogType", isNullable="columnNoNulls")
	private int type;
	@DBFieldName(fieldName="内容", isNullable="columnNoNulls")
	private String content;
	@DBFieldName(fieldName="记录时间", isNullable="columnNoNulls")
	private String createTime;

	public GuildLog(){
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

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "GuildLog [id=" + id + " ,guildId=" + guildId + " ,type=" + type + " ,content=" + content + " ,createTime=" + createTime+ "]";
	}
}

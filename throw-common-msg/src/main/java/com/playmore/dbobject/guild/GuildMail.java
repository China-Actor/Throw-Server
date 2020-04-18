package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildMail implements Serializable {

	@DBFieldName(fieldName="邮件ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="公会ID", isNullable="columnNoNulls")
	private long guildId;
	@DBFieldName(fieldName="玩家ID", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="状态", isNullable="columnNoNulls")
	private int state;
	@DBFieldName(fieldName="题目", isNullable="columnNoNulls")
	private String title;
	@DBFieldName(fieldName="内容", isNullable="columnNoNulls")
	private String content;
	@DBFieldName(fieldName="发件人ID", isNullable="columnNoNulls")
	private long sender;
	@DBFieldName(fieldName="发件人职务", isNullable="columnNoNulls")
	private int senderDuty;
	@DBFieldName(fieldName="邮件创建时间", isNullable="columnNoNulls")
	private String beginTime;
	@DBFieldName(fieldName="邮件删除时间", isNullable="columnNoNulls")
	private String endTime;

	public GuildMail(){
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

	public void setState(int state) {
		this.state=state;
	}

	public int getState() {
		return state;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setSender(long sender) {
		this.sender=sender;
	}

	public long getSender() {
		return sender;
	}

	public void setSenderDuty(int senderDuty) {
		this.senderDuty=senderDuty;
	}

	public int getSenderDuty() {
		return senderDuty;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime=beginTime;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setEndTime(String endTime) {
		this.endTime=endTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public String toString() {
		return "GuildMail [id=" + id + " ,guildId=" + guildId + " ,playerId=" + playerId + " ,state=" + state + " ,title=" + title + " ,content=" + content + " ,sender=" + sender + " ,senderDuty=" + senderDuty + " ,beginTime=" + beginTime + " ,endTime=" + endTime+ "]";
	}
}

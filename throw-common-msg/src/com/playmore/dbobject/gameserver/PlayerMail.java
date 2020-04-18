package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMail implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="邮件所属玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="邮件类型", isNullable="columnNoNulls")
	private int type;
	@DBFieldName(fieldName="状态", isNullable="columnNoNulls")
	private int status;
	@DBFieldName(fieldName="发出邮件的玩家ID，如果为0表示系统发放", isNullable="columnNullable")
	private String fromId;
	@DBFieldName(fieldName="标题", isNullable="columnNullable")
	private String title;
	@DBFieldName(fieldName="副标题", isNullable="columnNullable")
	private String subtitle;
	@DBFieldName(fieldName="邮件的富文本参数，表达式：a,b,c", isNullable="columnNullable")
	private String txtParams;
	@DBFieldName(fieldName="邮件的附件，表达式：res_type:res_id:res_num|", isNullable="columnNullable")
	private String attachment;
	@DBFieldName(fieldName="邮件创建时间", isNullable="columnNullable")
	private String createTime;
	@DBFieldName(fieldName="邮件生效时间", isNullable="columnNullable")
	private String startTime;
	@DBFieldName(fieldName="邮件最后有效时间，超过有效时间的邮件视为无效，NULL表示邮件不过期", isNullable="columnNullable")
	private String endTime;

	public PlayerMail(){
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

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setFromId(String fromId) {
		this.fromId=fromId;
	}

	public String getFromId() {
		return fromId;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle=subtitle;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setTxtParams(String txtParams) {
		this.txtParams=txtParams;
	}

	public String getTxtParams() {
		return txtParams;
	}

	public void setAttachment(String attachment) {
		this.attachment=attachment;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setStartTime(String startTime) {
		this.startTime=startTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime=endTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public String toString() {
		return "PlayerMail [id=" + id + " ,playerId=" + playerId + " ,type=" + type + " ,status=" + status + " ,fromId=" + fromId + " ,title=" + title + " ,subtitle=" + subtitle + " ,txtParams=" + txtParams + " ,attachment=" + attachment + " ,createTime=" + createTime + " ,startTime=" + startTime + " ,endTime=" + endTime+ "]";
	}
}

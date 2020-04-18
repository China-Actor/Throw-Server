package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerMail implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="邮件类型", isNullable="columnNoNulls")
	private int type;
	@DBFieldName(fieldName="发出邮件的玩家ID，如果为0表示系统发放", isNullable="columnNoNulls")
	private String fromId;
	@DBFieldName(fieldName="标题", isNullable="columnNoNulls")
	private String title;
	@DBFieldName(fieldName="内容", isNullable="columnNoNulls")
	private String txtParams;
	@DBFieldName(fieldName="附件：trestype_resId_num,trestype_resId_num", isNullable="columnNullable")
	private String attachment;
	@DBFieldName(fieldName="生效时间", isNullable="columnNoNulls")
	private String startTime;
	@DBFieldName(fieldName="结束时间", isNullable="columnNullable")
	private String endTime;
	@DBFieldName(fieldName="副标题", isNullable="columnNullable")
	private String subtitle;
	@DBFieldName(fieldName="最低收信等级", isNullable="columnNoNulls")
	private int level;
	@DBFieldName(fieldName="最低收信vip等级", isNullable="columnNoNulls")
	private int vipLevel;
	@DBFieldName(fieldName="竞技场赛季时间", isNullable="columnNullable")
	private String extend1;
	@DBFieldName(fieldName="竞技场id ", isNullable="columnNullable")
	private String extend2;

	public ServerMail(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
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

	public void setSubtitle(String subtitle) {
		this.subtitle=subtitle;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setVipLevel(int vipLevel) {
		this.vipLevel=vipLevel;
	}

	public int getVipLevel() {
		return vipLevel;
	}

	public void setExtend1(String extend1) {
		this.extend1=extend1;
	}

	public String getExtend1() {
		return extend1;
	}

	public void setExtend2(String extend2) {
		this.extend2=extend2;
	}

	public String getExtend2() {
		return extend2;
	}

	public String toString() {
		return "ServerMail [id=" + id + " ,type=" + type + " ,fromId=" + fromId + " ,title=" + title + " ,txtParams=" + txtParams + " ,attachment=" + attachment + " ,startTime=" + startTime + " ,endTime=" + endTime + " ,subtitle=" + subtitle + " ,level=" + level + " ,vipLevel=" + vipLevel + " ,extend1=" + extend1 + " ,extend2=" + extend2+ "]";
	}
}

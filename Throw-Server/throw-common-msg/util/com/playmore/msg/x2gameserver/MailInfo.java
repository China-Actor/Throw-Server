package com.playmore.msg.x2gameserver;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MailInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8137720192764337144L;
	private String title; // 标题
	private String content;	// 内容
	private String attach;	//奖励
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String endTime;	// 解锁时间
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String startTime;	// 开始时间
	private String level;	//
	private String vipLevel;	//
	private String subTitle;//
	private int type;	// 类型
	private String fromId;	// 谁发送的  默认系统
	private String extend1;	//
	private String extend2;	//
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}


	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "MailInfo [" + (title != null ? "title=" + title + ", " : "")
				+ (content != null ? "content=" + content + ", " : "")
				+ (attach != null ? "attach=" + attach + ", " : "")
				+ (endTime != null ? "endTime=" + endTime + ", " : "")
				+ (startTime != null ? "startTime=" + startTime : "")
				+ (level != null ? "level=" + level : "")
				+ (vipLevel != null ? "vipLevel=" + vipLevel : "")+ "]";
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getExtend1() {
		return extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	public String getExtend2() {
		return extend2;
	}

	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}

	

}




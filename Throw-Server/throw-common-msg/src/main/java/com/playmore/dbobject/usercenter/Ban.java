package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class Ban implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="用户Id", isNullable="columnNullable")
	private long userid;
	@DBFieldName(fieldName="角色id", isNullable="columnNoNulls")
	private long playerid;
	@DBFieldName(fieldName="服务器id", isNullable="columnNullable")
	private int serverid;
	@DBFieldName(fieldName="封号类型0登陆 1发言", isNullable="columnNoNulls")
	private int banType;
	@DBFieldName(fieldName="封号原因", isNullable="columnNoNulls")
	private String reason;
	@DBFieldName(fieldName="操作者", isNullable="columnNoNulls")
	private String operator;
	@DBFieldName(fieldName="解封时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date unlockDate;
	@DBFieldName(fieldName="操作时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date operatorDate;

	public Ban(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setUserid(long userid) {
		this.userid=userid;
	}

	public long getUserid() {
		return userid;
	}

	public void setPlayerid(long playerid) {
		this.playerid=playerid;
	}

	public long getPlayerid() {
		return playerid;
	}

	public void setServerid(int serverid) {
		this.serverid=serverid;
	}

	public int getServerid() {
		return serverid;
	}

	public void setBanType(int banType) {
		this.banType=banType;
	}

	public int getBanType() {
		return banType;
	}

	public void setReason(String reason) {
		this.reason=reason;
	}

	public String getReason() {
		return reason;
	}

	public void setOperator(String operator) {
		this.operator=operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setUnlockDate(Date unlockDate) {
		this.unlockDate=unlockDate;
	}

	public Date getUnlockDate() {
		return unlockDate;
	}

	public void setOperatorDate(Date operatorDate) {
		this.operatorDate=operatorDate;
	}

	public Date getOperatorDate() {
		return operatorDate;
	}

	public String toString() {
		return "Ban [id=" + id + " ,userid=" + userid + " ,playerid=" + playerid + " ,serverid=" + serverid + " ,banType=" + banType + " ,reason=" + reason + " ,operator=" + operator + " ,unlockDate=" + unlockDate + " ,operatorDate=" + operatorDate+ "]";
	}
}

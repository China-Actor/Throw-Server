package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class User implements Serializable {

	@DBFieldName(fieldName="用户id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="渠道唯一标示", isNullable="columnNoNulls")
	private String thirdId;
	@DBFieldName(fieldName="渠道账号", isNullable="columnNoNulls")
	private String thirdAccount;
	@DBFieldName(fieldName="渠道号编识", isNullable="columnNoNulls")
	private String thirdChannel;
	@DBFieldName(fieldName="渠道名称", isNullable="columnNoNulls")
	private String thirdName;
	@DBFieldName(fieldName="最近登录服务器", isNullable="columnNoNulls")
	private int lastServer;
	@DBFieldName(fieldName="创建日期", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@DBFieldName(fieldName="登陆日期", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date loginTime;

	public User(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setThirdId(String thirdId) {
		this.thirdId=thirdId;
	}

	public String getThirdId() {
		return thirdId;
	}

	public void setThirdAccount(String thirdAccount) {
		this.thirdAccount=thirdAccount;
	}

	public String getThirdAccount() {
		return thirdAccount;
	}

	public void setThirdChannel(String thirdChannel) {
		this.thirdChannel=thirdChannel;
	}

	public String getThirdChannel() {
		return thirdChannel;
	}

	public void setThirdName(String thirdName) {
		this.thirdName=thirdName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setLastServer(int lastServer) {
		this.lastServer=lastServer;
	}

	public int getLastServer() {
		return lastServer;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime=loginTime;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public String toString() {
		return "User [id=" + id + " ,thirdId=" + thirdId + " ,thirdAccount=" + thirdAccount + " ,thirdChannel=" + thirdChannel + " ,thirdName=" + thirdName + " ,lastServer=" + lastServer + " ,createTime=" + createTime + " ,loginTime=" + loginTime+ "]";
	}
}

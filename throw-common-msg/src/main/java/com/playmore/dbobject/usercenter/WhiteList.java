package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class WhiteList implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="用户id对应user表", isNullable="columnNoNulls")
	private long userid;
	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int serverid;
	@DBFieldName(fieldName="创建日期", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@DBFieldName(fieldName="创建者", isNullable="columnNoNulls")
	private String operator;

	public WhiteList(){
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

	public void setServerid(int serverid) {
		this.serverid=serverid;
	}

	public int getServerid() {
		return serverid;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setOperator(String operator) {
		this.operator=operator;
	}

	public String getOperator() {
		return operator;
	}

	public String toString() {
		return "WhiteList [id=" + id + " ,userid=" + userid + " ,serverid=" + serverid + " ,createTime=" + createTime + " ,operator=" + operator+ "]";
	}
}

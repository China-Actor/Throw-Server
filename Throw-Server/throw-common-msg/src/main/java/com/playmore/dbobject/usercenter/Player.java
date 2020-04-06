package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class Player implements Serializable {

	@DBFieldName(fieldName="playerid", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="userid用户", isNullable="columnNullable")
	private long userid;
	@DBFieldName(fieldName="服务器id", isNullable="columnNullable")
	private int serverid;
	@DBFieldName(fieldName="角色名", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="性别0女1男", isNullable="columnNullable")
	private boolean sex;

	public Player(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
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

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setSex(boolean sex) {
		this.sex=sex;
	}

	public boolean getSex() {
		return sex;
	}

	public String toString() {
		return "Player [id=" + id + " ,userid=" + userid + " ,serverid=" + serverid + " ,name=" + name + " ,sex=" + sex+ "]";
	}
}

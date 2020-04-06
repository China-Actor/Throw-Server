package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerInfo implements Serializable {

	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="服务器名", isNullable="columnNoNulls")
	private String name;
	@DBFieldName(fieldName="服务器编号名字", isNullable="columnNullable")
	private String serverName;
	@DBFieldName(fieldName="运营状态", externalKey="CommerceStatusType", isNullable="columnNoNulls")
	private int status;
	@DBFieldName(fieldName="服务器推荐", externalKey="ServerMarkType", isNullable="columnNoNulls")
	private int mark;
	@DBFieldName(fieldName="第一次开服日期", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@DBFieldName(fieldName="维护结束后开服时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date openTime;
	@DBFieldName(fieldName="客户端最低版本号", isNullable="columnNoNulls")
	private String minVersion;
	@DBFieldName(fieldName="客户端最高版本号", isNullable="columnNoNulls")
	private String maxVersion;
	@DBFieldName(fieldName="客户端限制", externalKey="ServersystemType", isNullable="columnNoNulls")
	private int system;
	@DBFieldName(fieldName="最大在线人数", isNullable="columnNoNulls")
	private int maxOnline;
	@DBFieldName(fieldName="推荐在线人数", isNullable="columnNoNulls")
	private int adviseOnline;
	@DBFieldName(fieldName="跨服服务器id", isNullable="columnNoNulls")
	private int crossServer;
	@DBFieldName(fieldName="最大注册人数", isNullable="columnNoNulls")
	private int maxRegister;

	public ServerInfo(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setServerName(String serverName) {
		this.serverName=serverName;
	}

	public String getServerName() {
		return serverName;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setMark(int mark) {
		this.mark=mark;
	}

	public int getMark() {
		return mark;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime=openTime;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setMinVersion(String minVersion) {
		this.minVersion=minVersion;
	}

	public String getMinVersion() {
		return minVersion;
	}

	public void setMaxVersion(String maxVersion) {
		this.maxVersion=maxVersion;
	}

	public String getMaxVersion() {
		return maxVersion;
	}

	public void setSystem(int system) {
		this.system=system;
	}

	public int getSystem() {
		return system;
	}

	public void setMaxOnline(int maxOnline) {
		this.maxOnline=maxOnline;
	}

	public int getMaxOnline() {
		return maxOnline;
	}

	public void setAdviseOnline(int adviseOnline) {
		this.adviseOnline=adviseOnline;
	}

	public int getAdviseOnline() {
		return adviseOnline;
	}

	public void setCrossServer(int crossServer) {
		this.crossServer=crossServer;
	}

	public int getCrossServer() {
		return crossServer;
	}

	public void setMaxRegister(int maxRegister) {
		this.maxRegister=maxRegister;
	}

	public int getMaxRegister() {
		return maxRegister;
	}

	public String toString() {
		return "ServerInfo [id=" + id + " ,name=" + name + " ,serverName=" + serverName + " ,status=" + status + " ,mark=" + mark + " ,createTime=" + createTime + " ,openTime=" + openTime + " ,minVersion=" + minVersion + " ,maxVersion=" + maxVersion + " ,system=" + system + " ,maxOnline=" + maxOnline + " ,adviseOnline=" + adviseOnline + " ,crossServer=" + crossServer + " ,maxRegister=" + maxRegister+ "]";
	}
}

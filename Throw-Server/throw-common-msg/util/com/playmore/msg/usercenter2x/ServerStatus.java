package com.playmore.msg.usercenter2x;

import com.playmore.database.DBFieldName;

public class ServerStatus {
	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	public int serverId;
	@DBFieldName(fieldName="是否开放", externalKey="ServerOpenType", isNullable="columnNoNulls")
	public int openType;
	@DBFieldName(fieldName="在线人数", isNullable="columnNoNulls")
	public int onlineNum;
	@DBFieldName(fieldName="当前时间", isNullable="columnNoNulls")
	public String nowTime;
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public int getOnlineNum() {
		return onlineNum;
	}
	public void setOnlineNum(int onlineNum) {
		this.onlineNum = onlineNum;
	}
	public int getOpenType() {
		return openType;
	}
	public void setOpenType(int openType) {
		this.openType = openType;
	}
	public String getNowTime() {
		return nowTime;
	}
	public void setNowTime(String nowTime) {
		this.nowTime = nowTime;
	}
	
}

package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerChannel implements Serializable {

	private int id;
	@DBFieldName(fieldName="渠道名字", isNullable="columnNullable")
	private String channelName;
	@DBFieldName(fieldName="渠道id", isNullable="columnNullable")
	private int channelId;
	@DBFieldName(fieldName="服务器组", isNullable="columnNullable")
	private int serverGroup;
	private String createTime;

	public ServerChannel(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setChannelName(String channelName) {
		this.channelName=channelName;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelId(int channelId) {
		this.channelId=channelId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setServerGroup(int serverGroup) {
		this.serverGroup=serverGroup;
	}

	public int getServerGroup() {
		return serverGroup;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "ServerChannel [id=" + id + " ,channelName=" + channelName + " ,channelId=" + channelId + " ,serverGroup=" + serverGroup + " ,createTime=" + createTime+ "]";
	}
}

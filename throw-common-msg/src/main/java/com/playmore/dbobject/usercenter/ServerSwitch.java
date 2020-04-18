package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerSwitch implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int serverId;
	@DBFieldName(fieldName="渠道", isNullable="columnNoNulls")
	private String channel;
	@DBFieldName(fieldName="开关类型", externalKey="ServerSwitchType", isNullable="columnNoNulls")
	private int switchType;
	@DBFieldName(fieldName="开关名", isNullable="columnNoNulls")
	private String switchName;
	@DBFieldName(fieldName="开关标志", externalKey="ServerOpenType", isNullable="columnNoNulls")
	private int open;
	@DBFieldName(fieldName="开始时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date beginTime;
	@DBFieldName(fieldName="结束时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	@DBFieldName(fieldName="更新时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public ServerSwitch(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setChannel(String channel) {
		this.channel=channel;
	}

	public String getChannel() {
		return channel;
	}

	public void setSwitchType(int switchType) {
		this.switchType=switchType;
	}

	public int getSwitchType() {
		return switchType;
	}

	public void setSwitchName(String switchName) {
		this.switchName=switchName;
	}

	public String getSwitchName() {
		return switchName;
	}

	public void setOpen(int open) {
		this.open=open;
	}

	public int getOpen() {
		return open;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime=beginTime;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime=endTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime=updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "ServerSwitch [id=" + id + " ,serverId=" + serverId + " ,channel=" + channel + " ,switchType=" + switchType + " ,switchName=" + switchName + " ,open=" + open + " ,beginTime=" + beginTime + " ,endTime=" + endTime + " ,updateTime=" + updateTime+ "]";
	}
}

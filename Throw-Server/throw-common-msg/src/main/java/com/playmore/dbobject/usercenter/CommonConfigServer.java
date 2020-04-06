package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CommonConfigServer implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="开放配置的服务器id", isNullable="columnNoNulls")
	private int serverId;
	@DBFieldName(fieldName="通用配置id", isNullable="columnNoNulls")
	private int commonConfigId;

	public CommonConfigServer(){
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

	public void setCommonConfigId(int commonConfigId) {
		this.commonConfigId=commonConfigId;
	}

	public int getCommonConfigId() {
		return commonConfigId;
	}

	public String toString() {
		return "CommonConfigServer [id=" + id + " ,serverId=" + serverId + " ,commonConfigId=" + commonConfigId+ "]";
	}
}

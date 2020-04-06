package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerGroup implements Serializable {

	@DBFieldName(fieldName="组id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="服务器id用逗号隔开，", isNullable="columnNullable")
	private String serverId;
	private String create;

	public ServerGroup(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setServerId(String serverId) {
		this.serverId=serverId;
	}

	public String getServerId() {
		return serverId;
	}

	public void setCreate(String create) {
		this.create=create;
	}

	public String getCreate() {
		return create;
	}

	public String toString() {
		return "ServerGroup [id=" + id + " ,serverId=" + serverId + " ,create=" + create+ "]";
	}
}

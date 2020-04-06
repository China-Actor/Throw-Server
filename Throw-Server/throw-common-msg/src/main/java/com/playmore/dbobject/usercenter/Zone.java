package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class Zone implements Serializable {

	@DBFieldName(fieldName="分区id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="分区名", isNullable="columnNoNulls")
	private String name;
	@DBFieldName(fieldName="服务器id用逗号隔开", isNullable="columnNoNulls")
	private String serverids;
	@DBFieldName(fieldName="渠道", isNullable="columnNullable")
	private String thirdChannel;

	public Zone(){
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

	public void setServerids(String serverids) {
		this.serverids=serverids;
	}

	public String getServerids() {
		return serverids;
	}

	public void setThirdChannel(String thirdChannel) {
		this.thirdChannel=thirdChannel;
	}

	public String getThirdChannel() {
		return thirdChannel;
	}

	public String toString() {
		return "Zone [id=" + id + " ,name=" + name + " ,serverids=" + serverids + " ,thirdChannel=" + thirdChannel+ "]";
	}
}

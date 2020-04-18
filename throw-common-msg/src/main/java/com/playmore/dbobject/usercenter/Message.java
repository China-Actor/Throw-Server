package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class Message implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private String id;
	@DBFieldName(fieldName="提示", isNullable="columnNoNulls")
	private String message;
	private String starTime;
	private String endTime;

	public Message(){
	}

	public void setId(String id) {
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setMessage(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setStarTime(String starTime) {
		this.starTime=starTime;
	}

	public String getStarTime() {
		return starTime;
	}

	public void setEndTime(String endTime) {
		this.endTime=endTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public String toString() {
		return "Message [id=" + id + " ,message=" + message + " ,starTime=" + starTime + " ,endTime=" + endTime+ "]";
	}
}

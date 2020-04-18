package com.playmore.dbobject.paycenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayOk implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="创建日期", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public PayOk(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PayOk [id=" + id + " ,createTime=" + createTime+ "]";
	}
}

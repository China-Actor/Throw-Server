package com.playmore.dbobject.paycenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayFail implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="失败原因", isNullable="columnNoNulls")
	private String reason;
	@DBFieldName(fieldName="创建时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public PayFail(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setReason(String reason) {
		this.reason=reason;
	}

	public String getReason() {
		return reason;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PayFail [id=" + id + " ,reason=" + reason + " ,createTime=" + createTime+ "]";
	}
}

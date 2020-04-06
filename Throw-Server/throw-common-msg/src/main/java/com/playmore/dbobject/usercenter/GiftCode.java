package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GiftCode implements Serializable {

	private int id;
	@DBFieldName(fieldName="礼包批次", isNullable="columnNullable")
	private String giftBatch;
	@DBFieldName(fieldName="礼包码", isNullable="columnNullable")
	private String giftCode;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createTime;
	@DBFieldName(fieldName="礼包码类型", isNullable="columnNullable")
	private int type;

	public GiftCode(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setGiftBatch(String giftBatch) {
		this.giftBatch=giftBatch;
	}

	public String getGiftBatch() {
		return giftBatch;
	}

	public void setGiftCode(String giftCode) {
		this.giftCode=giftCode;
	}

	public String getGiftCode() {
		return giftCode;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public String toString() {
		return "GiftCode [id=" + id + " ,giftBatch=" + giftBatch + " ,giftCode=" + giftCode + " ,createTime=" + createTime + " ,type=" + type+ "]";
	}
}

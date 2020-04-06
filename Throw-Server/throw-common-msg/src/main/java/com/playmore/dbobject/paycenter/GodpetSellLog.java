package com.playmore.dbobject.paycenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GodpetSellLog implements Serializable {

	@DBFieldName(fieldName="主键ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="服务器ID", isNullable="columnNoNulls")
	private int sid;
	@DBFieldName(fieldName="玩家ID", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="宠物code", isNullable="columnNoNulls")
	private String petId;
	@DBFieldName(fieldName="扩展字段", isNullable="columnNoNulls")
	private String extend;
	@DBFieldName(fieldName="记录时间", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public GodpetSellLog(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setSid(int sid) {
		this.sid=sid;
	}

	public int getSid() {
		return sid;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPetId(String petId) {
		this.petId=petId;
	}

	public String getPetId() {
		return petId;
	}

	public void setExtend(String extend) {
		this.extend=extend;
	}

	public String getExtend() {
		return extend;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "GodpetSellLog [id=" + id + " ,sid=" + sid + " ,playerId=" + playerId + " ,petId=" + petId + " ,extend=" + extend + " ,createTime=" + createTime+ "]";
	}
}

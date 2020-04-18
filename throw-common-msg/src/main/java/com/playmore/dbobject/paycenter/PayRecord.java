package com.playmore.dbobject.paycenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayRecord implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="游戏服务器id", isNullable="columnNoNulls")
	private int serverId;
	@DBFieldName(fieldName="用户id", isNullable="columnNoNulls")
	private long userId;
	@DBFieldName(fieldName="订单编号", isNullable="columnNoNulls")
	private String orderNo;
	@DBFieldName(fieldName="金额", isNullable="columnNoNulls")
	private float amount;
	@DBFieldName(fieldName="1成功2失败", isNullable="columnNoNulls")
	private int status;
	@DBFieldName(fieldName="签名时间戳", isNullable="columnNoNulls")
	private String htnonce;
	@DBFieldName(fieldName="签名", isNullable="columnNoNulls")
	private String httoken;
	@DBFieldName(fieldName="对应玩家充值订单id", isNullable="columnNoNulls")
	private String extinfo;
	@DBFieldName(fieldName="是否人工后台充值", isNullable="columnNoNulls")
	private boolean byBoss;

	public PayRecord(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setServerId(int serverId) {
		this.serverId=serverId;
	}

	public int getServerId() {
		return serverId;
	}

	public void setUserId(long userId) {
		this.userId=userId;
	}

	public long getUserId() {
		return userId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo=orderNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setAmount(float amount) {
		this.amount=amount;
	}

	public float getAmount() {
		return amount;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setHtnonce(String htnonce) {
		this.htnonce=htnonce;
	}

	public String getHtnonce() {
		return htnonce;
	}

	public void setHttoken(String httoken) {
		this.httoken=httoken;
	}

	public String getHttoken() {
		return httoken;
	}

	public void setExtinfo(String extinfo) {
		this.extinfo=extinfo;
	}

	public String getExtinfo() {
		return extinfo;
	}

	public void setByBoss(boolean byBoss) {
		this.byBoss=byBoss;
	}

	public boolean getByBoss() {
		return byBoss;
	}

	public String toString() {
		return "PayRecord [id=" + id + " ,serverId=" + serverId + " ,userId=" + userId + " ,orderNo=" + orderNo + " ,amount=" + amount + " ,status=" + status + " ,htnonce=" + htnonce + " ,httoken=" + httoken + " ,extinfo=" + extinfo + " ,byBoss=" + byBoss+ "]";
	}
}

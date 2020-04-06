package com.playmore.dbobject.paycenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RechargeReturn implements Serializable {

	@DBFieldName(fieldName="用户ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="帐号", isNullable="columnNoNulls")
	private String account;
	@DBFieldName(fieldName="三方渠道", isNullable="columnNoNulls")
	private String thridChannel;
	@DBFieldName(fieldName="充值金额", isNullable="columnNoNulls")
	private int amount;
	@DBFieldName(fieldName="是否已经领取过：0、未领取；1、已领取", isNullable="columnNoNulls")
	private int got;
	@DBFieldName(fieldName="返还的物品", isNullable="columnNullable")
	private String goods;

	public RechargeReturn(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setAccount(String account) {
		this.account=account;
	}

	public String getAccount() {
		return account;
	}

	public void setThridChannel(String thridChannel) {
		this.thridChannel=thridChannel;
	}

	public String getThridChannel() {
		return thridChannel;
	}

	public void setAmount(int amount) {
		this.amount=amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setGot(int got) {
		this.got=got;
	}

	public int getGot() {
		return got;
	}

	public void setGoods(String goods) {
		this.goods=goods;
	}

	public String getGoods() {
		return goods;
	}

	public String toString() {
		return "RechargeReturn [id=" + id + " ,account=" + account + " ,thridChannel=" + thridChannel + " ,amount=" + amount + " ,got=" + got + " ,goods=" + goods+ "]";
	}
}

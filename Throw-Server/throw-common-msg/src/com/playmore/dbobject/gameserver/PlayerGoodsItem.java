package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerGoodsItem implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="物品模版id", isNullable="columnNoNulls")
	private int goodsId;
	@DBFieldName(fieldName="数量", isNullable="columnNoNulls")
	private int num;
	@DBFieldName(fieldName="类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="背包类型", isNullable="columnNullable")
	private int bagType;
	@DBFieldName(fieldName="装备星级", isNullable="columnNullable")
	private int star;
	@DBFieldName(fieldName="强化经验", isNullable="columnNullable")
	private int exp;

	public PlayerGoodsItem(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId=goodsId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setBagType(int bagType) {
		this.bagType=bagType;
	}

	public int getBagType() {
		return bagType;
	}

	public void setStar(int star) {
		this.star=star;
	}

	public int getStar() {
		return star;
	}

	public void setExp(int exp) {
		this.exp=exp;
	}

	public int getExp() {
		return exp;
	}

	public String toString() {
		return "PlayerGoodsItem [id=" + id + " ,playerId=" + playerId + " ,goodsId=" + goodsId + " ,num=" + num + " ,type=" + type + " ,bagType=" + bagType + " ,star=" + star + " ,exp=" + exp+ "]";
	}
}

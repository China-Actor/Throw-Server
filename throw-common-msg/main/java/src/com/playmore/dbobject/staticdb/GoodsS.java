package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GoodsS implements Serializable {

	@DBFieldName(fieldName="商品ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="商店阶段ID", isNullable="columnNullable")
	private int shopid;
	@DBFieldName(fieldName="商店中位置", isNullable="columnNullable")
	private int location;
	@DBFieldName(fieldName="随机权重", isNullable="columnNullable")
	private int weight;
	@DBFieldName(fieldName="商品类型", isNullable="columnNullable")
	private int goodsType;
	@DBFieldName(fieldName="商品ID", isNullable="columnNullable")
	private int goodsId;
	@DBFieldName(fieldName="商品数量", isNullable="columnNullable")
	private int goodsNum;
	@DBFieldName(fieldName="购买消耗道具类型", isNullable="columnNullable")
	private int costType;
	@DBFieldName(fieldName="购买消耗道具ID", isNullable="columnNullable")
	private int costId;
	@DBFieldName(fieldName="购买消耗道具数量", isNullable="columnNullable")
	private int costNum;
	@DBFieldName(fieldName="折扣", isNullable="columnNullable")
	private int discount;

	public GoodsS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setShopid(int shopid) {
		this.shopid=shopid;
	}

	public int getShopid() {
		return shopid;
	}

	public void setLocation(int location) {
		this.location=location;
	}

	public int getLocation() {
		return location;
	}

	public void setWeight(int weight) {
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setGoodsType(int goodsType) {
		this.goodsType=goodsType;
	}

	public int getGoodsType() {
		return goodsType;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId=goodsId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum=goodsNum;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setCostType(int costType) {
		this.costType=costType;
	}

	public int getCostType() {
		return costType;
	}

	public void setCostId(int costId) {
		this.costId=costId;
	}

	public int getCostId() {
		return costId;
	}

	public void setCostNum(int costNum) {
		this.costNum=costNum;
	}

	public int getCostNum() {
		return costNum;
	}

	public void setDiscount(int discount) {
		this.discount=discount;
	}

	public int getDiscount() {
		return discount;
	}

	public String toString() {
		return "GoodsS [id=" + id + " ,shopid=" + shopid + " ,location=" + location + " ,weight=" + weight + " ,goodsType=" + goodsType + " ,goodsId=" + goodsId + " ,goodsNum=" + goodsNum + " ,costType=" + costType + " ,costId=" + costId + " ,costNum=" + costNum + " ,discount=" + discount+ "]";
	}
}

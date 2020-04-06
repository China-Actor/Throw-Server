package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DiamondS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="充值类型", isNullable="columnNullable")
	private int rechargetype;
	@DBFieldName(fieldName="标题", isNullable="columnNullable")
	private String title;
	@DBFieldName(fieldName="批注信息", isNullable="columnNullable")
	private String tip;
	@DBFieldName(fieldName="获得有偿钻石", isNullable="columnNullable")
	private int diamond;
	@DBFieldName(fieldName="首充获得无偿钻石", isNullable="columnNullable")
	private int firstdiamond;
	@DBFieldName(fieldName="赠送获得无偿钻石", isNullable="columnNullable")
	private int giftdiamond;
	@DBFieldName(fieldName="消耗RMB", isNullable="columnNullable")
	private int moneycost;
	@DBFieldName(fieldName="获得vip经验", isNullable="columnNullable")
	private int vipexp;
	@DBFieldName(fieldName="说明", isNullable="columnNullable")
	private int comments;

	public DiamondS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setRechargetype(int rechargetype) {
		this.rechargetype=rechargetype;
	}

	public int getRechargetype() {
		return rechargetype;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTip(String tip) {
		this.tip=tip;
	}

	public String getTip() {
		return tip;
	}

	public void setDiamond(int diamond) {
		this.diamond=diamond;
	}

	public int getDiamond() {
		return diamond;
	}

	public void setFirstdiamond(int firstdiamond) {
		this.firstdiamond=firstdiamond;
	}

	public int getFirstdiamond() {
		return firstdiamond;
	}

	public void setGiftdiamond(int giftdiamond) {
		this.giftdiamond=giftdiamond;
	}

	public int getGiftdiamond() {
		return giftdiamond;
	}

	public void setMoneycost(int moneycost) {
		this.moneycost=moneycost;
	}

	public int getMoneycost() {
		return moneycost;
	}

	public void setVipexp(int vipexp) {
		this.vipexp=vipexp;
	}

	public int getVipexp() {
		return vipexp;
	}

	public void setComments(int comments) {
		this.comments=comments;
	}

	public int getComments() {
		return comments;
	}

	public String toString() {
		return "DiamondS [id=" + id + " ,rechargetype=" + rechargetype + " ,title=" + title + " ,tip=" + tip + " ,diamond=" + diamond + " ,firstdiamond=" + firstdiamond + " ,giftdiamond=" + giftdiamond + " ,moneycost=" + moneycost + " ,vipexp=" + vipexp + " ,comments=" + comments+ "]";
	}
}

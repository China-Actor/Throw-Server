package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ItemS implements Serializable {

	@DBFieldName(fieldName="道具ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="道具名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="道具品质（0粗糙，1普通，2稀有，3稀有+，4精英，5精英+，6史诗，7史诗+，8传说，9传说+，10神话", isNullable="columnNullable")
	private int itemQuality;
	@DBFieldName(fieldName="道具图标", isNullable="columnNullable")
	private String iconId;
	@DBFieldName(fieldName="背包页签", isNullable="columnNullable")
	private int bagTag;
	@DBFieldName(fieldName="道具类型", isNullable="columnNullable")
	private int itemType;
	@DBFieldName(fieldName="道具类型值一", isNullable="columnNullable")
	private int itemTypeValue1;
	@DBFieldName(fieldName="道具类型值二", isNullable="columnNullable")
	private int itemTypeValue2;
	@DBFieldName(fieldName="堆叠数量上限", isNullable="columnNullable")
	private int itemMaxNum;
	@DBFieldName(fieldName="使用跳转ID", isNullable="columnNullable")
	private int useSystemId;
	@DBFieldName(fieldName="界面显示类型", isNullable="columnNullable")
	private int itemUsetype;
	@DBFieldName(fieldName="道具功能描述", isNullable="columnNullable")
	private String itemTypeDesc;
	@DBFieldName(fieldName="道具描述", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="说明", isNullable="columnNullable")
	private String comments;

	public ItemS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setItemQuality(int itemQuality) {
		this.itemQuality=itemQuality;
	}

	public int getItemQuality() {
		return itemQuality;
	}

	public void setIconId(String iconId) {
		this.iconId=iconId;
	}

	public String getIconId() {
		return iconId;
	}

	public void setBagTag(int bagTag) {
		this.bagTag=bagTag;
	}

	public int getBagTag() {
		return bagTag;
	}

	public void setItemType(int itemType) {
		this.itemType=itemType;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemTypeValue1(int itemTypeValue1) {
		this.itemTypeValue1=itemTypeValue1;
	}

	public int getItemTypeValue1() {
		return itemTypeValue1;
	}

	public void setItemTypeValue2(int itemTypeValue2) {
		this.itemTypeValue2=itemTypeValue2;
	}

	public int getItemTypeValue2() {
		return itemTypeValue2;
	}

	public void setItemMaxNum(int itemMaxNum) {
		this.itemMaxNum=itemMaxNum;
	}

	public int getItemMaxNum() {
		return itemMaxNum;
	}

	public void setUseSystemId(int useSystemId) {
		this.useSystemId=useSystemId;
	}

	public int getUseSystemId() {
		return useSystemId;
	}

	public void setItemUsetype(int itemUsetype) {
		this.itemUsetype=itemUsetype;
	}

	public int getItemUsetype() {
		return itemUsetype;
	}

	public void setItemTypeDesc(String itemTypeDesc) {
		this.itemTypeDesc=itemTypeDesc;
	}

	public String getItemTypeDesc() {
		return itemTypeDesc;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setComments(String comments) {
		this.comments=comments;
	}

	public String getComments() {
		return comments;
	}

	public String toString() {
		return "ItemS [id=" + id + " ,name=" + name + " ,itemQuality=" + itemQuality + " ,iconId=" + iconId + " ,bagTag=" + bagTag + " ,itemType=" + itemType + " ,itemTypeValue1=" + itemTypeValue1 + " ,itemTypeValue2=" + itemTypeValue2 + " ,itemMaxNum=" + itemMaxNum + " ,useSystemId=" + useSystemId + " ,itemUsetype=" + itemUsetype + " ,itemTypeDesc=" + itemTypeDesc + " ,desc=" + desc + " ,comments=" + comments+ "]";
	}
}

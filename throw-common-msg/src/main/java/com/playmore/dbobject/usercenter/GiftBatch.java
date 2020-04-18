package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GiftBatch implements Serializable {

	private int id;
	private int type;
	@DBFieldName(fieldName="礼包码批次", isNullable="columnNullable")
	private String giftBatch;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createTime;
	@DBFieldName(fieldName="开始时间", isNullable="columnNullable")
	private String starTime;
	@DBFieldName(fieldName="结束时间", isNullable="columnNullable")
	private String endTime;
	@DBFieldName(fieldName="奖励type,id,num;type1id1,num1", isNullable="columnNullable")
	private String rewardStr;
	@DBFieldName(fieldName="渠道id字符串中间用英文逗号隔开1001,1002  默认全选 为0", isNullable="columnNullable")
	private String channelStr;
	@DBFieldName(fieldName="服务器id字符串中间用英文逗号隔开1001,1002默认全选 为0", isNullable="columnNullable")
	private String serveridStr;

	public GiftBatch(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setGiftBatch(String giftBatch) {
		this.giftBatch=giftBatch;
	}

	public String getGiftBatch() {
		return giftBatch;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setStarTime(String starTime) {
		this.starTime=starTime;
	}

	public String getStarTime() {
		return starTime;
	}

	public void setEndTime(String endTime) {
		this.endTime=endTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setRewardStr(String rewardStr) {
		this.rewardStr=rewardStr;
	}

	public String getRewardStr() {
		return rewardStr;
	}

	public void setChannelStr(String channelStr) {
		this.channelStr=channelStr;
	}

	public String getChannelStr() {
		return channelStr;
	}

	public void setServeridStr(String serveridStr) {
		this.serveridStr=serveridStr;
	}

	public String getServeridStr() {
		return serveridStr;
	}

	public String toString() {
		return "GiftBatch [id=" + id + " ,type=" + type + " ,giftBatch=" + giftBatch + " ,createTime=" + createTime + " ,starTime=" + starTime + " ,endTime=" + endTime + " ,rewardStr=" + rewardStr + " ,channelStr=" + channelStr + " ,serveridStr=" + serveridStr+ "]";
	}
}

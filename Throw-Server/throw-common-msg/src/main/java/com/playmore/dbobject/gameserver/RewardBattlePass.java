package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class RewardBattlePass implements Serializable {

	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="类型", isNullable="columnNoNulls")
	private int type;
	@DBFieldName(fieldName="内容", isNullable="columnNullable")
	private String content;
	@DBFieldName(fieldName="功勋值", isNullable="columnNullable")
	private int value;
	@DBFieldName(fieldName="是否拥有道具", isNullable="columnNullable")
	private boolean isProp;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createTime;
	@DBFieldName(fieldName="更新时间", isNullable="columnNullable")
	private String updateTime;

	public RewardBattlePass(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setValue(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setIsProp(boolean isProp) {
		this.isProp=isProp;
	}

	public boolean getIsProp() {
		return isProp;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String toString() {
		return "RewardBattlePass [id=" + id + " ,pid=" + pid + " ,type=" + type + " ,content=" + content + " ,value=" + value + " ,isProp=" + isProp + " ,createTime=" + createTime + " ,updateTime=" + updateTime+ "]";
	}
}

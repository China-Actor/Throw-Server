package com.playmore.dbobject.configcenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GameServerMerge implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="合并的服务器id逗号隔开", isNullable="columnNoNulls")
	private String mergeids;
	@DBFieldName(fieldName="创建日期", isNullable="columnNoNulls")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public GameServerMerge(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setMergeids(String mergeids) {
		this.mergeids=mergeids;
	}

	public String getMergeids() {
		return mergeids;
	}

	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "GameServerMerge [id=" + id + " ,mergeids=" + mergeids + " ,createTime=" + createTime+ "]";
	}
}

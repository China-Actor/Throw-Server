package com.playmore.dbobject.usercenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CommonConfig implements Serializable {

	@DBFieldName(fieldName="类型", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="图片id,图片id", isNullable="columnNoNulls")
	private String value;
	@DBFieldName(fieldName="是否使用（0否1是）", isNullable="columnNullable")
	private boolean use;
	@DBFieldName(fieldName="vip等级", isNullable="columnNullable")
	private int vipLevel;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="渠道", isNullable="columnNullable")
	private String channel;

	public CommonConfig(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setValue(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setUse(boolean use) {
		this.use=use;
	}

	public boolean getUse() {
		return use;
	}

	public void setVipLevel(int vipLevel) {
		this.vipLevel=vipLevel;
	}

	public int getVipLevel() {
		return vipLevel;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setChannel(String channel) {
		this.channel=channel;
	}

	public String getChannel() {
		return channel;
	}

	public String toString() {
		return "CommonConfig [id=" + id + " ,value=" + value + " ,use=" + use + " ,vipLevel=" + vipLevel + " ,level=" + level + " ,channel=" + channel+ "]";
	}
}

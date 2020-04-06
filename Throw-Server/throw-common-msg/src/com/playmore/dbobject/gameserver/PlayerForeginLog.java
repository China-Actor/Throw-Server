package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeginLog implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="外援id", isNullable="columnNoNulls")
	private int type;
	@DBFieldName(fieldName="语言key", isNullable="columnNullable")
	private String languageKey;
	@DBFieldName(fieldName="内容", isNullable="columnNoNulls")
	private String params;
	@DBFieldName(fieldName="记录时间", isNullable="columnNoNulls")
	private String createTime;

	public PlayerForeginLog(){
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

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setLanguageKey(String languageKey) {
		this.languageKey=languageKey;
	}

	public String getLanguageKey() {
		return languageKey;
	}

	public void setParams(String params) {
		this.params=params;
	}

	public String getParams() {
		return params;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String toString() {
		return "PlayerForeginLog [id=" + id + " ,playerId=" + playerId + " ,type=" + type + " ,languageKey=" + languageKey + " ,params=" + params + " ,createTime=" + createTime+ "]";
	}
}

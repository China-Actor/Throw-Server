package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class LanguageS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="参数名", isNullable="columnNullable")
	private String key;
	@DBFieldName(fieldName="中文", isNullable="columnNullable")
	private String chinese;
	@DBFieldName(fieldName="日本（程序使用）", isNullable="columnNullable")
	private String japanese;
	@DBFieldName(fieldName="英文", isNullable="columnNullable")
	private int english;

	public LanguageS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setKey(String key) {
		this.key=key;
	}

	public String getKey() {
		return key;
	}

	public void setChinese(String chinese) {
		this.chinese=chinese;
	}

	public String getChinese() {
		return chinese;
	}

	public void setJapanese(String japanese) {
		this.japanese=japanese;
	}

	public String getJapanese() {
		return japanese;
	}

	public void setEnglish(int english) {
		this.english=english;
	}

	public int getEnglish() {
		return english;
	}

	public String toString() {
		return "LanguageS [id=" + id + " ,key=" + key + " ,chinese=" + chinese + " ,japanese=" + japanese + " ,english=" + english+ "]";
	}
}

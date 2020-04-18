package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SensitiveWordS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="敏感字库", isNullable="columnNullable")
	private String word;

	public SensitiveWordS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setWord(String word) {
		this.word=word;
	}

	public String getWord() {
		return word;
	}

	public String toString() {
		return "SensitiveWordS [id=" + id + " ,word=" + word+ "]";
	}
}

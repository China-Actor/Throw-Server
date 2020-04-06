package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GradeS implements Serializable {

	@DBFieldName(fieldName="属性ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="战斗力系数", isNullable="columnNullable")
	private float value;
	@DBFieldName(fieldName="注释", isNullable="columnNullable")
	private String field;

	public GradeS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setValue(float value) {
		this.value=value;
	}

	public float getValue() {
		return value;
	}

	public void setField(String field) {
		this.field=field;
	}

	public String getField() {
		return field;
	}

	public String toString() {
		return "GradeS [id=" + id + " ,value=" + value + " ,field=" + field+ "]";
	}
}

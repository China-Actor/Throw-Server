package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ErrorCodeS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="句柄", isNullable="columnNoNulls")
	private String codeChar;
	@DBFieldName(fieldName="描述", isNullable="columnNoNulls")
	private String desc;

	public ErrorCodeS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setCodeChar(String codeChar) {
		this.codeChar=codeChar;
	}

	public String getCodeChar() {
		return codeChar;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return "ErrorCodeS [id=" + id + " ,codeChar=" + codeChar + " ,desc=" + desc+ "]";
	}
}

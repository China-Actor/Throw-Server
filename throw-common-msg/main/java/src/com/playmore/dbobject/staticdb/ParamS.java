package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ParamS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="参数名", isNullable="columnNullable")
	private String key;
	@DBFieldName(fieldName="参数", isNullable="columnNullable")
	private String param;
	@DBFieldName(fieldName="参数描述", isNullable="columnNullable")
	private String desc;

	public ParamS(){
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

	public void setParam(String param) {
		this.param=param;
	}

	public String getParam() {
		return param;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return "ParamS [id=" + id + " ,key=" + key + " ,param=" + param + " ,desc=" + desc+ "]";
	}
}

package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class WishS implements Serializable {

	@DBFieldName(fieldName="格子", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="权重", isNullable="columnNullable")
	private int weight;
	@DBFieldName(fieldName="可选择的英雄", isNullable="columnNullable")
	private String content;
	@DBFieldName(fieldName="分组", isNullable="columnNullable")
	private int type;

	public WishS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setWeight(int weight) {
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public String toString() {
		return "WishS [id=" + id + " ,weight=" + weight + " ,content=" + content + " ,type=" + type+ "]";
	}
}

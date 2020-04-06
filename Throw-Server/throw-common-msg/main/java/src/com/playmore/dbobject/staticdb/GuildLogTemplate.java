package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildLogTemplate implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="描述", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="描述", isNullable="columnNullable")
	private String content;

	public GuildLogTemplate(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public String toString() {
		return "GuildLogTemplate [id=" + id + " ,name=" + name + " ,content=" + content+ "]";
	}
}

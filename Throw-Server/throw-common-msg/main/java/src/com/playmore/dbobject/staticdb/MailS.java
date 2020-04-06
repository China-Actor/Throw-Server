package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MailS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="邮件系统分类", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="邮件标题", isNullable="columnNullable")
	private String title;
	@DBFieldName(fieldName="邮件内容", isNullable="columnNullable")
	private String content;
	@DBFieldName(fieldName="发送者", isNullable="columnNullable")
	private String sendername;
	@DBFieldName(fieldName="邮件奖励", isNullable="columnNullable")
	private String awards;
	@DBFieldName(fieldName="邮件有效期", isNullable="columnNullable")
	private int term;

	public MailS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setSendername(String sendername) {
		this.sendername=sendername;
	}

	public String getSendername() {
		return sendername;
	}

	public void setAwards(String awards) {
		this.awards=awards;
	}

	public String getAwards() {
		return awards;
	}

	public void setTerm(int term) {
		this.term=term;
	}

	public int getTerm() {
		return term;
	}

	public String toString() {
		return "MailS [id=" + id + " ,type=" + type + " ,title=" + title + " ,content=" + content + " ,sendername=" + sendername + " ,awards=" + awards + " ,term=" + term+ "]";
	}
}

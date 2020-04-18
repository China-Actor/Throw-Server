package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class LevelS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="等级", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="金币", isNullable="columnNullable")
	private int gold;
	@DBFieldName(fieldName="英雄经验", isNullable="columnNullable")
	private int exp;
	@DBFieldName(fieldName="英雄粉尘", isNullable="columnNullable")
	private int item1;
	@DBFieldName(fieldName="英雄总经验", isNullable="columnNullable")
	private long expsum;
	@DBFieldName(fieldName="共鸣水晶限制", isNullable="columnNullable")
	private int limit;

	public LevelS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setGold(int gold) {
		this.gold=gold;
	}

	public int getGold() {
		return gold;
	}

	public void setExp(int exp) {
		this.exp=exp;
	}

	public int getExp() {
		return exp;
	}

	public void setItem1(int item1) {
		this.item1=item1;
	}

	public int getItem1() {
		return item1;
	}

	public void setExpsum(long expsum) {
		this.expsum=expsum;
	}

	public long getExpsum() {
		return expsum;
	}

	public void setLimit(int limit) {
		this.limit=limit;
	}

	public int getLimit() {
		return limit;
	}

	public String toString() {
		return "LevelS [id=" + id + " ,level=" + level + " ,gold=" + gold + " ,exp=" + exp + " ,item1=" + item1 + " ,expsum=" + expsum + " ,limit=" + limit+ "]";
	}
}

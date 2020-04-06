package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PriceaddS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="序列ID", isNullable="columnNullable")
	private int pirceId;
	@DBFieldName(fieldName="购买次数", isNullable="columnNullable")
	private int buyCount;
	@DBFieldName(fieldName="价格", isNullable="columnNullable")
	private int price;

	public PriceaddS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setPirceId(int pirceId) {
		this.pirceId=pirceId;
	}

	public int getPirceId() {
		return pirceId;
	}

	public void setBuyCount(int buyCount) {
		this.buyCount=buyCount;
	}

	public int getBuyCount() {
		return buyCount;
	}

	public void setPrice(int price) {
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "PriceaddS [id=" + id + " ,pirceId=" + pirceId + " ,buyCount=" + buyCount + " ,price=" + price+ "]";
	}
}

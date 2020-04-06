package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ShopS implements Serializable {

	@DBFieldName(fieldName="商店阶段ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="商店类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="商店名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="自动刷新时间类型", isNullable="columnNullable")
	private int refreshTime;
	@DBFieldName(fieldName="手动刷新消耗", isNullable="columnNullable")
	private int refreshCost;
	@DBFieldName(fieldName="开启条件", isNullable="columnNullable")
	private int open;
	@DBFieldName(fieldName="商品数量", isNullable="columnNullable")
	private int num;
	@DBFieldName(fieldName="描述文字（可多条随机）", isNullable="columnNullable")
	private int desc;

	public ShopS(){
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

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setRefreshTime(int refreshTime) {
		this.refreshTime=refreshTime;
	}

	public int getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshCost(int refreshCost) {
		this.refreshCost=refreshCost;
	}

	public int getRefreshCost() {
		return refreshCost;
	}

	public void setOpen(int open) {
		this.open=open;
	}

	public int getOpen() {
		return open;
	}

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setDesc(int desc) {
		this.desc=desc;
	}

	public int getDesc() {
		return desc;
	}

	public String toString() {
		return "ShopS [id=" + id + " ,type=" + type + " ,name=" + name + " ,refreshTime=" + refreshTime + " ,refreshCost=" + refreshCost + " ,open=" + open + " ,num=" + num + " ,desc=" + desc+ "]";
	}
}

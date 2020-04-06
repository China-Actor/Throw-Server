package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SystemS implements Serializable {

	@DBFieldName(fieldName="系统ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="系统名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="开启提示语", isNullable="columnNullable")
	private String tips;
	@DBFieldName(fieldName="解锁关卡", isNullable="columnNullable")
	private int stage;
	@DBFieldName(fieldName="解锁VIP", isNullable="columnNullable")
	private int vip;
	@DBFieldName(fieldName="系统ICON", isNullable="columnNullable")
	private int icon;
	@DBFieldName(fieldName="超链接", isNullable="columnNullable")
	private int link;
	@DBFieldName(fieldName="系统开启顺序", isNullable="columnNullable")
	private int openOrder;

	public SystemS(){
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

	public void setTips(String tips) {
		this.tips=tips;
	}

	public String getTips() {
		return tips;
	}

	public void setStage(int stage) {
		this.stage=stage;
	}

	public int getStage() {
		return stage;
	}

	public void setVip(int vip) {
		this.vip=vip;
	}

	public int getVip() {
		return vip;
	}

	public void setIcon(int icon) {
		this.icon=icon;
	}

	public int getIcon() {
		return icon;
	}

	public void setLink(int link) {
		this.link=link;
	}

	public int getLink() {
		return link;
	}

	public void setOpenOrder(int openOrder) {
		this.openOrder=openOrder;
	}

	public int getOpenOrder() {
		return openOrder;
	}

	public String toString() {
		return "SystemS [id=" + id + " ,name=" + name + " ,tips=" + tips + " ,stage=" + stage + " ,vip=" + vip + " ,icon=" + icon + " ,link=" + link + " ,openOrder=" + openOrder+ "]";
	}
}

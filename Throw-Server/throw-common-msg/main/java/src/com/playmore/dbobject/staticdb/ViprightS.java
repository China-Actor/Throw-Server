package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ViprightS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="特权类型", isNullable="columnNullable")
	private int vipright;
	@DBFieldName(fieldName="特权说明", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="Vip0", isNullable="columnNullable")
	private int vip0value;
	@DBFieldName(fieldName="Vip1", isNullable="columnNullable")
	private int vip1value;
	@DBFieldName(fieldName="Vip2", isNullable="columnNullable")
	private int vip2value;
	@DBFieldName(fieldName="Vip3", isNullable="columnNullable")
	private int vip3value;
	@DBFieldName(fieldName="Vip4", isNullable="columnNullable")
	private int vip4value;
	@DBFieldName(fieldName="Vip5", isNullable="columnNullable")
	private int vip5value;
	@DBFieldName(fieldName="Vip6", isNullable="columnNullable")
	private int vip6value;
	@DBFieldName(fieldName="Vip7", isNullable="columnNullable")
	private int vip7value;
	@DBFieldName(fieldName="Vip8", isNullable="columnNullable")
	private int vip8value;
	@DBFieldName(fieldName="Vip9", isNullable="columnNullable")
	private int vip9value;
	@DBFieldName(fieldName="Vip10", isNullable="columnNullable")
	private int vip10value;
	@DBFieldName(fieldName="Vip11", isNullable="columnNullable")
	private int vip11value;
	@DBFieldName(fieldName="Vip12", isNullable="columnNullable")
	private int vip12value;
	@DBFieldName(fieldName="Vip13", isNullable="columnNullable")
	private int vip13value;
	@DBFieldName(fieldName="Vip14", isNullable="columnNullable")
	private int vip14value;
	@DBFieldName(fieldName="Vip15", isNullable="columnNullable")
	private int vip15value;

	public ViprightS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setVipright(int vipright) {
		this.vipright=vipright;
	}

	public int getVipright() {
		return vipright;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setVip0value(int vip0value) {
		this.vip0value=vip0value;
	}

	public int getVip0value() {
		return vip0value;
	}

	public void setVip1value(int vip1value) {
		this.vip1value=vip1value;
	}

	public int getVip1value() {
		return vip1value;
	}

	public void setVip2value(int vip2value) {
		this.vip2value=vip2value;
	}

	public int getVip2value() {
		return vip2value;
	}

	public void setVip3value(int vip3value) {
		this.vip3value=vip3value;
	}

	public int getVip3value() {
		return vip3value;
	}

	public void setVip4value(int vip4value) {
		this.vip4value=vip4value;
	}

	public int getVip4value() {
		return vip4value;
	}

	public void setVip5value(int vip5value) {
		this.vip5value=vip5value;
	}

	public int getVip5value() {
		return vip5value;
	}

	public void setVip6value(int vip6value) {
		this.vip6value=vip6value;
	}

	public int getVip6value() {
		return vip6value;
	}

	public void setVip7value(int vip7value) {
		this.vip7value=vip7value;
	}

	public int getVip7value() {
		return vip7value;
	}

	public void setVip8value(int vip8value) {
		this.vip8value=vip8value;
	}

	public int getVip8value() {
		return vip8value;
	}

	public void setVip9value(int vip9value) {
		this.vip9value=vip9value;
	}

	public int getVip9value() {
		return vip9value;
	}

	public void setVip10value(int vip10value) {
		this.vip10value=vip10value;
	}

	public int getVip10value() {
		return vip10value;
	}

	public void setVip11value(int vip11value) {
		this.vip11value=vip11value;
	}

	public int getVip11value() {
		return vip11value;
	}

	public void setVip12value(int vip12value) {
		this.vip12value=vip12value;
	}

	public int getVip12value() {
		return vip12value;
	}

	public void setVip13value(int vip13value) {
		this.vip13value=vip13value;
	}

	public int getVip13value() {
		return vip13value;
	}

	public void setVip14value(int vip14value) {
		this.vip14value=vip14value;
	}

	public int getVip14value() {
		return vip14value;
	}

	public void setVip15value(int vip15value) {
		this.vip15value=vip15value;
	}

	public int getVip15value() {
		return vip15value;
	}

	public String toString() {
		return "ViprightS [id=" + id + " ,vipright=" + vipright + " ,desc=" + desc + " ,vip0value=" + vip0value + " ,vip1value=" + vip1value + " ,vip2value=" + vip2value + " ,vip3value=" + vip3value + " ,vip4value=" + vip4value + " ,vip5value=" + vip5value + " ,vip6value=" + vip6value + " ,vip7value=" + vip7value + " ,vip8value=" + vip8value + " ,vip9value=" + vip9value + " ,vip10value=" + vip10value + " ,vip11value=" + vip11value + " ,vip12value=" + vip12value + " ,vip13value=" + vip13value + " ,vip14value=" + vip14value + " ,vip15value=" + vip15value+ "]";
	}
}

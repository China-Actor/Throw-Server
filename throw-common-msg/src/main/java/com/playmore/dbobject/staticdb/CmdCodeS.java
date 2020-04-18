package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CmdCodeS implements Serializable {

	@DBFieldName(fieldName="命令字 16位显示", isNullable="columnNoNulls")
	private String id;
	private String c2s;
	private String c2sDesc;
	private String s2c;
	private String s2cDesc;

	public CmdCodeS(){
	}

	public void setId(String id) {
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setC2s(String c2s) {
		this.c2s=c2s;
	}

	public String getC2s() {
		return c2s;
	}

	public void setC2sDesc(String c2sDesc) {
		this.c2sDesc=c2sDesc;
	}

	public String getC2sDesc() {
		return c2sDesc;
	}

	public void setS2c(String s2c) {
		this.s2c=s2c;
	}

	public String getS2c() {
		return s2c;
	}

	public void setS2cDesc(String s2cDesc) {
		this.s2cDesc=s2cDesc;
	}

	public String getS2cDesc() {
		return s2cDesc;
	}

	public String toString() {
		return "CmdCodeS [id=" + id + " ,c2s=" + c2s + " ,c2sDesc=" + c2sDesc + " ,s2c=" + s2c + " ,s2cDesc=" + s2cDesc+ "]";
	}
}

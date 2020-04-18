package com.playmore.msg.x2gameserver;

public class BaseResponse {
	private int code;
	private String msg;
	
	public BaseResponse()
	{
		this.code=0;
		this.msg="success";
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}

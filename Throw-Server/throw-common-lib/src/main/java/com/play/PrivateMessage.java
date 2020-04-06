package com.play;

import java.io.Serializable;


/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PrivateMessage implements Serializable {

	private long id;
	private long fromId;
	private long toId;
	private String msg;
	private long timestamp;
	private int read;
	private String groupFlag;

	public PrivateMessage() {
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setFromId(long fromId) {
		this.fromId = fromId;
	}

	public long getFromId() {
		return fromId;
	}

	public void setToId(long toId) {
		this.toId = toId;
	}

	public long getToId() {
		return toId;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setRead(int read) {
		this.read = read;
	}

	public int getRead() {
		return read;
	}

	public void setGroupFlag(String groupFlag) {
		this.groupFlag = groupFlag;
	}

	public String getGroupFlag() {
		return groupFlag;
	}

	public String toString() {
		return "PrivateMessage [id=" + id + " ,fromId=" + fromId + " ,toId=" + toId + " ,msg=" + msg + " ,timestamp=" + timestamp + " ,read=" + read
				+ " ,groupFlag=" + groupFlag + "]";
	}
}

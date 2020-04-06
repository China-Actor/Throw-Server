package com.playmore.msg.usercenter2x;

import com.playmore.dbobject.usercenter.Player;
import com.playmore.dbobject.usercenter.User;

public class LoginResult {

	boolean status;
	User user;
	Player player;
	boolean ban;
	boolean gag;
	boolean white;
	boolean isRepeateName;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isBan() {
		return ban;
	}

	public void setBan(boolean ban) {
		this.ban = ban;
	}

	public boolean isGag() {
		return gag;
	}

	public void setGag(boolean gag) {
		this.gag = gag;
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}

	public boolean isRepeateName() {
		return isRepeateName;
	}

	public void setRepeateName(boolean isRepeateName) {
		this.isRepeateName = isRepeateName;
	}
	

}

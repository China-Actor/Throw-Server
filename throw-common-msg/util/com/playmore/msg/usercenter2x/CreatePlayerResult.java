package com.playmore.msg.usercenter2x;

import com.playmore.dbobject.usercenter.Player;

public class CreatePlayerResult {

	boolean status;
	Player player;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}

package com.playmore.msg.x2gameserver;

import java.io.Serializable;

public class MailToPlayers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8262098879668975277L;
	private long[] playerId;
	private MailInfo mailInfo;
	
	public long[] getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long[] playerId) {
		this.playerId = playerId;
	}
	public MailInfo getMailInfo() {
		return mailInfo;
	}
	public void setMailInfo(MailInfo mailInfo) {
		this.mailInfo = mailInfo;
	}
}

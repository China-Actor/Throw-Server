package com.playmore.xysword.remote.action;

import com.playmore.remote.annotation.MainCMD;
import com.playmore.remote.annotation.SubCMD;
import com.playmore.xysword.enumtype.CrossCommand;

@MainCMD(CrossCommand.CHAT)
public interface CrossChatAction {
	
	@SubCMD(value=1,async=true)
	void chat(int serverId,byte[] msg);
	
}
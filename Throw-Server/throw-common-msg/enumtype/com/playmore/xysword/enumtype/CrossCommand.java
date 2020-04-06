package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface CrossCommand {

	@EnumFieldName(annotation="跨服聊天")
	int CHAT = 1;
	
	@EnumFieldName(annotation="玩家信息")
	int COMMS = 2;
	
	@EnumFieldName(annotation="外援信息")
	int FOREGIN = 3;
	
	
}

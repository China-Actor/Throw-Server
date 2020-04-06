package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface MailStateType {
//状态:0、未读；1、已读；2、已领取；3、删除
	@EnumFieldName(annotation="未读")
	public static final int UNREAD = 0;
	@EnumFieldName(annotation="已读")
	public static final int READED = 1;
	@EnumFieldName(annotation="已领取")
	public static final int REWARD = 2;
	@EnumFieldName(annotation="删除")
	public static final int DELETE = 3;
	
}

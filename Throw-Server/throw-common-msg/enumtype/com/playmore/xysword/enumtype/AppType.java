package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface AppType {

	@EnumFieldName(annotation="用户中心")
	public final static int USER_CENTER = 1;
	@EnumFieldName(annotation="计费中心")
	public final static int PAY_CENTER = 2;
	@EnumFieldName(annotation="config服务器")
	public final static int CONFIG_CENTER = 3;
	@EnumFieldName(annotation="BOSS服务器")
	public final static int BOSS_SERVER = 4;
	@EnumFieldName(annotation="游戏服务器")
	public final static int GAME_SERVER = 5;
	@EnumFieldName(annotation="定时任务服务器")
	public final static int SCHEDULE_SERVER = 6;
	@EnumFieldName(annotation="兑换码服务器")
	public final static int INVITE_CODE_SERVER = 7;


	@EnumFieldName(annotation="公会服务器")
	public final static int GUILD_SERVER = 8;
	@EnumFieldName(annotation="聊天服务器")
	public final static int CHAT_SERVER = 9;
	@EnumFieldName(annotation="同步数据服务器")
	public final static int SYN_GAME_SERVER = 10;

}

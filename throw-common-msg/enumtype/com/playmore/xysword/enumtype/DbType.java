package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface DbType {

	@EnumFieldName(annotation="静态库")
	public static final String STATIC = "static";
	
	@EnumFieldName(annotation="日志库")
	public static final String LOG = "log";
	
	@EnumFieldName(annotation="游戏库")
	public static final String GAME = "game";
	
	@EnumFieldName(annotation="用户中心")
	public static final String USER_CENTER = "usercenter";
	
	@EnumFieldName(annotation="配置中心")
	public static final String CONFIG_CENTER = "configcenter";
	
	@EnumFieldName(annotation="BOSS中心")
	public static final String BOSS = "boss";
	
	@EnumFieldName(annotation="计费中心")
	public static final String PAY = "pay";
	
	@EnumFieldName(annotation="同步游戏数据")
	public static final String SYN_GAME = "synGame";
	
	@EnumFieldName(annotation="公会中心")
	public static final String GUILD_CENTER = "guildcenter";
}

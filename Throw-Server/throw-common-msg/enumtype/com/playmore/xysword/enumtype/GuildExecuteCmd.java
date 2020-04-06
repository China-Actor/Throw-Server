package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface GuildExecuteCmd {

	@EnumFieldName(annotation="创建公会")
	public static final int CREATE_GUILD = 1001;

	@EnumFieldName(annotation="添加公会成员和更新公会数量和公会的申请删除并通知对应公会")
	public static final int ADD_GUILD_MEMBER = 1002;
	
	@EnumFieldName(annotation="公会申请和更新申请数量和通知长老以上的玩家服")
	public static final int GUILD_APPLE = 1003;
	
	@EnumFieldName(annotation="退出公会 或者踢人")
	public static final int EXIT_GUILD = 1004;
	
	@EnumFieldName(annotation="修改职位")
	public static final int UPDATE_GUILD_DUTY = 1005;
	
	@EnumFieldName(annotation="修改积分")
	public static final int UPDATE_GUILD_ACTIVE = 1006;
	
	@EnumFieldName(annotation="公会申请列表操作")
	public static final int GUILD_APPLE_AOTO = 1007;
	
	@EnumFieldName(annotation="开启公会Boss")
	public static final int GUILD_START_BOSS = 1008;
	
	
	@EnumFieldName(annotation="公会邮件")
	public static final int GUILD_MAIL = 1009;
	
}

package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface ServerSwitchType {

	@EnumFieldName(annotation="是否服务器开放")
	public final static int OPEN = 1;
	@EnumFieldName(annotation="是否允许登录")
	public final static int LOGIN = 2;
	@EnumFieldName(annotation="是否充值")
	public final static int PAY = 3;
	@EnumFieldName(annotation="是否注册")
	public final static int REGISTER = 4;
	@EnumFieldName(annotation="是否微信关注")
	public final static int ATTENTION = 5;
	@EnumFieldName(annotation="是否礼包码")
	public final static int INVITECODE = 6;
	@EnumFieldName(annotation="是否分享")
	public final static int SHARE = 10;
	@EnumFieldName(annotation="是否签到")
	public final static int SIGN = 11;
	@EnumFieldName(annotation="是否月卡")
	public final static int MONTHCARD = 12;
	@EnumFieldName(annotation="是否跨服聊天")
	public final static int SERVERCHAT = 17;
	@EnumFieldName(annotation="是否防沉迷")
	public final static int ANTI_ADDICATION = 18;
	@EnumFieldName(annotation="是否屏蔽敏感字")
	public final static int SENSITIVE = 19;
	@EnumFieldName(annotation="是否开启武道会")
	public final static int AREAN_MATCH = 20;
	
	@EnumFieldName(annotation="是否贵宾")
	public final static int GUEST = 21;
	@EnumFieldName(annotation="是否组队喊话")
	public final static int TEAM_SHOUT = 22;
	@EnumFieldName(annotation="是否活动")
	public final static int ACTIVITY = 23;
	@EnumFieldName(annotation="是否神宠")
	public final static int GOD_PET = 24;
	@EnumFieldName(annotation="是否微信百万红包")
	public final static int WECHAT_REDPACKET = 25;
	
	@EnumFieldName(annotation="是否开启积分赛")
	public final static int SCORE_MATCH = 26;
	
	@EnumFieldName(annotation="是否开启评分反馈")
	public final static int FEED_BACK = 27;
	@EnumFieldName(annotation="是否开启炼体")
	public final static int CARD_REFINE = 28;
	@EnumFieldName(annotation="是否开启红包雨")
	public final static int LUCKY_RAIN = 29;
	
	@EnumFieldName(annotation="是否开启帮会邮件")
	public final static int GUILD_MAIL = 30;
	@EnumFieldName(annotation="是否开启帮会幻境")
	public final static int GUILD_DUNGEON = 31;
	@EnumFieldName(annotation="是否开启查看他人阵容")
	public final static int OTHER_PLAYER_FORMATION = 32;
	@EnumFieldName(annotation="是否开启宠物合成")
	public final static int PET_COMPOSE = 33;
	@EnumFieldName(annotation="是否开启寻宝")
	public final static int TREASURE_HUNT = 34;
	@EnumFieldName(annotation="仙灵宝境")
	public final static int TURN_TABLE = 35;
	@EnumFieldName(annotation="帮会战")
	public final static int GUILD_WAR = 36;
	@EnumFieldName(annotation="限时商城")
	public final static int LIMIT_TIME_SHOP = 37;
	@EnumFieldName(annotation="专属装备")
	public final static int SPECIAL_EQUIP = 38;
	
	@EnumFieldName(annotation="是否服务器战斗")
	public final static int SERVER_BATTLE = 100;
	@EnumFieldName(annotation="是否打开C2S日志")
	public final static int C2S_LOG = 101;
	@EnumFieldName(annotation="是否打开S2C日志")
	public final static int S2C_LOG = 102;
	@EnumFieldName(annotation="是否打开战斗日志")
	public final static int BATTLE_LOG = 103;
	
}

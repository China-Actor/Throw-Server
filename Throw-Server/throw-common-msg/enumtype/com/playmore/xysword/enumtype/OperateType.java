package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface OperateType {

	@EnumFieldName(annotation="挂机领取奖励")
	public final static int IdleReward = 1;
	@EnumFieldName(annotation="新用户初始化奖励")
	public final static int NewPlayInitReward = 2;
	@EnumFieldName(annotation="关卡奖励")
	public final static int StageReward = 3;
	@EnumFieldName(annotation="道具使用")
	public final static int ItemUse = 4;
	@EnumFieldName(annotation="英雄升级")
	public final static int UpdateHero = 5;
	@EnumFieldName(annotation="脱装")
	public final static int EquipmentUnWear = 6;
	@EnumFieldName(annotation="强化消耗")
	public final static int EquipmentStrengthen = 7;
	@EnumFieldName(annotation="英雄合成")
	public final static int AdvancedHero = 8;
	@EnumFieldName(annotation="快速挂机领取奖励")
	public final static int FastIdleReward = 9;
	@EnumFieldName(annotation="任务宝箱领取")
	public final static int TaskBoxReceive = 10;
	@EnumFieldName(annotation="任务领取")
	public final static int TaskReceive = 11;
	@EnumFieldName(annotation="图鉴领取")
	public final static int HandbookReceive = 12;
	@EnumFieldName(annotation="迷宫")
	public final static int MazeReceive = 13;
	@EnumFieldName(annotation="英雄重置")
	public final static int HeroReset = 14;
	@EnumFieldName(annotation="英雄遣散")
	public final static int  HeroDismiss= 15;
	@EnumFieldName(annotation="刷新悬赏任务")
	public final static int  OfferRewardFlush= 16;
	@EnumFieldName(annotation="领取悬赏奖励")
	public final static int  OfferRewardReceive= 17;
	@EnumFieldName(annotation="迷宫奖励")
	public final static int  MazeReward= 18;
	@EnumFieldName(annotation="邮件奖励")
	public final static int MailReward = 19;
	@EnumFieldName(annotation="共鸣水晶添加槽位")
	public final static int  CRYSTAL_ADD_SLOT= 20;
	@EnumFieldName(annotation="共鸣水晶刷新")
	public final static int  CRYSTAL_FLUSH_SLOT= 21;
	@EnumFieldName(annotation="竞技场购买门票")
	public final static int  ARENA_BUY_TICKETS= 22;
	@EnumFieldName(annotation="卡池抽卡")
	public static final int DRAW = 23;
	@EnumFieldName(annotation="玩家等级升级")
	public static final int PLAYER_LEVEL_UPDATE = 24;
	@EnumFieldName(annotation="购买英雄槽位")
	public final static int  BUY_CARD_SLOAT= 25;
	@EnumFieldName(annotation="改名")
	public final static int ChangeName = 26;
	@EnumFieldName(annotation="竞技场领取")
	public final static int  ARENA_HIGH_COIN= 27;
	@EnumFieldName(annotation="高阶竞技场购买门票")
	public final static int  ARENA_HIGH_BUY_TICKETS= 28;
	@EnumFieldName(annotation="领取友情点")
	public final static int  FRIEND_GIFT= 29;
	@EnumFieldName(annotation="商店购买钻石")
	public final static int  SHOP_BUY_DIAMOND= 30;
	@EnumFieldName(annotation="高阶竞技场活跃宝箱")
	public final static int  ARENA_HIGH_ACTIVTY_BOX= 31;
	@EnumFieldName(annotation="商铺刷新")
	public static final int SHOP_FLUSH = 32;
	@EnumFieldName(annotation="商铺购买")
	public static final int SHOP_BUY = 33;
	@EnumFieldName(annotation="公会创建扣除钻石")
	public final static int  CREATE_GUILD_DIAMONDS= 34;
	@EnumFieldName(annotation="公会改名字扣除钻石")
	public final static int  UPDATE_GUILD_NAME_DIAMONDS= 35;
	@EnumFieldName(annotation="抽卡切换种族")
	public final static int  DRAW_SWITCH_RACE= 36;
	@EnumFieldName(annotation="抽卡任务")
	public final static int  DRAW_TASK= 37;
	@EnumFieldName(annotation="兑换礼包码")
	public final static int  EXCHANGE_GIFT= 38;
	@EnumFieldName(annotation="后台修改资源")
	public final static int  UPDATE_RES= 39;
	@EnumFieldName(annotation="GM")
	public final static int GM = 42;
	
}
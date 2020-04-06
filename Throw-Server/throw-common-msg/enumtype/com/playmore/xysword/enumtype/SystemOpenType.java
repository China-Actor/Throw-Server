package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface SystemOpenType {

	@EnumFieldName(annotation="进阶")
	public final static int ADVANCED_CARD = 9;
	@EnumFieldName(annotation="抽卡")
	public final static int DRAW = 10;
	@EnumFieldName(annotation="水晶")
	public final static int CRYSTAL = 11;
	@EnumFieldName(annotation="马车")
	public final static int RESET_CARD= 13;
	@EnumFieldName(annotation="竞技场")
	public final static int ARENA = 16;
	@EnumFieldName(annotation="迷宫")
	public final static int MAZE = 17;
	@EnumFieldName(annotation="爬塔")
	public final static int TOWER = 18;
	@EnumFieldName(annotation="悬赏")
	public final static int OFFER_REWARD = 19;
	@EnumFieldName(annotation="高阶竞技场")
	public final static int ARENA_HIGHER = 20;
	@EnumFieldName(annotation="好友")
	public final static int FRIEND = 21;
	@EnumFieldName(annotation="公会")
	public final static int GUILD = 22;
	@EnumFieldName(annotation="商店")
	public final static int SHOP_NORMAL = 23;
	@EnumFieldName(annotation="公会商店")
	public final static int SHOP_GUILD = 24;
	@EnumFieldName(annotation="友情商店")
	public final static int SHOP_FRIEND = 25;
	@EnumFieldName(annotation="迷宫商店")
	public final static int SHOP_MAZE = 26;
	@EnumFieldName(annotation="高阶商店")
	public final static int SHOP_ARENA_HIGHER = 27;
	@EnumFieldName(annotation="皇家犒赏令")
	public final static int BATTLE_PASS_TASK = 29;
	@EnumFieldName(annotation="勇者犒赏令")
	public final static int BATTLE_PASS_MAZE = 30;
	
	

	
}

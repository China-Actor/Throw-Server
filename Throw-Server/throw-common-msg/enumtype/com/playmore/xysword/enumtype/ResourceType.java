package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface ResourceType {
	
	@EnumFieldName(annotation="金币")
	public final static int Gold = 1;				
	@EnumFieldName(annotation="贵族经验")
	public final static int NobleExp = 2;			
	@EnumFieldName(annotation="主角经验")
	public final static int LeadExp = 3;					
	@EnumFieldName(annotation="英雄经验")
	public final static int HeroExp = 4;				
	@EnumFieldName(annotation="英雄粉尘")
	public final static int HeroDust = 10;		
	@EnumFieldName(annotation="生命精华")
	public final static int LiveElite = 11;	
	@EnumFieldName(annotation="门票")
	public final static int TICKET = 12;	
	@EnumFieldName(annotation="生命之水")
	public final static int LiveWater = 13;	
	@EnumFieldName(annotation="高阶竞技场门票")
	public final static int ArenaHighTICKET = 14;
	@EnumFieldName(annotation="友情点")
	public final static int FriendshipPoint = 20;	
	@EnumFieldName(annotation="装备强化石")
	public final static int EquipmentAddStone = 30;	
	@EnumFieldName(annotation="有偿钻石")
	public final static int  DiamondsPaid= 90;
	@EnumFieldName(annotation="钻石")
	public final static int  Diamonds= 99;	
	@EnumFieldName(annotation="魂石")
	public final static int  Stone= 100;
	@EnumFieldName(annotation="英雄")
	public final static int  heros= 999;	
	@EnumFieldName(annotation="宝箱")
	public final static int  Box= 200;	
	@EnumFieldName(annotation="装备")
	public final static int  Equipment= 300;	
	@EnumFieldName(annotation="装备随机包")
	public final static int  EquipmentPackage= 333;	
	@EnumFieldName(annotation="神器")
	public final static int  Artifact= 400;
	@EnumFieldName(annotation="遗物BUFF")
	public final static int  RelicBuff= 500;
	@EnumFieldName(annotation="空包")
	public final static int  EmptyBag= 666;
	@EnumFieldName(annotation="嵌套包")
	public final static int  NestedPackage= 777;
	@EnumFieldName(annotation="迷宫币")
	public final static int  MazeCoin= 52;
	@EnumFieldName(annotation="公会货币")
	public final static int  GuildCoin= 50;
	@EnumFieldName(annotation="遣散货币")
	public final static int  DismissCoin= 51;
	@EnumFieldName(annotation="竞技场货币")
	public final static int  ArenaCoin= 53;
	@EnumFieldName(annotation="皇家犒赏令")
	public final static int  BattlePassTaskValue= 60;
	@EnumFieldName(annotation="勇者犒赏令")
	public final static int  BattlePassMazeValue= 61;
	@EnumFieldName(annotation="金币系数类型")
	public final static int  GoldRd= 555;
	@EnumFieldName(annotation="普通招募卷")
	public final static int DrawNormalTicket = 21;	
	@EnumFieldName(annotation="资源宝箱（小时）")
	public final static int ResouceBox = 201;	
}

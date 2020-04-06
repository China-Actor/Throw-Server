package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface TaskType {
	
	/**
	 * 升级1次英雄
	 */
	@EnumFieldName(annotation="升级1次英雄")
	public final static int UpHeroOnce = 1;
	
	/**
	 * 强化1次装备
	 */
	@EnumFieldName(annotation="强化1次装备")
	public final static int StrengthenEquipmentOnce = 2;
	
	/**
	 * 领取挂机奖励1次
	 */
	@EnumFieldName(annotation="领取挂机奖励1次")
	public final static int ReceiveAutoRewardOnce = 3;
	
	/**
	 * 挑战1次主线关卡
	 */
	@EnumFieldName(annotation="挑战1次主线关卡")
	public final static int ChangeStageOnce = 4;

	/**
	 * 通关主线关卡X章X节
	 */
	@EnumFieldName(annotation="通关主线关卡X章X节")
	public final static int FinishXStage = 50;
	
	/**
	 * 拥有X名Y品质及以上的英雄。
	 */
	@EnumFieldName(annotation="拥有X名Y品质及以上的英雄。")
	public final static int HaveXNumXQuality = 51;
	
	/**
	 * 英雄最高等级达到X级
	 */
	@EnumFieldName(annotation="英雄最高等级达到X级")
	public final static int HeroArriveXLevel = 52;
	
	/**
	 * 挑战爬塔1次
	 */
	@EnumFieldName(annotation="挑战爬塔1次")
	public final static int ChangeTowerOnce = 5;
	
	/**
	 * 快速挂机1次
	 */
	@EnumFieldName(annotation="快速挂机1次")
	public final static int ReceiveFastAutoRewardOnceOnce = 6;
	
	/**
	 * 接受个人悬赏任务
	 */
	@EnumFieldName(annotation="接受个人悬赏任务")
	public final static int AcceptOfferTaskSingle = 7;
	
	/**
	 * 接受团队悬赏任务
	 */
	@EnumFieldName(annotation="接受团队悬赏任务")
	public final static int AcceptOfferTaskTeam = 8;
	
	
	/**
	 * 进阶1次英雄
	 */
	@EnumFieldName(annotation="进阶1次英雄")
	public final static int AdvancedHeroOnce = 10;
	
	/**
	 * 王座之塔通关X层
	 */
	@EnumFieldName(annotation="王座之塔通关X层")
	public final static int FinishTowerXLayer = 53;
	
	/**
	 * 通关主线关卡X章
	 */
	@EnumFieldName(annotation="通关主线关卡X章")
	public final static int FinishMainXChapter = 54;
	
	/**
	 * 累计收取挂机金币ＸX 
	 */
	@EnumFieldName(annotation="累计收取挂机金币ＸX ")
	public final static int TotalReceiveAutoRewardGold = 56;
	
	/**
	 * 水晶祭祀升至X级
	 */
	@EnumFieldName(annotation="水晶祭祀升至X级")
	public final static int CrystalXLevel = 57;
	
	/**
	 * 异界迷宫第X层通关Y次
	 */
	@EnumFieldName(annotation="异界迷宫第X层通关Y次")
	public final static int FinishMazeXLayerXNum = 58;
	
	/**
	 * 竞技场天梯到达X分
	 */
	@EnumFieldName(annotation="竞技场天梯到达X分")
	public final static int ArenaXScore = 59;
	
	/**
	 * 竞技场胜利累计X场
	 */
	@EnumFieldName(annotation="竞技场胜利累计X场")
	public final static int ArenaTotalXWin = 60;
	
	/**
	 * 水晶祭祀的个数到达X个
	 */
	@EnumFieldName(annotation="水晶祭祀的个数到达X个")
	public final static int CrystalSlotXNum = 61;
	
	/**
	 * 召唤1次英雄
	 */
	@EnumFieldName(annotation="召唤1次英雄")
	public final static int DrawHero = 18;
	
	/**
	 * 竞技场胜利
	 */
	@EnumFieldName(annotation="竞技场胜利")
	public final static int ArenWin = 9;
	
	/**
	 * 击败迷宫boos
	 */
	@EnumFieldName(annotation="击败迷宫boos")
	public final static int FinishMazeBoos = 11;
	
	/**
	 * 战队等级到达X级
	 */
	@EnumFieldName(annotation="战队等级到达X级")
	public final static int PlayerXLevel = 55;
	
	/**
	 * 参与团队狩猎1次
	 */
	@EnumFieldName(annotation="参与团队狩猎1次")
	public final static int GUILD_BOSS = 17;
	
	/**
	 *赠送友情点
	 */
	@EnumFieldName(annotation="赠送友情点")
	public final static int GIVE_HEART = 16;
	
	/**
	 *异界迷宫商店买东西
	 */
	@EnumFieldName(annotation="异界迷宫商店买东西")
	public final static int SHOP_MAZE_BUY = 13;
	
	/**
	 *商铺买东西
	 */
	@EnumFieldName(annotation="商铺买东西")
	public final static int SHOP_NORMAL_BUY = 14;
	
	/**
	 *公会商店买装备
	 */
	@EnumFieldName(annotation="公会商店买装备")
	public final static int SHOP_GUILD_BUY = 15;
	
	
}

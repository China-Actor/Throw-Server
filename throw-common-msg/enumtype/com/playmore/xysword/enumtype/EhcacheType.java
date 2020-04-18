package com.playmore.xysword.enumtype;

import com.playmore.database.CacheAnnotation;
import com.playmore.database.EnumFieldName;

public interface EhcacheType {
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.gameserver.PlayerInfo", tips="playerId")
	@EnumFieldName(annotation="玩家信息")
	public static final String PlayerCacheBeanName = "playerService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerCard", tips="playerId")
	@EnumFieldName(annotation="玩家卡牌")
	public static final String PlayerCardMapCacheBeanName = "roleCardMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerFormation", tips="playerId")
	@EnumFieldName(annotation="玩家阵型")
	public static final String PlayerFormationCacheBeanName = "playerFormationService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerEquipment", tips="playerId")
	@EnumFieldName(annotation="玩家英雄装备")
	public static final String PlayerRoleEquipmentMapCacheBeanName = "roleEquipmentdMapService";
	

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerGoodsItem", tips="playerId")
	@EnumFieldName(annotation="玩家道具")
	public static final String PlayerGoodsItemCacheBeanName = "playerGoodsItemService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerStage", tips="playerId")
	@EnumFieldName(annotation="玩家关卡记录")
	public static final String PlayerStageMapCacheBeanName = "playerStageMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerTask", tips="playerId")
	@EnumFieldName(annotation="玩家任务")
	public static final String PlayerTaskMapCacheBeanName = "taskMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerTaskBox", tips="playerId")
	@EnumFieldName(annotation="任务宝箱")
	public static final String PlayerTaskBoxMapCacheBeanName = "taskBoxMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerTime", tips="playerId")
	@EnumFieldName(annotation="玩家时间")
	public static final String PlayerTimeMapCacheBeanName = "playerTimeMapService";
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerTower", tips="playerId")
	@EnumFieldName(annotation="玩家爬塔关卡记录")
	public static final String PlayerTowerMapCacheBeanName = "playerTowerMapService";
	

	

	

	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerHandbook", tips="playerId")
	@EnumFieldName(annotation="图鉴")
	public static final String PlayerHandbookMapCacheBeanName = "handbookMapService";
	
	
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.gameserver.PlayerResources", tips="pid")
	@EnumFieldName(annotation="玩家资产信息")
	public static final String PlayerResourceCacheBeanName = "playerResourcesService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerMail", tips="playerId")
	@EnumFieldName(annotation="玩家邮件")
	public static final String PlayerMailCacheBeanName = "playerMailService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.OfferrewardTask", tips="playerId")
	@EnumFieldName(annotation="悬赏任务")
	public static final String PlayerOfferRewardCacheBeanName = "playerOfferRewardService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerForeign", tips="playerId")
	@EnumFieldName(annotation="外援英雄")
	public static final String PlayerForeignCacheBeanName = "playerForeignService";
	
	
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerCrystal", tips="pid")
	@EnumFieldName(annotation="共鸣水晶")
	public static final String PlayerCrystalCacheBeanName = "playerCrystalService";
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.ServerMail", tips="1")
	@EnumFieldName(annotation="服务器邮件")
	public static final String ServerMailCacheBeanName = "serverMailService";
	
	@CacheAnnotation(isSingle=false, pojoClass="java.lang.Long", tips="playerId")
	@EnumFieldName(annotation="玩家邮件获得")
	public static final String PlayerMailDrawCacheBeanName = "playerMailDrawService";
	
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.gameserver.PlayerArena", tips="playerId")
	@EnumFieldName(annotation="竞技场")
	public static final String ArenaCacheBeanName = "playerArenaService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerArenaChallengeRecord", tips="playerId")
	@EnumFieldName(annotation="竞技场记录")
	public static final String PlayerArenaChallengeRecordMapCacheBeanName = "playerArenaChallengeRecordMapService";
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerSystemOpen", tips="playerId")
	@EnumFieldName(annotation="玩家功能开放记录")
	public static final String PlayerSystemOpenCacheBeanName = "playerSystemOpenService";
	
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.gameserver.PlayerSundry", tips="pid")
	@EnumFieldName(annotation="玩家杂项信息")
	public static final String PlayerSundryCacheBeanName = "playerSundryService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerFriend", tips="playerId")
	@EnumFieldName(annotation="玩家好友")
	public static final String PlayerFriendMapCacheBeanName = "playerFriendMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerFriendApply", tips="playerId")
	@EnumFieldName(annotation="玩家好友申请")
	public static final String PlayerFriendApplyMapCacheBeanName = "playerFriendApplyMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerFriendDraw", tips="playerId")
	@EnumFieldName(annotation="玩家好友获得")
	public static final String PlayerFriendDrawMapCacheBeanName = "playerFriendDrawMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerFriendGive", tips="playerId")
	@EnumFieldName(annotation="玩家好友赠送")
	public static final String PlayerFriendGiveMapCacheBeanName = "playerFriendGiveMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerFriendBlack", tips="playerId")
	@EnumFieldName(annotation="玩家好友黑名单")
	public static final String PlayerFriendBlackMapCacheBeanName = "playerFriendBlackMapService";
	

	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.gameserver.PlayerArenaHigher", tips="playerId")
	@EnumFieldName(annotation="竞技场")
	public static final String ArenaHighCacheBeanName = "playerArenaHighService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerArenaHighChallengeRecord", tips="playerId")
	@EnumFieldName(annotation="高阶竞技场记录")
	public static final String PlayerArenaHighRecordMapCacheBeanName = "playerArenaHighRecordMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.RewardTask", tips="playerId")
	@EnumFieldName(annotation="犒赏令")
	public static final String RewardTaskCacheBeanName = "RewardTaskService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerShop", tips="playerId")
	@EnumFieldName(annotation="商铺")
	public static final String PlayerShopCacheBeanName = "PlayerShopService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.guild.GuildMember", tips="playerId")
	@EnumFieldName(annotation="公会成员")
	public static final String GuildMemberGuildCacheBeanName = "GuildMemberGuildService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.guild.Guild", tips="playerId")
	@EnumFieldName(annotation="公会")
	public static final String GuildCacheBeanName = "guildCacheService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.guild.GuildApply", tips="playerId")
	@EnumFieldName(annotation="公会")
	public static final String GuildApplyGuildCacheBeanName = "GuildApplyGuildService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.guild.GuildMember", tips="playerId")
	@EnumFieldName(annotation="公会成员")
	public static final String GuildMemberPlayerCacheBeanName = "GuildMemberPlayerService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerSourceSkill", tips="playerId")
	@EnumFieldName(annotation="源技能")
	public static final String PlayerSourceSkillMapCacheBeanName = "PlayerSourceSkillService";
	
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerForeginAid", tips="playerId")
	@EnumFieldName(annotation="我的外援")
	public static final String PlayerForeginAidCacheBeanName = "playerForeginAidService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerSourceSkill", tips="playerId")
	@EnumFieldName(annotation="源链接")
	public static final String PlayerSourceLinkMapCacheBeanName = "PlayerSourceLinkService";
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerGift", tips="playerId")
	@EnumFieldName(annotation="玩家兑换码")
	public static final String PlayerGiftMapCacheBeanName = "playerGiftMapService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerDraw", tips="playerId")
	@EnumFieldName(annotation="抽卡")
	public static final String PlayerDrawMapCacheBeanName = "PlayerDrawService";

	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.gameserver.PlayerDrawWish", tips="playerId")
	@EnumFieldName(annotation="心愿单")
	public static final String PlayerDrawWishCacheBeanName = "PlayerDrawWishService";

}

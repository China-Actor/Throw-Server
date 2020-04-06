package com.playmore.xysword.enumtype;

import com.playmore.database.CacheAnnotation;
import com.playmore.database.EnumFieldName;

public interface UserCenterEhcacheType {
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityItem", tips="activityId")
	@EnumFieldName(annotation="活动条目")
	public static final String ActivityItemListCacheBeanName = "activityItemListService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityExchangeItem", tips="activityId")
	@EnumFieldName(annotation="兑换活动条目")
	public static final String ActivityExchangeItemListCacheBeanName = "activityExchangeItemListService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivitySellingItem", tips="activityId")
	@EnumFieldName(annotation="售卖活动条目")
	public static final String ActivitySellingItemListCacheBeanName = "activitySellingItemListService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityRank", tips="activityId")
	@EnumFieldName(annotation="排行活动条目")
	public static final String ActivityRankListCacheBeanName = "activityRankListService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityConstant", tips="activityId")
	@EnumFieldName(annotation="活动常量")
	public static final String ActivityConstantMapCacheBeanName = "activityConstantMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.Activity", tips="1L")
	@EnumFieldName(annotation="活动")
	public static final String ActivityMapCacheBeanName = "activityMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.Activity", tips="1L")
	@EnumFieldName(annotation="服务器人数")
	public static final String ServerRegisterMapCacheBeanName = "serverRegisterMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityComplex", tips="1L")
	@EnumFieldName(annotation="活动集合")
	public static final String ActivityComplexMapCacheBeanName = "activityComplexMapService";
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.usercenter.ActivityServer", tips="activityId,serverId")
	@EnumFieldName(annotation="活动服务器")
	public static final String ActivityServerCacheBeanName = "activityServerService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.Ban", tips="playerId")
	@EnumFieldName(annotation="封号")
	public static final String banListCacheBeanName = "banListService";
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.msg.usercenter2x.ServerStatus", tips="serverId")
	@EnumFieldName(annotation="游戏服务器状态")
	public static final String gameServerStatusCacheBeanName = "gameServerStatusService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.Player", tips="userId_serverId")
	@EnumFieldName(annotation="玩家列表")
	public static final String playerListCacheBeanName = "playerListService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ServerSwitch", tips="serverId")
	@EnumFieldName(annotation="服务器开关")
	public static final String serverSwitchListBeanName = "serverSwitchMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.User", tips="thirdAccount_thirdChannel")
	@EnumFieldName(annotation="用户列表")
	public static final String userListCacheBeanName = "userListService";
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.usercenter.WhiteList", tips="userId_serverId")
	@EnumFieldName(annotation="白名单")
	public static final String whiteListCacheBeanName = "whiteListService";
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.usercenter.Message", tips="id")
	@EnumFieldName(annotation="服务器关闭消息")
	public static final String messageCacheBeanName = "messageService";	
	
	@CacheAnnotation(isSingle=true, pojoClass="com.playmore.dbobject.usercenter.CommonConfigServer", tips="commonConfigId,serverId")
	@EnumFieldName(annotation="通用配置服务器")
	public static final String CommonConfigServerCacheBeanName = "commonConfigServerService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.CommonConfig", tips="1L")
	@EnumFieldName(annotation="通用配置")
	public static final String CommonConfigMapCacheBeanName = "commonConfigMapService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityMammonItem", tips="activityId")
	@EnumFieldName(annotation="活动奖池配置条目")
	public static final String ActivityMammonItemListCacheBeanName = "activityMammonItemListService";
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityMiniSevenItem", tips="activityId")
	@EnumFieldName(annotation="狂欢盛典类型活动配置条目")
	public static final String ActivityMiniSevenItemListCacheBeanName = "activityMiniSevenItemListService";
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityLimitTimeShopItem", tips="activityId")
	@EnumFieldName(annotation="限时商店类型活动配置条目")
	public static final String ActivityLimitTimeShopItemListCacheBeanName = "ActivityLimitTimeShopItemListService";

	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.ActivityLimitTimeShop", tips="Id")
	@EnumFieldName(annotation="限时商店类型活动配置")
	public static final String ActivityLimitTimeShopListCacheBeanName = "ActivityLimitTimeShopListService";
	
	
	@CacheAnnotation(isSingle=false, pojoClass="com.playmore.dbobject.usercenter.LimitTimeShopBuy", tips="activityId")
	@EnumFieldName(annotation="抢购表活动配置条目")
	public static final String LimitTimeShopBuyListCacheBeanName = "limitTimeShopBuyShopListService";
	
}
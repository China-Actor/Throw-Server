package com.playmore.msg;

public interface UserCenterCmdConstant {

	public final static int QUERY_USER = 1;
	public final static int QUERY_BAN = 2;
	public final static int QUERY_ZONE = 3;
	public final static int QUERY_ALL_SERVER_INFO = 4;
	public final static int QUERY_WHITE_LIST = 5;
	public final static int QUERY_SERVER_SWITCH = 6;
	public final static int QUERY_SERVER_INFO_BY_SERVERID = 7;
	public final static int QUERY_SERVER_SWITCH_BY_ID = 8;
	public final static int QUERY_WHITE_LIST_BY_ID = 9;

	public final static int REGISTER_USER = 10;
	public final static int LOGIN_USER = 11;
	public final static int CREATE_PLAYER = 12;
	public final static int UPDATE_PLAYER_NAME = 13;
	// 内网转服
	public final static int UPDATE_PLAYER_SERVERID = 14;

	public final static int INSERT_WHITE_LIST = 20;
	public final static int INSERT_BAN = 21;
	public final static int INSERT_ZONE = 22;
	public final static int INSERT_SERVER_INFO = 23;
	public final static int INSERT_SERVER_SWITCH = 24;
	public final static int INSERT_ACTIVITY = 25;
	public final static int INSERT_ACTIVITY_ITEM = 26;
	public final static int INSERT_ACTIVITY_COMPLEX = 27;
	public final static int INSERT_ACTIVITY_EXCHANGE_ITEM = 28;
	public static final int INSERT_ACTIVITY_LIMIT_TIME_SHOP = 29;

	public final static int UPDATE_WHITE_LIST = 30;
	public final static int UPDATE_BAN = 31;
	public final static int UPDATE_ZONE = 32;
	public final static int UPDATE_SERVER = 33;
	public final static int UPDATE_SERVER_SWITCH = 34;
	public final static int UPDATE_ACTIVITY = 35;
	public final static int UPDATE_ACTIVITY_ITEM = 36;
	public final static int UPDATE_ACTIVITY_SERVER = 37;
	public final static int UPDATE_ALL_ACTIVITY_SERVER = 38;
	public final static int UPDATE_ACTIVITY_COMPLEX = 39;

	public final static int DELETE_WHITE_LIST = 40;
	public final static int DELETE_BAN = 41;
	public final static int DELETE_ZONE = 42;
	public final static int DELETE_SERVER = 43;
	public final static int DELETE_SERVER_SWITCH = 44;
	public final static int DELETE_ACTIVITY = 45;
	public final static int DELETE_ACTIVITY_ITEM = 46;
	public final static int DELETE_ACTIVITY_SERVER = 47;
	public final static int DELETE_ACTIVITY_COMPLEX = 48;
	public final static int DELETE_ACTIVITY_EXCHANGE_ITEM = 49;

	public final static int RELOAD_SERVER_RESOURCE = 50;
	public final static int CLOSE_SERVER = 51;
	public final static int CLEAN_EH_CACHE = 52;

	public final static int UPDATE_GAME_SERVER_STATUS = 60;

	public final static int UPDATE_MESSAGE = 61;
	public final static int QUERY_MESSAGE = 62;

	public final static int CLOSE_GAME_SERVER_STATUS = 63;

	public final static int QUERY_BAN_BY_ID = 100;
	public final static int QUERY_PLAYER = 101;
	public final static int QUERY_SERVER_STATUS = 102;
	public final static int QUERY_PLAYER_FUZZY_SEARCH = 103;
	public final static int QUERY_ALL_ACTIVITY_BY_SERVER = 110;
	public final static int QUERY_ACTIVITY_ITEM_BY_ACTIVITYID = 111;
	public final static int QUERY_ACTIVITY_SERVER_BY_ACTIVITYID = 112;
	public final static int QUERY_ALL_ACTIVITY_ITEM_BY_SERVER = 113;
	public final static int QUERY_ACTIVITY_SERVER_BY_SERVER = 114;
	public final static int QUERY_ALL_ACTIVITY = 115;
	public final static int QUERY_ACTIVITY_EXCHANGE_BY_SERVER = 116;
	public final static int QUERY_ALL_COMPLEX_ACTIVITY = 117;
	public final static int QUERY_ACTIVITY_EXCHANGE_BY_ACTIVITYID = 118;

	public final static int QUERY_SERVER_NOTICE_BY_SERVER = 119;

	public final static int QUERY_ALL_ACTIVITY_SELLING = 120;
	public final static int QUERY_ALL_ACTIVITY_CONSTANT = 121;
	public final static int QUERY_ALL_ACTIVITY_RANK = 122;
	public final static int QUERY_ALL_ACTIVITY_MAMMON = 123;

	public final static int QUERY_ACTIVITY_BY_ACTIVITYID = 124;
	// 限时商店
	public final static int QUERY_ACTIVITY_LIMIT_TIME_SHOP_BY_ACTIVITYID = 125;
	// 查询玩家
	public final static int QUERY_PLAYER_ = 126;

	// 查询usercenter的cache keys
	public final static int QUERY_EHCACHE_KEYS = 150;
	// 查询cache单个数据
	public final static int QUERY_EHCACHE_SINGLE = 151;
	// 查询cache集合数据
	public final static int QUERY_EHCACHE_COLLECTION = 152;
	// 删除cache单个缓存
	public final static int DELETE_EHCACHE = 153;
	// 查询数据长度
	public final static int EHCACHE_KEYS_TOTAL_SIZE = 154;
	// 查询集合总数
	public final static int EHCACHE_COLLECTION_TOTAL_SIZE = 155;

	public final static int UPDATE_ACTIVITY_EXCHANGE_ITEM = 160;

	public final static int INSERT_ACTIVITY_SELLING = 170;
	public final static int INSERT_ACTIVITY_CONSTANT = 171;
	public final static int INSERT_ACTIVITY_RANK = 172;
	public final static int INSERT_ACTIVITY_MAMMON_ITEM = 173;
	public final static int INSERT_ACTIVITY_MINI_SEVEN_ITEM = 174;

	public final static int DELETE_ACTIVITY_SELLING = 190;
	public final static int DELETE_ACTIVITY_CONSTANT = 191;
	public final static int DELETE_ACTIVITY_RANK = 192;
	public final static int DELETE_ACTIVITY_MAMMON_ITEM = 193;
	public final static int DELETE_ACTIVITY_MINI_SEVEN_ITEM = 194;
	public final static int DELETE_ACTIVITY_SERVER_BATCH = 195;
	public static final int DELETE_ACTIVITY_LIMIT_TIME_SHOP = 196;

	public final static int UPDATE_ACTIVITY_SELLING = 210;
	public final static int UPDATE_ACTIVITY_CONSTANT = 211;
	public final static int UPDATE_ACTIVITY_RANK = 212;
	public final static int UPDATE_ACTIVITY_MAMMON_ITEM = 213;
	public final static int UPDATE_ACTIVITY_MINI_SEVEN_ITEM = 214;
	public static final int UPDATE_ACTIVITY_LIMIT_TIME_SHOP = 215;

	public final static int QUERY_ACTIVITY_SELLING_ITEM_BY_ACTIVITYID = 230;
	public final static int QUERY_ACTIVITY_CONSTANT_BY_ACTIVITYID = 231;
	public final static int QUERY_ACTIVITY_RANK_BY_ACTIVITYID = 232;
	public final static int QUERY_ACTIVITY_MAMMON_ITEM_BY_ACTIVITYID = 233;
	public final static int QUERY_ALL_ACTIVITY_MAMMON_ITEM_BY_SERVER = 234;
	public final static int QUERY_ALL_ACTIVITY_MINISEVEN_ITEM_BY_SERVER = 235;
	public final static int QUERY_ACTIVITY_MINI_SEVEN_ITEM_BY_AVTIVITYID = 236;

	/**
	 * 资讯通用配置
	 */
	public final static int QUERY_COMMON_CONFIG = 301;
	public final static int UPDATE_COMMON_CONFIG = 302;
	public final static int UPDATE_COMMON_CONFIG_ALL = 303;

	/**
	 * 限时商店条目所用常量
	 */

	public final static int QUERY_LIMIT_TIME_SHOP_SURPLUS_NUMBER = 400;

	public final static int UPDATE_LIMIT_TIME_SHOP_BUY_COUNT = 401;

	public final static int QUERY_LIMIT_TIME_SHOP_GROUP_BUY = 402;

	public final static int UPDATE_LIMIT_TIME_SHOP__GROUP_BUY_JOIN_COUNT = 403;

	public final static int QUERY_LIMIT_TIME_SHOP_BUY_BY_SHOP_ITEM_ID = 404;

	public final static int DELETE_LIMIT_TIME_SHOP_BUY_BY_TYPE = 405;

	/**
	 * 限时商店配置
	 */
	public final static int INSERT_LIMIT_TIME_SHOP_CONFIG = 410;

	public final static int UPDATE_LIMIT_TIME_SHOP_CONFIG = 411;

	public final static int IDELETE_LIMIT_TIME_SHOP_CONFIG = 412;

	/** 2018年10月16日 上午11:02:43 查询老用户 */
	public final static int SELECT_OLD_USER = 420;
	/** 2018年10月16日 上午11:11:28 删除老用户 */
	public final static int DELETE_OLD_USER = 421;

	/** 创建礼包码 */
	public final static int CREATE_GIFT_CODE = 501;
	
	/** 查询礼包码 */
	public final static int QUERY_GIFTQUERY_GIFT_CODE_CODE = 502;

}
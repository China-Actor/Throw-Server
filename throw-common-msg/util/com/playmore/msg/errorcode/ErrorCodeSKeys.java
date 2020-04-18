package com.playmore.msg.errorcode;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ErrorCodeSKeys {

	// 操作成功
	public static int SUCCESS = 0;
	// 登录失败，账号被封
	public static int LOGIN_FAIL_BAN = 1;
	// 登录失败，服务器未运行
	public static int LOGIN_FAIL_SERVER_NOT_RUNNING = 2;
	// 登录失败，服务器未开放
	public static int LOGIN_FAIL_SERVER_NOT_OPEN = 3;
	// 登录失败，已达到最大在线人数
	public static int LOGIN_FAIL_MAX_ONLINE = 4;
	// 登录失败，登录错误的服务器
	public static int LOGIN_FAIL_NOT_IN_SERVER = 5;
	// 您的账号在别处登录
	public static int LOGIN_FAIL_RELOGIN = 6;

	// 创建角色失败，用户中心访问出错
	public static int REGISTER_PLAYER_USERCENTER_ERROR = 7;
	// 创建角色失败，SESSION过期
	public static int REGISTER_PLAYER_LOGIN_EXPIRE = 8;
	// 创建角色失败，角色已存在
	public static int REGISTER_PLAYER_EXIST = 9;

	// 帐号异常，登录失败，请联系客服
	public static int LOGIN_ERROR_PLAYER_EXIST = 10;

	// 创建角色初始化失败
	public static int REGISTER_INIT_PLAYER_CARD_ERROR = 11;

	// 扣除资源失败
	public static int COST_RES_FAIL = 12;

	// 英雄升级金币不足
	public static int UPGRADE_GOLD_NOT_ENOUGH = 13;
	// 英雄升级经验不足
	public static int UPGRADE_EXP_NOT_ENOUGH = 14;
	// 英雄升级粉尘不足
	public static int UPGRADE_DUST_NOT_ENOUGH = 15;
	// 英雄升级超过最大等级
	public static int UPGRADE_EXCEED_MAX_LEVEL = 16;

	// 英雄进阶没有找到该品质
	public static int ADVANCED_CARD_NO_QUALITYS = 17;
	// 英雄进阶品质数量不够
	public static int ADVANCED_CARD_QUALITYS_NOT_ENOUGH = 18;
	// 英雄进阶失败
	public static int ADVANCED_CARD_FAIL = 19;
	// 英雄进阶参数错误
	public static int ADVANCED_CARD_PARAM_ERR = 20;

	// 奖励角色卡牌列表为Null
	public static int REWARD_ROLE_CARD_NULL = 21;
	// 合成材料不足
	public static int REWARD_MERGE_MATERIAL_UNENOUGH = 22;

	// 道具使用失败
	public static int ITEM_USE_FAIL = 23;
	// 道具类型不存在
	public static int ITEM_TYPE_NOT_FOUND = 24;

	// 玩家卡牌不存在
	public static int PLAYER_CARD_IS_NULL = 25;
	// 英雄卡牌加锁解锁失败
	public static int PLAYER_CARD_LOCK_FAIL = 26;
	// 玩家账号不存在
	public static int PLAYER_NO_EXIST = 27;

	// 领取日常任务宝箱已过期
	public static int TASK_BOX_DAY_INVALID = 28;
	// 领取周常任务宝箱已过期
	public static int TASK_BOX_WEEK_INVALID = 29;

	// 钻石不足
	public static int UPGRADE_DIAMOND_NOT_ENOUGH = 30;

	// 玩家资源不存在
	public static int PLAYER_RESOURCES_NO_EXIST = 31;
	// 玩家迷宫资源不存在
	public static int PLAYER_MAZE_DATA_NO_EXIST = 32;
	// 玩家战斗异常
	public static int PLAYER_BATTLE_ERR = 33;

	// 竞技场门票不足
	public static int ARENA_BATTLE_RES_NO_ENOGHT = 34;

	// 快速挂机次数不足
	public static int IDLE_COUNT_NO_ENOGHT = 35;

	// 该功能没有解锁
	public static int FUNCTION_NO_UNLOCK = 36;

	// 英雄槽位不足
	public static int CARD_SLOT_NO_ENOUGH = 37;

	// 迷宫生命之水不足
	public static int MAZE_WATER_NO_ENOGHT = 38;

	// 扣除资源失败
	public static int RESOURCE_NO_ENOGHT = 39;

	// 共鸣水晶等级限制
	public static int CRYSTAL_LIMIT = 40;

	
	
	// 被踢下线
	public static int BI_KICK = 201;
	// 创建角色失败，名字含有敏感字
	public static int REGISTER_PLAYER_NAME_SENSITIVE = 205;
	// 创建角色失败，名字格式不合法
	public static int REGISTER_PLAYER_NAME_INVALIDE = 206;

	// 更新角色名字失败，名字含有敏感字
	public static int UPDATE_PLAYER_NAME_SENSITIVE = 207;
	// 更新角色名字失败，名字格式不合法
	public static int UPDATE_PLAYER_NAME_INVALIDE = 208;
	// 更新角色名字失败，名字为空
	public static int UPDATE_PLAYER_NAME_IS_NULL = 209;
	// 更新角色名字失败，该昵称已被使用
	public static int UPDATE_PLAYER_NAME_FAIL_SAME_NAME = 210;
	// 更新角色名字失败，钻石不足
	public static int UPDATE_PLAYER_NAME_COND_NOT_SATISFY = 211;

	// 参数不匹配
	public static int UN_MATCH = 212;
	// 礼包码为空
	public static int GIFT_CODE_IS_NULL = 220;
	// 礼包码同一批次只能使用一次
	public static int GIFT_CODE_USE_ONCE = 221;
	// 礼包码已使用过
	public static int GIFT_CODE_USESD = 222;
	
	// 还没有好友
	public static int NO_FRIEND = 301;
	// 没有好友申请
	public static int NO_FRIEND_APPLY = 302;

	// 好友已满
	public static int FRIEND_LIMIT = 303;

	// 对方好友已满
	public static int TARGET_FRIEND_LIMIT = 304;

	// 今日赠送次数已满
	public static int GIVE_TIMES_LIMIT = 305;

	// 今日领取次数已满
	public static int DRAW_TIMES_LIMIT = 306;

	// 没找到所查找好友
	public static int NOT_FIND_FRIEND = 307;

	// 该玩家不存在
	public static int PLAYER_NOT_EXIST = 308;

	// 已经是好友啦
	public static int FRIEND_ALREADY = 309;

	// 不能添加自己为好友
	public static int FRIEND_IS_MYSELF = 310;

	// 已经添加过好友不能重复申请
	public static int FRIEND_APPLY_HAD = 311;

	// 黑名单没有该用户
	public static int FRIEND_BLACK_NOT = 312;

	// 删除好友失败
	public static int DELETE_FRIEND_FAIL = 313;

	// 该用户是黑名单
	public static int IS_FRIEND_BLACK = 314;

	// 未达到领取条件
	public static int UN_ENOUGH = 315;

	// 数据已过期
	public static int INVALID = 316;
	
	// 消耗道具不足
	public static int UPGRADE_PROP_NOT_ENOUGH = 317;
	
	// 商品已购买
	public static int SHOP_ALREADY_BUY = 318;
	
	// 商品已过期
	public static int SHOP_ALREADY_INVALID = 319;	
	
	// 商品包不存在
	public static int SHOP_PACKAGE_NOT_FOUND = 320;
	
	// 心愿单英雄重复
	public static int WISH_HERO_REPEAT = 321;
	
	// 种族重复打开
	public static int RACE_REPAEAT_OPEN = 322;
	
	
	/**-------------公会----------**/
	// 帮会创建缺少钻石
	public static int GUILD_CREATE_DIAMOND_NOT_ENOUGH					= 		639;
	// 帮会创建重名
	public static int GUILD_CREATE_NAME 					= 		640;
	// 已经有帮会
	public static int GUILD_ALREADY_IN 					= 		641;
	// 未找到帮会
	public static int GUILD_NOT_FOUNT 					= 		642;

	// 加入帮会人数已满
	public static int GUILD_JOIN_MEMBER 					= 		645;
	// 申请数满
	public static int GUILD_APPLY_MAX 					= 		646;
	// 帮会禁止加入
	public static int GUILD_NO_JOIN 					= 		647;
	// 已经申请过
	public static int GUILD_ALREADY_APPLY 					= 		648;
	// 帮会名长度过短（6-12）
	public static int GUILD_NAME_LENGTH_MIN 					= 		649;
	
	// 帮会名长度过长（6-12）
	public static int GUILD_NAME_LENGTH_MAX 					= 		650;
	
	//创建公会失败
	public static int GUILD_CREATE_FAIL 					= 		651;

	// 退出帮会24小时内不能再次加入
	public static int GUILD_JOIN_TIME 					= 		652;

	// 公会权限不足
	public static int GUILD_NO_DUTY 					= 		653;
	
	// 输入内容过长
	public static int GUILD_NOTICE_LENGTH 					= 		654;
	
	// 帮会改名重名
	public static int GUILD_CHANGE_NAME_RENAME 					= 		655;
	
	// 开启公会boss 活跃不足
	public static int GUILD_BOSS_ACTIVE_NO_ENOUGH 					= 		656;
	

	// 公会长不能推出公会
	public static int GUILD_NO_EXIT 					= 		657;
	
	// 公会退出失败
	public static int GUILD_NO_EXIT_FAIL 					= 		658;
	
	// 加入公会不够等级
	public static int GUILD_JOIN_LEVEL_ENOUGH 					= 		659;
	
	// 开启公会boss 次数不足
	public static int GUILD_BOSS_COUNT_NO_ENOUGH 					= 		660;
	
	// 公会公告长度过长
	public static int GUILD_NOTICE_TOO_LONG					= 		661;
	
	
	/**----------------   我的外援----------*/
	// 我的外援没有开放
	public static int FOREGIN_NOT_OPEN					= 		701;
	
	// 我的外援没有找到该英雄
	public static int FOREGIN_NOT_FIND_CARD					= 		702;
	
	// 我的外援上阵不符合要求
	public static int FOREGIN_NOT_EFFECTIVE					= 		703;
	
	// 我的外援下阵cd 时间未到
	public static int FOREGIN_DOWN_TIME_NO_ARRIVED					= 		705;
	
	
	// 操作异常
	public static  int OPERATION_ERROR 					= 		777;

	// 内容含有敏感字
	public static int SENSITIVE_WORD 					= 		801;
	// 钻石不足
	public static int DIAMOND_NOT_ENOUGH					= 		802;
	// 参数错误
	public static int PARAM_ERR = 888;
	// 服务器异常
	public static int ERROR = 999;
}

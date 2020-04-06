package com.playmore.msg;

public interface GameServerCmdConstant {

	// 重新加载服务器列表等数据
	public static int RELOAD_SERVER_RESOURCE = 1;
	// 将玩家数据入库
	public static int SAVE_GAME_DATA = 2;
	// 关闭服务器
	public static int CLOSE_GAME_SERVER = 3;
	// 清空ehcache缓存
	public static int CLEAN_EHCACHE = 4;
	// 清空单个系统的ehcache缓存
	public static int CLEAN_ONE_EHCACHE = 5;
	// 重新加载静态表数据
	public static int RELOAD_STATIC_DATA = 6;
	// 发送邮件给玩家
	public static int MAIL_TO_PLAYERS = 7;
	// 发送邮件给全服
	public static int MAIL_TO_ALL = 8;
	// 发送消息
	public static int SYS_NOTIFY = 9;
	// 发送重复消息
	public static int REPEAT_NOTIFY = 10;
	// 删除重复消息
	public static int DEL_REPEAT_NOTIFY = 11;
	// 请求玩家邮件
	public static int QUERY_PLAYER_MAIL = 12;

	// 重新加载活动数据
	public static int RELOAD_ACTIVITY_DATA = 20;

	// 充值通知
	public static int PAY = 30;

	// 神宠产出通知
	public static int GODPET_PRODUCE = 40;
	// 神宠购买下订单
	public static int GODPET_ORDER = 41;
	// 神宠卖成功回调
	public static int GODPET_SELL_SUCCESS = 42;

	// 查询cache的keys
	public static int QUERY_EHCACHE_KEYS = 100;
	// 查询cache单个数据
	public static int QUERY_EHCACHE_SINGLE = 101;
	// 查询cache集合数据
	public static int QUERY_EHCACHE_COLLECTION = 102;
	// 删除cache单个缓存
	public static int DELETE_EHCACHE = 103;
	// 查询在线集合数据
	public static int QUERY_ONLINE_COLLECTION = 104;
	// 踢下线
	public static int KICK = 105;
	// 查询数据长度
	public static int STATIC_DATA_TOTAL_SIZE = 106;
	// 查询内存中静态数据
	public static int STATIC_DATA = 107;
	// 查询cache的keys长度
	public static int EHCACHE_KEYS_TOTAL_SIZE = 108;
	// 查询cache集合数据长度
	public static int EHCACHE_COLLECTION_TOTAL_SIZE = 109;

	// 查询排行榜集合数据长度
	public static int RANKINGLIST_COLLECTION_TOTAL_SIZE = 110;
	// 查询排行榜的数据
	public static int RANKINGLIST_COLLECTION = 111;

	// 跳过玩家新手引导
	public static int SKIP_PLAYER_GUIDE = 112;

	// BOSS充值
	public static int RECHARGE_BY_BOSS = 120;

	// 重置首充记录
	public static int RESET_FIRST = 121;

	// Boss 后台查询玩家邮件
	public static int QUERY_MAIL_BY_BOSS = 130;

	// Boss 查询在线用户 ，具体情况
	public static int QUERY_ONLINE_BY_BOSS = 131;

	// 查询贵宾用户数据
	public static int QUERY_ALL_GUEST_INFO = 132;

	// 实时注册人数
	public static int QUERY_REGIST_NUM = 133;

	// Boss 后台查询全服邮件
	public static int QUERY_SERVER_MAIL_BY_BOSS = 135;

	// Boss 后台删除全服邮件
	public static int DELETE_SERVER_MAIL_BY_BOSS = 136;

	// Boss 后台删除玩家邮件
	public static int DELETE_MAIL_BY_BOSS = 137;

	// 添加临时登陆权限
	public static int LOGIN_BY_TEMP_VERIFY = 138;

	// 转服
	public static int TURN_SERVER = 139;

	// 刷新指定配置缓存
	public static int FLUSH_CACHE = 140;
	
	// 刷新任务管理器缓存
	public static int FLUSH_CACHE_MANAGE_TASK = 141;
	
	// 创建机器人
	public static int CREATE_ROBOT = 142;
	
	// 全服 查找英雄装备信息
	public static int ACROSS_FIND_EQUIPMENT = 143;
	
	// 全服 查找个人信息
	public static int ACROSS_FIND_PERSON_INFO = 144;
		
	// 全服 查找阵容信息
	public static int ACROSS_FIND_FORMATION_INFO = 145;
	
	//查询玩家
	public static int QUERY_PLAYER_INFO = 146;
	
	// 推送好友申请
	public static int PUSH_APPLY_FRIEND_INFO = 147;
	
	// 执行好友申请
	public static int APPLY_FRIEND_RESULT = 148;
	
	//好友赠送礼物
	public static int FRIEND_GIVE_GIFT = 149;
	
	// 删除好友
	public static int DELETE_FRIEND_RESULT = 150;
	
	// 全服 好友对战下发阵容
	public static int FRIEND_BATTLE_FORMATION = 151;
	
	// 推送好友申请
	public static int FIND_FRIEND_BLACK = 152;
	
	// 后台修改玩家资源
	public static int UPDATE_PLAYER_RESOURCE = 153;
	
	// 后台修改玩家关卡
	public static int UPDATE_PLAYER_CHECKPOINT = 154;
}

package com.playmore.xysword.constant;

public interface FriendConstants {

	public final static int CAN_NOT_DRAW = 0;
	public final static int CAN_DRAW = 1;
	public final static int DRAWED = 2;
	// 类型 1同意单个 2 同意全部 3 忽略单个 4 忽略全部
	public final static int AGREE_ONE = 1;
	public final static int AGREE_ALL = 2;
	public final static int IGNORE_ONE = 3;
	public final static int IGNORE_ALL = 4;
	//类型 1 ：处理好友申请 2：赠送礼物 3：领取礼物 4：删除好友 5：新的礼物 6：有好友删除 7:标记好友8:加入黑名单9：移除黑名单
	public final static int Friend_Apply = 1;
	public final static int Give = 2;
	public final static int Draw = 3;
	public final static int Del = 4;
	public final static int New_Gift = 5;
	public final static int Be_deleted = 6;
	public final static int Sign = 7;
	public final static int Join_black = 8;
	public final static int Del_black = 9;
}

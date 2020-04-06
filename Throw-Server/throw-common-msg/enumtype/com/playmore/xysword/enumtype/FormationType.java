package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface FormationType {
	@EnumFieldName(annotation="挑战关卡pve")
	public final static int PVE_STAGE = 1;
	@EnumFieldName(annotation="挂机阵容")
	public final static int PVE_IDLE = 2;
	@EnumFieldName(annotation="挑战关卡爬塔")
	public final static int PVE_TOWER_STAGE = 3;
	@EnumFieldName(annotation="迷宫阵型")
	public final static int MAZE_STAGE = 4;
	@EnumFieldName(annotation="PVP")
	public final static int PVP_STAGE = 5;
	@EnumFieldName(annotation="时光之巅")
	public final static int PEAK_TIME_STAGE = 6;
	@EnumFieldName(annotation="竞技场阵容")
	public final static int PVP_ARENA_STAGE = 7;
	@EnumFieldName(annotation="竞技场防守阵容")
	public final static int PVP_ARENA_DEFEND_STAGE = 8;
	@EnumFieldName(annotation="高阶竞技场阵容-1")
	public final static int PVP_ARENA_HIGH_STAGE_1 = 9;
	@EnumFieldName(annotation="高阶竞技场阵容-2")
	public final static int PVP_ARENA_HIGH_STAGE_2 = 10;
	@EnumFieldName(annotation="高阶竞技场阵容-3")
	public final static int PVP_ARENA_HIGH_STAGE_3 = 11;
	@EnumFieldName(annotation="高阶竞技场阵容-1  防守")
	public final static int PVP_ARENA_HIGH_DEFENCE_1 = 12;
	@EnumFieldName(annotation="高阶竞技场阵容-2  防守")
	public final static int PVP_ARENA_HIGH_DEFENCE_2 = 13;
	@EnumFieldName(annotation="高阶竞技场阵容-3  防守")
	public final static int PVP_ARENA_HIGH_DEFENCE_3 = 14;
	@EnumFieldName(annotation="好友切磋")
	public final static int PVE_FRIEND_BATTLE = 15;
	@EnumFieldName(annotation="公会boss阵容_1")
	public final static int GUILD_BOSS_1 = 16;
	@EnumFieldName(annotation="公会boss阵容_2")
	public final static int GUILD_BOSS_2 = 17;
	
 
	

}

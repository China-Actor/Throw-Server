package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface MazeType {
	@EnumFieldName(annotation="普通关卡")
	public final static int NORMAL_STAGE = 1;
	@EnumFieldName(annotation="精英关卡")
	public final static int ELITE_STAGE = 2;
	@EnumFieldName(annotation="BOSS关卡")
	public final static int BOSS_STAGE = 3;
	@EnumFieldName(annotation="协力英雄关卡")
	public final static int SYNERGY_HERO_STAGE = 4;
	@EnumFieldName(annotation=" 哥布林BOSS")
	public final static int GEBOLIN_BOSS_STAGE = 5;
	@EnumFieldName(annotation="商人")
	public final static int BUSINESSMAN = 6;
	@EnumFieldName(annotation="温泉")
	public final static int HOT_SPRING = 7;
	@EnumFieldName(annotation="复活者")
	public final static int RESURRECTION = 8;
	@EnumFieldName(annotation="协力英雄")
	public final static int SYNERGY_HERO = 9;
	@EnumFieldName(annotation="宝箱")
	public final static int MAZE_BOX = 99;
	@EnumFieldName(annotation="艾雅之泪")
	public final static int AIYA_TEARS = 100;

	
	
	
}

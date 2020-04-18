package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface RankType {
	@EnumFieldName(annotation="爬塔排行")
	public final static int MAX_TOWER_STAGE = 1;
	@EnumFieldName(annotation="竞技场")
	public final static int ARENA = 2;
	@EnumFieldName(annotation="高阶竞技场 -  段位排行")
	public final static int ARENA_HIGHER_RANK = 3;
	@EnumFieldName(annotation="高阶竞技场 -  积分排行")
	public final static int ARENA_HIGHER_SCORE = 4;
}

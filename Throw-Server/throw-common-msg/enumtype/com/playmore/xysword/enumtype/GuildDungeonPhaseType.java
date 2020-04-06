package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface GuildDungeonPhaseType {

	@EnumFieldName(annotation="未打开")
	public static final int CLOSE = 0;
	@EnumFieldName(annotation="打开")
	public static final int OPEN = 1;
	@EnumFieldName(annotation="完成")
	public static final int FINISH = 2;
	
}

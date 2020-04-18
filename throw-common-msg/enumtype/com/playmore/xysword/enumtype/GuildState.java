package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface GuildState {

	@EnumFieldName(annotation="直接加入")
	public static final int JOIN_NOW = 1;
	@EnumFieldName(annotation="审核加入")
	public static final int JOIN_APPLY = 2;
	@EnumFieldName(annotation="禁止加入")
	public static final int NO_JOIN = 3;
}

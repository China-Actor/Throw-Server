package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface SexType {
	@EnumFieldName(annotation="男")
	public final static int MALE = 1;
	@EnumFieldName(annotation="女")
	public final static int FEMAILE = 0;

	
}

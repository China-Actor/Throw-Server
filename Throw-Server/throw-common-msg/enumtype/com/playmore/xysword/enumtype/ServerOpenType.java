package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface ServerOpenType {

	@EnumFieldName(annotation="开")
	public final static int OPEN = 1;
	@EnumFieldName(annotation="关")
	public final static int CLOSE = 0;
	
}

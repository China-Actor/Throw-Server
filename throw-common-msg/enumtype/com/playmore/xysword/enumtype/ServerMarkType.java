package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface ServerMarkType {
	@EnumFieldName(annotation="普通服务器")
	public final static int NORMAL = 0;
	@EnumFieldName(annotation="新服")
	public final static int NEW = 1;
	@EnumFieldName(annotation="推荐服务器")
	public final static int ADVISE = 2;
	
}

package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface ServerLoadType {
	@EnumFieldName(annotation="空闲")
	public final static int NORMAL = 0;
	@EnumFieldName(annotation="拥挤")
	public final static int CROWD = 1;
	@EnumFieldName(annotation="爆满")
	public final static int FULL = 2;
	@EnumFieldName(annotation="关闭")
	public final static int CLOSE = 3;
}

package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface ClientOSType {
	
	@EnumFieldName(annotation="无限制")
	public final static int NO_LIMIT = 0;
	@EnumFieldName(annotation="只限ios")
	public final static int ONLY_IOS = 1;
	@EnumFieldName(annotation="只限安卓")
	public final static int ONLY_ANDROID = 2;
	@EnumFieldName(annotation="临时体验服")
	public final static int ONLY_TEMP = 4;
}

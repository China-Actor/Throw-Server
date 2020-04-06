package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface TimeType {

	@EnumFieldName(annotation="默认服务器时间")
	public final static int SYSTEM_TIME = 0;
	@EnumFieldName(annotation="utc时间hh:mm:ss")
	public final static int UTC_TIME = 1;
	@EnumFieldName(annotation="utc时间")
	public final static int UTC_TIME_NO_HH = 2;

}

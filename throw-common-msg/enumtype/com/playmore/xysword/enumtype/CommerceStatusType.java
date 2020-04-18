package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface CommerceStatusType {
	@EnumFieldName(annotation="正式上线")
	public final static int OFFICIAL = 0;
	@EnumFieldName(annotation="公测")
	public final static int OPEN_BETA = 1;
	@EnumFieldName(annotation="内测")
	public final static int CLOSED_BETA = 2;
	@EnumFieldName(annotation="开发中")
	public final static int ALPHA = 3;
}

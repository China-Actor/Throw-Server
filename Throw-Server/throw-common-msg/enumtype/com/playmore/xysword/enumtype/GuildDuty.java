package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface GuildDuty {
	@EnumFieldName(annotation="普通会员")
	public final static int COMMON = 1;
	@EnumFieldName(annotation="副会长")
	public final static int VICE_CHAIR = 2;
	@EnumFieldName(annotation="会长")
	public final static int CHAIR = 3;

}

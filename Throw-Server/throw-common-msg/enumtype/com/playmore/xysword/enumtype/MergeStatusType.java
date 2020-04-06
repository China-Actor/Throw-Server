package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface MergeStatusType {
	@EnumFieldName(annotation="正常")
	public final static int NORMAL = 0;
	@EnumFieldName(annotation="被合服")
	public final static int MERGE = 1;
}

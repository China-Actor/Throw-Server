package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface StageType {
	
	@EnumFieldName(annotation="主线副本")
	public final static int MeanLine = 1;
	@EnumFieldName(annotation="精英副本")
	public final static int Elite = 2;
	@EnumFieldName(annotation="日常副本")
	public final static int Daily = 3;
	
}

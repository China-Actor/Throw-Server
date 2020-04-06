package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface MazeStatus {
	
	@EnumFieldName(annotation="默认")
	public final static int DEFAULT = 0;
	@EnumFieldName(annotation="进行中")
	public final static int ONGOING = 1;
	@EnumFieldName(annotation="完成")
	public final static int FINISH = 2;
	@EnumFieldName(annotation="完成没有奖励")
	public final static int FINISH_NOREWARD = 3;
	
}
 
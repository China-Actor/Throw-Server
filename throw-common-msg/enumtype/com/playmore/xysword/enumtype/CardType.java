package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface CardType {

	@EnumFieldName(annotation="同一个英雄")
	public final static int SAME_CARD = 1;
	@EnumFieldName(annotation="同宗族")
	public final static int SAME_CUMP = 2;
	@EnumFieldName(annotation="英雄锁住")
	public final static int CARD_LOCK = 1;
	@EnumFieldName(annotation="英雄解锁")
	public final static int CARD_UNLOCK = 0;

}

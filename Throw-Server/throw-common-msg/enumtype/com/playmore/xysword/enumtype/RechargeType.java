package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface RechargeType {
	
	/**
	 * 钻石
	 */
	@EnumFieldName(annotation="钻石")
	public final static int Diamond = 1;
	
	/**
	 * 犒赏令
	 */
	@EnumFieldName(annotation="犒赏令")
	public final static int BattlePass = 2;
	
}

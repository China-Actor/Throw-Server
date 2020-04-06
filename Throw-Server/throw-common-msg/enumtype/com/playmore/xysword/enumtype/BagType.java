package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

/**
 * 背包类型
 * @author luozy
 *
 */
public interface BagType {
	@EnumFieldName(annotation="不进背包")
	public final static int UN_BAG = 0;
	
	@EnumFieldName(annotation="道具页签")
	public final static int ITEM = 1;
	
	@EnumFieldName(annotation="装备页签")
	public final static int EQUIPMENT = 2;
	
	@EnumFieldName(annotation="灵魂石页签")
	public final static int STONE = 3;
}

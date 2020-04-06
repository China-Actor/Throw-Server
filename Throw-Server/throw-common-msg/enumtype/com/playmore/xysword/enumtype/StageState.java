package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface StageState {

	@EnumFieldName(annotation="BOSS倒计时状态")
	public final static int BOSS_WAIT = 1;
	@EnumFieldName(annotation="BOSS可攻击状态")
	public final static int BOSS_READY = 2;
	@EnumFieldName(annotation="BOSS已击败状态")
	public final static int BOSS_PASS = 3;
}

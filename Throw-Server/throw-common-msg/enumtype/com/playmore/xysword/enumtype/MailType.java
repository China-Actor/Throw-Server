package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface MailType {
	@EnumFieldName(annotation="测试")
	public static final int TEST = 1;
	@EnumFieldName(annotation="补偿")
	public static final int COMPENSATE = 2;
	@EnumFieldName(annotation="竞技场")
	public static final int ARENA = 3;
	@EnumFieldName(annotation="公会")
	public static final int GUILD = 4;
	
	
	@EnumFieldName(annotation="竞技场")
	public static final int ARENA_NUM = 30;
	
	@EnumFieldName(annotation="竞技场")
	public static final int ARENA_REASON_NUM = 40;
	
	/**
	 * 公会BOSS开启通知
	 */
	public static final int GUILD_BOSS_START = 99;

	/**
	 * 公会BOSS奖励
	 */
	public static final int GUILD_BOSS_REWARD = 50;

	/**
	 * 公会全员邮件
	 */
	public static final int GUILD_MAIL = 60;
	
}

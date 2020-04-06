package com.playmore.xysword.enumtype;

import com.playmore.database.EnumFieldName;

public interface TestDevIp {

	@EnumFieldName(annotation="为了公司内网有两个ip网卡做的特殊化")
	public final static String DEV_IP = "192.168.75.62";
	public final static String DEV_IP_TEST = "192.168.69.62";
	
}

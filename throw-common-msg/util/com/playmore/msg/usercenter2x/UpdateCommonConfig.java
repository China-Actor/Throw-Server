package com.playmore.msg.usercenter2x;

import com.playmore.dbobject.usercenter.CommonConfig;

public class UpdateCommonConfig {

	private CommonConfig config;
	
	private int zoneId;

	public CommonConfig getConfig() {
		return config;
	}

	public void setConfig(CommonConfig config) {
		this.config = config;
	}

	public int getZoneId() {
		return zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

}

package com.playmore.xysword.remote.action;

import java.util.List;
import java.util.Set;

import com.playmore.msg.x2gameserver.ForeginInfoVo;
import com.playmore.remote.annotation.MainCMD;
import com.playmore.remote.annotation.SubCMD;
import com.playmore.xysword.enumtype.CrossCommand;

@MainCMD(CrossCommand.FOREGIN)
public interface CrossForeginInfoAction {
	@SubCMD(value=1,async=true)
	List<ForeginInfoVo> foreginInfo(int serverId, Set<Long> playerIds);
	
	@SubCMD(value=2,async=true)
	void updateForeginInfo(int serverId, Set<Long> playerIds,int type,Object params);

	
	
	

	
}
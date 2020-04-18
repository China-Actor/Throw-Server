package com.playmore.msg.x2gameserver;

import java.util.List;

public class EquipmentCardRequest extends BaseRequest {
	private List<Long> playerIds;
	
	public EquipmentCardRequest()
	{}
	
	public EquipmentCardRequest(int serverId, long playerId) {
		super(serverId, playerId,0,false);
	}

	public List<Long> getPlayerIds() {
		return playerIds;
	}

	public void setPlayerIds(List<Long> playerIds) {
		this.playerIds = playerIds;
	}
	
	
}

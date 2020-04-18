package com.playmore.msg.x2gameserver;

import java.util.List;

public class FormationInfoRequest extends BaseRequest {

	/**
	 * 阵容类型
	 */
	private List<Integer> formations;
	
	public FormationInfoRequest() {}
	
	public FormationInfoRequest(int serverId, long playerId) {
		super(serverId, playerId,0,false);
	}

	public List<Integer> getFormations() {
		return formations;
	}

	public void setFormations(List<Integer> formations) {
		this.formations = formations;
	}

	 
	
	
}

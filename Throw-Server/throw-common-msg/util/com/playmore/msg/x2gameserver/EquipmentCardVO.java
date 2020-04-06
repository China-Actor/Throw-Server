package com.playmore.msg.x2gameserver;

import java.util.List;

public class EquipmentCardVO {

	private long playerCardId;
	
	private List<EquipmentDetailVO> eDetails;
	
	
	public static class EquipmentDetailVO
	{
		private long id ; 						//装备实例id(槽位上)
		private int slot ;						//装备槽位
		private int itemId;						//装备模板id
		private int star ; 						//星级
		private int exp; 						//经验值
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public int getSlot() {
			return slot;
		}
		public void setSlot(int slot) {
			this.slot = slot;
		}
		public int getItemId() {
			return itemId;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public int getStar() {
			return star;
		}
		public void setStar(int star) {
			this.star = star;
		}
		public int getExp() {
			return exp;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		
	}


	public long getPlayerCardId() {
		return playerCardId;
	}


	public void setPlayerCardId(long playerCardId) {
		this.playerCardId = playerCardId;
	}


	public List<EquipmentDetailVO> geteDetails() {
		return eDetails;
	}


	public void seteDetails(List<EquipmentDetailVO> eDetails) {
		this.eDetails = eDetails;
	}


	 


	 
	
	
}

package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerEquipment implements Serializable {

	@DBFieldName(fieldName="实例id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="卡牌实例id", isNullable="columnNullable")
	private long playerCardId;
	@DBFieldName(fieldName="卡牌模板id", isNullable="columnNullable")
	private int cardId;
	@DBFieldName(fieldName="装备id_1", isNullable="columnNullable")
	private long slotEquipId1;
	@DBFieldName(fieldName="装备模板id_1", isNullable="columnNullable")
	private int slotItemId1;
	@DBFieldName(fieldName="装备星级_1", isNullable="columnNullable")
	private int slotStar1;
	@DBFieldName(fieldName="装备强化经验_1", isNullable="columnNullable")
	private int slotExp1;
	@DBFieldName(fieldName="装备id_2", isNullable="columnNullable")
	private long slotEquipId2;
	@DBFieldName(fieldName="装备模板id_2", isNullable="columnNullable")
	private int slotItemId2;
	@DBFieldName(fieldName="装备星级_2", isNullable="columnNullable")
	private int slotStar2;
	@DBFieldName(fieldName="装备强化经验_2", isNullable="columnNullable")
	private int slotExp2;
	@DBFieldName(fieldName="装备id_3", isNullable="columnNullable")
	private long slotEquipId3;
	@DBFieldName(fieldName="装备模板id_3", isNullable="columnNullable")
	private int slotItemId3;
	@DBFieldName(fieldName="装备星级_3", isNullable="columnNullable")
	private int slotStar3;
	@DBFieldName(fieldName="装备强化经验_3", isNullable="columnNullable")
	private int slotExp3;
	@DBFieldName(fieldName="装备id_4", isNullable="columnNullable")
	private long slotEquipId4;
	@DBFieldName(fieldName="装备模板id_4", isNullable="columnNullable")
	private int slotItemId4;
	@DBFieldName(fieldName="装备星级_4", isNullable="columnNullable")
	private int slotStar4;
	@DBFieldName(fieldName="装备强化经验_4", isNullable="columnNullable")
	private int slotExp4;
	@DBFieldName(fieldName="装备id_5", isNullable="columnNullable")
	private long slotEquipId5;
	@DBFieldName(fieldName="装备模板id_5", isNullable="columnNullable")
	private int slotItemId5;
	@DBFieldName(fieldName="装备星级_5", isNullable="columnNullable")
	private int slotStar5;
	@DBFieldName(fieldName="装备强化经验_5", isNullable="columnNullable")
	private int slotExp5;
	@DBFieldName(fieldName="装备id_6", isNullable="columnNullable")
	private long slotEquipId6;
	@DBFieldName(fieldName="装备模板id_6", isNullable="columnNullable")
	private int slotItemId6;
	@DBFieldName(fieldName="装备星级_6", isNullable="columnNullable")
	private int slotStar6;
	@DBFieldName(fieldName="装备强化经验_6", isNullable="columnNullable")
	private int slotExp6;
	@DBFieldName(fieldName="装备id_7", isNullable="columnNullable")
	private long slotEquipId7;
	@DBFieldName(fieldName="装备模板id_7", isNullable="columnNullable")
	private int slotItemId7;
	@DBFieldName(fieldName="装备星级_7", isNullable="columnNullable")
	private int slotStar7;
	@DBFieldName(fieldName="装备强化经验_7", isNullable="columnNullable")
	private int slotExp7;
	@DBFieldName(fieldName="装备id_8", isNullable="columnNullable")
	private long slotEquipId8;
	@DBFieldName(fieldName="装备模板id_8", isNullable="columnNullable")
	private int slotItemId8;
	@DBFieldName(fieldName="装备星级_8", isNullable="columnNullable")
	private int slotStar8;
	@DBFieldName(fieldName="装备强化经验_8", isNullable="columnNullable")
	private int slotExp8;
	@DBFieldName(fieldName="装备id_9", isNullable="columnNullable")
	private long slotEquipId9;
	@DBFieldName(fieldName="装备模板id_9", isNullable="columnNullable")
	private int slotItemId9;
	@DBFieldName(fieldName="装备星级_9", isNullable="columnNullable")
	private int slotStar9;
	@DBFieldName(fieldName="装备强化经验_9", isNullable="columnNullable")
	private int slotExp9;
	@DBFieldName(fieldName="装备id_10", isNullable="columnNullable")
	private long slotEquipId10;
	@DBFieldName(fieldName="装备模板id_10", isNullable="columnNullable")
	private int slotItemId10;
	@DBFieldName(fieldName="装备星级_10", isNullable="columnNullable")
	private int slotStar10;
	@DBFieldName(fieldName="装备强化经验_10", isNullable="columnNullable")
	private int slotExp10;

	public PlayerEquipment(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setPlayerId(long playerId) {
		this.playerId=playerId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerCardId(long playerCardId) {
		this.playerCardId=playerCardId;
	}

	public long getPlayerCardId() {
		return playerCardId;
	}

	public void setCardId(int cardId) {
		this.cardId=cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setSlotEquipId1(long slotEquipId1) {
		this.slotEquipId1=slotEquipId1;
	}

	public long getSlotEquipId1() {
		return slotEquipId1;
	}

	public void setSlotItemId1(int slotItemId1) {
		this.slotItemId1=slotItemId1;
	}

	public int getSlotItemId1() {
		return slotItemId1;
	}

	public void setSlotStar1(int slotStar1) {
		this.slotStar1=slotStar1;
	}

	public int getSlotStar1() {
		return slotStar1;
	}

	public void setSlotExp1(int slotExp1) {
		this.slotExp1=slotExp1;
	}

	public int getSlotExp1() {
		return slotExp1;
	}

	public void setSlotEquipId2(long slotEquipId2) {
		this.slotEquipId2=slotEquipId2;
	}

	public long getSlotEquipId2() {
		return slotEquipId2;
	}

	public void setSlotItemId2(int slotItemId2) {
		this.slotItemId2=slotItemId2;
	}

	public int getSlotItemId2() {
		return slotItemId2;
	}

	public void setSlotStar2(int slotStar2) {
		this.slotStar2=slotStar2;
	}

	public int getSlotStar2() {
		return slotStar2;
	}

	public void setSlotExp2(int slotExp2) {
		this.slotExp2=slotExp2;
	}

	public int getSlotExp2() {
		return slotExp2;
	}

	public void setSlotEquipId3(long slotEquipId3) {
		this.slotEquipId3=slotEquipId3;
	}

	public long getSlotEquipId3() {
		return slotEquipId3;
	}

	public void setSlotItemId3(int slotItemId3) {
		this.slotItemId3=slotItemId3;
	}

	public int getSlotItemId3() {
		return slotItemId3;
	}

	public void setSlotStar3(int slotStar3) {
		this.slotStar3=slotStar3;
	}

	public int getSlotStar3() {
		return slotStar3;
	}

	public void setSlotExp3(int slotExp3) {
		this.slotExp3=slotExp3;
	}

	public int getSlotExp3() {
		return slotExp3;
	}

	public void setSlotEquipId4(long slotEquipId4) {
		this.slotEquipId4=slotEquipId4;
	}

	public long getSlotEquipId4() {
		return slotEquipId4;
	}

	public void setSlotItemId4(int slotItemId4) {
		this.slotItemId4=slotItemId4;
	}

	public int getSlotItemId4() {
		return slotItemId4;
	}

	public void setSlotStar4(int slotStar4) {
		this.slotStar4=slotStar4;
	}

	public int getSlotStar4() {
		return slotStar4;
	}

	public void setSlotExp4(int slotExp4) {
		this.slotExp4=slotExp4;
	}

	public int getSlotExp4() {
		return slotExp4;
	}

	public void setSlotEquipId5(long slotEquipId5) {
		this.slotEquipId5=slotEquipId5;
	}

	public long getSlotEquipId5() {
		return slotEquipId5;
	}

	public void setSlotItemId5(int slotItemId5) {
		this.slotItemId5=slotItemId5;
	}

	public int getSlotItemId5() {
		return slotItemId5;
	}

	public void setSlotStar5(int slotStar5) {
		this.slotStar5=slotStar5;
	}

	public int getSlotStar5() {
		return slotStar5;
	}

	public void setSlotExp5(int slotExp5) {
		this.slotExp5=slotExp5;
	}

	public int getSlotExp5() {
		return slotExp5;
	}

	public void setSlotEquipId6(long slotEquipId6) {
		this.slotEquipId6=slotEquipId6;
	}

	public long getSlotEquipId6() {
		return slotEquipId6;
	}

	public void setSlotItemId6(int slotItemId6) {
		this.slotItemId6=slotItemId6;
	}

	public int getSlotItemId6() {
		return slotItemId6;
	}

	public void setSlotStar6(int slotStar6) {
		this.slotStar6=slotStar6;
	}

	public int getSlotStar6() {
		return slotStar6;
	}

	public void setSlotExp6(int slotExp6) {
		this.slotExp6=slotExp6;
	}

	public int getSlotExp6() {
		return slotExp6;
	}

	public void setSlotEquipId7(long slotEquipId7) {
		this.slotEquipId7=slotEquipId7;
	}

	public long getSlotEquipId7() {
		return slotEquipId7;
	}

	public void setSlotItemId7(int slotItemId7) {
		this.slotItemId7=slotItemId7;
	}

	public int getSlotItemId7() {
		return slotItemId7;
	}

	public void setSlotStar7(int slotStar7) {
		this.slotStar7=slotStar7;
	}

	public int getSlotStar7() {
		return slotStar7;
	}

	public void setSlotExp7(int slotExp7) {
		this.slotExp7=slotExp7;
	}

	public int getSlotExp7() {
		return slotExp7;
	}

	public void setSlotEquipId8(long slotEquipId8) {
		this.slotEquipId8=slotEquipId8;
	}

	public long getSlotEquipId8() {
		return slotEquipId8;
	}

	public void setSlotItemId8(int slotItemId8) {
		this.slotItemId8=slotItemId8;
	}

	public int getSlotItemId8() {
		return slotItemId8;
	}

	public void setSlotStar8(int slotStar8) {
		this.slotStar8=slotStar8;
	}

	public int getSlotStar8() {
		return slotStar8;
	}

	public void setSlotExp8(int slotExp8) {
		this.slotExp8=slotExp8;
	}

	public int getSlotExp8() {
		return slotExp8;
	}

	public void setSlotEquipId9(long slotEquipId9) {
		this.slotEquipId9=slotEquipId9;
	}

	public long getSlotEquipId9() {
		return slotEquipId9;
	}

	public void setSlotItemId9(int slotItemId9) {
		this.slotItemId9=slotItemId9;
	}

	public int getSlotItemId9() {
		return slotItemId9;
	}

	public void setSlotStar9(int slotStar9) {
		this.slotStar9=slotStar9;
	}

	public int getSlotStar9() {
		return slotStar9;
	}

	public void setSlotExp9(int slotExp9) {
		this.slotExp9=slotExp9;
	}

	public int getSlotExp9() {
		return slotExp9;
	}

	public void setSlotEquipId10(long slotEquipId10) {
		this.slotEquipId10=slotEquipId10;
	}

	public long getSlotEquipId10() {
		return slotEquipId10;
	}

	public void setSlotItemId10(int slotItemId10) {
		this.slotItemId10=slotItemId10;
	}

	public int getSlotItemId10() {
		return slotItemId10;
	}

	public void setSlotStar10(int slotStar10) {
		this.slotStar10=slotStar10;
	}

	public int getSlotStar10() {
		return slotStar10;
	}

	public void setSlotExp10(int slotExp10) {
		this.slotExp10=slotExp10;
	}

	public int getSlotExp10() {
		return slotExp10;
	}

	public String toString() {
		return "PlayerEquipment [id=" + id + " ,playerId=" + playerId + " ,playerCardId=" + playerCardId + " ,cardId=" + cardId + " ,slotEquipId1=" + slotEquipId1 + " ,slotItemId1=" + slotItemId1 + " ,slotStar1=" + slotStar1 + " ,slotExp1=" + slotExp1 + " ,slotEquipId2=" + slotEquipId2 + " ,slotItemId2=" + slotItemId2 + " ,slotStar2=" + slotStar2 + " ,slotExp2=" + slotExp2 + " ,slotEquipId3=" + slotEquipId3 + " ,slotItemId3=" + slotItemId3 + " ,slotStar3=" + slotStar3 + " ,slotExp3=" + slotExp3 + " ,slotEquipId4=" + slotEquipId4 + " ,slotItemId4=" + slotItemId4 + " ,slotStar4=" + slotStar4 + " ,slotExp4=" + slotExp4 + " ,slotEquipId5=" + slotEquipId5 + " ,slotItemId5=" + slotItemId5 + " ,slotStar5=" + slotStar5 + " ,slotExp5=" + slotExp5 + " ,slotEquipId6=" + slotEquipId6 + " ,slotItemId6=" + slotItemId6 + " ,slotStar6=" + slotStar6 + " ,slotExp6=" + slotExp6 + " ,slotEquipId7=" + slotEquipId7 + " ,slotItemId7=" + slotItemId7 + " ,slotStar7=" + slotStar7 + " ,slotExp7=" + slotExp7 + " ,slotEquipId8=" + slotEquipId8 + " ,slotItemId8=" + slotItemId8 + " ,slotStar8=" + slotStar8 + " ,slotExp8=" + slotExp8 + " ,slotEquipId9=" + slotEquipId9 + " ,slotItemId9=" + slotItemId9 + " ,slotStar9=" + slotStar9 + " ,slotExp9=" + slotExp9 + " ,slotEquipId10=" + slotEquipId10 + " ,slotItemId10=" + slotItemId10 + " ,slotStar10=" + slotStar10 + " ,slotExp10=" + slotExp10+ "]";
	}
}

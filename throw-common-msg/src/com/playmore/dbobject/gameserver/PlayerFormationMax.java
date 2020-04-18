package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFormationMax implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNoNulls")
	private long playerId;
	@DBFieldName(fieldName="类型", externalKey="FormationType", isNullable="columnNoNulls")
	private int type;
	@DBFieldName(fieldName="槽位1站位0-8", isNullable="columnNoNulls")
	private int slot1Pos;
	@DBFieldName(fieldName="槽位1角色", isNullable="columnNoNulls")
	private long slot1Card;
	@DBFieldName(fieldName="槽位2站位0-8", isNullable="columnNoNulls")
	private int slot2Pos;
	@DBFieldName(fieldName="槽位2角色", isNullable="columnNoNulls")
	private long slot2Card;
	@DBFieldName(fieldName="槽位3站位0-8", isNullable="columnNoNulls")
	private int slot3Pos;
	@DBFieldName(fieldName="槽位3角色", isNullable="columnNoNulls")
	private long slot3Card;
	@DBFieldName(fieldName="槽位4站位0-8", isNullable="columnNoNulls")
	private int slot4Pos;
	@DBFieldName(fieldName="槽位角色", isNullable="columnNoNulls")
	private long slot4Card;
	@DBFieldName(fieldName="槽位5站位0-8", isNullable="columnNoNulls")
	private int slot5Pos;
	@DBFieldName(fieldName="槽位5角色", isNullable="columnNoNulls")
	private long slot5Card;
	@DBFieldName(fieldName="使用策略", isNullable="columnNullable")
	private boolean useStrategy;
	@DBFieldName(fieldName="阵容战斗力", isNullable="columnNullable")
	private long power;

	public PlayerFormationMax(){
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

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setSlot1Pos(int slot1Pos) {
		this.slot1Pos=slot1Pos;
	}

	public int getSlot1Pos() {
		return slot1Pos;
	}

	public void setSlot1Card(long slot1Card) {
		this.slot1Card=slot1Card;
	}

	public long getSlot1Card() {
		return slot1Card;
	}

	public void setSlot2Pos(int slot2Pos) {
		this.slot2Pos=slot2Pos;
	}

	public int getSlot2Pos() {
		return slot2Pos;
	}

	public void setSlot2Card(long slot2Card) {
		this.slot2Card=slot2Card;
	}

	public long getSlot2Card() {
		return slot2Card;
	}

	public void setSlot3Pos(int slot3Pos) {
		this.slot3Pos=slot3Pos;
	}

	public int getSlot3Pos() {
		return slot3Pos;
	}

	public void setSlot3Card(long slot3Card) {
		this.slot3Card=slot3Card;
	}

	public long getSlot3Card() {
		return slot3Card;
	}

	public void setSlot4Pos(int slot4Pos) {
		this.slot4Pos=slot4Pos;
	}

	public int getSlot4Pos() {
		return slot4Pos;
	}

	public void setSlot4Card(long slot4Card) {
		this.slot4Card=slot4Card;
	}

	public long getSlot4Card() {
		return slot4Card;
	}

	public void setSlot5Pos(int slot5Pos) {
		this.slot5Pos=slot5Pos;
	}

	public int getSlot5Pos() {
		return slot5Pos;
	}

	public void setSlot5Card(long slot5Card) {
		this.slot5Card=slot5Card;
	}

	public long getSlot5Card() {
		return slot5Card;
	}

	public void setUseStrategy(boolean useStrategy) {
		this.useStrategy=useStrategy;
	}

	public boolean getUseStrategy() {
		return useStrategy;
	}

	public void setPower(long power) {
		this.power=power;
	}

	public long getPower() {
		return power;
	}

	public String toString() {
		return "PlayerFormationMax [id=" + id + " ,playerId=" + playerId + " ,type=" + type + " ,slot1Pos=" + slot1Pos + " ,slot1Card=" + slot1Card + " ,slot2Pos=" + slot2Pos + " ,slot2Card=" + slot2Card + " ,slot3Pos=" + slot3Pos + " ,slot3Card=" + slot3Card + " ,slot4Pos=" + slot4Pos + " ,slot4Card=" + slot4Card + " ,slot5Pos=" + slot5Pos + " ,slot5Card=" + slot5Card + " ,useStrategy=" + useStrategy + " ,power=" + power+ "]";
	}
}

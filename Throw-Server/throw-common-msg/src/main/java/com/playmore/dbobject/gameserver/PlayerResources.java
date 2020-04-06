package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
public class PlayerResources implements Serializable {

	@DBFieldName(fieldName="playerId", isNullable="columnNoNulls")
	private long pid;
	@DBFieldName(fieldName="金币", isNullable="columnNoNulls")
	private long gold;
	@DBFieldName(fieldName="有偿钻石", isNullable="columnNullable")
	private int diamondsPaid;
	@DBFieldName(fieldName="钻石", isNullable="columnNoNulls")
	private int diamonds;
	@DBFieldName(fieldName="生命精华", isNullable="columnNullable")
	private int liveElite;
	@DBFieldName(fieldName="友情点", isNullable="columnNoNulls")
	private int friendshipPoint;
	@DBFieldName(fieldName="公会货币", isNullable="columnNullable")
	private int guildCoin;
	@DBFieldName(fieldName="遣散货币", isNullable="columnNullable")
	private int dismissCoin;
	@DBFieldName(fieldName="迷宫货币", isNullable="columnNullable")
	private int mazeCoin;
	@DBFieldName(fieldName="竞技场货币", isNullable="columnNullable")
	private int arenaCoin;

	public PlayerResources(){
	}

	public void setPid(long pid) {
		this.pid=pid;
	}

	public long getPid() {
		return pid;
	}

	public void setGold(long gold) {
		this.gold=gold;
	}

	public long getGold() {
		return gold;
	}

	public void setDiamondsPaid(int diamondsPaid) {
		this.diamondsPaid=diamondsPaid;
	}

	public int getDiamondsPaid() {
		return diamondsPaid;
	}

	public void setDiamonds(int diamonds) {
		this.diamonds=diamonds;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public void setLiveElite(int liveElite) {
		this.liveElite=liveElite;
	}

	public int getLiveElite() {
		return liveElite;
	}

	public void setFriendshipPoint(int friendshipPoint) {
		this.friendshipPoint=friendshipPoint;
	}

	public int getFriendshipPoint() {
		return friendshipPoint;
	}

	public void setGuildCoin(int guildCoin) {
		this.guildCoin=guildCoin;
	}

	public int getGuildCoin() {
		return guildCoin;
	}

	public void setDismissCoin(int dismissCoin) {
		this.dismissCoin=dismissCoin;
	}

	public int getDismissCoin() {
		return dismissCoin;
	}

	public void setMazeCoin(int mazeCoin) {
		this.mazeCoin=mazeCoin;
	}

	public int getMazeCoin() {
		return mazeCoin;
	}

	public void setArenaCoin(int arenaCoin) {
		this.arenaCoin=arenaCoin;
	}

	public int getArenaCoin() {
		return arenaCoin;
	}

	public String toString() {
		return "PlayerResources [pid=" + pid + " ,gold=" + gold + " ,diamondsPaid=" + diamondsPaid + " ,diamonds=" + diamonds + " ,liveElite=" + liveElite + " ,friendshipPoint=" + friendshipPoint + " ,guildCoin=" + guildCoin + " ,dismissCoin=" + dismissCoin + " ,mazeCoin=" + mazeCoin + " ,arenaCoin=" + arenaCoin+ "]";
	}
}

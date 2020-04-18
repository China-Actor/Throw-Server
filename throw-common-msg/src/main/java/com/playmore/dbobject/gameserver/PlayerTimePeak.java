package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTimePeak implements Serializable {

	private long id;
	@DBFieldName(fieldName="玩家id", isNullable="columnNullable")
	private long playerId;
	@DBFieldName(fieldName="地图类型", isNullable="columnNullable")
	private int mapId;
	@DBFieldName(fieldName="领取奖励", isNullable="columnNullable")
	private String rewardStr;
	@DBFieldName(fieldName="英雄数据", isNullable="columnNullable")
	private String cardData;
	@DBFieldName(fieldName="背包数据", isNullable="columnNullable")
	private String bagData;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createTime;
	@DBFieldName(fieldName="更新时间", isNullable="columnNullable")
	private String updateTime;
	@DBFieldName(fieldName="地图坐标", isNullable="columnNullable")
	private String mapData;
	@DBFieldName(fieldName="地图状态   1 开   0关", isNullable="columnNullable")
	private int status;
	@DBFieldName(fieldName="开始起点", isNullable="columnNullable")
	private int starIdx;
	@DBFieldName(fieldName="战斗失败阵容", isNullable="columnNullable")
	private String battleFailFormation;
	@DBFieldName(fieldName="遗物宝箱 没有领取过的数据", isNullable="columnNullable")
	private String relicBoxData;
	@DBFieldName(fieldName="协力英雄的数据", isNullable="columnNullable")
	private String synergyHeroData;

	public PlayerTimePeak(){
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

	public void setMapId(int mapId) {
		this.mapId=mapId;
	}

	public int getMapId() {
		return mapId;
	}

	public void setRewardStr(String rewardStr) {
		this.rewardStr=rewardStr;
	}

	public String getRewardStr() {
		return rewardStr;
	}

	public void setCardData(String cardData) {
		this.cardData=cardData;
	}

	public String getCardData() {
		return cardData;
	}

	public void setBagData(String bagData) {
		this.bagData=bagData;
	}

	public String getBagData() {
		return bagData;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setMapData(String mapData) {
		this.mapData=mapData;
	}

	public String getMapData() {
		return mapData;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setStarIdx(int starIdx) {
		this.starIdx=starIdx;
	}

	public int getStarIdx() {
		return starIdx;
	}

	public void setBattleFailFormation(String battleFailFormation) {
		this.battleFailFormation=battleFailFormation;
	}

	public String getBattleFailFormation() {
		return battleFailFormation;
	}

	public void setRelicBoxData(String relicBoxData) {
		this.relicBoxData=relicBoxData;
	}

	public String getRelicBoxData() {
		return relicBoxData;
	}

	public void setSynergyHeroData(String synergyHeroData) {
		this.synergyHeroData=synergyHeroData;
	}

	public String getSynergyHeroData() {
		return synergyHeroData;
	}

	public String toString() {
		return "PlayerTimePeak [id=" + id + " ,playerId=" + playerId + " ,mapId=" + mapId + " ,rewardStr=" + rewardStr + " ,cardData=" + cardData + " ,bagData=" + bagData + " ,createTime=" + createTime + " ,updateTime=" + updateTime + " ,mapData=" + mapData + " ,status=" + status + " ,starIdx=" + starIdx + " ,battleFailFormation=" + battleFailFormation + " ,relicBoxData=" + relicBoxData + " ,synergyHeroData=" + synergyHeroData+ "]";
	}
}

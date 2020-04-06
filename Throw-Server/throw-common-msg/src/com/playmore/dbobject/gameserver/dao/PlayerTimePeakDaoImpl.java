package com.playmore.dbobject.gameserver.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;
import com.playmore.database.dao.MutiPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.NoPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.dao.provider.MutiDBProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.playmore.xysword.enumtype.DbType;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.gameserver.PlayerTimePeak;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTimePeakDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerTimePeak>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerTimePeakDaoImpl DEFAULT = new	PlayerTimePeakDaoImpl();
	public static PlayerTimePeakDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerTimePeak createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer mapId = rs.getInt("map_id");
		java.lang.String rewardStr = rs.getString("reward_str");
		java.lang.String cardData = rs.getString("card_data");
		java.lang.String bagData = rs.getString("bag_data");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String updateTime = rs.getString("update_time");
		java.lang.String mapData = rs.getString("map_data");
		java.lang.Integer status = rs.getInt("status");
		java.lang.Integer starIdx = rs.getInt("star_idx");
		java.lang.String battleFailFormation = rs.getString("battle_fail_formation");
		java.lang.String relicBoxData = rs.getString("relic_box_data");
		java.lang.String synergyHeroData = rs.getString("synergy_hero_data");
		PlayerTimePeak instance = new PlayerTimePeak();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setMapId(mapId);
		instance.setRewardStr(rewardStr);
		instance.setCardData(cardData);
		instance.setBagData(bagData);
		instance.setCreateTime(createTime);
		instance.setUpdateTime(updateTime);
		instance.setMapData(mapData);
		instance.setStatus(status);
		instance.setStarIdx(starIdx);
		instance.setBattleFailFormation(battleFailFormation);
		instance.setRelicBoxData(relicBoxData);
		instance.setSynergyHeroData(synergyHeroData);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_time_peak (`id`,`player_id`,`map_id`,`reward_str`,`card_data`,`bag_data`,`create_time`,`update_time`,`map_data`,`status`,`star_idx`,`battle_fail_formation`,`relic_box_data`,`synergy_hero_data`) VALUES(:id,:playerId,:mapId,:rewardStr,:cardData,:bagData,:createTime,:updateTime,:mapData,:status,:starIdx,:battleFailFormation,:relicBoxData,:synergyHeroData)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_time_peak SET `player_id`=:playerId,`map_id`=:mapId,`reward_str`=:rewardStr,`card_data`=:cardData,`bag_data`=:bagData,`create_time`=:createTime,`update_time`=:updateTime,`map_data`=:mapData,`status`=:status,`star_idx`=:starIdx,`battle_fail_formation`=:battleFailFormation,`relic_box_data`=:relicBoxData,`synergy_hero_data`=:synergyHeroData WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerTimePeak t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_time_peak";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

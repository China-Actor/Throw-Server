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
import com.playmore.dbobject.gameserver.PlayerSourceLink;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerSourceLinkDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerSourceLink>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerSourceLink createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.String linkNumber = rs.getString("link_number");
		java.lang.Integer linkId = rs.getInt("link_id");
		java.lang.Integer slotIndex = rs.getInt("slot_index");
		java.lang.Long slotHero = rs.getLong("slot_hero");
		java.lang.Long fromPlayerId = rs.getLong("from_player_id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Integer relation = rs.getInt("relation");
		java.lang.String updateTime = rs.getString("update_time");
		PlayerSourceLink instance = new PlayerSourceLink();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setLinkNumber(linkNumber);
		instance.setLinkId(linkId);
		instance.setSlotIndex(slotIndex);
		instance.setSlotHero(slotHero);
		instance.setFromPlayerId(fromPlayerId);
		instance.setServerId(serverId);
		instance.setRelation(relation);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_source_link (`id`,`player_id`,`link_number`,`link_id`,`slot_index`,`slot_hero`,`from_player_id`,`server_id`,`relation`,`update_time`) VALUES(:id,:playerId,:linkNumber,:linkId,:slotIndex,:slotHero,:fromPlayerId,:serverId,:relation,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_source_link SET `player_id`=:playerId,`link_number`=:linkNumber,`link_id`=:linkId,`slot_index`=:slotIndex,`slot_hero`=:slotHero,`from_player_id`=:fromPlayerId,`server_id`=:serverId,`relation`=:relation,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerSourceLink t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_source_link";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

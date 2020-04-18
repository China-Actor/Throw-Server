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
import com.playmore.dbobject.gameserver.PlayerDrawWish;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerDrawWishDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerDrawWish>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerDrawWish createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer group = rs.getInt("group");
		java.lang.Integer slot = rs.getInt("slot");
		java.lang.Integer heroId = rs.getInt("hero_id");
		PlayerDrawWish instance = new PlayerDrawWish();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setGroup(group);
		instance.setSlot(slot);
		instance.setHeroId(heroId);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_draw_wish (`id`,`player_id`,`group`,`slot`,`hero_id`) VALUES(:id,:playerId,:group,:slot,:heroId)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_draw_wish SET `player_id`=:playerId,`group`=:group,`slot`=:slot,`hero_id`=:heroId WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerDrawWish t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_draw_wish";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

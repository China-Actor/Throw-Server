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
import com.playmore.dbobject.gameserver.PlayerHandbook;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerHandbookDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerHandbook>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerHandbookDaoImpl DEFAULT = new	PlayerHandbookDaoImpl();
	public static PlayerHandbookDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerHandbook createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer heroId = rs.getInt("hero_id");
		java.lang.Boolean isReceive = rs.getBoolean("is_receive");
		PlayerHandbook instance = new PlayerHandbook();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setHeroId(heroId);
		instance.setIsReceive(isReceive);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_handbook (`id`,`player_id`,`hero_id`,`is_receive`) VALUES(:id,:playerId,:heroId,:isReceive)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_handbook SET `player_id`=:playerId,`hero_id`=:heroId,`is_receive`=:isReceive WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerHandbook t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_handbook";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

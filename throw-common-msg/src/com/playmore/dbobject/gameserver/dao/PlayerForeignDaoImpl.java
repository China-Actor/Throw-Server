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
import com.playmore.dbobject.gameserver.PlayerForeign;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeignDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerForeign>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerForeignDaoImpl DEFAULT = new	PlayerForeignDaoImpl();
	public static PlayerForeignDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerForeign createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long playerCardId = rs.getLong("player_card_id");
		java.lang.Long borrowPlayerId = rs.getLong("borrow_player_id");
		java.lang.Integer quality = rs.getInt("quality");
		java.lang.Integer status = rs.getInt("status");
		java.lang.String insertTime = rs.getString("insert_time");
		PlayerForeign instance = new PlayerForeign();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setPlayerCardId(playerCardId);
		instance.setBorrowPlayerId(borrowPlayerId);
		instance.setQuality(quality);
		instance.setStatus(status);
		instance.setInsertTime(insertTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_foreign (`id`,`player_id`,`player_card_id`,`borrow_player_id`,`quality`,`status`,`insert_time`) VALUES(:id,:playerId,:playerCardId,:borrowPlayerId,:quality,:status,:insertTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_foreign SET `player_id`=:playerId,`player_card_id`=:playerCardId,`borrow_player_id`=:borrowPlayerId,`quality`=:quality,`status`=:status,`insert_time`=:insertTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerForeign t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_foreign";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerGift;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerGiftDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerGift>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerGiftDaoImpl DEFAULT = new	PlayerGiftDaoImpl();
	public static PlayerGiftDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerGift createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.String giftCode = rs.getString("gift_code");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.Integer type = rs.getInt("type");
		PlayerGift instance = new PlayerGift();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setGiftCode(giftCode);
		instance.setCreateTime(createTime);
		instance.setType(type);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_gift (`id`,`player_id`,`gift_code`,`create_time`,`type`) VALUES(:id,:playerId,:giftCode,:createTime,:type)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_gift SET `player_id`=:playerId,`gift_code`=:giftCode,`create_time`=:createTime,`type`=:type WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerGift t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_gift";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerForeginAid;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerForeginAidDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerForeginAid>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerForeginAid createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long cardId = rs.getLong("card_id");
		java.lang.Long cardTempId = rs.getLong("card_temp_id");
		java.lang.Integer quality = rs.getInt("quality");
		java.lang.String createTime = rs.getString("create_time");
		PlayerForeginAid instance = new PlayerForeginAid();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setCardId(cardId);
		instance.setCardTempId(cardTempId);
		instance.setQuality(quality);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_foregin_aid (`id`,`player_id`,`card_id`,`card_temp_id`,`quality`,`create_time`) VALUES(:id,:playerId,:cardId,:cardTempId,:quality,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_foregin_aid SET `player_id`=:playerId,`card_id`=:cardId,`card_temp_id`=:cardTempId,`quality`=:quality,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerForeginAid t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_foregin_aid";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

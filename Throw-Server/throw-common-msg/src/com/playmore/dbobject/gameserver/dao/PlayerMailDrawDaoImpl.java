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
import com.playmore.dbobject.gameserver.PlayerMailDraw;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMailDrawDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerMailDraw>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerMailDrawDaoImpl DEFAULT = new	PlayerMailDrawDaoImpl();
	public static PlayerMailDrawDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerMailDraw createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long serverMailId = rs.getLong("server_mail_id");
		java.lang.String createTime = rs.getString("create_time");
		PlayerMailDraw instance = new PlayerMailDraw();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setServerMailId(serverMailId);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_mail_draw (`id`,`player_id`,`server_mail_id`,`create_time`) VALUES(:id,:playerId,:serverMailId,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_mail_draw SET `player_id`=:playerId,`server_mail_id`=:serverMailId,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerMailDraw t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_mail_draw";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerSystemOpen;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSystemOpenDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerSystemOpen>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerSystemOpenDaoImpl DEFAULT = new	PlayerSystemOpenDaoImpl();
	public static PlayerSystemOpenDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerSystemOpen createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer moduleId = rs.getInt("module_id");
		java.lang.Integer openStatus = rs.getInt("open_status");
		java.lang.String createTime = rs.getString("create_time");
		PlayerSystemOpen instance = new PlayerSystemOpen();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setModuleId(moduleId);
		instance.setOpenStatus(openStatus);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_system_open (`id`,`player_id`,`module_id`,`open_status`,`create_time`) VALUES(:id,:playerId,:moduleId,:openStatus,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_system_open SET `player_id`=:playerId,`module_id`=:moduleId,`open_status`=:openStatus,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerSystemOpen t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_system_open";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

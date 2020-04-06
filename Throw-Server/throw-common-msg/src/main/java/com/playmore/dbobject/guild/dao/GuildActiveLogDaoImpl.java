package com.playmore.dbobject.guild.dao;

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
import com.playmore.dbobject.guild.GuildActiveLog;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildActiveLogDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildActiveLog>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildActiveLogDaoImpl DEFAULT = new	GuildActiveLogDaoImpl();
	public static GuildActiveLogDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildActiveLog createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Integer active = rs.getInt("active");
		java.lang.String createTime = rs.getString("create_time");
		GuildActiveLog instance = new GuildActiveLog();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setGuildId(guildId);
		instance.setActive(active);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_active_log (`id`,`player_id`,`guild_id`,`active`,`create_time`) VALUES(:id,:playerId,:guildId,:active,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_active_log SET `player_id`=:playerId,`guild_id`=:guildId,`active`=:active,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(GuildActiveLog t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_active_log";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

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
import com.playmore.dbobject.guild.GuildApply;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildApplyDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildApply>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildApplyDaoImpl DEFAULT = new	GuildApplyDaoImpl();
	public static GuildApplyDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildApply createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.String time = rs.getString("time");
		GuildApply instance = new GuildApply();
		instance.setId(id);
		instance.setGuildId(guildId);
		instance.setPlayerId(playerId);
		instance.setTime(time);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_apply (`id`,`guild_id`,`player_id`,`time`) VALUES(:id,:guildId,:playerId,:time)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_apply SET `guild_id`=:guildId,`player_id`=:playerId,`time`=:time WHERE id=:id";
	}
	protected java.lang.Long getKey(GuildApply t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_apply";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

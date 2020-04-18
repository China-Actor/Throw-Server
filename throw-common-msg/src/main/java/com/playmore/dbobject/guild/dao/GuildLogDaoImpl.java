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
import com.playmore.dbobject.guild.GuildLog;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildLogDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildLog>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildLogDaoImpl DEFAULT = new	GuildLogDaoImpl();
	public static GuildLogDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildLog createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String content = rs.getString("content");
		java.lang.String createTime = rs.getString("create_time");
		GuildLog instance = new GuildLog();
		instance.setId(id);
		instance.setGuildId(guildId);
		instance.setType(type);
		instance.setContent(content);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_log (`id`,`guild_id`,`type`,`content`,`create_time`) VALUES(:id,:guildId,:type,:content,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_log SET `guild_id`=:guildId,`type`=:type,`content`=:content,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(GuildLog t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_log";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

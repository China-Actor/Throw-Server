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
import com.playmore.dbobject.guild.GuildBossHurt;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildBossHurtDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildBossHurt>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildBossHurtDaoImpl DEFAULT = new	GuildBossHurtDaoImpl();
	public static GuildBossHurtDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildBossHurt createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Long hurtHp = rs.getLong("hurt_hp");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String createTime = rs.getString("create_time");
		GuildBossHurt instance = new GuildBossHurt();
		instance.setId(id);
		instance.setGuildId(guildId);
		instance.setPlayerId(playerId);
		instance.setServerId(serverId);
		instance.setHurtHp(hurtHp);
		instance.setType(type);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_boss_hurt (`id`,`guild_id`,`player_id`,`server_id`,`hurt_hp`,`type`,`create_time`) VALUES(:id,:guildId,:playerId,:serverId,:hurtHp,:type,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_boss_hurt SET `guild_id`=:guildId,`player_id`=:playerId,`server_id`=:serverId,`hurt_hp`=:hurtHp,`type`=:type,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(GuildBossHurt t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_boss_hurt";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

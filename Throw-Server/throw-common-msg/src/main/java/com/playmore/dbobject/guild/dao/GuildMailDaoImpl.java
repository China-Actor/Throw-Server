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
import com.playmore.dbobject.guild.GuildMail;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildMailDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildMail>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildMailDaoImpl DEFAULT = new	GuildMailDaoImpl();
	public static GuildMailDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildMail createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer state = rs.getInt("state");
		java.lang.String title = rs.getString("title");
		java.lang.String content = rs.getString("content");
		java.lang.Long sender = rs.getLong("sender");
		java.lang.Integer senderDuty = rs.getInt("sender_duty");
		java.lang.String beginTime = rs.getString("begin_time");
		java.lang.String endTime = rs.getString("end_time");
		GuildMail instance = new GuildMail();
		instance.setId(id);
		instance.setGuildId(guildId);
		instance.setPlayerId(playerId);
		instance.setState(state);
		instance.setTitle(title);
		instance.setContent(content);
		instance.setSender(sender);
		instance.setSenderDuty(senderDuty);
		instance.setBeginTime(beginTime);
		instance.setEndTime(endTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_mail (`id`,`guild_id`,`player_id`,`state`,`title`,`content`,`sender`,`sender_duty`,`begin_time`,`end_time`) VALUES(:id,:guildId,:playerId,:state,:title,:content,:sender,:senderDuty,:beginTime,:endTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_mail SET `guild_id`=:guildId,`player_id`=:playerId,`state`=:state,`title`=:title,`content`=:content,`sender`=:sender,`sender_duty`=:senderDuty,`begin_time`=:beginTime,`end_time`=:endTime WHERE id=:id";
	}
	protected java.lang.Long getKey(GuildMail t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_mail";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

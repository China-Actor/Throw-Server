package com.playmore.dbobject.staticdb.dao;

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
import com.playmore.dbobject.staticdb.GuildRightS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class GuildRightSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildRightS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected GuildRightS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer guildjob = rs.getInt("guildjob");
		java.lang.Integer guildshow = rs.getInt("guildshow");
		java.lang.Integer guildright = rs.getInt("guildright");
		GuildRightS instance = new GuildRightS();
		instance.setId(id);
		instance.setGuildjob(guildjob);
		instance.setGuildshow(guildshow);
		instance.setGuildright(guildright);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_right_s (`id`,`guildjob`,`guildshow`,`guildright`) VALUES(:id,:guildjob,:guildshow,:guildright)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_right_s SET `guildjob`=:guildjob,`guildshow`=:guildshow,`guildright`=:guildright WHERE id=:id";
	}
	protected java.lang.Integer getKey(GuildRightS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_right_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import com.playmore.dbobject.guild.GuildS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildSDaoImpl DEFAULT = new	GuildSDaoImpl();
	public static GuildSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer exp = rs.getInt("exp");
		java.lang.Integer num = rs.getInt("num");
		GuildS instance = new GuildS();
		instance.setId(id);
		instance.setExp(exp);
		instance.setNum(num);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_s (`id`,`exp`,`num`) VALUES(:id,:exp,:num)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_s SET `exp`=:exp,`num`=:num WHERE id=:id";
	}
	protected java.lang.Integer getKey(GuildS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_s";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

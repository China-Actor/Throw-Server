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
import com.playmore.dbobject.staticdb.GuildS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class GuildSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
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
		return DbType.STATIC;
	}
}

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
import com.playmore.dbobject.staticdb.GuildLogTemplate;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class GuildLogTemplateDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildLogTemplate>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected GuildLogTemplate createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String content = rs.getString("content");
		GuildLogTemplate instance = new GuildLogTemplate();
		instance.setId(id);
		instance.setName(name);
		instance.setContent(content);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_log_template (`id`,`name`,`content`) VALUES(:id,:name,:content)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_log_template SET `name`=:name,`content`=:content WHERE id=:id";
	}
	protected java.lang.Integer getKey(GuildLogTemplate t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_log_template";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import com.playmore.dbobject.staticdb.MailS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class MailSDaoImpl extends SinglePrimaryKeyDBDaoImpl<MailS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected MailS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String title = rs.getString("title");
		java.lang.String content = rs.getString("content");
		java.lang.String sendername = rs.getString("sendername");
		java.lang.String awards = rs.getString("awards");
		java.lang.Integer term = rs.getInt("term");
		MailS instance = new MailS();
		instance.setId(id);
		instance.setType(type);
		instance.setTitle(title);
		instance.setContent(content);
		instance.setSendername(sendername);
		instance.setAwards(awards);
		instance.setTerm(term);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO mail_s (`id`,`type`,`title`,`content`,`sendername`,`awards`,`term`) VALUES(:id,:type,:title,:content,:sendername,:awards,:term)";
	}
	protected String getUpdateSql() {
		return "UPDATE mail_s SET `type`=:type,`title`=:title,`content`=:content,`sendername`=:sendername,`awards`=:awards,`term`=:term WHERE id=:id";
	}
	protected java.lang.Integer getKey(MailS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "mail_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

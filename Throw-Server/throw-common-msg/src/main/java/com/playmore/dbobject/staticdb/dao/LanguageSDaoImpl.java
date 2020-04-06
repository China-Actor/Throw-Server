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
import com.playmore.dbobject.staticdb.LanguageS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class LanguageSDaoImpl extends SinglePrimaryKeyDBDaoImpl<LanguageS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected LanguageS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String key = rs.getString("key");
		java.lang.String chinese = rs.getString("chinese");
		java.lang.String japanese = rs.getString("japanese");
		java.lang.Integer english = rs.getInt("english");
		LanguageS instance = new LanguageS();
		instance.setId(id);
		instance.setKey(key);
		instance.setChinese(chinese);
		instance.setJapanese(japanese);
		instance.setEnglish(english);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO language_s (`id`,`key`,`chinese`,`japanese`,`english`) VALUES(:id,:key,:chinese,:japanese,:english)";
	}
	protected String getUpdateSql() {
		return "UPDATE language_s SET `key`=:key,`chinese`=:chinese,`japanese`=:japanese,`english`=:english WHERE id=:id";
	}
	protected java.lang.Integer getKey(LanguageS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "language_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

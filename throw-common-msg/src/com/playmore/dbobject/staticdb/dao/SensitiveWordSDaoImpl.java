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
import com.playmore.dbobject.staticdb.SensitiveWordS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SensitiveWordSDaoImpl extends SinglePrimaryKeyDBDaoImpl<SensitiveWordS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final SensitiveWordSDaoImpl DEFAULT = new	SensitiveWordSDaoImpl();
	public static SensitiveWordSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected SensitiveWordS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String word = rs.getString("word");
		SensitiveWordS instance = new SensitiveWordS();
		instance.setId(id);
		instance.setWord(word);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO sensitive_word_s (`id`,`word`) VALUES(:id,:word)";
	}
	protected String getUpdateSql() {
		return "UPDATE sensitive_word_s SET `word`=:word WHERE id=:id";
	}
	protected java.lang.Integer getKey(SensitiveWordS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "sensitive_word_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

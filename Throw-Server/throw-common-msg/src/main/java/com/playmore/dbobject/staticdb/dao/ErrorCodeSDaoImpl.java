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
import com.playmore.dbobject.staticdb.ErrorCodeS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class ErrorCodeSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ErrorCodeS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected ErrorCodeS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String codeChar = rs.getString("code_char");
		java.lang.String desc = rs.getString("desc");
		ErrorCodeS instance = new ErrorCodeS();
		instance.setId(id);
		instance.setCodeChar(codeChar);
		instance.setDesc(desc);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO error_code_s (`id`,`code_char`,`desc`) VALUES(:id,:codeChar,:desc)";
	}
	protected String getUpdateSql() {
		return "UPDATE error_code_s SET `code_char`=:codeChar,`desc`=:desc WHERE id=:id";
	}
	protected java.lang.Integer getKey(ErrorCodeS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "error_code_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

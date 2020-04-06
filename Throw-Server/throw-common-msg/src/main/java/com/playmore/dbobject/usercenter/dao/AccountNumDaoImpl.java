package com.playmore.dbobject.usercenter.dao;

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
import com.playmore.dbobject.usercenter.AccountNum;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AccountNumDaoImpl extends SinglePrimaryKeyDBDaoImpl<AccountNum>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final AccountNumDaoImpl DEFAULT = new	AccountNumDaoImpl();
	public static AccountNumDaoImpl getDefault() {
		return DEFAULT;
	}
	protected AccountNum createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer num = rs.getInt("num");
		java.lang.String createTime = rs.getString("create_time");
		AccountNum instance = new AccountNum();
		instance.setId(id);
		instance.setNum(num);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO account_num (`id`,`num`,`create_time`) VALUES(:id,:num,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE account_num SET `num`=:num,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Integer getKey(AccountNum t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "account_num";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

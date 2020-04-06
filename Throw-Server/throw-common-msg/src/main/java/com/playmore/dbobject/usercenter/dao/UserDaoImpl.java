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
import com.playmore.dbobject.usercenter.User;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class UserDaoImpl extends SinglePrimaryKeyDBDaoImpl<User>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final UserDaoImpl DEFAULT = new	UserDaoImpl();
	public static UserDaoImpl getDefault() {
		return DEFAULT;
	}
	protected User createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String thirdId = rs.getString("third_id");
		java.lang.String thirdAccount = rs.getString("third_account");
		java.lang.String thirdChannel = rs.getString("third_channel");
		java.lang.String thirdName = rs.getString("third_name");
		java.lang.Integer lastServer = rs.getInt("last_server");
		java.util.Date createTime = rs.getTimestamp("create_time");
		java.util.Date loginTime = rs.getTimestamp("login_time");
		User instance = new User();
		instance.setId(id);
		instance.setThirdId(thirdId);
		instance.setThirdAccount(thirdAccount);
		instance.setThirdChannel(thirdChannel);
		instance.setThirdName(thirdName);
		instance.setLastServer(lastServer);
		instance.setCreateTime(createTime);
		instance.setLoginTime(loginTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO user (`id`,`third_id`,`third_account`,`third_channel`,`third_name`,`last_server`,`create_time`,`login_time`) VALUES(:id,:thirdId,:thirdAccount,:thirdChannel,:thirdName,:lastServer,:createTime,:loginTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE user SET `third_id`=:thirdId,`third_account`=:thirdAccount,`third_channel`=:thirdChannel,`third_name`=:thirdName,`last_server`=:lastServer,`create_time`=:createTime,`login_time`=:loginTime WHERE id=:id";
	}
	protected java.lang.Long getKey(User t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "user";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

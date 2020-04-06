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
import com.playmore.dbobject.usercenter.WhiteList;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class WhiteListDaoImpl extends SinglePrimaryKeyDBDaoImpl<WhiteList>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final WhiteListDaoImpl DEFAULT = new	WhiteListDaoImpl();
	public static WhiteListDaoImpl getDefault() {
		return DEFAULT;
	}
	protected WhiteList createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Long userid = rs.getLong("userid");
		java.lang.Integer serverid = rs.getInt("serverid");
		java.util.Date createTime = rs.getTimestamp("create_time");
		java.lang.String operator = rs.getString("operator");
		WhiteList instance = new WhiteList();
		instance.setId(id);
		instance.setUserid(userid);
		instance.setServerid(serverid);
		instance.setCreateTime(createTime);
		instance.setOperator(operator);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO white_list (`id`,`userid`,`serverid`,`create_time`,`operator`) VALUES(:id,:userid,:serverid,:createTime,:operator)";
	}
	protected String getUpdateSql() {
		return "UPDATE white_list SET `userid`=:userid,`serverid`=:serverid,`create_time`=:createTime,`operator`=:operator WHERE id=:id";
	}
	protected java.lang.Integer getKey(WhiteList t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "white_list";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

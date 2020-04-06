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
import com.playmore.dbobject.usercenter.Ban;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BanDaoImpl extends SinglePrimaryKeyDBDaoImpl<Ban>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final BanDaoImpl DEFAULT = new	BanDaoImpl();
	public static BanDaoImpl getDefault() {
		return DEFAULT;
	}
	protected Ban createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Long userid = rs.getLong("userid");
		java.lang.Long playerid = rs.getLong("playerid");
		java.lang.Integer serverid = rs.getInt("serverid");
		java.lang.Integer banType = rs.getInt("ban_type");
		java.lang.String reason = rs.getString("reason");
		java.lang.String operator = rs.getString("operator");
		java.util.Date unlockDate = rs.getTimestamp("unlock_date");
		java.util.Date operatorDate = rs.getTimestamp("operator_date");
		Ban instance = new Ban();
		instance.setId(id);
		instance.setUserid(userid);
		instance.setPlayerid(playerid);
		instance.setServerid(serverid);
		instance.setBanType(banType);
		instance.setReason(reason);
		instance.setOperator(operator);
		instance.setUnlockDate(unlockDate);
		instance.setOperatorDate(operatorDate);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO ban (`id`,`userid`,`playerid`,`serverid`,`ban_type`,`reason`,`operator`,`unlock_date`,`operator_date`) VALUES(:id,:userid,:playerid,:serverid,:banType,:reason,:operator,:unlockDate,:operatorDate)";
	}
	protected String getUpdateSql() {
		return "UPDATE ban SET `userid`=:userid,`playerid`=:playerid,`serverid`=:serverid,`ban_type`=:banType,`reason`=:reason,`operator`=:operator,`unlock_date`=:unlockDate,`operator_date`=:operatorDate WHERE id=:id";
	}
	protected java.lang.Integer getKey(Ban t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "ban";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

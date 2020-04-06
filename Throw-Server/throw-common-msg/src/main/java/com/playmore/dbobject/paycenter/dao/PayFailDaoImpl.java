package com.playmore.dbobject.paycenter.dao;

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
import com.playmore.dbobject.paycenter.PayFail;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayFailDaoImpl extends SinglePrimaryKeyDBDaoImpl<PayFail>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PayFailDaoImpl DEFAULT = new	PayFailDaoImpl();
	public static PayFailDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PayFail createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String reason = rs.getString("reason");
		java.util.Date createTime = rs.getTimestamp("create_time");
		PayFail instance = new PayFail();
		instance.setId(id);
		instance.setReason(reason);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO pay_fail (`id`,`reason`,`create_time`) VALUES(:id,:reason,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE pay_fail SET `reason`=:reason,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PayFail t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "pay_fail";
	}
	public String getDbType(){
		return DbType.PAY;
	}
}

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
import com.playmore.dbobject.paycenter.PayRecord;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayRecordDaoImpl extends SinglePrimaryKeyDBDaoImpl<PayRecord>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PayRecordDaoImpl DEFAULT = new	PayRecordDaoImpl();
	public static PayRecordDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PayRecord createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Long userId = rs.getLong("user_id");
		java.lang.String orderNo = rs.getString("order_no");
		java.lang.Float amount = rs.getFloat("amount");
		java.lang.Integer status = rs.getInt("status");
		java.lang.String htnonce = rs.getString("htnonce");
		java.lang.String httoken = rs.getString("httoken");
		java.lang.String extinfo = rs.getString("extinfo");
		java.lang.Boolean byBoss = rs.getBoolean("by_boss");
		PayRecord instance = new PayRecord();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setUserId(userId);
		instance.setOrderNo(orderNo);
		instance.setAmount(amount);
		instance.setStatus(status);
		instance.setHtnonce(htnonce);
		instance.setHttoken(httoken);
		instance.setExtinfo(extinfo);
		instance.setByBoss(byBoss);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO pay_record (`id`,`server_id`,`user_id`,`order_no`,`amount`,`status`,`htnonce`,`httoken`,`extinfo`,`by_boss`) VALUES(:id,:serverId,:userId,:orderNo,:amount,:status,:htnonce,:httoken,:extinfo,:byBoss)";
	}
	protected String getUpdateSql() {
		return "UPDATE pay_record SET `server_id`=:serverId,`user_id`=:userId,`order_no`=:orderNo,`amount`=:amount,`status`=:status,`htnonce`=:htnonce,`httoken`=:httoken,`extinfo`=:extinfo,`by_boss`=:byBoss WHERE id=:id";
	}
	protected java.lang.Long getKey(PayRecord t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "pay_record";
	}
	public String getDbType(){
		return DbType.PAY;
	}
}

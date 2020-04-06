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
import com.playmore.dbobject.paycenter.RechargeReturn;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RechargeReturnDaoImpl extends SinglePrimaryKeyDBDaoImpl<RechargeReturn>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final RechargeReturnDaoImpl DEFAULT = new	RechargeReturnDaoImpl();
	public static RechargeReturnDaoImpl getDefault() {
		return DEFAULT;
	}
	protected RechargeReturn createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String account = rs.getString("account");
		java.lang.String thridChannel = rs.getString("thrid_channel");
		java.lang.Integer amount = rs.getInt("amount");
		java.lang.Integer got = rs.getInt("got");
		java.lang.String goods = rs.getString("goods");
		RechargeReturn instance = new RechargeReturn();
		instance.setId(id);
		instance.setAccount(account);
		instance.setThridChannel(thridChannel);
		instance.setAmount(amount);
		instance.setGot(got);
		instance.setGoods(goods);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO recharge_return (`id`,`account`,`thrid_channel`,`amount`,`got`,`goods`) VALUES(:id,:account,:thridChannel,:amount,:got,:goods)";
	}
	protected String getUpdateSql() {
		return "UPDATE recharge_return SET `account`=:account,`thrid_channel`=:thridChannel,`amount`=:amount,`got`=:got,`goods`=:goods WHERE id=:id";
	}
	protected java.lang.Long getKey(RechargeReturn t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "recharge_return";
	}
	public String getDbType(){
		return DbType.PAY;
	}
}

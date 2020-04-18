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
import com.playmore.dbobject.paycenter.PayOk;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayOkDaoImpl extends SinglePrimaryKeyDBDaoImpl<PayOk>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PayOkDaoImpl DEFAULT = new	PayOkDaoImpl();
	public static PayOkDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PayOk createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.util.Date createTime = rs.getTimestamp("create_time");
		PayOk instance = new PayOk();
		instance.setId(id);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO pay_ok (`id`,`create_time`) VALUES(:id,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE pay_ok SET `create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PayOk t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "pay_ok";
	}
	public String getDbType(){
		return DbType.PAY;
	}
}

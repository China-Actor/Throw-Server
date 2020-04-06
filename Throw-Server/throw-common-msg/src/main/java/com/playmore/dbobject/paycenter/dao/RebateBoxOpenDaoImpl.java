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
import com.playmore.dbobject.paycenter.RebateBoxOpen;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RebateBoxOpenDaoImpl extends SinglePrimaryKeyDBDaoImpl<RebateBoxOpen>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final RebateBoxOpenDaoImpl DEFAULT = new	RebateBoxOpenDaoImpl();
	public static RebateBoxOpenDaoImpl getDefault() {
		return DEFAULT;
	}
	protected RebateBoxOpen createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer nun = rs.getInt("nun");
		RebateBoxOpen instance = new RebateBoxOpen();
		instance.setId(id);
		instance.setNun(nun);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO rebate_box_open (`id`,`nun`) VALUES(:id,:nun)";
	}
	protected String getUpdateSql() {
		return "UPDATE rebate_box_open SET `nun`=:nun WHERE id=:id";
	}
	protected java.lang.Integer getKey(RebateBoxOpen t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "rebate_box_open";
	}
	public String getDbType(){
		return DbType.PAY;
	}
}

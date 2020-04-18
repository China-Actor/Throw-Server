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
import com.playmore.dbobject.staticdb.PriceaddS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PriceaddSDaoImpl extends SinglePrimaryKeyDBDaoImpl<PriceaddS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PriceaddSDaoImpl DEFAULT = new	PriceaddSDaoImpl();
	public static PriceaddSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PriceaddS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer pirceId = rs.getInt("pirce_id");
		java.lang.Integer buyCount = rs.getInt("buy_count");
		java.lang.Integer price = rs.getInt("price");
		PriceaddS instance = new PriceaddS();
		instance.setId(id);
		instance.setPirceId(pirceId);
		instance.setBuyCount(buyCount);
		instance.setPrice(price);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO priceadd_s (`id`,`pirce_id`,`buy_count`,`price`) VALUES(:id,:pirceId,:buyCount,:price)";
	}
	protected String getUpdateSql() {
		return "UPDATE priceadd_s SET `pirce_id`=:pirceId,`buy_count`=:buyCount,`price`=:price WHERE id=:id";
	}
	protected java.lang.Integer getKey(PriceaddS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "priceadd_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import com.playmore.dbobject.staticdb.GoodsS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GoodsSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GoodsS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GoodsSDaoImpl DEFAULT = new	GoodsSDaoImpl();
	public static GoodsSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GoodsS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer shopid = rs.getInt("shopid");
		java.lang.Integer location = rs.getInt("location");
		java.lang.Integer weight = rs.getInt("weight");
		java.lang.Integer goodsType = rs.getInt("goods_type");
		java.lang.Integer goodsId = rs.getInt("goods_id");
		java.lang.Integer goodsNum = rs.getInt("goods_num");
		java.lang.Integer costType = rs.getInt("cost_type");
		java.lang.Integer costId = rs.getInt("cost_id");
		java.lang.Integer costNum = rs.getInt("cost_num");
		java.lang.Integer discount = rs.getInt("discount");
		GoodsS instance = new GoodsS();
		instance.setId(id);
		instance.setShopid(shopid);
		instance.setLocation(location);
		instance.setWeight(weight);
		instance.setGoodsType(goodsType);
		instance.setGoodsId(goodsId);
		instance.setGoodsNum(goodsNum);
		instance.setCostType(costType);
		instance.setCostId(costId);
		instance.setCostNum(costNum);
		instance.setDiscount(discount);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO goods_s (`id`,`shopid`,`location`,`weight`,`goods_type`,`goods_id`,`goods_num`,`cost_type`,`cost_id`,`cost_num`,`discount`) VALUES(:id,:shopid,:location,:weight,:goodsType,:goodsId,:goodsNum,:costType,:costId,:costNum,:discount)";
	}
	protected String getUpdateSql() {
		return "UPDATE goods_s SET `shopid`=:shopid,`location`=:location,`weight`=:weight,`goods_type`=:goodsType,`goods_id`=:goodsId,`goods_num`=:goodsNum,`cost_type`=:costType,`cost_id`=:costId,`cost_num`=:costNum,`discount`=:discount WHERE id=:id";
	}
	protected java.lang.Integer getKey(GoodsS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "goods_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

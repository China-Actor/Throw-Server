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
import com.playmore.dbobject.staticdb.ShopS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ShopSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ShopS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ShopSDaoImpl DEFAULT = new	ShopSDaoImpl();
	public static ShopSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ShopS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String name = rs.getString("name");
		java.lang.Integer refreshTime = rs.getInt("refresh_time");
		java.lang.Integer refreshCost = rs.getInt("refresh_cost");
		java.lang.Integer open = rs.getInt("open");
		java.lang.Integer num = rs.getInt("num");
		java.lang.Integer desc = rs.getInt("desc");
		ShopS instance = new ShopS();
		instance.setId(id);
		instance.setType(type);
		instance.setName(name);
		instance.setRefreshTime(refreshTime);
		instance.setRefreshCost(refreshCost);
		instance.setOpen(open);
		instance.setNum(num);
		instance.setDesc(desc);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO shop_s (`id`,`type`,`name`,`refresh_time`,`refresh_cost`,`open`,`num`,`desc`) VALUES(:id,:type,:name,:refreshTime,:refreshCost,:open,:num,:desc)";
	}
	protected String getUpdateSql() {
		return "UPDATE shop_s SET `type`=:type,`name`=:name,`refresh_time`=:refreshTime,`refresh_cost`=:refreshCost,`open`=:open,`num`=:num,`desc`=:desc WHERE id=:id";
	}
	protected java.lang.Integer getKey(ShopS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "shop_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import com.playmore.dbobject.staticdb.SystemS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class SystemSDaoImpl extends SinglePrimaryKeyDBDaoImpl<SystemS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final SystemSDaoImpl DEFAULT = new	SystemSDaoImpl();
	public static SystemSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected SystemS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String tips = rs.getString("tips");
		java.lang.Integer stage = rs.getInt("stage");
		java.lang.Integer vip = rs.getInt("vip");
		java.lang.Integer icon = rs.getInt("icon");
		java.lang.Integer link = rs.getInt("link");
		java.lang.Integer openOrder = rs.getInt("open_order");
		SystemS instance = new SystemS();
		instance.setId(id);
		instance.setName(name);
		instance.setTips(tips);
		instance.setStage(stage);
		instance.setVip(vip);
		instance.setIcon(icon);
		instance.setLink(link);
		instance.setOpenOrder(openOrder);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO system_s (`id`,`name`,`tips`,`stage`,`vip`,`icon`,`link`,`open_order`) VALUES(:id,:name,:tips,:stage,:vip,:icon,:link,:openOrder)";
	}
	protected String getUpdateSql() {
		return "UPDATE system_s SET `name`=:name,`tips`=:tips,`stage`=:stage,`vip`=:vip,`icon`=:icon,`link`=:link,`open_order`=:openOrder WHERE id=:id";
	}
	protected java.lang.Integer getKey(SystemS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "system_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

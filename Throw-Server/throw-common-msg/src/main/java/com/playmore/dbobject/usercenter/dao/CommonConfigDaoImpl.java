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
import com.playmore.dbobject.usercenter.CommonConfig;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CommonConfigDaoImpl extends SinglePrimaryKeyDBDaoImpl<CommonConfig>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final CommonConfigDaoImpl DEFAULT = new	CommonConfigDaoImpl();
	public static CommonConfigDaoImpl getDefault() {
		return DEFAULT;
	}
	protected CommonConfig createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String value = rs.getString("value");
		java.lang.Boolean use = rs.getBoolean("use");
		java.lang.Integer vipLevel = rs.getInt("vip_level");
		java.lang.Integer level = rs.getInt("level");
		java.lang.String channel = rs.getString("channel");
		CommonConfig instance = new CommonConfig();
		instance.setId(id);
		instance.setValue(value);
		instance.setUse(use);
		instance.setVipLevel(vipLevel);
		instance.setLevel(level);
		instance.setChannel(channel);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO common_config (`id`,`value`,`use`,`vip_level`,`level`,`channel`) VALUES(:id,:value,:use,:vipLevel,:level,:channel)";
	}
	protected String getUpdateSql() {
		return "UPDATE common_config SET `value`=:value,`use`=:use,`vip_level`=:vipLevel,`level`=:level,`channel`=:channel WHERE id=:id";
	}
	protected java.lang.Integer getKey(CommonConfig t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "common_config";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

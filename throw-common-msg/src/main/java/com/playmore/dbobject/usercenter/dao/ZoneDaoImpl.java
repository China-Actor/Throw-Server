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
import com.playmore.dbobject.usercenter.Zone;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ZoneDaoImpl extends SinglePrimaryKeyDBDaoImpl<Zone>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ZoneDaoImpl DEFAULT = new	ZoneDaoImpl();
	public static ZoneDaoImpl getDefault() {
		return DEFAULT;
	}
	protected Zone createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String serverids = rs.getString("serverids");
		java.lang.String thirdChannel = rs.getString("third_channel");
		Zone instance = new Zone();
		instance.setId(id);
		instance.setName(name);
		instance.setServerids(serverids);
		instance.setThirdChannel(thirdChannel);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO zone (`id`,`name`,`serverids`,`third_channel`) VALUES(:id,:name,:serverids,:thirdChannel)";
	}
	protected String getUpdateSql() {
		return "UPDATE zone SET `name`=:name,`serverids`=:serverids,`third_channel`=:thirdChannel WHERE id=:id";
	}
	protected java.lang.Integer getKey(Zone t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "zone";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

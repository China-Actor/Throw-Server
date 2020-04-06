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
import com.playmore.dbobject.usercenter.CommonConfigServer;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CommonConfigServerDaoImpl extends SinglePrimaryKeyDBDaoImpl<CommonConfigServer>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final CommonConfigServerDaoImpl DEFAULT = new	CommonConfigServerDaoImpl();
	public static CommonConfigServerDaoImpl getDefault() {
		return DEFAULT;
	}
	protected CommonConfigServer createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Integer commonConfigId = rs.getInt("common_config_id");
		CommonConfigServer instance = new CommonConfigServer();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setCommonConfigId(commonConfigId);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO common_config_server (`id`,`server_id`,`common_config_id`) VALUES(:id,:serverId,:commonConfigId)";
	}
	protected String getUpdateSql() {
		return "UPDATE common_config_server SET `server_id`=:serverId,`common_config_id`=:commonConfigId WHERE id=:id";
	}
	protected java.lang.Integer getKey(CommonConfigServer t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "common_config_server";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

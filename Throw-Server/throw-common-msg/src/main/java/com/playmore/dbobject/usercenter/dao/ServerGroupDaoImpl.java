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
import com.playmore.dbobject.usercenter.ServerGroup;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerGroupDaoImpl extends SinglePrimaryKeyDBDaoImpl<ServerGroup>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ServerGroupDaoImpl DEFAULT = new	ServerGroupDaoImpl();
	public static ServerGroupDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ServerGroup createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String serverId = rs.getString("server_id");
		java.lang.String create = rs.getString("create");
		ServerGroup instance = new ServerGroup();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setCreate(create);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO server_group (`id`,`server_id`,`create`) VALUES(:id,:serverId,:create)";
	}
	protected String getUpdateSql() {
		return "UPDATE server_group SET `server_id`=:serverId,`create`=:create WHERE id=:id";
	}
	protected java.lang.Integer getKey(ServerGroup t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "server_group";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

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
import com.playmore.dbobject.usercenter.ServerInfo;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerInfoDaoImpl extends SinglePrimaryKeyDBDaoImpl<ServerInfo>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ServerInfoDaoImpl DEFAULT = new	ServerInfoDaoImpl();
	public static ServerInfoDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ServerInfo createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String serverName = rs.getString("server_name");
		java.lang.Integer status = rs.getInt("status");
		java.lang.Integer mark = rs.getInt("mark");
		java.util.Date createTime = rs.getTimestamp("create_time");
		java.util.Date openTime = rs.getTimestamp("open_time");
		java.lang.String minVersion = rs.getString("min_version");
		java.lang.String maxVersion = rs.getString("max_version");
		java.lang.Integer system = rs.getInt("system");
		java.lang.Integer maxOnline = rs.getInt("max_online");
		java.lang.Integer adviseOnline = rs.getInt("advise_online");
		java.lang.Integer crossServer = rs.getInt("cross_server");
		java.lang.Integer maxRegister = rs.getInt("max_register");
		ServerInfo instance = new ServerInfo();
		instance.setId(id);
		instance.setName(name);
		instance.setServerName(serverName);
		instance.setStatus(status);
		instance.setMark(mark);
		instance.setCreateTime(createTime);
		instance.setOpenTime(openTime);
		instance.setMinVersion(minVersion);
		instance.setMaxVersion(maxVersion);
		instance.setSystem(system);
		instance.setMaxOnline(maxOnline);
		instance.setAdviseOnline(adviseOnline);
		instance.setCrossServer(crossServer);
		instance.setMaxRegister(maxRegister);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO server_info (`id`,`name`,`server_name`,`status`,`mark`,`create_time`,`open_time`,`min_version`,`max_version`,`system`,`max_online`,`advise_online`,`cross_server`,`max_register`) VALUES(:id,:name,:serverName,:status,:mark,:createTime,:openTime,:minVersion,:maxVersion,:system,:maxOnline,:adviseOnline,:crossServer,:maxRegister)";
	}
	protected String getUpdateSql() {
		return "UPDATE server_info SET `name`=:name,`server_name`=:serverName,`status`=:status,`mark`=:mark,`create_time`=:createTime,`open_time`=:openTime,`min_version`=:minVersion,`max_version`=:maxVersion,`system`=:system,`max_online`=:maxOnline,`advise_online`=:adviseOnline,`cross_server`=:crossServer,`max_register`=:maxRegister WHERE id=:id";
	}
	protected java.lang.Integer getKey(ServerInfo t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "server_info";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

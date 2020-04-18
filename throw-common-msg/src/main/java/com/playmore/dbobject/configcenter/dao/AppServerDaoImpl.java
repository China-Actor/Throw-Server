package com.playmore.dbobject.configcenter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.dbobject.configcenter.AppServer;
import com.playmore.xysword.enumtype.DbType;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AppServerDaoImpl extends SinglePrimaryKeyDBDaoImpl<AppServer>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final AppServerDaoImpl DEFAULT = new	AppServerDaoImpl();
	public static AppServerDaoImpl getDefault() {
		return DEFAULT;
	}
	protected AppServer createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer appid = rs.getInt("appid");
		java.lang.String ip = rs.getString("ip");
		java.lang.String internetip = rs.getString("internetip");
		java.lang.String serverAccount = rs.getString("server_account");
		java.lang.String serverPsw = rs.getString("server_psw");
		java.lang.Integer serverPort = rs.getInt("server_port");
		java.lang.String path = rs.getString("path");
		java.lang.Integer httpport = rs.getInt("httpport");
		java.lang.Integer guildport = rs.getInt("guildport");
		java.lang.String dbip = rs.getString("dbip");
		java.lang.String dbport = rs.getString("dbport");
		java.lang.String dbname = rs.getString("dbname");
		java.lang.String dbaccount = rs.getString("dbaccount");
		java.lang.String dbpsw = rs.getString("dbpsw");
		java.lang.Long configserverid = rs.getLong("configserverid");
		AppServer instance = new AppServer();
		instance.setId(id);
		instance.setAppid(appid);
		instance.setIp(ip);
		instance.setInternetip(internetip);
		instance.setServerAccount(serverAccount);
		instance.setServerPsw(serverPsw);
		instance.setServerPort(serverPort);
		instance.setPath(path);
		instance.setHttpport(httpport);
		instance.setGuildport(guildport);
		instance.setDbip(dbip);
		instance.setDbport(dbport);
		instance.setDbname(dbname);
		instance.setDbaccount(dbaccount);
		instance.setDbpsw(dbpsw);
		instance.setConfigserverid(configserverid);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO app_server (`id`,`appid`,`ip`,`internetip`,`server_account`,`server_psw`,`server_port`,`path`,`httpport`,`guildport`,`dbip`,`dbport`,`dbname`,`dbaccount`,`dbpsw`,`configserverid`) VALUES(:id,:appid,:ip,:internetip,:serverAccount,:serverPsw,:serverPort,:path,:httpport,:guildport,:dbip,:dbport,:dbname,:dbaccount,:dbpsw,:configserverid)";
	}
	protected String getUpdateSql() {
		return "UPDATE app_server SET `appid`=:appid,`ip`=:ip,`internetip`=:internetip,`server_account`=:serverAccount,`server_psw`=:serverPsw,`server_port`=:serverPort,`path`=:path,`httpport`=:httpport,`guildport`=:guildport,`dbip`=:dbip,`dbport`=:dbport,`dbname`=:dbname,`dbaccount`=:dbaccount,`dbpsw`=:dbpsw,`configserverid`=:configserverid WHERE id=:id";
	}
	protected java.lang.Integer getKey(AppServer t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "app_server";
	}
	public String getDbType(){
		return DbType.CONFIG_CENTER;
	}
}

package com.playmore.dbobject.configcenter.dao;

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
import com.playmore.dbobject.configcenter.GameServer;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GameServerDaoImpl extends SinglePrimaryKeyDBDaoImpl<GameServer>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GameServerDaoImpl DEFAULT = new	GameServerDaoImpl();
	public static GameServerDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GameServer createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer status = rs.getInt("status");
		java.lang.String ip = rs.getString("ip");
		java.lang.String internetip = rs.getString("internetip");
		java.lang.String serverAccount = rs.getString("server_account");
		java.lang.String serverPsw = rs.getString("server_psw");
		java.lang.Integer serverPort = rs.getInt("server_port");
		java.lang.Integer port = rs.getInt("port");
		java.lang.Integer crossPort = rs.getInt("cross_port");
		java.lang.Integer crossClientPort = rs.getInt("cross_client_port");
		java.lang.String path = rs.getString("path");
		java.lang.Integer httpport = rs.getInt("httpport");
		java.lang.String jdkPath = rs.getString("jdk_path");
		java.lang.Integer max = rs.getInt("max");
		java.lang.String dbip = rs.getString("dbip");
		java.lang.String dbport = rs.getString("dbport");
		java.lang.String dbname = rs.getString("dbname");
		java.lang.String dbaccount = rs.getString("dbaccount");
		java.lang.String dbpsw = rs.getString("dbpsw");
		java.lang.String staticdbip = rs.getString("staticdbip");
		java.lang.String staticdbport = rs.getString("staticdbport");
		java.lang.String staticdbname = rs.getString("staticdbname");
		java.lang.String staticdbaccount = rs.getString("staticdbaccount");
		java.lang.String staticdbpsw = rs.getString("staticdbpsw");
		java.lang.String logdbip = rs.getString("logdbip");
		java.lang.String logdbport = rs.getString("logdbport");
		java.lang.String logdbname = rs.getString("logdbname");
		java.lang.String logdbaccount = rs.getString("logdbaccount");
		java.lang.String logdbpsw = rs.getString("logdbpsw");
		java.lang.Boolean isLinuxOs = rs.getBoolean("is_linux_os");
		java.lang.String guilddbip = rs.getString("guilddbip");
		java.lang.String guilddbport = rs.getString("guilddbport");
		java.lang.String guilddbname = rs.getString("guilddbname");
		java.lang.String guilddbaccount = rs.getString("guilddbaccount");
		java.lang.String guilddbpsw = rs.getString("guilddbpsw");
		GameServer instance = new GameServer();
		instance.setId(id);
		instance.setStatus(status);
		instance.setIp(ip);
		instance.setInternetip(internetip);
		instance.setServerAccount(serverAccount);
		instance.setServerPsw(serverPsw);
		instance.setServerPort(serverPort);
		instance.setPort(port);
		instance.setCrossPort(crossPort);
		instance.setCrossClientPort(crossClientPort);
		instance.setPath(path);
		instance.setHttpport(httpport);
		instance.setJdkPath(jdkPath);
		instance.setMax(max);
		instance.setDbip(dbip);
		instance.setDbport(dbport);
		instance.setDbname(dbname);
		instance.setDbaccount(dbaccount);
		instance.setDbpsw(dbpsw);
		instance.setStaticdbip(staticdbip);
		instance.setStaticdbport(staticdbport);
		instance.setStaticdbname(staticdbname);
		instance.setStaticdbaccount(staticdbaccount);
		instance.setStaticdbpsw(staticdbpsw);
		instance.setLogdbip(logdbip);
		instance.setLogdbport(logdbport);
		instance.setLogdbname(logdbname);
		instance.setLogdbaccount(logdbaccount);
		instance.setLogdbpsw(logdbpsw);
		instance.setIsLinuxOs(isLinuxOs);
		instance.setGuilddbip(guilddbip);
		instance.setGuilddbport(guilddbport);
		instance.setGuilddbname(guilddbname);
		instance.setGuilddbaccount(guilddbaccount);
		instance.setGuilddbpsw(guilddbpsw);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO game_server (`id`,`status`,`ip`,`internetip`,`server_account`,`server_psw`,`server_port`,`port`,`cross_port`,`cross_client_port`,`path`,`httpport`,`jdk_path`,`max`,`dbip`,`dbport`,`dbname`,`dbaccount`,`dbpsw`,`staticdbip`,`staticdbport`,`staticdbname`,`staticdbaccount`,`staticdbpsw`,`logdbip`,`logdbport`,`logdbname`,`logdbaccount`,`logdbpsw`,`is_linux_os`,`guilddbip`,`guilddbport`,`guilddbname`,`guilddbaccount`,`guilddbpsw`) VALUES(:id,:status,:ip,:internetip,:serverAccount,:serverPsw,:serverPort,:port,:crossPort,:crossClientPort,:path,:httpport,:jdkPath,:max,:dbip,:dbport,:dbname,:dbaccount,:dbpsw,:staticdbip,:staticdbport,:staticdbname,:staticdbaccount,:staticdbpsw,:logdbip,:logdbport,:logdbname,:logdbaccount,:logdbpsw,:isLinuxOs,:guilddbip,:guilddbport,:guilddbname,:guilddbaccount,:guilddbpsw)";
	}
	protected String getUpdateSql() {
		return "UPDATE game_server SET `status`=:status,`ip`=:ip,`internetip`=:internetip,`server_account`=:serverAccount,`server_psw`=:serverPsw,`server_port`=:serverPort,`port`=:port,`cross_port`=:crossPort,`cross_client_port`=:crossClientPort,`path`=:path,`httpport`=:httpport,`jdk_path`=:jdkPath,`max`=:max,`dbip`=:dbip,`dbport`=:dbport,`dbname`=:dbname,`dbaccount`=:dbaccount,`dbpsw`=:dbpsw,`staticdbip`=:staticdbip,`staticdbport`=:staticdbport,`staticdbname`=:staticdbname,`staticdbaccount`=:staticdbaccount,`staticdbpsw`=:staticdbpsw,`logdbip`=:logdbip,`logdbport`=:logdbport,`logdbname`=:logdbname,`logdbaccount`=:logdbaccount,`logdbpsw`=:logdbpsw,`is_linux_os`=:isLinuxOs,`guilddbip`=:guilddbip,`guilddbport`=:guilddbport,`guilddbname`=:guilddbname,`guilddbaccount`=:guilddbaccount,`guilddbpsw`=:guilddbpsw WHERE id=:id";
	}
	protected java.lang.Integer getKey(GameServer t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "game_server";
	}
	public String getDbType(){
		return DbType.CONFIG_CENTER;
	}
}

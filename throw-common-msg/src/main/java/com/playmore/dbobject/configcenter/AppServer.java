package com.playmore.dbobject.configcenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AppServer implements Serializable {

	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="应用id", externalKey="AppType", isNullable="columnNoNulls")
	private int appid;
	@DBFieldName(fieldName="内网ip", isNullable="columnNoNulls")
	private String ip;
	@DBFieldName(fieldName="外网ip", isNullable="columnNoNulls")
	private String internetip;
	@DBFieldName(fieldName="服务器账号", isNullable="columnNoNulls")
	private String serverAccount;
	@DBFieldName(fieldName="服务器密码", isNullable="columnNoNulls")
	private String serverPsw;
	@DBFieldName(fieldName="服务器登陆端口", isNullable="columnNoNulls")
	private int serverPort;
	@DBFieldName(fieldName="程序所在路径", isNullable="columnNoNulls")
	private String path;
	@DBFieldName(fieldName="http端口", isNullable="columnNoNulls")
	private int httpport;
	@DBFieldName(fieldName="公会端口", isNullable="columnNullable")
	private int guildport;
	@DBFieldName(fieldName="数据库ip", isNullable="columnNoNulls")
	private String dbip;
	@DBFieldName(fieldName="数据库端口", isNullable="columnNoNulls")
	private String dbport;
	@DBFieldName(fieldName="数据库名", isNullable="columnNoNulls")
	private String dbname;
	@DBFieldName(fieldName="数据库账号", isNullable="columnNoNulls")
	private String dbaccount;
	@DBFieldName(fieldName="数据库密码", isNullable="columnNoNulls")
	private String dbpsw;
	@DBFieldName(fieldName="配置服务器id", isNullable="columnNoNulls")
	private long configserverid;

	public AppServer(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setAppid(int appid) {
		this.appid=appid;
	}

	public int getAppid() {
		return appid;
	}

	public void setIp(String ip) {
		this.ip=ip;
	}

	public String getIp() {
		return ip;
	}

	public void setInternetip(String internetip) {
		this.internetip=internetip;
	}

	public String getInternetip() {
		return internetip;
	}

	public void setServerAccount(String serverAccount) {
		this.serverAccount=serverAccount;
	}

	public String getServerAccount() {
		return serverAccount;
	}

	public void setServerPsw(String serverPsw) {
		this.serverPsw=serverPsw;
	}

	public String getServerPsw() {
		return serverPsw;
	}

	public void setServerPort(int serverPort) {
		this.serverPort=serverPort;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setPath(String path) {
		this.path=path;
	}

	public String getPath() {
		return path;
	}

	public void setHttpport(int httpport) {
		this.httpport=httpport;
	}

	public int getHttpport() {
		return httpport;
	}

	public void setGuildport(int guildport) {
		this.guildport=guildport;
	}

	public int getGuildport() {
		return guildport;
	}

	public void setDbip(String dbip) {
		this.dbip=dbip;
	}

	public String getDbip() {
		return dbip;
	}

	public void setDbport(String dbport) {
		this.dbport=dbport;
	}

	public String getDbport() {
		return dbport;
	}

	public void setDbname(String dbname) {
		this.dbname=dbname;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbaccount(String dbaccount) {
		this.dbaccount=dbaccount;
	}

	public String getDbaccount() {
		return dbaccount;
	}

	public void setDbpsw(String dbpsw) {
		this.dbpsw=dbpsw;
	}

	public String getDbpsw() {
		return dbpsw;
	}

	public void setConfigserverid(long configserverid) {
		this.configserverid=configserverid;
	}

	public long getConfigserverid() {
		return configserverid;
	}

	public String toString() {
		return "AppServer [id=" + id + " ,appid=" + appid + " ,ip=" + ip + " ,internetip=" + internetip + " ,serverAccount=" + serverAccount + " ,serverPsw=" + serverPsw + " ,serverPort=" + serverPort + " ,path=" + path + " ,httpport=" + httpport + " ,guildport=" + guildport + " ,dbip=" + dbip + " ,dbport=" + dbport + " ,dbname=" + dbname + " ,dbaccount=" + dbaccount + " ,dbpsw=" + dbpsw + " ,configserverid=" + configserverid+ "]";
	}
}

package com.playmore.dbobject.configcenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GameServer implements Serializable {

	@DBFieldName(fieldName="服务器id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="合服状态", externalKey="MergeStatusType", isNullable="columnNoNulls")
	private int status;
	@DBFieldName(fieldName="内网ip", isNullable="columnNoNulls")
	private String ip;
	@DBFieldName(fieldName="外网IP", isNullable="columnNoNulls")
	private String internetip;
	@DBFieldName(fieldName="服务器账号", isNullable="columnNoNulls")
	private String serverAccount;
	@DBFieldName(fieldName="服务器密码", isNullable="columnNoNulls")
	private String serverPsw;
	@DBFieldName(fieldName="服务器登陆端口", isNullable="columnNoNulls")
	private int serverPort;
	@DBFieldName(fieldName="netty端口", isNullable="columnNoNulls")
	private int port;
	@DBFieldName(fieldName="跨服服务器端口", isNullable="columnNoNulls")
	private int crossPort;
	@DBFieldName(fieldName="跨服客户端端口", isNullable="columnNoNulls")
	private int crossClientPort;
	@DBFieldName(fieldName="程序所在路径", isNullable="columnNoNulls")
	private String path;
	@DBFieldName(fieldName="http端口", isNullable="columnNoNulls")
	private int httpport;
	@DBFieldName(fieldName="Jdk安装路径", isNullable="columnNoNulls")
	private String jdkPath;
	@DBFieldName(fieldName="最大在线", isNullable="columnNoNulls")
	private int max;
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
	@DBFieldName(fieldName="配置数据库ip", isNullable="columnNoNulls")
	private String staticdbip;
	@DBFieldName(fieldName="配置数据库端口", isNullable="columnNoNulls")
	private String staticdbport;
	@DBFieldName(fieldName="配置数据库名", isNullable="columnNoNulls")
	private String staticdbname;
	@DBFieldName(fieldName="策划配置数据库账号", isNullable="columnNoNulls")
	private String staticdbaccount;
	@DBFieldName(fieldName="配置数据库密码", isNullable="columnNoNulls")
	private String staticdbpsw;
	@DBFieldName(fieldName="日志数据库ip", isNullable="columnNoNulls")
	private String logdbip;
	@DBFieldName(fieldName="日志数据库端口", isNullable="columnNoNulls")
	private String logdbport;
	@DBFieldName(fieldName="日志数据库名", isNullable="columnNoNulls")
	private String logdbname;
	@DBFieldName(fieldName="日志数据库账号", isNullable="columnNoNulls")
	private String logdbaccount;
	@DBFieldName(fieldName="日志数据库密码", isNullable="columnNoNulls")
	private String logdbpsw;
	@DBFieldName(fieldName="是否linux操作系统", isNullable="columnNoNulls")
	private boolean isLinuxOs;
	@DBFieldName(fieldName="公会数据库ip", isNullable="columnNoNulls")
	private String guilddbip;
	@DBFieldName(fieldName="公会数据库端口", isNullable="columnNoNulls")
	private String guilddbport;
	@DBFieldName(fieldName="公会数据库名", isNullable="columnNoNulls")
	private String guilddbname;
	@DBFieldName(fieldName="公会数据库账号", isNullable="columnNoNulls")
	private String guilddbaccount;
	@DBFieldName(fieldName="公会数据库密码", isNullable="columnNoNulls")
	private String guilddbpsw;

	public GameServer(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return status;
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

	public void setPort(int port) {
		this.port=port;
	}

	public int getPort() {
		return port;
	}

	public void setCrossPort(int crossPort) {
		this.crossPort=crossPort;
	}

	public int getCrossPort() {
		return crossPort;
	}

	public void setCrossClientPort(int crossClientPort) {
		this.crossClientPort=crossClientPort;
	}

	public int getCrossClientPort() {
		return crossClientPort;
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

	public void setJdkPath(String jdkPath) {
		this.jdkPath=jdkPath;
	}

	public String getJdkPath() {
		return jdkPath;
	}

	public void setMax(int max) {
		this.max=max;
	}

	public int getMax() {
		return max;
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

	public void setStaticdbip(String staticdbip) {
		this.staticdbip=staticdbip;
	}

	public String getStaticdbip() {
		return staticdbip;
	}

	public void setStaticdbport(String staticdbport) {
		this.staticdbport=staticdbport;
	}

	public String getStaticdbport() {
		return staticdbport;
	}

	public void setStaticdbname(String staticdbname) {
		this.staticdbname=staticdbname;
	}

	public String getStaticdbname() {
		return staticdbname;
	}

	public void setStaticdbaccount(String staticdbaccount) {
		this.staticdbaccount=staticdbaccount;
	}

	public String getStaticdbaccount() {
		return staticdbaccount;
	}

	public void setStaticdbpsw(String staticdbpsw) {
		this.staticdbpsw=staticdbpsw;
	}

	public String getStaticdbpsw() {
		return staticdbpsw;
	}

	public void setLogdbip(String logdbip) {
		this.logdbip=logdbip;
	}

	public String getLogdbip() {
		return logdbip;
	}

	public void setLogdbport(String logdbport) {
		this.logdbport=logdbport;
	}

	public String getLogdbport() {
		return logdbport;
	}

	public void setLogdbname(String logdbname) {
		this.logdbname=logdbname;
	}

	public String getLogdbname() {
		return logdbname;
	}

	public void setLogdbaccount(String logdbaccount) {
		this.logdbaccount=logdbaccount;
	}

	public String getLogdbaccount() {
		return logdbaccount;
	}

	public void setLogdbpsw(String logdbpsw) {
		this.logdbpsw=logdbpsw;
	}

	public String getLogdbpsw() {
		return logdbpsw;
	}

	public void setIsLinuxOs(boolean isLinuxOs) {
		this.isLinuxOs=isLinuxOs;
	}

	public boolean getIsLinuxOs() {
		return isLinuxOs;
	}

	public void setGuilddbip(String guilddbip) {
		this.guilddbip=guilddbip;
	}

	public String getGuilddbip() {
		return guilddbip;
	}

	public void setGuilddbport(String guilddbport) {
		this.guilddbport=guilddbport;
	}

	public String getGuilddbport() {
		return guilddbport;
	}

	public void setGuilddbname(String guilddbname) {
		this.guilddbname=guilddbname;
	}

	public String getGuilddbname() {
		return guilddbname;
	}

	public void setGuilddbaccount(String guilddbaccount) {
		this.guilddbaccount=guilddbaccount;
	}

	public String getGuilddbaccount() {
		return guilddbaccount;
	}

	public void setGuilddbpsw(String guilddbpsw) {
		this.guilddbpsw=guilddbpsw;
	}

	public String getGuilddbpsw() {
		return guilddbpsw;
	}

	public String toString() {
		return "GameServer [id=" + id + " ,status=" + status + " ,ip=" + ip + " ,internetip=" + internetip + " ,serverAccount=" + serverAccount + " ,serverPsw=" + serverPsw + " ,serverPort=" + serverPort + " ,port=" + port + " ,crossPort=" + crossPort + " ,crossClientPort=" + crossClientPort + " ,path=" + path + " ,httpport=" + httpport + " ,jdkPath=" + jdkPath + " ,max=" + max + " ,dbip=" + dbip + " ,dbport=" + dbport + " ,dbname=" + dbname + " ,dbaccount=" + dbaccount + " ,dbpsw=" + dbpsw + " ,staticdbip=" + staticdbip + " ,staticdbport=" + staticdbport + " ,staticdbname=" + staticdbname + " ,staticdbaccount=" + staticdbaccount + " ,staticdbpsw=" + staticdbpsw + " ,logdbip=" + logdbip + " ,logdbport=" + logdbport + " ,logdbname=" + logdbname + " ,logdbaccount=" + logdbaccount + " ,logdbpsw=" + logdbpsw + " ,isLinuxOs=" + isLinuxOs + " ,guilddbip=" + guilddbip + " ,guilddbport=" + guilddbport + " ,guilddbname=" + guilddbname + " ,guilddbaccount=" + guilddbaccount + " ,guilddbpsw=" + guilddbpsw+ "]";
	}
}

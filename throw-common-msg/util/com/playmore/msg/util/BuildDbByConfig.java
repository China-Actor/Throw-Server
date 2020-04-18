package com.playmore.msg.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.playmore.database.datasource.Bonecp;
import com.playmore.database.datasource.Db;
import com.playmore.dbobject.configcenter.AppServer;
import com.playmore.dbobject.configcenter.DbConfig;
import com.playmore.dbobject.configcenter.GameServer;

public class BuildDbByConfig {
	
	static Logger logger = LoggerFactory.getLogger(BuildDbByConfig.class);
	
	private static Db BuildDb(String properties,String dbIp, String dbPort, String dbName,String dbAccount, String dbPsw){
		
		Bonecp dataSource = new Bonecp(properties);
		
		String jdbcUrl = dataSource.getJdbcUrl();
		
		//替换ip
		String newJdbcUrl = new String(jdbcUrl);
		String regex = "([0-9]{1,3}[.]){3}[0-9]{1,3}";
	    Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(newJdbcUrl);     
	    while (matcher.find()) { 
	      String temp = newJdbcUrl.substring(matcher.start(),matcher.end());
	      newJdbcUrl = newJdbcUrl.replaceAll(temp, dbIp);
	    }  
	    
	    regex = ":[0-9]{1,4}/";
	    pat = Pattern.compile(regex);  
	    matcher = pat.matcher(newJdbcUrl);     
	    while (matcher.find()) { 
	      String temp = newJdbcUrl.substring(matcher.start(),matcher.end());
	      newJdbcUrl = newJdbcUrl.replaceAll(temp, ":"+dbPort+"/");
	    }  
	    
	    regex = "/([a-zA-Z]){1,}/?";
	    pat = Pattern.compile(regex);  
	    matcher = pat.matcher(newJdbcUrl);     
	    while (matcher.find()) { 
	      String temp = newJdbcUrl.substring(matcher.start(),matcher.end());
	      newJdbcUrl = newJdbcUrl.replaceAll(temp, "/"+dbName);
	    } 
	    dataSource.setJdbcUrl(newJdbcUrl);
		dataSource.setUser(dbAccount);
		dataSource.setPassword(dbPsw);
		
		return dataSource;	
		
	}
	
	private static Db BuildDBConfig(Bonecp db, DbConfig config){
		if(config!=null){
			db.setIdleConnectionTestPeriodInMinutes(config.getIdleConnectionTestPeriodInMinutes());
			db.setIdleMaxAgeInSeconds(config.getIdleMaxAgeInSeconds());
			db.setMaxConnectionsPerPartition(config.getMaxConnectionsPerPartition());
			db.setMinConnectionsPerPartition(config.getMinConnectionsPerPartition());
			db.setPartitionCount(config.getPartitionCount());
			db.setAcquireIncrement(config.getAcquireIncrement());
			db.setStatementsCacheSize(config.getStatementsCacheSize());
		}
		logger.info("config==null:"+(config==null));
		logger.info("IdleConnectionTestPeriodInMinutes="+db.getIdleConnectionTestPeriodInMinutes());
		logger.info("IdleMaxAgeInSeconds="+db.getIdleMaxAgeInSeconds());
		logger.info("MaxConnectionsPerPartition="+db.getMaxConnectionsPerPartition());
		logger.info("MinConnectionsPerPartition="+db.getMinConnectionsPerPartition());
		logger.info("PartitionCount="+db.getPartitionCount());
		logger.info("AcquireIncrement="+db.getAcquireIncrement());
		logger.info("StatementsCacheSize="+db.getStatementsCacheSize());
		return db;
	}
	
	public static Db BuildDbByGameServer(String properties, GameServer gameServer, DbConfig config){
		
		Bonecp db = (Bonecp)BuildDb(properties, gameServer.getDbip(),
				gameServer.getDbport(), gameServer.getDbname(),
				gameServer.getDbaccount(), gameServer.getDbpsw());	
		return BuildDBConfig(db,config);
	}
	
	public static Db BuildStaticDbByGameServer(String properties, GameServer gameServer){
		Bonecp db = (Bonecp)BuildDb(properties, gameServer.getStaticdbip(),
				gameServer.getStaticdbport(), gameServer.getStaticdbname(),
				gameServer.getStaticdbaccount(), gameServer.getStaticdbpsw());	
		return BuildDBConfig(db,null);
	}
	
	public static Db BuildGuildDbByGameServer(String properties, GameServer gameServer){
		Bonecp db = (Bonecp)BuildDb(properties, gameServer.getGuilddbip(),
				gameServer.getGuilddbport(), gameServer.getGuilddbname(),
				gameServer.getGuilddbaccount(), gameServer.getGuilddbpsw());	
		return BuildDBConfig(db,null);
	}
	
	public static Db BuildLogDbByGameServer(String properties, GameServer gameServer, DbConfig config){
		
		Bonecp db = (Bonecp)BuildDb(properties, gameServer.getLogdbip(),
				gameServer.getLogdbport(), gameServer.getLogdbname(),
				gameServer.getLogdbaccount(), gameServer.getLogdbpsw());	
		return BuildDBConfig(db,config);
	}
	
	public static Db BuildDbByAppServer(String properties, AppServer gameServer, DbConfig config){
		
		Bonecp db =  (Bonecp)BuildDb(properties, gameServer.getDbip(),
				gameServer.getDbport(), gameServer.getDbname(),
				gameServer.getDbaccount(), gameServer.getDbpsw());	
		return BuildDBConfig(db,config);
	}
	
	
}

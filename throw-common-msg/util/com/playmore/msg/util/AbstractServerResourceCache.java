package com.playmore.msg.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.playmore.dbobject.configcenter.AppServer;
import com.playmore.dbobject.configcenter.DbConfig;
import com.playmore.dbobject.configcenter.GameServer;
import com.playmore.dbobject.configcenter.GameServerMerge;
import com.playmore.dbobject.usercenter.ServerChannel;
import com.playmore.dbobject.usercenter.ServerGroup;
import com.playmore.dbobject.usercenter.ServerInfo;
import com.playmore.dbobject.usercenter.Zone;
import com.playmore.msg.ConfigServerCmdConstant;
import com.playmore.msg.x2config.ServerQueryByID;
import com.playmore.util.StringUtil;

public abstract class AbstractServerResourceCache{
	
	
	//KEY为 serverid VALUE为zoneid
	/*static Map<Integer,Integer> serverZoneMap = new HashMap<Integer,Integer>();
	
	static Map<Integer,GameServer> gameServerMap = new HashMap<Integer,GameServer>();
	
	static Map<Integer, GameServerMerge> gameServerMergeMap = new HashMap<Integer, GameServerMerge>();
	
	static Map<Integer,ServerInfo> serverInfoMap = new HashMap<Integer,ServerInfo>();
	
	static Map<Integer,Zone> zoneMap = new HashMap<Integer,Zone>();
	
	static Map<Integer, AppServer> appServerMap = new HashMap<Integer, AppServer>();*/
	
	Collection<GameServer> gameServerList;
	Collection<ServerInfo> serverInfoList;
	Collection<Zone> zoneList;
	Collection<GameServerMerge> gameServerMergeList;
	Collection<AppServer> appServerList;
	Collection<ServerChannel> serverChannelList;
	Collection<ServerGroup> serverGroupList;
	protected DbConfig config;
	
	public abstract void reload();
	
	protected abstract void queryAllGameServer();
	
	public abstract void initDb();
	
	protected void init(){
//		initDbConfig(appId);
//		initDb();
		queryAllGameServer();
//		cacheServerInfo();
	}
	
	/*protected void reloadServer(){
		cacheServerInfo();
	}*/
	
	protected void initDbConfig(int appId){
		ServerQueryByID query = new ServerQueryByID();
		query.setId(appId);
		config = RemoteServerUtil.getDefault().postToConfigServer(ConfigServerCmdConstant.QUERY_DB_CONFIG, query, DbConfig.class);
	}
	
	/*private void cacheServerInfo(){
		for(Zone zone : getZoneList()){
			String serverids[] = zone.getServerids().split(",");
			for(String serverid : serverids){
				serverZoneMap.put(Integer.valueOf(serverid),zone.getId());
			}
		}
		for(GameServer gameServer : getGameServerList()){
			gameServerMap.put(gameServer.getId(), gameServer);
		}
		for(ServerInfo serverInfo : getServerInfoList()){
			serverInfoMap.put(serverInfo.getId(), serverInfo);
		}
		for(Zone zone : getZoneList()){
			zoneMap.put(zone.getId(), zone);
		}
		for (AppServer appServer : getAppServerList()) {
			appServerMap.put(appServer.getId(), appServer);
		}
		for (GameServerMerge gameServerMerge : getGameServerMergeList()) {
			gameServerMergeMap.put(gameServerMerge.getId(), gameServerMerge);
		}
	}*/
	
	public DbConfig getDbConfig(){
		return config;
	}
	
	public GameServer getGameServer(Integer gameServerId){
		for(GameServer gameServer : getGameServerList()){
			if(gameServer.getId()==gameServerId)return gameServer;
		}
		return null;
	}
	
	public ServerInfo getServerInfo(Integer serverInfoId){
		for(ServerInfo serverInfo : getServerInfoList()){
			if(serverInfo.getId()==serverInfoId)return serverInfo;
		}
		return null;
	}
	
	public ServerChannel getServerChannle(Integer channel){
		for(ServerChannel serverChannel : getServerChannelList()){
			if(serverChannel.getChannelId()==channel)
				return serverChannel;
		}
		return null;
	}
	
	public ServerGroup getserverGroup(Integer groupId){
		for(ServerGroup serverGroup : getServerGroupList()){
			if(serverGroup.getId()==groupId)
				return serverGroup;
		}
		return null;
	}
	
	public Zone getZone(Integer zoneId){
		for(Zone zone : getZoneList()){
			if(zone.getId()==zoneId)return zone;
		}
		return null;
	}
	
	public AppServer getAppServer(Integer appserverId) {
		for (AppServer appServer : getAppServerList()) {
			if(appServer.getId()==appserverId)return appServer;
		}
		return null;
	}
	
	public Integer getZoneIdByServerId(Integer serverId){
		for(Zone zone : getZoneList()){
			int[] serverIds = StringUtil.splitIntArray(zone.getServerids(), ",");
			for(int zoneServerId : serverIds){
				if(zoneServerId == serverId)return zone.getId();
			}
		}
		return 0;
	}
	
	public GameServerMerge getGameServerMerge(Integer gameServerMergeID) {
		for (GameServerMerge gameServerMerge : getGameServerMergeList()) {
			if(gameServerMerge.getId()==gameServerMergeID)return gameServerMerge;
		}
		return null;
	}
	
	public Collection<GameServer> getGameServerList() {
		return gameServerList;
	}

	public void setGameServerList(List<GameServer> gameServerList) {
		this.gameServerList = gameServerList;
	}
	
	public Collection<ServerInfo> getServerInfoList() {
		return serverInfoList;
	}

	public void setServerInfoList(Collection<ServerInfo> serverInfoList) {
		this.serverInfoList = serverInfoList;
	}

	public Collection<Zone> getZoneList() {
		return zoneList;
	}

	public void setZoneList(Collection<Zone> zoneList) {
		this.zoneList = zoneList;
	}

	public Collection<GameServerMerge> getGameServerMergeList() {
		return gameServerMergeList;
	}

	public void setGameServerMergeList(List<GameServerMerge> gameServerMergeList) {
		this.gameServerMergeList = gameServerMergeList;
	}
	
	public Collection<AppServer> getAppServerList() {
		return appServerList;
	}

	public void setAppServerList(List<AppServer> appServerList) {
		this.appServerList = appServerList;
	}

	public Collection<ServerChannel> getServerChannelList() {
		return serverChannelList;
	}

	public void setServerChannelList(Collection<ServerChannel> serverChannelList) {
		this.serverChannelList = serverChannelList;
	}

	public Collection<ServerGroup> getServerGroupList() {
		return serverGroupList;
	}

	public void setServerGroupList(Collection<ServerGroup> serverGroupList) {
		this.serverGroupList = serverGroupList;
	}
	
	
	
	
	
	
	/*public static Map<Integer, Integer> getServerZoneMap() {
		return serverZoneMap;
	}

	public static Map<Integer, GameServer> getGameServerMap() {
		return gameServerMap;
	}

	public static Map<Integer, ServerInfo> getServerInfoMap() {
		return serverInfoMap;
	}

	public static Map<Integer, Zone> getZoneMap() {
		return zoneMap;
	}*/
	
}

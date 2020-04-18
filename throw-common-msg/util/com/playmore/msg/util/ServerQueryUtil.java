package com.playmore.msg.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.playmore.dbobject.configcenter.AppServer;
import com.playmore.dbobject.configcenter.GameServer;
import com.playmore.dbobject.configcenter.GameServerMerge;
import com.playmore.dbobject.usercenter.ServerInfo;
import com.playmore.dbobject.usercenter.ServerSwitch;
import com.playmore.dbobject.usercenter.Zone;
import com.playmore.msg.ConfigServerCmdConstant;
import com.playmore.msg.UserCenterCmdConstant;
import com.playmore.msg.x2config.ServerQuery;
import com.playmore.msg.x2config.ServerQueryByIDs;

public class ServerQueryUtil {

	public static ServerInfo queryServerInfo(String serverId){
		ServerInfo info = new ServerInfo();
		info.setId(Integer.valueOf(serverId));
		info = RemoteServerUtil.getDefault().postToUserCenter(UserCenterCmdConstant.QUERY_SERVER_INFO_BY_SERVERID,info,ServerInfo.class);
		return info;
	}
	
	public static List<ServerInfo> queryCrossServer(int crossServer, int serverId, 
			Collection<ServerInfo> serverInfoList){
		List<ServerInfo> crossServerList = new ArrayList<ServerInfo>();
		for(ServerInfo info : serverInfoList){
			if(info.getCrossServer()!=crossServer)continue;
			if(info.getId()==serverId)continue;
			crossServerList.add(info);
		}
		return crossServerList;
	}
	
	public static List<ServerSwitch> queryServerSwitch(String serverId){
		ServerSwitch serverSwitch = new ServerSwitch();
		serverSwitch.setServerId(Integer.valueOf(serverId));
		List<ServerSwitch> list = RemoteServerUtil.getDefault().postListToUserCenter(UserCenterCmdConstant.QUERY_SERVER_SWITCH, serverSwitch, ServerSwitch.class);
		return list;
	}
	
	public static GameServerMerge queryGameServermerge(String serverId){
		ServerQueryByIDs query = new ServerQueryByIDs();
		query.setServerIds(serverId);
		GameServerMerge merge = RemoteServerUtil.getDefault().postToConfigServer(ConfigServerCmdConstant.QUERY_GAME_SERVER_MERGE,query,GameServerMerge.class);
		return merge;
	}
	
	public static List<GameServer> queryAllGameServer(){
		List<GameServer> list =  RemoteServerUtil.getDefault().postListToConfigServer(ConfigServerCmdConstant.QUERY_ALL_GAME_SERVER, new ServerQuery(), GameServer.class);
		return list;
	}
	
	public static List<GameServerMerge> queryAllGameServerMerge(){
		List<GameServerMerge> list =  RemoteServerUtil.getDefault().postListToConfigServer(ConfigServerCmdConstant.QUERY_ALL_GAME_SERVER_MERGE, new ServerQuery(), GameServerMerge.class);
		return list;
	}
	
	public static List<ServerInfo> queryAllServerInfo(){
		List<ServerInfo> list = RemoteServerUtil.getDefault().postListToUserCenter(UserCenterCmdConstant.QUERY_ALL_SERVER_INFO,  new ServerInfo(), ServerInfo.class);
		return list;
	}
	
	public static List<Zone> queryAllZone(){
		List<Zone> list = RemoteServerUtil.getDefault().postListToUserCenter(UserCenterCmdConstant.QUERY_ZONE,  new Zone(), Zone.class);
		return list;
	}
	
	public static List<AppServer> queryAllAppserver(){
		List<AppServer> list = RemoteServerUtil.getDefault().postListToConfigServer(ConfigServerCmdConstant.QUERY_ALL_APP_SERVER, new AppServer(), AppServer.class);
		return list;
	}
	
	public static void main(String[] str){
		RemoteServerUtil.getDefault().setConfigServerUrl("http://192.168.3.36:8190/remoteInvoke");
		/*List<GameServer> list = queryAllGameServer();
		for(GameServer o: list){
			System.out.println("GameServer:"+o);
		}*/
		/*List<AppServer> list = queryUserCenter();
		for(AppServer o: list){
			System.out.println("AppServer:"+o);
		}*/
		
		/*List<ServerInfo> list =queryAllServerInfo();
//		List<ServerInfo> list = JettyClient.postList("http://192.168.3.36:8090/remoteInvoke", UserCenterCmdConstant.QUERY_SERVER_LIST,  new ServerInfo(), ServerInfo.class);
		for(ServerInfo o: list){
			System.out.println("ServerInfo:"+o);
		}*/
		List<Zone> list = queryAllZone();
		for(Zone o: list){
			System.out.println("Zone:"+o);
		}
		
	}
	
	
	
	
}

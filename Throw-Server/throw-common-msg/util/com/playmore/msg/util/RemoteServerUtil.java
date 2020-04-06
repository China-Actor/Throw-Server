package com.playmore.msg.util;

import java.util.List;

import com.playmore.dbobject.configcenter.AppServer;
import com.playmore.dbobject.configcenter.GameServer;
import com.playmore.msg.ConfigServerCmdConstant;
import com.playmore.msg.x2config.ServerQuery;
import com.playmore.msg.x2config.ServerQueryByID;
import com.playmore.msg.x2config.ServerQueryByIDs;
import com.playmore.servlet.context.JettyClient;
import com.playmore.servlet.context.RemoteInvokeContextPath;
import com.playmore.servlet.util.GetIP;
import com.playmore.servlet.util.GetPath;
import com.playmore.xysword.enumtype.AppType;

public class RemoteServerUtil {

	private String configServerUrl;
	
	private AppServer userCenter;
	
	private AppServer payCenter;
	
	private AppServer inviteCode;
	
	private AppServer GuildCenter;
	
	
	private static RemoteServerUtil cacheDefault = new RemoteServerUtil();
	
	public static RemoteServerUtil getDefault(){
		return cacheDefault;
	}
	
	public AppServer getUserCenter() {
		return userCenter;
	}

	public void setUserCenter(AppServer userCenter) {
		this.userCenter = userCenter;
	}
	
	public AppServer getPayCenter() {
		return payCenter;
	}

	public void setPayCenter(AppServer payCenter) {
		this.payCenter = payCenter;
	}

	public AppServer getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(AppServer inviteCode) {
		this.inviteCode = inviteCode;
	}

	public String getConfigServerUrl() {
		return configServerUrl;
	}
	
	
	
	
	public AppServer getGuildCenter() {
		return GuildCenter;
	}

	public void setGuildCenter(AppServer guildCenter) {
		GuildCenter = guildCenter;
	}

	private String getGameServerUrl(GameServer gameServer){
		return "http://"+gameServer.getIp()+":"+gameServer.getHttpport()+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
	}

	public void setConfigServerUrl(String configServerUrl) {
		this.configServerUrl = configServerUrl;
	}
	
	public <T> T postToInviteCode(int commandId, Object sendMsg,
			Class<T> cls) {
		return JettyClient.post(getInviteCodeRemoteInvokeUrl(), commandId,
				sendMsg, cls);
	}
	
	public <T> T postToUserCenter(int commandId, Object sendMsg,Class<T> cls) 
	{
		T t = JettyClient.post(getUserCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		if(t == null)
		{
			userCenterSyncIp();
			t = JettyClient.post(getUserCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		}
		return t;
	}
	
	public <T> T postToGuildCenter(int commandId, Object sendMsg,Class<T> cls) 
	{
		T t = JettyClient.post(getGuildCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		if(t == null)
		{
			userCenterSyncIp();
			t = JettyClient.post(getGuildCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		}
		return t;
	}
	
	public <T> T postToPayCenter(int commandId, Object sendMsg, Class<T> cls) 
	{
		T t = JettyClient.post(getPayCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		if(t == null)
		{
			payCenterSyncIp();
			t = JettyClient.post(getPayCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		}
		
		return t;
	}
	
	public <T> T postToConfigServer(int commandId, Object sendMsg,
			Class<T> cls) {
		return JettyClient.post(getConfigServerUrl(), commandId,
				sendMsg, cls);
	}
	
	public <T> T postToConfigServerCross(int commandId,  int sendMsg,
			Class<T> cls) {
		ServerQueryByIDs query = new ServerQueryByIDs();
		query.setServerIds(sendMsg+"");
		return JettyClient.post(getConfigServerUrl(), commandId,
				query, cls);
	}
	public <T> T postToGameServer(GameServer gameServer, int commandId, Object sendMsg,
			Class<T> cls) {
		return JettyClient.post(getGameServerUrl(gameServer), commandId,
				sendMsg, cls);
	}
	
	public <T> List<T> postListToGameServer(GameServer gameServer, int commandId, Object sendMsg,
			Class<T> cls) {
		return JettyClient.postList(getGameServerUrl(gameServer), commandId,
				sendMsg, cls);
	}
	
	public <T> List<T> postListToConfigServer(int commandId, Object sendMsg, Class<T> t){
		return JettyClient.postList(getConfigServerUrl(),commandId, sendMsg, t);
	}
	
	public <T> T postListToGuildServer(int commandId, Object sendMsg, Class<T> t){
		return JettyClient.post(getGuildCenterRemoteInvokeUrl(),commandId, sendMsg, t);
	}
	
	
	
	public <T> List<T> postListToUserCenter(int commandId, Object sendMsg, Class<T> t)
	{
		List<T> list = JettyClient.postList(getUserCenterRemoteInvokeUrl(), commandId, sendMsg, t);
		if(list == null)
		{
			userCenterSyncIp();
			list = JettyClient.postList(getUserCenterRemoteInvokeUrl(), commandId, sendMsg, t);
		}
		return list;
	}
	
	public <T> List<T> postListToInviteCode(int commandId, Object sendMsg, Class<T> t){
		return JettyClient.postList(getInviteCodeRemoteInvokeUrl(), commandId, sendMsg, t);
	}
	
	public <T> List<T> postListToPayCenter(int commandId, Object sendMsg,Class<T> cls) {
		
		List<T> list = JettyClient.postList(getPayCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		if(list == null)
		{
			payCenterSyncIp();
			list = JettyClient.postList(getPayCenterRemoteInvokeUrl(), commandId,sendMsg, cls);
		}
		
		return list;
	}
	
	private void payCenterSyncIp()
	{
		AppServer payCenter = queryPayCenter();
		payCenter.setIp(payCenter.getInternetip());
	}
	
	private void userCenterSyncIp()
	{
		AppServer userCenter = queryUserCenter();
		userCenter.setIp(userCenter.getInternetip());
	}
	
	private String getUserCenterRemoteInvokeUrl(){
		AppServer userCenter = queryUserCenter();
		String ip = userCenter.getIp();
		int port = userCenter.getHttpport();
		String url = "http://"+ip+":"+port+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
		return url;
	}
	
	private String getGuildCenterRemoteInvokeUrl(){
		AppServer guildCenter = queryGuildCenter();
		String ip = guildCenter.getIp();
		int port = guildCenter.getHttpport();
		String url = "http://"+ip+":"+port+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
		return url;
	}
	
	
	public String getPayCenterLocalInvokeUrl(){
		ServerQuery query = new ServerQuery();
		query.setIp(GetIP.getLocalIP());
		query.setPath(GetPath.getLocalPath());
		AppServer payCenter = RemoteServerUtil.getDefault().postToConfigServer(ConfigServerCmdConstant.QUERY_MINE_APP_SERVER, query, AppServer.class);
		String ip = payCenter.getIp();
		int port = payCenter.getHttpport();
		String url = "http://"+ip+":"+port+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
		return url;
	}
	
	private String getPayCenterRemoteInvokeUrl(){
		AppServer payCenter = queryPayCenter();
//		String ip = payCenter.getInternetip();
		//TODO 要上负载均衡了再改
		String ip = payCenter.getIp();
		int port = payCenter.getHttpport();
		String url = "http://"+ip+":"+port+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
//		String url = "http://"+ip+":"+port+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
		return url;
	}
	
	private String getInviteCodeRemoteInvokeUrl(){
		AppServer inviteCode = queryInviteCode();
		String ip = inviteCode.getIp();
		int port = inviteCode.getHttpport();
		String url = "http://"+ip+":"+port+RemoteInvokeContextPath.REMOTE_INVOKE_CONTEXT_PATH;
		return url;
	}
	
	private AppServer queryUserCenter(){
		if(getUserCenter()!=null){
			return getUserCenter();
		}
		ServerQueryByIDs query = new ServerQueryByIDs();
		query.setServerIds(""+AppType.USER_CENTER);
		List<AppServer> list = postListToConfigServer(ConfigServerCmdConstant.QUERY_APP_SERVER_BY_APPID, query, AppServer.class);
		if(list.size()>0){
			AppServer userCenter = list.get(0);
			setUserCenter(userCenter);
			return userCenter;
		}
		return null;
	}
	
	private AppServer queryGuildCenter(){
		if(getGuildCenter()!=null){
			return getGuildCenter();
		}
		ServerQueryByIDs query = new ServerQueryByIDs();
		query.setServerIds(""+AppType.GUILD_SERVER);
		List<AppServer> list = postListToConfigServer(ConfigServerCmdConstant.QUERY_APP_SERVER_BY_APPID, query, AppServer.class);
		if(list.size()>0){
			AppServer guildCenter = list.get(0);
			setGuildCenter(guildCenter);
			return guildCenter;
		}
		return null;
	}
	
	
	private AppServer queryPayCenter(){
		if(getPayCenter()!=null){
			return getPayCenter();
		}
		ServerQueryByIDs query = new ServerQueryByIDs();
		query.setServerIds(""+AppType.PAY_CENTER);
		List<AppServer> list = postListToConfigServer(ConfigServerCmdConstant.QUERY_APP_SERVER_BY_APPID, query, AppServer.class);
		if(list.size()>0){
			AppServer payCenter = list.get(0);
			setPayCenter(payCenter);
			return payCenter;
		}
		return null;
	}
	
	private AppServer queryInviteCode(){
		if(getInviteCode()!=null){
			return getInviteCode();
		}
		ServerQueryByIDs query = new ServerQueryByIDs();
		query.setServerIds(""+AppType.INVITE_CODE_SERVER);
		List<AppServer> list = postListToConfigServer(ConfigServerCmdConstant.QUERY_APP_SERVER_BY_APPID, query, AppServer.class);
		if(list.size()>0){
			AppServer inviteCode = list.get(0);
			setInviteCode(inviteCode);
			return inviteCode;
		}
		return null;
	}
}

package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.ServerInfo;
import com.playmore.dbobject.usercenter.dao.ServerInfoDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerInfoDBQueue extends DefaultDBQueue<ServerInfo> {

	private static final ServerInfoDBQueue DEFAULT = new	ServerInfoDBQueue();
	public static ServerInfoDBQueue getDefault() {
		return DEFAULT;
	}
	private ServerInfoDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerInfo> getDao() {
		return ServerInfoDaoImpl.getDefault();
	}
}

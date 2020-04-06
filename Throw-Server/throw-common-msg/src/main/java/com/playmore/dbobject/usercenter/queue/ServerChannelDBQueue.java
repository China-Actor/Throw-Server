package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.ServerChannel;
import com.playmore.dbobject.usercenter.dao.ServerChannelDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerChannelDBQueue extends DefaultDBQueue<ServerChannel> {

	private static final ServerChannelDBQueue DEFAULT = new	ServerChannelDBQueue();
	public static ServerChannelDBQueue getDefault() {
		return DEFAULT;
	}
	private ServerChannelDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerChannel> getDao() {
		return ServerChannelDaoImpl.getDefault();
	}
}

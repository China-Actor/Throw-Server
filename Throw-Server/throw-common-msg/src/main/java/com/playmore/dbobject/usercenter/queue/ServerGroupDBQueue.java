package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.ServerGroup;
import com.playmore.dbobject.usercenter.dao.ServerGroupDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerGroupDBQueue extends DefaultDBQueue<ServerGroup> {

	private static final ServerGroupDBQueue DEFAULT = new	ServerGroupDBQueue();
	public static ServerGroupDBQueue getDefault() {
		return DEFAULT;
	}
	private ServerGroupDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerGroup> getDao() {
		return ServerGroupDaoImpl.getDefault();
	}
}

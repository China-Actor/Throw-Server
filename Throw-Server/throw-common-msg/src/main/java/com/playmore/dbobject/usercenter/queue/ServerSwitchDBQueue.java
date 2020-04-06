package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.ServerSwitch;
import com.playmore.dbobject.usercenter.dao.ServerSwitchDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerSwitchDBQueue extends DefaultDBQueue<ServerSwitch> {

	private static final ServerSwitchDBQueue DEFAULT = new	ServerSwitchDBQueue();
	public static ServerSwitchDBQueue getDefault() {
		return DEFAULT;
	}
	private ServerSwitchDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerSwitch> getDao() {
		return ServerSwitchDaoImpl.getDefault();
	}
}

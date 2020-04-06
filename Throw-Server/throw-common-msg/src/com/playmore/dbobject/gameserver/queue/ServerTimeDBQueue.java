package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.ServerTime;
import com.playmore.dbobject.gameserver.dao.ServerTimeDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerTimeDBQueue extends DefaultDBQueue<ServerTime> {

	private static final ServerTimeDBQueue DEFAULT = new	ServerTimeDBQueue();
	public static ServerTimeDBQueue getDefault() {
		return DEFAULT;
	}
	private ServerTimeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerTime> getDao() {
		return ServerTimeDaoImpl.getDefault();
	}
}

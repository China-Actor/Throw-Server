package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.ServerMail;
import com.playmore.dbobject.gameserver.dao.ServerMailDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerMailDBQueue extends DefaultDBQueue<ServerMail> {

	private static final ServerMailDBQueue DEFAULT = new	ServerMailDBQueue();
	public static ServerMailDBQueue getDefault() {
		return DEFAULT;
	}
	private ServerMailDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerMail> getDao() {
		return ServerMailDaoImpl.getDefault();
	}
}

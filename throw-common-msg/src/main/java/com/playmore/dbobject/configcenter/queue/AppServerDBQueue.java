package com.playmore.dbobject.configcenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.configcenter.AppServer;
import com.playmore.dbobject.configcenter.dao.AppServerDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AppServerDBQueue extends DefaultDBQueue<AppServer> {

	private static final AppServerDBQueue DEFAULT = new	AppServerDBQueue();
	public static AppServerDBQueue getDefault() {
		return DEFAULT;
	}
	private AppServerDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<AppServer> getDao() {
		return AppServerDaoImpl.getDefault();
	}
}

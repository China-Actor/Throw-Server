package com.playmore.dbobject.configcenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.configcenter.DbConfig;
import com.playmore.dbobject.configcenter.dao.DbConfigDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DbConfigDBQueue extends DefaultDBQueue<DbConfig> {

	private static final DbConfigDBQueue DEFAULT = new	DbConfigDBQueue();
	public static DbConfigDBQueue getDefault() {
		return DEFAULT;
	}
	private DbConfigDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<DbConfig> getDao() {
		return DbConfigDaoImpl.getDefault();
	}
}

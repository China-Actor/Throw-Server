package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.Zone;
import com.playmore.dbobject.usercenter.dao.ZoneDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ZoneDBQueue extends DefaultDBQueue<Zone> {

	private static final ZoneDBQueue DEFAULT = new	ZoneDBQueue();
	public static ZoneDBQueue getDefault() {
		return DEFAULT;
	}
	private ZoneDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<Zone> getDao() {
		return ZoneDaoImpl.getDefault();
	}
}

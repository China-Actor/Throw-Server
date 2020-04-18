package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.Ban;
import com.playmore.dbobject.usercenter.dao.BanDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BanDBQueue extends DefaultDBQueue<Ban> {

	private static final BanDBQueue DEFAULT = new	BanDBQueue();
	public static BanDBQueue getDefault() {
		return DEFAULT;
	}
	private BanDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<Ban> getDao() {
		return BanDaoImpl.getDefault();
	}
}

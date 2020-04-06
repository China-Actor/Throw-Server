package com.playmore.dbobject.paycenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.paycenter.RebateBoxOpen;
import com.playmore.dbobject.paycenter.dao.RebateBoxOpenDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RebateBoxOpenDBQueue extends DefaultDBQueue<RebateBoxOpen> {

	private static final RebateBoxOpenDBQueue DEFAULT = new	RebateBoxOpenDBQueue();
	public static RebateBoxOpenDBQueue getDefault() {
		return DEFAULT;
	}
	private RebateBoxOpenDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<RebateBoxOpen> getDao() {
		return RebateBoxOpenDaoImpl.getDefault();
	}
}

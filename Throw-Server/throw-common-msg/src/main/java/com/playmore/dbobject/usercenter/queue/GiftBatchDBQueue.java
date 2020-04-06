package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.GiftBatch;
import com.playmore.dbobject.usercenter.dao.GiftBatchDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GiftBatchDBQueue extends DefaultDBQueue<GiftBatch> {

	private static final GiftBatchDBQueue DEFAULT = new	GiftBatchDBQueue();
	public static GiftBatchDBQueue getDefault() {
		return DEFAULT;
	}
	private GiftBatchDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GiftBatch> getDao() {
		return GiftBatchDaoImpl.getDefault();
	}
}

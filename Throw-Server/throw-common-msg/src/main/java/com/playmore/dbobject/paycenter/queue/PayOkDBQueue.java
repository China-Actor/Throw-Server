package com.playmore.dbobject.paycenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.paycenter.PayOk;
import com.playmore.dbobject.paycenter.dao.PayOkDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayOkDBQueue extends DefaultDBQueue<PayOk> {

	private static final PayOkDBQueue DEFAULT = new	PayOkDBQueue();
	public static PayOkDBQueue getDefault() {
		return DEFAULT;
	}
	private PayOkDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PayOk> getDao() {
		return PayOkDaoImpl.getDefault();
	}
}

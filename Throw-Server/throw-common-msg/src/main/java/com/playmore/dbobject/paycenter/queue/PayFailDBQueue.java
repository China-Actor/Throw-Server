package com.playmore.dbobject.paycenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.paycenter.PayFail;
import com.playmore.dbobject.paycenter.dao.PayFailDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayFailDBQueue extends DefaultDBQueue<PayFail> {

	private static final PayFailDBQueue DEFAULT = new	PayFailDBQueue();
	public static PayFailDBQueue getDefault() {
		return DEFAULT;
	}
	private PayFailDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PayFail> getDao() {
		return PayFailDaoImpl.getDefault();
	}
}

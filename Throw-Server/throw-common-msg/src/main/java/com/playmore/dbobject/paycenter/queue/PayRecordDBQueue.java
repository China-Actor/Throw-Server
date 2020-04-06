package com.playmore.dbobject.paycenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.paycenter.PayRecord;
import com.playmore.dbobject.paycenter.dao.PayRecordDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PayRecordDBQueue extends DefaultDBQueue<PayRecord> {

	private static final PayRecordDBQueue DEFAULT = new	PayRecordDBQueue();
	public static PayRecordDBQueue getDefault() {
		return DEFAULT;
	}
	private PayRecordDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PayRecord> getDao() {
		return PayRecordDaoImpl.getDefault();
	}
}

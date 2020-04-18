package com.playmore.dbobject.paycenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.paycenter.RechargeReturn;
import com.playmore.dbobject.paycenter.dao.RechargeReturnDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RechargeReturnDBQueue extends DefaultDBQueue<RechargeReturn> {

	private static final RechargeReturnDBQueue DEFAULT = new	RechargeReturnDBQueue();
	public static RechargeReturnDBQueue getDefault() {
		return DEFAULT;
	}
	private RechargeReturnDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<RechargeReturn> getDao() {
		return RechargeReturnDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.AccountNum;
import com.playmore.dbobject.usercenter.dao.AccountNumDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AccountNumDBQueue extends DefaultDBQueue<AccountNum> {

	private static final AccountNumDBQueue DEFAULT = new	AccountNumDBQueue();
	public static AccountNumDBQueue getDefault() {
		return DEFAULT;
	}
	private AccountNumDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<AccountNum> getDao() {
		return AccountNumDaoImpl.getDefault();
	}
}

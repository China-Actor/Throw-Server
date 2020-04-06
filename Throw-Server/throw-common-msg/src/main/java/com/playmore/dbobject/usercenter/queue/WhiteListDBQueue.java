package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.WhiteList;
import com.playmore.dbobject.usercenter.dao.WhiteListDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class WhiteListDBQueue extends DefaultDBQueue<WhiteList> {

	private static final WhiteListDBQueue DEFAULT = new	WhiteListDBQueue();
	public static WhiteListDBQueue getDefault() {
		return DEFAULT;
	}
	private WhiteListDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<WhiteList> getDao() {
		return WhiteListDaoImpl.getDefault();
	}
}

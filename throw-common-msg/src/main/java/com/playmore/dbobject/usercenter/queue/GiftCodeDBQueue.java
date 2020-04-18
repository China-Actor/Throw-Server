package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.GiftCode;
import com.playmore.dbobject.usercenter.dao.GiftCodeDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GiftCodeDBQueue extends DefaultDBQueue<GiftCode> {

	private static final GiftCodeDBQueue DEFAULT = new	GiftCodeDBQueue();
	public static GiftCodeDBQueue getDefault() {
		return DEFAULT;
	}
	private GiftCodeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GiftCode> getDao() {
		return GiftCodeDaoImpl.getDefault();
	}
}

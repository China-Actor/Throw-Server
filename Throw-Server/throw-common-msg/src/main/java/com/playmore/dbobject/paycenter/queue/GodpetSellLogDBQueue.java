package com.playmore.dbobject.paycenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.paycenter.GodpetSellLog;
import com.playmore.dbobject.paycenter.dao.GodpetSellLogDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GodpetSellLogDBQueue extends DefaultDBQueue<GodpetSellLog> {

	private static final GodpetSellLogDBQueue DEFAULT = new	GodpetSellLogDBQueue();
	public static GodpetSellLogDBQueue getDefault() {
		return DEFAULT;
	}
	private GodpetSellLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GodpetSellLog> getDao() {
		return GodpetSellLogDaoImpl.getDefault();
	}
}

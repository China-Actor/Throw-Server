package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.OfferrewardTask;
import com.playmore.dbobject.gameserver.dao.OfferrewardTaskDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class OfferrewardTaskDBQueue extends DefaultDBQueue<OfferrewardTask> {

	private static final OfferrewardTaskDBQueue DEFAULT = new	OfferrewardTaskDBQueue();
	public static OfferrewardTaskDBQueue getDefault() {
		return DEFAULT;
	}
	private OfferrewardTaskDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<OfferrewardTask> getDao() {
		return OfferrewardTaskDaoImpl.getDefault();
	}
}

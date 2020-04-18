package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.IdWorkerTime;
import com.playmore.dbobject.gameserver.dao.IdWorkerTimeDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class IdWorkerTimeDBQueue extends DefaultDBQueue<IdWorkerTime> {

	private static final IdWorkerTimeDBQueue DEFAULT = new	IdWorkerTimeDBQueue();
	public static IdWorkerTimeDBQueue getDefault() {
		return DEFAULT;
	}
	private IdWorkerTimeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<IdWorkerTime> getDao() {
		return IdWorkerTimeDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTimePeakLog;
import com.playmore.dbobject.gameserver.dao.PlayerTimePeakLogDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTimePeakLogDBQueue extends DefaultDBQueue<PlayerTimePeakLog> {

	private static final PlayerTimePeakLogDBQueue DEFAULT = new	PlayerTimePeakLogDBQueue();
	public static PlayerTimePeakLogDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerTimePeakLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTimePeakLog> getDao() {
		return PlayerTimePeakLogDaoImpl.getDefault();
	}
}

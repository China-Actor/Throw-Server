package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTimePeak;
import com.playmore.dbobject.gameserver.dao.PlayerTimePeakDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTimePeakDBQueue extends DefaultDBQueue<PlayerTimePeak> {

	private static final PlayerTimePeakDBQueue DEFAULT = new	PlayerTimePeakDBQueue();
	public static PlayerTimePeakDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerTimePeakDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTimePeak> getDao() {
		return PlayerTimePeakDaoImpl.getDefault();
	}
}

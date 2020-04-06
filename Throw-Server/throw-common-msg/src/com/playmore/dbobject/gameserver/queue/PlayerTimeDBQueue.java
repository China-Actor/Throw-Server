package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTime;
import com.playmore.dbobject.gameserver.dao.PlayerTimeDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTimeDBQueue extends DefaultDBQueue<PlayerTime> {

	private static final PlayerTimeDBQueue DEFAULT = new	PlayerTimeDBQueue();
	public static PlayerTimeDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerTimeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTime> getDao() {
		return PlayerTimeDaoImpl.getDefault();
	}
}

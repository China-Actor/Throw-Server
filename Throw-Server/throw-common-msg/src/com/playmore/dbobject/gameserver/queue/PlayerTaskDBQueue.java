package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTask;
import com.playmore.dbobject.gameserver.dao.PlayerTaskDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTaskDBQueue extends DefaultDBQueue<PlayerTask> {

	private static final PlayerTaskDBQueue DEFAULT = new	PlayerTaskDBQueue();
	public static PlayerTaskDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerTaskDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTask> getDao() {
		return PlayerTaskDaoImpl.getDefault();
	}
}

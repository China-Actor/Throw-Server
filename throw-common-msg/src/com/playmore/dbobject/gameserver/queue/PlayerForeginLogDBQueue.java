package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerForeginLog;
import com.playmore.dbobject.gameserver.dao.PlayerForeginLogDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeginLogDBQueue extends DefaultDBQueue<PlayerForeginLog> {

	private static final PlayerForeginLogDBQueue DEFAULT = new	PlayerForeginLogDBQueue();
	public static PlayerForeginLogDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerForeginLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerForeginLog> getDao() {
		return PlayerForeginLogDaoImpl.getDefault();
	}
}

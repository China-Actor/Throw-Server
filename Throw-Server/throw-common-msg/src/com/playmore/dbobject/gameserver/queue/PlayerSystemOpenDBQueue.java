package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSystemOpen;
import com.playmore.dbobject.gameserver.dao.PlayerSystemOpenDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSystemOpenDBQueue extends DefaultDBQueue<PlayerSystemOpen> {

	private static final PlayerSystemOpenDBQueue DEFAULT = new	PlayerSystemOpenDBQueue();
	public static PlayerSystemOpenDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerSystemOpenDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSystemOpen> getDao() {
		return PlayerSystemOpenDaoImpl.getDefault();
	}
}

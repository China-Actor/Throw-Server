package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerForeign;
import com.playmore.dbobject.gameserver.dao.PlayerForeignDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeignDBQueue extends DefaultDBQueue<PlayerForeign> {

	private static final PlayerForeignDBQueue DEFAULT = new	PlayerForeignDBQueue();
	public static PlayerForeignDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerForeignDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerForeign> getDao() {
		return PlayerForeignDaoImpl.getDefault();
	}
}

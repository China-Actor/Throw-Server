package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSundry;
import com.playmore.dbobject.gameserver.dao.PlayerSundryDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSundryDBQueue extends DefaultDBQueue<PlayerSundry> {

	private static final PlayerSundryDBQueue DEFAULT = new	PlayerSundryDBQueue();
	public static PlayerSundryDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerSundryDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSundry> getDao() {
		return PlayerSundryDaoImpl.getDefault();
	}
}

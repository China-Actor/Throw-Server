package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.Player;
import com.playmore.dbobject.usercenter.dao.PlayerDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerDBQueue extends DefaultDBQueue<Player> {

	private static final PlayerDBQueue DEFAULT = new	PlayerDBQueue();
	public static PlayerDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<Player> getDao() {
		return PlayerDaoImpl.getDefault();
	}
}

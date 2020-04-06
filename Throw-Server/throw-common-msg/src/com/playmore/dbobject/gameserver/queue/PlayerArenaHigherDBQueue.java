package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArenaHigher;
import com.playmore.dbobject.gameserver.dao.PlayerArenaHigherDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaHigherDBQueue extends DefaultDBQueue<PlayerArenaHigher> {

	private static final PlayerArenaHigherDBQueue DEFAULT = new	PlayerArenaHigherDBQueue();
	public static PlayerArenaHigherDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerArenaHigherDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArenaHigher> getDao() {
		return PlayerArenaHigherDaoImpl.getDefault();
	}
}

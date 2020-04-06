package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerHandbook;
import com.playmore.dbobject.gameserver.dao.PlayerHandbookDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerHandbookDBQueue extends DefaultDBQueue<PlayerHandbook> {

	private static final PlayerHandbookDBQueue DEFAULT = new	PlayerHandbookDBQueue();
	public static PlayerHandbookDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerHandbookDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerHandbook> getDao() {
		return PlayerHandbookDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFormationMax;
import com.playmore.dbobject.gameserver.dao.PlayerFormationMaxDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFormationMaxDBQueue extends DefaultDBQueue<PlayerFormationMax> {

	private static final PlayerFormationMaxDBQueue DEFAULT = new	PlayerFormationMaxDBQueue();
	public static PlayerFormationMaxDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFormationMaxDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFormationMax> getDao() {
		return PlayerFormationMaxDaoImpl.getDefault();
	}
}

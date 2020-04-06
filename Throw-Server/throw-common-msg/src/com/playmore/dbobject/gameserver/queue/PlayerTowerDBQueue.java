package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTower;
import com.playmore.dbobject.gameserver.dao.PlayerTowerDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTowerDBQueue extends DefaultDBQueue<PlayerTower> {

	private static final PlayerTowerDBQueue DEFAULT = new	PlayerTowerDBQueue();
	public static PlayerTowerDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerTowerDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTower> getDao() {
		return PlayerTowerDaoImpl.getDefault();
	}
}

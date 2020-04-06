package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerCrystal;
import com.playmore.dbobject.gameserver.dao.PlayerCrystalDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerCrystalDBQueue extends DefaultDBQueue<PlayerCrystal> {

	private static final PlayerCrystalDBQueue DEFAULT = new	PlayerCrystalDBQueue();
	public static PlayerCrystalDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerCrystalDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerCrystal> getDao() {
		return PlayerCrystalDaoImpl.getDefault();
	}
}

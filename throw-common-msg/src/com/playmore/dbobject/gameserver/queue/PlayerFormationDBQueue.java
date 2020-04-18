package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFormation;
import com.playmore.dbobject.gameserver.dao.PlayerFormationDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFormationDBQueue extends DefaultDBQueue<PlayerFormation> {

	private static final PlayerFormationDBQueue DEFAULT = new	PlayerFormationDBQueue();
	public static PlayerFormationDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFormationDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFormation> getDao() {
		return PlayerFormationDaoImpl.getDefault();
	}
}

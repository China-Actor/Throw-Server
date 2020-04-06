package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerResources;
import com.playmore.dbobject.gameserver.dao.PlayerResourcesDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerResourcesDBQueue extends DefaultDBQueue<PlayerResources> {

	private static final PlayerResourcesDBQueue DEFAULT = new	PlayerResourcesDBQueue();
	public static PlayerResourcesDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerResourcesDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerResources> getDao() {
		return PlayerResourcesDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArena;
import com.playmore.dbobject.gameserver.dao.PlayerArenaDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaDBQueue extends DefaultDBQueue<PlayerArena> {

	private static final PlayerArenaDBQueue DEFAULT = new	PlayerArenaDBQueue();
	public static PlayerArenaDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerArenaDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArena> getDao() {
		return PlayerArenaDaoImpl.getDefault();
	}
}

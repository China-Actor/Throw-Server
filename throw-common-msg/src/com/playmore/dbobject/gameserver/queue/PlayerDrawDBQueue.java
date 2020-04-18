package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerDraw;
import com.playmore.dbobject.gameserver.dao.PlayerDrawDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerDrawDBQueue extends DefaultDBQueue<PlayerDraw> {

	private static final PlayerDrawDBQueue DEFAULT = new	PlayerDrawDBQueue();
	public static PlayerDrawDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerDrawDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerDraw> getDao() {
		return PlayerDrawDaoImpl.getDefault();
	}
}

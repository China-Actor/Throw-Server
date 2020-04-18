package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerMailDraw;
import com.playmore.dbobject.gameserver.dao.PlayerMailDrawDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMailDrawDBQueue extends DefaultDBQueue<PlayerMailDraw> {

	private static final PlayerMailDrawDBQueue DEFAULT = new	PlayerMailDrawDBQueue();
	public static PlayerMailDrawDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerMailDrawDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerMailDraw> getDao() {
		return PlayerMailDrawDaoImpl.getDefault();
	}
}

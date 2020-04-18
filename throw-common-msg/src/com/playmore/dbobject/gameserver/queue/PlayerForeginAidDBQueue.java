package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerForeginAid;
import com.playmore.dbobject.gameserver.dao.PlayerForeginAidDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerForeginAidDBQueue extends DefaultDBQueue<PlayerForeginAid> {

	private static final PlayerForeginAidDBQueue DEFAULT = new	PlayerForeginAidDBQueue();
	public static PlayerForeginAidDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerForeginAidDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerForeginAid> getDao() {
		return PlayerForeginAidDaoImpl.getDefault();
	}
}

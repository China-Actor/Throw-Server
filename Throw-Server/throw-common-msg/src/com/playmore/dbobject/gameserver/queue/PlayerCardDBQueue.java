package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerCard;
import com.playmore.dbobject.gameserver.dao.PlayerCardDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerCardDBQueue extends DefaultDBQueue<PlayerCard> {

	private static final PlayerCardDBQueue DEFAULT = new	PlayerCardDBQueue();
	public static PlayerCardDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerCardDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerCard> getDao() {
		return PlayerCardDaoImpl.getDefault();
	}
}

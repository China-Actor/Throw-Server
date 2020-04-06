package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSourceLink;
import com.playmore.dbobject.gameserver.dao.PlayerSourceLinkDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSourceLinkDBQueue extends DefaultDBQueue<PlayerSourceLink> {

	private static final PlayerSourceLinkDBQueue DEFAULT = new	PlayerSourceLinkDBQueue();
	public static PlayerSourceLinkDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerSourceLinkDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSourceLink> getDao() {
		return PlayerSourceLinkDaoImpl.getDefault();
	}
}

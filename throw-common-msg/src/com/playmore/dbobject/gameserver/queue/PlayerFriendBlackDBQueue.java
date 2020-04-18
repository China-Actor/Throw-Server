package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendBlack;
import com.playmore.dbobject.gameserver.dao.PlayerFriendBlackDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendBlackDBQueue extends DefaultDBQueue<PlayerFriendBlack> {

	private static final PlayerFriendBlackDBQueue DEFAULT = new	PlayerFriendBlackDBQueue();
	public static PlayerFriendBlackDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFriendBlackDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendBlack> getDao() {
		return PlayerFriendBlackDaoImpl.getDefault();
	}
}

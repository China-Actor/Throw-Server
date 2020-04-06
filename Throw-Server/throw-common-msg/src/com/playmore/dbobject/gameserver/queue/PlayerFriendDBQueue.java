package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriend;
import com.playmore.dbobject.gameserver.dao.PlayerFriendDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendDBQueue extends DefaultDBQueue<PlayerFriend> {

	private static final PlayerFriendDBQueue DEFAULT = new	PlayerFriendDBQueue();
	public static PlayerFriendDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFriendDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriend> getDao() {
		return PlayerFriendDaoImpl.getDefault();
	}
}

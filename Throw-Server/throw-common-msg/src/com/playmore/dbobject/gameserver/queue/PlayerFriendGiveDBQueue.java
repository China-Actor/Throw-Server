package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendGive;
import com.playmore.dbobject.gameserver.dao.PlayerFriendGiveDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendGiveDBQueue extends DefaultDBQueue<PlayerFriendGive> {

	private static final PlayerFriendGiveDBQueue DEFAULT = new	PlayerFriendGiveDBQueue();
	public static PlayerFriendGiveDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFriendGiveDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendGive> getDao() {
		return PlayerFriendGiveDaoImpl.getDefault();
	}
}

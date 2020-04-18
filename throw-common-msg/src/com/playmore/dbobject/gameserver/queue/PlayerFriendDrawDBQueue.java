package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendDraw;
import com.playmore.dbobject.gameserver.dao.PlayerFriendDrawDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendDrawDBQueue extends DefaultDBQueue<PlayerFriendDraw> {

	private static final PlayerFriendDrawDBQueue DEFAULT = new	PlayerFriendDrawDBQueue();
	public static PlayerFriendDrawDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFriendDrawDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendDraw> getDao() {
		return PlayerFriendDrawDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendApply;
import com.playmore.dbobject.gameserver.dao.PlayerFriendApplyDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerFriendApplyDBQueue extends DefaultDBQueue<PlayerFriendApply> {

	private static final PlayerFriendApplyDBQueue DEFAULT = new	PlayerFriendApplyDBQueue();
	public static PlayerFriendApplyDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerFriendApplyDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendApply> getDao() {
		return PlayerFriendApplyDaoImpl.getDefault();
	}
}

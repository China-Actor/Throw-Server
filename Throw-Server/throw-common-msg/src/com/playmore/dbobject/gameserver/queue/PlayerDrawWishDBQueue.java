package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerDrawWish;
import com.playmore.dbobject.gameserver.dao.PlayerDrawWishDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerDrawWishDBQueue extends DefaultDBQueue<PlayerDrawWish> {

	private static final PlayerDrawWishDBQueue DEFAULT = new	PlayerDrawWishDBQueue();
	public static PlayerDrawWishDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerDrawWishDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerDrawWish> getDao() {
		return PlayerDrawWishDaoImpl.getDefault();
	}
}

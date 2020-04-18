package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerGift;
import com.playmore.dbobject.gameserver.dao.PlayerGiftDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerGiftDBQueue extends DefaultDBQueue<PlayerGift> {

	private static final PlayerGiftDBQueue DEFAULT = new	PlayerGiftDBQueue();
	public static PlayerGiftDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerGiftDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerGift> getDao() {
		return PlayerGiftDaoImpl.getDefault();
	}
}

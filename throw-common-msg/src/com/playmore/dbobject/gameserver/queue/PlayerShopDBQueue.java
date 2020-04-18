package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerShop;
import com.playmore.dbobject.gameserver.dao.PlayerShopDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerShopDBQueue extends DefaultDBQueue<PlayerShop> {

	private static final PlayerShopDBQueue DEFAULT = new	PlayerShopDBQueue();
	public static PlayerShopDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerShopDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerShop> getDao() {
		return PlayerShopDaoImpl.getDefault();
	}
}

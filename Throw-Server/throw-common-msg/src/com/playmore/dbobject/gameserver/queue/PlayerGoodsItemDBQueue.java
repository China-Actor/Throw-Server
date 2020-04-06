package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerGoodsItem;
import com.playmore.dbobject.gameserver.dao.PlayerGoodsItemDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerGoodsItemDBQueue extends DefaultDBQueue<PlayerGoodsItem> {

	private static final PlayerGoodsItemDBQueue DEFAULT = new	PlayerGoodsItemDBQueue();
	public static PlayerGoodsItemDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerGoodsItemDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerGoodsItem> getDao() {
		return PlayerGoodsItemDaoImpl.getDefault();
	}
}

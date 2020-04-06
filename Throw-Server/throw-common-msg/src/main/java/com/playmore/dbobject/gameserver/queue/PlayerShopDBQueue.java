package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerShop;
import com.playmore.dbobject.gameserver.dao.PlayerShopDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerShopDBQueue extends DefaultDBQueue<PlayerShop> {

	@Autowired
	PlayerShopDaoImpl daoImpl;

	private PlayerShopDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerShop> getDao() {
		return this.daoImpl;
	}
}

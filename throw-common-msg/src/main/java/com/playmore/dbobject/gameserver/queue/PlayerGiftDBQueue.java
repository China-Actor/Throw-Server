package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerGift;
import com.playmore.dbobject.gameserver.dao.PlayerGiftDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerGiftDBQueue extends DefaultDBQueue<PlayerGift> {

	@Autowired
	PlayerGiftDaoImpl daoImpl;

	private PlayerGiftDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerGift> getDao() {
		return this.daoImpl;
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerDrawWish;
import com.playmore.dbobject.gameserver.dao.PlayerDrawWishDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerDrawWishDBQueue extends DefaultDBQueue<PlayerDrawWish> {

	@Autowired
	PlayerDrawWishDaoImpl daoImpl;

	private PlayerDrawWishDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerDrawWish> getDao() {
		return this.daoImpl;
	}
}

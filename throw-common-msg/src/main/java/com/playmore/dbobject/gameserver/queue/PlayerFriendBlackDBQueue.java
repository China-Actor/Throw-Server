package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendBlack;
import com.playmore.dbobject.gameserver.dao.PlayerFriendBlackDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFriendBlackDBQueue extends DefaultDBQueue<PlayerFriendBlack> {

	@Autowired
	PlayerFriendBlackDaoImpl daoImpl;

	private PlayerFriendBlackDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendBlack> getDao() {
		return this.daoImpl;
	}
}

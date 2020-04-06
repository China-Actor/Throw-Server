package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriend;
import com.playmore.dbobject.gameserver.dao.PlayerFriendDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFriendDBQueue extends DefaultDBQueue<PlayerFriend> {

	@Autowired
	PlayerFriendDaoImpl daoImpl;

	private PlayerFriendDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriend> getDao() {
		return this.daoImpl;
	}
}

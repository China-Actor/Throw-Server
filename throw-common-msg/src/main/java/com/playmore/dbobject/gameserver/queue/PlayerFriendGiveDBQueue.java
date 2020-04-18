package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendGive;
import com.playmore.dbobject.gameserver.dao.PlayerFriendGiveDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFriendGiveDBQueue extends DefaultDBQueue<PlayerFriendGive> {

	@Autowired
	PlayerFriendGiveDaoImpl daoImpl;

	private PlayerFriendGiveDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendGive> getDao() {
		return this.daoImpl;
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendDraw;
import com.playmore.dbobject.gameserver.dao.PlayerFriendDrawDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFriendDrawDBQueue extends DefaultDBQueue<PlayerFriendDraw> {

	@Autowired
	PlayerFriendDrawDaoImpl daoImpl;

	private PlayerFriendDrawDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendDraw> getDao() {
		return this.daoImpl;
	}
}

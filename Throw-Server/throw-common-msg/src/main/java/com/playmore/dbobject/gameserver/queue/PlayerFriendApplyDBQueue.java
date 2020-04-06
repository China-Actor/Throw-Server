package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFriendApply;
import com.playmore.dbobject.gameserver.dao.PlayerFriendApplyDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFriendApplyDBQueue extends DefaultDBQueue<PlayerFriendApply> {

	@Autowired
	PlayerFriendApplyDaoImpl daoImpl;

	private PlayerFriendApplyDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFriendApply> getDao() {
		return this.daoImpl;
	}
}

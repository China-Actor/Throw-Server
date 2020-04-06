package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArenaHigher;
import com.playmore.dbobject.gameserver.dao.PlayerArenaHigherDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerArenaHigherDBQueue extends DefaultDBQueue<PlayerArenaHigher> {

	@Autowired
	PlayerArenaHigherDaoImpl daoImpl;

	private PlayerArenaHigherDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArenaHigher> getDao() {
		return this.daoImpl;
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTask;
import com.playmore.dbobject.gameserver.dao.PlayerTaskDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerTaskDBQueue extends DefaultDBQueue<PlayerTask> {

	@Autowired
	PlayerTaskDaoImpl daoImpl;

	private PlayerTaskDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTask> getDao() {
		return this.daoImpl;
	}
}

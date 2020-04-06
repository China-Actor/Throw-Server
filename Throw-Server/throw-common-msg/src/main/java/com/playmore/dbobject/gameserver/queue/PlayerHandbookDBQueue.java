package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerHandbook;
import com.playmore.dbobject.gameserver.dao.PlayerHandbookDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerHandbookDBQueue extends DefaultDBQueue<PlayerHandbook> {

	@Autowired
	PlayerHandbookDaoImpl daoImpl;

	private PlayerHandbookDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerHandbook> getDao() {
		return this.daoImpl;
	}
}

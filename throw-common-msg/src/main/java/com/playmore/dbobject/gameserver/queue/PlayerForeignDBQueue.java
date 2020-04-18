package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerForeign;
import com.playmore.dbobject.gameserver.dao.PlayerForeignDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerForeignDBQueue extends DefaultDBQueue<PlayerForeign> {

	@Autowired
	PlayerForeignDaoImpl daoImpl;

	private PlayerForeignDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerForeign> getDao() {
		return this.daoImpl;
	}
}

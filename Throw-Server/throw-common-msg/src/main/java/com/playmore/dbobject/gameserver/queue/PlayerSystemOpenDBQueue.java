package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSystemOpen;
import com.playmore.dbobject.gameserver.dao.PlayerSystemOpenDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerSystemOpenDBQueue extends DefaultDBQueue<PlayerSystemOpen> {

	@Autowired
	PlayerSystemOpenDaoImpl daoImpl;

	private PlayerSystemOpenDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSystemOpen> getDao() {
		return this.daoImpl;
	}
}

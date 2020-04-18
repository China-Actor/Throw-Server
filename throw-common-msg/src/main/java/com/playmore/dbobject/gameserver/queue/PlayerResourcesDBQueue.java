package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerResources;
import com.playmore.dbobject.gameserver.dao.PlayerResourcesDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerResourcesDBQueue extends DefaultDBQueue<PlayerResources> {

	@Autowired
	PlayerResourcesDaoImpl daoImpl;

	private PlayerResourcesDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerResources> getDao() {
		return this.daoImpl;
	}
}

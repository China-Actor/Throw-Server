package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTower;
import com.playmore.dbobject.gameserver.dao.PlayerTowerDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerTowerDBQueue extends DefaultDBQueue<PlayerTower> {

	@Autowired
	PlayerTowerDaoImpl daoImpl;

	private PlayerTowerDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTower> getDao() {
		return this.daoImpl;
	}
}

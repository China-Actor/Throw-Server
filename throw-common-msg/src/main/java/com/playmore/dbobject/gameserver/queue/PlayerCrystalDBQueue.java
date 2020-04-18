package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerCrystal;
import com.playmore.dbobject.gameserver.dao.PlayerCrystalDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerCrystalDBQueue extends DefaultDBQueue<PlayerCrystal> {

	@Autowired
	PlayerCrystalDaoImpl daoImpl;

	private PlayerCrystalDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerCrystal> getDao() {
		return this.daoImpl;
	}
}

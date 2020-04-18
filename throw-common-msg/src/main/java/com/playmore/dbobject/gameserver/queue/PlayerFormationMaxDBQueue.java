package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFormationMax;
import com.playmore.dbobject.gameserver.dao.PlayerFormationMaxDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFormationMaxDBQueue extends DefaultDBQueue<PlayerFormationMax> {

	@Autowired
	PlayerFormationMaxDaoImpl daoImpl;

	private PlayerFormationMaxDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFormationMax> getDao() {
		return this.daoImpl;
	}
}

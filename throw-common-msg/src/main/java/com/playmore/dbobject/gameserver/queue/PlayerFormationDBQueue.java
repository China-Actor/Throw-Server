package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerFormation;
import com.playmore.dbobject.gameserver.dao.PlayerFormationDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerFormationDBQueue extends DefaultDBQueue<PlayerFormation> {

	@Autowired
	PlayerFormationDaoImpl daoImpl;

	private PlayerFormationDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerFormation> getDao() {
		return this.daoImpl;
	}
}

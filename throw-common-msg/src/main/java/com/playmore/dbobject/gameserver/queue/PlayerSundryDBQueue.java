package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSundry;
import com.playmore.dbobject.gameserver.dao.PlayerSundryDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerSundryDBQueue extends DefaultDBQueue<PlayerSundry> {

	@Autowired
	PlayerSundryDaoImpl daoImpl;

	private PlayerSundryDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSundry> getDao() {
		return this.daoImpl;
	}
}

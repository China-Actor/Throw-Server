package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerForeginLog;
import com.playmore.dbobject.gameserver.dao.PlayerForeginLogDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerForeginLogDBQueue extends DefaultDBQueue<PlayerForeginLog> {

	@Autowired
	PlayerForeginLogDaoImpl daoImpl;

	private PlayerForeginLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerForeginLog> getDao() {
		return this.daoImpl;
	}
}

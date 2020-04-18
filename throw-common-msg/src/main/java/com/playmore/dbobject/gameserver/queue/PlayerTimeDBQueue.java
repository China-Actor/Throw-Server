package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTime;
import com.playmore.dbobject.gameserver.dao.PlayerTimeDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerTimeDBQueue extends DefaultDBQueue<PlayerTime> {

	@Autowired
	PlayerTimeDaoImpl daoImpl;

	private PlayerTimeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTime> getDao() {
		return this.daoImpl;
	}
}

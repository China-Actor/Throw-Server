package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTimePeakLog;
import com.playmore.dbobject.gameserver.dao.PlayerTimePeakLogDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerTimePeakLogDBQueue extends DefaultDBQueue<PlayerTimePeakLog> {

	@Autowired
	PlayerTimePeakLogDaoImpl daoImpl;

	private PlayerTimePeakLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTimePeakLog> getDao() {
		return this.daoImpl;
	}
}

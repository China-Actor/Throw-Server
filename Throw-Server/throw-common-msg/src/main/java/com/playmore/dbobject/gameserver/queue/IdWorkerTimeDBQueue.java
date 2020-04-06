package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.IdWorkerTime;
import com.playmore.dbobject.gameserver.dao.IdWorkerTimeDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class IdWorkerTimeDBQueue extends DefaultDBQueue<IdWorkerTime> {

	@Autowired
	IdWorkerTimeDaoImpl daoImpl;

	private IdWorkerTimeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<IdWorkerTime> getDao() {
		return this.daoImpl;
	}
}

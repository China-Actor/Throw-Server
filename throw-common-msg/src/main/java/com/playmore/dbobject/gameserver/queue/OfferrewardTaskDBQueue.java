package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.OfferrewardTask;
import com.playmore.dbobject.gameserver.dao.OfferrewardTaskDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class OfferrewardTaskDBQueue extends DefaultDBQueue<OfferrewardTask> {

	@Autowired
	OfferrewardTaskDaoImpl daoImpl;

	private OfferrewardTaskDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<OfferrewardTask> getDao() {
		return this.daoImpl;
	}
}

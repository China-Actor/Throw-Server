package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTimePeak;
import com.playmore.dbobject.gameserver.dao.PlayerTimePeakDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerTimePeakDBQueue extends DefaultDBQueue<PlayerTimePeak> {

	@Autowired
	PlayerTimePeakDaoImpl daoImpl;

	private PlayerTimePeakDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTimePeak> getDao() {
		return this.daoImpl;
	}
}

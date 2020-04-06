package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.ServerTime;
import com.playmore.dbobject.gameserver.dao.ServerTimeDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class ServerTimeDBQueue extends DefaultDBQueue<ServerTime> {

	@Autowired
	ServerTimeDaoImpl daoImpl;

	private ServerTimeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerTime> getDao() {
		return this.daoImpl;
	}
}

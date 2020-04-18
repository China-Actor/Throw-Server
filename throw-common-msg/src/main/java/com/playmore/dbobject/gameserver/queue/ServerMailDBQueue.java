package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.ServerMail;
import com.playmore.dbobject.gameserver.dao.ServerMailDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class ServerMailDBQueue extends DefaultDBQueue<ServerMail> {

	@Autowired
	ServerMailDaoImpl daoImpl;

	private ServerMailDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<ServerMail> getDao() {
		return this.daoImpl;
	}
}

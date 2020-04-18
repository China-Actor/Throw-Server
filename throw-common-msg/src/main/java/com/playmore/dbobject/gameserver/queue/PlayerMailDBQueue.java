package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerMail;
import com.playmore.dbobject.gameserver.dao.PlayerMailDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerMailDBQueue extends DefaultDBQueue<PlayerMail> {

	@Autowired
	PlayerMailDaoImpl daoImpl;

	private PlayerMailDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerMail> getDao() {
		return this.daoImpl;
	}
}

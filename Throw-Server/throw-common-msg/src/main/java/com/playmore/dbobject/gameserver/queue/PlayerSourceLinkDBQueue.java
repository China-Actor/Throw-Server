package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSourceLink;
import com.playmore.dbobject.gameserver.dao.PlayerSourceLinkDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerSourceLinkDBQueue extends DefaultDBQueue<PlayerSourceLink> {

	@Autowired
	PlayerSourceLinkDaoImpl daoImpl;

	private PlayerSourceLinkDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSourceLink> getDao() {
		return this.daoImpl;
	}
}

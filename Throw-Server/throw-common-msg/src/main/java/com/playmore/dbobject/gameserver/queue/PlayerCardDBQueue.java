package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerCard;
import com.playmore.dbobject.gameserver.dao.PlayerCardDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerCardDBQueue extends DefaultDBQueue<PlayerCard> {

	@Autowired
	PlayerCardDaoImpl daoImpl;

	private PlayerCardDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerCard> getDao() {
		return this.daoImpl;
	}
}

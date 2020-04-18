package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerDraw;
import com.playmore.dbobject.gameserver.dao.PlayerDrawDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerDrawDBQueue extends DefaultDBQueue<PlayerDraw> {

	@Autowired
	PlayerDrawDaoImpl daoImpl;

	private PlayerDrawDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerDraw> getDao() {
		return this.daoImpl;
	}
}

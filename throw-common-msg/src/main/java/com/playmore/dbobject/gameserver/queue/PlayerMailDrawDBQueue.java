package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerMailDraw;
import com.playmore.dbobject.gameserver.dao.PlayerMailDrawDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerMailDrawDBQueue extends DefaultDBQueue<PlayerMailDraw> {

	@Autowired
	PlayerMailDrawDaoImpl daoImpl;

	private PlayerMailDrawDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerMailDraw> getDao() {
		return this.daoImpl;
	}
}

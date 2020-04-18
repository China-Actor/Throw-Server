package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTaskBox;
import com.playmore.dbobject.gameserver.dao.PlayerTaskBoxDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerTaskBoxDBQueue extends DefaultDBQueue<PlayerTaskBox> {

	@Autowired
	PlayerTaskBoxDaoImpl daoImpl;

	private PlayerTaskBoxDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTaskBox> getDao() {
		return this.daoImpl;
	}
}

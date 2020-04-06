package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerForeginAid;
import com.playmore.dbobject.gameserver.dao.PlayerForeginAidDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerForeginAidDBQueue extends DefaultDBQueue<PlayerForeginAid> {

	@Autowired
	PlayerForeginAidDaoImpl daoImpl;

	private PlayerForeginAidDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerForeginAid> getDao() {
		return this.daoImpl;
	}
}

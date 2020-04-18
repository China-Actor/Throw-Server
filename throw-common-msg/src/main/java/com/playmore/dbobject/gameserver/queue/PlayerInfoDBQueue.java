package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerInfo;
import com.playmore.dbobject.gameserver.dao.PlayerInfoDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerInfoDBQueue extends DefaultDBQueue<PlayerInfo> {

	@Autowired
	PlayerInfoDaoImpl daoImpl;

	private PlayerInfoDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerInfo> getDao() {
		return this.daoImpl;
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArena;
import com.playmore.dbobject.gameserver.dao.PlayerArenaDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerArenaDBQueue extends DefaultDBQueue<PlayerArena> {

	@Autowired
	PlayerArenaDaoImpl daoImpl;

	private PlayerArenaDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArena> getDao() {
		return this.daoImpl;
	}
}

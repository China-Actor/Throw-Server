package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerStage;
import com.playmore.dbobject.gameserver.dao.PlayerStageDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerStageDBQueue extends DefaultDBQueue<PlayerStage> {

	@Autowired
	PlayerStageDaoImpl daoImpl;

	private PlayerStageDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerStage> getDao() {
		return this.daoImpl;
	}
}

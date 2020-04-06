package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArenaHighChallengeRecord;
import com.playmore.dbobject.gameserver.dao.PlayerArenaHighChallengeRecordDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerArenaHighChallengeRecordDBQueue extends DefaultDBQueue<PlayerArenaHighChallengeRecord> {

	@Autowired
	PlayerArenaHighChallengeRecordDaoImpl daoImpl;

	private PlayerArenaHighChallengeRecordDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArenaHighChallengeRecord> getDao() {
		return this.daoImpl;
	}
}

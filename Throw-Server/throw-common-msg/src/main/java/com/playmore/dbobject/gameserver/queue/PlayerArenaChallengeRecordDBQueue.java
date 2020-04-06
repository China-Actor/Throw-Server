package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArenaChallengeRecord;
import com.playmore.dbobject.gameserver.dao.PlayerArenaChallengeRecordDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerArenaChallengeRecordDBQueue extends DefaultDBQueue<PlayerArenaChallengeRecord> {

	@Autowired
	PlayerArenaChallengeRecordDaoImpl daoImpl;

	private PlayerArenaChallengeRecordDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArenaChallengeRecord> getDao() {
		return this.daoImpl;
	}
}

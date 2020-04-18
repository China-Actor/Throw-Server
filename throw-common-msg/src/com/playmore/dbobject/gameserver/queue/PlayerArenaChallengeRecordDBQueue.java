package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArenaChallengeRecord;
import com.playmore.dbobject.gameserver.dao.PlayerArenaChallengeRecordDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaChallengeRecordDBQueue extends DefaultDBQueue<PlayerArenaChallengeRecord> {

	private static final PlayerArenaChallengeRecordDBQueue DEFAULT = new	PlayerArenaChallengeRecordDBQueue();
	public static PlayerArenaChallengeRecordDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerArenaChallengeRecordDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArenaChallengeRecord> getDao() {
		return PlayerArenaChallengeRecordDaoImpl.getDefault();
	}
}

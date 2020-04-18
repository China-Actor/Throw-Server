package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerArenaHighChallengeRecord;
import com.playmore.dbobject.gameserver.dao.PlayerArenaHighChallengeRecordDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerArenaHighChallengeRecordDBQueue extends DefaultDBQueue<PlayerArenaHighChallengeRecord> {

	private static final PlayerArenaHighChallengeRecordDBQueue DEFAULT = new	PlayerArenaHighChallengeRecordDBQueue();
	public static PlayerArenaHighChallengeRecordDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerArenaHighChallengeRecordDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerArenaHighChallengeRecord> getDao() {
		return PlayerArenaHighChallengeRecordDaoImpl.getDefault();
	}
}

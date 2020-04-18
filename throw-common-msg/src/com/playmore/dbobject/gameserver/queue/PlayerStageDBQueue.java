package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerStage;
import com.playmore.dbobject.gameserver.dao.PlayerStageDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerStageDBQueue extends DefaultDBQueue<PlayerStage> {

	private static final PlayerStageDBQueue DEFAULT = new	PlayerStageDBQueue();
	public static PlayerStageDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerStageDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerStage> getDao() {
		return PlayerStageDaoImpl.getDefault();
	}
}

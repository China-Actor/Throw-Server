package com.playmore.dbobject.configcenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.configcenter.GameServerMerge;
import com.playmore.dbobject.configcenter.dao.GameServerMergeDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GameServerMergeDBQueue extends DefaultDBQueue<GameServerMerge> {

	private static final GameServerMergeDBQueue DEFAULT = new	GameServerMergeDBQueue();
	public static GameServerMergeDBQueue getDefault() {
		return DEFAULT;
	}
	private GameServerMergeDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GameServerMerge> getDao() {
		return GameServerMergeDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.configcenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.configcenter.GameServer;
import com.playmore.dbobject.configcenter.dao.GameServerDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GameServerDBQueue extends DefaultDBQueue<GameServer> {

	private static final GameServerDBQueue DEFAULT = new	GameServerDBQueue();
	public static GameServerDBQueue getDefault() {
		return DEFAULT;
	}
	private GameServerDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GameServer> getDao() {
		return GameServerDaoImpl.getDefault();
	}
}

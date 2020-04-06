package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerInfo;
import com.playmore.dbobject.gameserver.dao.PlayerInfoDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerInfoDBQueue extends DefaultDBQueue<PlayerInfo> {

	private static final PlayerInfoDBQueue DEFAULT = new	PlayerInfoDBQueue();
	public static PlayerInfoDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerInfoDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerInfo> getDao() {
		return PlayerInfoDaoImpl.getDefault();
	}
}

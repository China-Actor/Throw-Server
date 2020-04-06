package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerTaskBox;
import com.playmore.dbobject.gameserver.dao.PlayerTaskBoxDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerTaskBoxDBQueue extends DefaultDBQueue<PlayerTaskBox> {

	private static final PlayerTaskBoxDBQueue DEFAULT = new	PlayerTaskBoxDBQueue();
	public static PlayerTaskBoxDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerTaskBoxDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerTaskBox> getDao() {
		return PlayerTaskBoxDaoImpl.getDefault();
	}
}

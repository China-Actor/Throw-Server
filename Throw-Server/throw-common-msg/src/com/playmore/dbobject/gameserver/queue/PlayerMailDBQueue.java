package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerMail;
import com.playmore.dbobject.gameserver.dao.PlayerMailDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMailDBQueue extends DefaultDBQueue<PlayerMail> {

	private static final PlayerMailDBQueue DEFAULT = new	PlayerMailDBQueue();
	public static PlayerMailDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerMailDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerMail> getDao() {
		return PlayerMailDaoImpl.getDefault();
	}
}

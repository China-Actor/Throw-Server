package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.PlayerInfoData;
import com.playmore.dbobject.guild.dao.PlayerInfoDataDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerInfoDataDBQueue extends DefaultDBQueue<PlayerInfoData> {

	private static final PlayerInfoDataDBQueue DEFAULT = new	PlayerInfoDataDBQueue();
	public static PlayerInfoDataDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerInfoDataDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerInfoData> getDao() {
		return PlayerInfoDataDaoImpl.getDefault();
	}
}

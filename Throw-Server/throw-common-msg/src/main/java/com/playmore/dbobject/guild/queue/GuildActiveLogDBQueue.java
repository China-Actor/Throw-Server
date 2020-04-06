package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildActiveLog;
import com.playmore.dbobject.guild.dao.GuildActiveLogDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildActiveLogDBQueue extends DefaultDBQueue<GuildActiveLog> {

	private static final GuildActiveLogDBQueue DEFAULT = new	GuildActiveLogDBQueue();
	public static GuildActiveLogDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildActiveLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildActiveLog> getDao() {
		return GuildActiveLogDaoImpl.getDefault();
	}
}

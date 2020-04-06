package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildLog;
import com.playmore.dbobject.guild.dao.GuildLogDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildLogDBQueue extends DefaultDBQueue<GuildLog> {

	private static final GuildLogDBQueue DEFAULT = new	GuildLogDBQueue();
	public static GuildLogDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildLogDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildLog> getDao() {
		return GuildLogDaoImpl.getDefault();
	}
}

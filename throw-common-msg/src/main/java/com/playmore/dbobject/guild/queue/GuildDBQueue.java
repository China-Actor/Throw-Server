package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.Guild;
import com.playmore.dbobject.guild.dao.GuildDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildDBQueue extends DefaultDBQueue<Guild> {

	private static final GuildDBQueue DEFAULT = new	GuildDBQueue();
	public static GuildDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<Guild> getDao() {
		return GuildDaoImpl.getDefault();
	}
}

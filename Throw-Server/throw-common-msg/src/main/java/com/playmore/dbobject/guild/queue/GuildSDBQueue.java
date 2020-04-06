package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildS;
import com.playmore.dbobject.guild.dao.GuildSDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildSDBQueue extends DefaultDBQueue<GuildS> {

	private static final GuildSDBQueue DEFAULT = new	GuildSDBQueue();
	public static GuildSDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildSDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildS> getDao() {
		return GuildSDaoImpl.getDefault();
	}
}

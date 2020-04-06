package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildMail;
import com.playmore.dbobject.guild.dao.GuildMailDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildMailDBQueue extends DefaultDBQueue<GuildMail> {

	private static final GuildMailDBQueue DEFAULT = new	GuildMailDBQueue();
	public static GuildMailDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildMailDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildMail> getDao() {
		return GuildMailDaoImpl.getDefault();
	}
}

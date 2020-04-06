package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildApply;
import com.playmore.dbobject.guild.dao.GuildApplyDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildApplyDBQueue extends DefaultDBQueue<GuildApply> {

	private static final GuildApplyDBQueue DEFAULT = new	GuildApplyDBQueue();
	public static GuildApplyDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildApplyDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildApply> getDao() {
		return GuildApplyDaoImpl.getDefault();
	}
}

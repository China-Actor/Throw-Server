package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildBossHurt;
import com.playmore.dbobject.guild.dao.GuildBossHurtDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildBossHurtDBQueue extends DefaultDBQueue<GuildBossHurt> {

	private static final GuildBossHurtDBQueue DEFAULT = new	GuildBossHurtDBQueue();
	public static GuildBossHurtDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildBossHurtDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildBossHurt> getDao() {
		return GuildBossHurtDaoImpl.getDefault();
	}
}

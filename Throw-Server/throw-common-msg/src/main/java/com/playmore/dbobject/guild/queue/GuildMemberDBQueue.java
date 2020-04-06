package com.playmore.dbobject.guild.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.guild.GuildMember;
import com.playmore.dbobject.guild.dao.GuildMemberDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildMemberDBQueue extends DefaultDBQueue<GuildMember> {

	private static final GuildMemberDBQueue DEFAULT = new	GuildMemberDBQueue();
	public static GuildMemberDBQueue getDefault() {
		return DEFAULT;
	}
	private GuildMemberDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<GuildMember> getDao() {
		return GuildMemberDaoImpl.getDefault();
	}
}

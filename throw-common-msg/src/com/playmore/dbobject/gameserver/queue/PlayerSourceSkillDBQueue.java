package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSourceSkill;
import com.playmore.dbobject.gameserver.dao.PlayerSourceSkillDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSourceSkillDBQueue extends DefaultDBQueue<PlayerSourceSkill> {

	private static final PlayerSourceSkillDBQueue DEFAULT = new	PlayerSourceSkillDBQueue();
	public static PlayerSourceSkillDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerSourceSkillDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSourceSkill> getDao() {
		return PlayerSourceSkillDaoImpl.getDefault();
	}
}

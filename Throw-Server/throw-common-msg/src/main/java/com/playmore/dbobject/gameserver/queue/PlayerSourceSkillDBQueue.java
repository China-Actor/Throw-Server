package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerSourceSkill;
import com.playmore.dbobject.gameserver.dao.PlayerSourceSkillDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerSourceSkillDBQueue extends DefaultDBQueue<PlayerSourceSkill> {

	@Autowired
	PlayerSourceSkillDaoImpl daoImpl;

	private PlayerSourceSkillDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerSourceSkill> getDao() {
		return this.daoImpl;
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerMazeTemplate;
import com.playmore.dbobject.gameserver.dao.PlayerMazeTemplateDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerMazeTemplateDBQueue extends DefaultDBQueue<PlayerMazeTemplate> {

	@Autowired
	PlayerMazeTemplateDaoImpl daoImpl;

	private PlayerMazeTemplateDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerMazeTemplate> getDao() {
		return this.daoImpl;
	}
}

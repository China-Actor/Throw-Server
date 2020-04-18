package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerMazeTemplate;
import com.playmore.dbobject.gameserver.dao.PlayerMazeTemplateDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMazeTemplateDBQueue extends DefaultDBQueue<PlayerMazeTemplate> {

	private static final PlayerMazeTemplateDBQueue DEFAULT = new	PlayerMazeTemplateDBQueue();
	public static PlayerMazeTemplateDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerMazeTemplateDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerMazeTemplate> getDao() {
		return PlayerMazeTemplateDaoImpl.getDefault();
	}
}

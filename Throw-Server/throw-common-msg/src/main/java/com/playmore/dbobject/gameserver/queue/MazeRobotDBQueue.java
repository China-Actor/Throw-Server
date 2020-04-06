package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.MazeRobot;
import com.playmore.dbobject.gameserver.dao.MazeRobotDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class MazeRobotDBQueue extends DefaultDBQueue<MazeRobot> {

	@Autowired
	MazeRobotDaoImpl daoImpl;

	private MazeRobotDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<MazeRobot> getDao() {
		return this.daoImpl;
	}
}

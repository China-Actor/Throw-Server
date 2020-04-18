package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.MazeRobot;
import com.playmore.dbobject.gameserver.dao.MazeRobotDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeRobotDBQueue extends DefaultDBQueue<MazeRobot> {

	private static final MazeRobotDBQueue DEFAULT = new	MazeRobotDBQueue();
	public static MazeRobotDBQueue getDefault() {
		return DEFAULT;
	}
	private MazeRobotDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<MazeRobot> getDao() {
		return MazeRobotDaoImpl.getDefault();
	}
}

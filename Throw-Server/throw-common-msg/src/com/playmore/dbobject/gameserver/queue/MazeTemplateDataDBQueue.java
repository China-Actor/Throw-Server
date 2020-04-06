package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.MazeTemplateData;
import com.playmore.dbobject.gameserver.dao.MazeTemplateDataDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeTemplateDataDBQueue extends DefaultDBQueue<MazeTemplateData> {

	private static final MazeTemplateDataDBQueue DEFAULT = new	MazeTemplateDataDBQueue();
	public static MazeTemplateDataDBQueue getDefault() {
		return DEFAULT;
	}
	private MazeTemplateDataDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<MazeTemplateData> getDao() {
		return MazeTemplateDataDaoImpl.getDefault();
	}
}

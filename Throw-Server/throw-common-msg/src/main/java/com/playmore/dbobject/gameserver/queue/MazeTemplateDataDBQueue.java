package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.MazeTemplateData;
import com.playmore.dbobject.gameserver.dao.MazeTemplateDataDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class MazeTemplateDataDBQueue extends DefaultDBQueue<MazeTemplateData> {

	@Autowired
	MazeTemplateDataDaoImpl daoImpl;

	private MazeTemplateDataDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<MazeTemplateData> getDao() {
		return this.daoImpl;
	}
}

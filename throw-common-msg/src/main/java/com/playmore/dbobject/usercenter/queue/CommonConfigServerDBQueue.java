package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.CommonConfigServer;
import com.playmore.dbobject.usercenter.dao.CommonConfigServerDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CommonConfigServerDBQueue extends DefaultDBQueue<CommonConfigServer> {

	private static final CommonConfigServerDBQueue DEFAULT = new	CommonConfigServerDBQueue();
	public static CommonConfigServerDBQueue getDefault() {
		return DEFAULT;
	}
	private CommonConfigServerDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<CommonConfigServer> getDao() {
		return CommonConfigServerDaoImpl.getDefault();
	}
}

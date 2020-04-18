package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.CommonConfig;
import com.playmore.dbobject.usercenter.dao.CommonConfigDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CommonConfigDBQueue extends DefaultDBQueue<CommonConfig> {

	private static final CommonConfigDBQueue DEFAULT = new	CommonConfigDBQueue();
	public static CommonConfigDBQueue getDefault() {
		return DEFAULT;
	}
	private CommonConfigDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<CommonConfig> getDao() {
		return CommonConfigDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.User;
import com.playmore.dbobject.usercenter.dao.UserDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class UserDBQueue extends DefaultDBQueue<User> {

	private static final UserDBQueue DEFAULT = new	UserDBQueue();
	public static UserDBQueue getDefault() {
		return DEFAULT;
	}
	private UserDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<User> getDao() {
		return UserDaoImpl.getDefault();
	}
}

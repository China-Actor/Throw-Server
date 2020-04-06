package com.playmore.dbobject.usercenter.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.usercenter.Message;
import com.playmore.dbobject.usercenter.dao.MessageDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MessageDBQueue extends DefaultDBQueue<Message> {

	private static final MessageDBQueue DEFAULT = new	MessageDBQueue();
	public static MessageDBQueue getDefault() {
		return DEFAULT;
	}
	private MessageDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<Message> getDao() {
		return MessageDaoImpl.getDefault();
	}
}

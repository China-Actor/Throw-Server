package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.VipRecv;
import com.playmore.dbobject.gameserver.dao.VipRecvDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class VipRecvDBQueue extends DefaultDBQueue<VipRecv> {

	private static final VipRecvDBQueue DEFAULT = new	VipRecvDBQueue();
	public static VipRecvDBQueue getDefault() {
		return DEFAULT;
	}
	private VipRecvDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<VipRecv> getDao() {
		return VipRecvDaoImpl.getDefault();
	}
}

package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.VipRecv;
import com.playmore.dbobject.gameserver.dao.VipRecvDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class VipRecvDBQueue extends DefaultDBQueue<VipRecv> {

	@Autowired
	VipRecvDaoImpl daoImpl;

	private VipRecvDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<VipRecv> getDao() {
		return this.daoImpl;
	}
}

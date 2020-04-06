package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerCrystalSlot;
import com.playmore.dbobject.gameserver.dao.PlayerCrystalSlotDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerCrystalSlotDBQueue extends DefaultDBQueue<PlayerCrystalSlot> {

	@Autowired
	PlayerCrystalSlotDaoImpl daoImpl;

	private PlayerCrystalSlotDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerCrystalSlot> getDao() {
		return this.daoImpl;
	}
}

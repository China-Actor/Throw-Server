package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerEquipment;
import com.playmore.dbobject.gameserver.dao.PlayerEquipmentDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerEquipmentDBQueue extends DefaultDBQueue<PlayerEquipment> {

	@Autowired
	PlayerEquipmentDaoImpl daoImpl;

	private PlayerEquipmentDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerEquipment> getDao() {
		return this.daoImpl;
	}
}

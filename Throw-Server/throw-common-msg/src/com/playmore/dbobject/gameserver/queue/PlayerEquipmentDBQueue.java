package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerEquipment;
import com.playmore.dbobject.gameserver.dao.PlayerEquipmentDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerEquipmentDBQueue extends DefaultDBQueue<PlayerEquipment> {

	private static final PlayerEquipmentDBQueue DEFAULT = new	PlayerEquipmentDBQueue();
	public static PlayerEquipmentDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerEquipmentDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerEquipment> getDao() {
		return PlayerEquipmentDaoImpl.getDefault();
	}
}

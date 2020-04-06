package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerCrystalSlot;
import com.playmore.dbobject.gameserver.dao.PlayerCrystalSlotDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerCrystalSlotDBQueue extends DefaultDBQueue<PlayerCrystalSlot> {

	private static final PlayerCrystalSlotDBQueue DEFAULT = new	PlayerCrystalSlotDBQueue();
	public static PlayerCrystalSlotDBQueue getDefault() {
		return DEFAULT;
	}
	private PlayerCrystalSlotDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerCrystalSlot> getDao() {
		return PlayerCrystalSlotDaoImpl.getDefault();
	}
}

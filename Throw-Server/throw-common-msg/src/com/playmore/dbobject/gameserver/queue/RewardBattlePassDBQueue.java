package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.RewardBattlePass;
import com.playmore.dbobject.gameserver.dao.RewardBattlePassDaoImpl;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RewardBattlePassDBQueue extends DefaultDBQueue<RewardBattlePass> {

	private static final RewardBattlePassDBQueue DEFAULT = new	RewardBattlePassDBQueue();
	public static RewardBattlePassDBQueue getDefault() {
		return DEFAULT;
	}
	private RewardBattlePassDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<RewardBattlePass> getDao() {
		return RewardBattlePassDaoImpl.getDefault();
	}
}

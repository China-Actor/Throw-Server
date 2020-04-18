package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.RewardBattlePass;
import com.playmore.dbobject.gameserver.dao.RewardBattlePassDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class RewardBattlePassDBQueue extends DefaultDBQueue<RewardBattlePass> {

	@Autowired
	RewardBattlePassDaoImpl daoImpl;

	private RewardBattlePassDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<RewardBattlePass> getDao() {
		return this.daoImpl;
	}
}

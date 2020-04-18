package com.playmore.dbobject.gameserver.queue;

import com.playmore.database.dao.DBQueueDao;
import com.playmore.database.dbqueue.DBQueueManager;
import com.playmore.database.dbqueue.DefaultDBQueue;
import com.playmore.dbobject.gameserver.PlayerGoodsItem;
import com.playmore.dbobject.gameserver.dao.PlayerGoodsItemDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Do not touch! Close it Now!
 **/
@Component
public class PlayerGoodsItemDBQueue extends DefaultDBQueue<PlayerGoodsItem> {

	@Autowired
	PlayerGoodsItemDaoImpl daoImpl;

	private PlayerGoodsItemDBQueue(){
		DBQueueManager.getDefault().addDbQueue(this);
	}
	public DBQueueDao<PlayerGoodsItem> getDao() {
		return this.daoImpl;
	}
}

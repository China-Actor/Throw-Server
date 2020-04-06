package com.playmore.util;

import java.util.Collection;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.playmore.database.idgenerator.IDFactory;
import com.playmore.database.idgenerator.IDGeneratorType;
import com.playmore.dbobject.configcenter.GameServer;
import com.playmore.dbobject.gameserver.IdWorkerTime;
import com.playmore.dbobject.gameserver.dao.IdWorkerTimeDaoImpl;
import com.playmore.dbobject.gameserver.queue.IdWorkerTimeDBQueue;
import com.playmore.enumtype.Constants;
import com.playmore.xysword.enumtype.TimeType;


public class GameServerIDUtil {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final GameServerIDUtil DEFAULT = new GameServerIDUtil();
	public static GameServerIDUtil getDefault(){
	
		return DEFAULT;
	}
	
	private GameServerIDUtil() {
		// TODO 临时
		IDFactory.getDefault().createIDGenerator(IDGeneratorType.DefaultDBIDGenerator, 1);
	}
	
	static IdWorkerTime workTime = null;
	
	public long nextId() throws Exception{
		try{
			long id = IDFactory.getDefault().getIDGenerator().nextId();
//			workTime.setLastTimeStamp(DateTools.getCurrentTimeStr(IDFactory.getDefault().getIDGenerator().getLastTimestamp()));
//			IdWorkerTimeDBQueue.getDefault().update(workTime);
			return id;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	//判断服务器时间是否被回拨
//	public void init(){
//	
//		GameServer gameServer = GameServerResourceCache.getDefault().getGameServer();
//		int serverId = gameServer.getId();
//		Collection<IdWorkerTime> workTimeList = IdWorkerTimeDaoImpl.getDefault().queryByPrimary(serverId);
//		if(workTimeList!=null && workTimeList.size()>Constants.ZERO){
//			workTime = workTimeList.iterator().next();
//		}
//		if(isDialBackTime(serverId)){
//			logger.error("server time is dial back");
//			System.exit(0);
//		}else{
//			
//			IDFactory.getDefault().createIDGenerator(IDGeneratorType.DefaultDBIDGenerator, serverId, 
//					DateTools.getCurrentDateMillis(workTime.getLastTimeStamp()));
//		}
//	}
	
//	private boolean isDialBackTime(int serverId){
//		if(workTime==null){
//			workTime = new IdWorkerTime();
//			workTime.setId(serverId);
//			workTime.setLastTimeStamp(DateManagerUtil.getDateNowString(TimeType.SYSTEM_TIME));
//			IdWorkerTimeDBQueue.getDefault().insert(workTime);
//		}
//	
//		return 	DateTools.getStringToDate(workTime.getLastTimeStamp()).after(new Date());
//	}
}

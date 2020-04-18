package com.playmore.dbobject.log.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.playmore.util.TimeUtil2;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class LogoutStat{
	private static Logger logger = LoggerFactory.getLogger("stat.logout");
	public static void printLog(java.util.Date logDate
			, java.lang.Integer serverId
			, java.lang.Long roleId
			, java.lang.Long userId
			, java.lang.String channel
			, java.lang.Integer level
			, java.lang.Integer vipLevel
			, java.util.Date logonDate
			, java.lang.Integer olSeconds
			, java.lang.Long teamExp
			){
		StringBuffer buffer = new StringBuffer();
		buffer.append(TimeUtil2.getStringByDate(logDate)).append(",");
		buffer.append(serverId).append(",");
		buffer.append(roleId).append(",");
		buffer.append(userId).append(",");
		buffer.append(channel).append(",");
		buffer.append(level).append(",");
		buffer.append(vipLevel).append(",");
		buffer.append(TimeUtil2.getStringByDate(logonDate)).append(",");
		buffer.append(olSeconds).append(",");
		buffer.append(teamExp);
		logger.info(buffer.toString());
	}
	public static void printBlankLine(){
		logger.info("");
	}
}

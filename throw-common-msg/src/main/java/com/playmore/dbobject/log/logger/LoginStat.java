package com.playmore.dbobject.log.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.playmore.util.TimeUtil2;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class LoginStat{
	private static Logger logger = LoggerFactory.getLogger("stat.login");
	public static void printLog(java.util.Date logDate
			, java.lang.Integer serverId
			, java.lang.Long roleId
			, java.lang.Long userId
			, java.lang.String channel
			, java.lang.Integer level
			, java.lang.Integer vipLevel
			){
		StringBuffer buffer = new StringBuffer();
		buffer.append(TimeUtil2.getStringByDate(logDate)).append(",");
		buffer.append(serverId).append(",");
		buffer.append(roleId).append(",");
		buffer.append(userId).append(",");
		buffer.append(channel).append(",");
		buffer.append(level).append(",");
		buffer.append(vipLevel);
		logger.info(buffer.toString());
	}
	public static void printBlankLine(){
		logger.info("");
	}
}

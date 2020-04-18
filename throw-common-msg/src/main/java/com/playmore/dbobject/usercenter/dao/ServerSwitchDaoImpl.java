package com.playmore.dbobject.usercenter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;
import com.playmore.database.dao.MutiPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.NoPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.dao.provider.MutiDBProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.playmore.xysword.enumtype.DbType;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.usercenter.ServerSwitch;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerSwitchDaoImpl extends SinglePrimaryKeyDBDaoImpl<ServerSwitch>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ServerSwitchDaoImpl DEFAULT = new	ServerSwitchDaoImpl();
	public static ServerSwitchDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ServerSwitch createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.String channel = rs.getString("channel");
		java.lang.Integer switchType = rs.getInt("switch_type");
		java.lang.String switchName = rs.getString("switch_name");
		java.lang.Integer open = rs.getInt("open");
		java.util.Date beginTime = rs.getTimestamp("begin_time");
		java.util.Date endTime = rs.getTimestamp("end_time");
		java.util.Date updateTime = rs.getTimestamp("update_time");
		ServerSwitch instance = new ServerSwitch();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setChannel(channel);
		instance.setSwitchType(switchType);
		instance.setSwitchName(switchName);
		instance.setOpen(open);
		instance.setBeginTime(beginTime);
		instance.setEndTime(endTime);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO server_switch (`id`,`server_id`,`channel`,`switch_type`,`switch_name`,`open`,`begin_time`,`end_time`,`update_time`) VALUES(:id,:serverId,:channel,:switchType,:switchName,:open,:beginTime,:endTime,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE server_switch SET `server_id`=:serverId,`channel`=:channel,`switch_type`=:switchType,`switch_name`=:switchName,`open`=:open,`begin_time`=:beginTime,`end_time`=:endTime,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Integer getKey(ServerSwitch t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "server_switch";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

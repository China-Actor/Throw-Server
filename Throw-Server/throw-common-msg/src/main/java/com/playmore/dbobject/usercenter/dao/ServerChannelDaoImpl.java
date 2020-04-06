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
import com.playmore.dbobject.usercenter.ServerChannel;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerChannelDaoImpl extends SinglePrimaryKeyDBDaoImpl<ServerChannel>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ServerChannelDaoImpl DEFAULT = new	ServerChannelDaoImpl();
	public static ServerChannelDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ServerChannel createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String channelName = rs.getString("channel_name");
		java.lang.Integer channelId = rs.getInt("channel_id");
		java.lang.Integer serverGroup = rs.getInt("server_group");
		java.lang.String createTime = rs.getString("create_time");
		ServerChannel instance = new ServerChannel();
		instance.setId(id);
		instance.setChannelName(channelName);
		instance.setChannelId(channelId);
		instance.setServerGroup(serverGroup);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO server_channel (`id`,`channel_name`,`channel_id`,`server_group`,`create_time`) VALUES(:id,:channelName,:channelId,:serverGroup,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE server_channel SET `channel_name`=:channelName,`channel_id`=:channelId,`server_group`=:serverGroup,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Integer getKey(ServerChannel t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "server_channel";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

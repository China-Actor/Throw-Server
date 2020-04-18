package com.playmore.dbobject.gameserver.dao;

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
import com.playmore.dbobject.gameserver.ServerMail;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ServerMailDaoImpl extends SinglePrimaryKeyDBDaoImpl<ServerMail>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ServerMailDaoImpl DEFAULT = new	ServerMailDaoImpl();
	public static ServerMailDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ServerMail createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String fromId = rs.getString("from_id");
		java.lang.String title = rs.getString("title");
		java.lang.String txtParams = rs.getString("txt_params");
		java.lang.String attachment = rs.getString("attachment");
		java.lang.String startTime = rs.getString("start_time");
		java.lang.String endTime = rs.getString("end_time");
		java.lang.String subtitle = rs.getString("subtitle");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer vipLevel = rs.getInt("vip_level");
		java.lang.String extend1 = rs.getString("extend1");
		java.lang.String extend2 = rs.getString("extend2");
		ServerMail instance = new ServerMail();
		instance.setId(id);
		instance.setType(type);
		instance.setFromId(fromId);
		instance.setTitle(title);
		instance.setTxtParams(txtParams);
		instance.setAttachment(attachment);
		instance.setStartTime(startTime);
		instance.setEndTime(endTime);
		instance.setSubtitle(subtitle);
		instance.setLevel(level);
		instance.setVipLevel(vipLevel);
		instance.setExtend1(extend1);
		instance.setExtend2(extend2);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO server_mail (`id`,`type`,`from_id`,`title`,`txt_params`,`attachment`,`start_time`,`end_time`,`subtitle`,`level`,`vip_level`,`extend1`,`extend2`) VALUES(:id,:type,:fromId,:title,:txtParams,:attachment,:startTime,:endTime,:subtitle,:level,:vipLevel,:extend1,:extend2)";
	}
	protected String getUpdateSql() {
		return "UPDATE server_mail SET `type`=:type,`from_id`=:fromId,`title`=:title,`txt_params`=:txtParams,`attachment`=:attachment,`start_time`=:startTime,`end_time`=:endTime,`subtitle`=:subtitle,`level`=:level,`vip_level`=:vipLevel,`extend1`=:extend1,`extend2`=:extend2 WHERE id=:id";
	}
	protected java.lang.Long getKey(ServerMail t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "server_mail";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

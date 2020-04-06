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
import com.playmore.dbobject.gameserver.PlayerMail;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerMailDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerMail>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerMail createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer status = rs.getInt("status");
		java.lang.String fromId = rs.getString("from_id");
		java.lang.String title = rs.getString("title");
		java.lang.String subtitle = rs.getString("subtitle");
		java.lang.String txtParams = rs.getString("txt_params");
		java.lang.String attachment = rs.getString("attachment");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String startTime = rs.getString("start_time");
		java.lang.String endTime = rs.getString("end_time");
		PlayerMail instance = new PlayerMail();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setType(type);
		instance.setStatus(status);
		instance.setFromId(fromId);
		instance.setTitle(title);
		instance.setSubtitle(subtitle);
		instance.setTxtParams(txtParams);
		instance.setAttachment(attachment);
		instance.setCreateTime(createTime);
		instance.setStartTime(startTime);
		instance.setEndTime(endTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_mail (`id`,`player_id`,`type`,`status`,`from_id`,`title`,`subtitle`,`txt_params`,`attachment`,`create_time`,`start_time`,`end_time`) VALUES(:id,:playerId,:type,:status,:fromId,:title,:subtitle,:txtParams,:attachment,:createTime,:startTime,:endTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_mail SET `player_id`=:playerId,`type`=:type,`status`=:status,`from_id`=:fromId,`title`=:title,`subtitle`=:subtitle,`txt_params`=:txtParams,`attachment`=:attachment,`create_time`=:createTime,`start_time`=:startTime,`end_time`=:endTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerMail t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_mail";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

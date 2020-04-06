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
import com.playmore.dbobject.gameserver.PlayerTaskBox;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerTaskBoxDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerTaskBox>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerTaskBox createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer boxId = rs.getInt("box_id");
		java.lang.Boolean isOpen = rs.getBoolean("is_open");
		PlayerTaskBox instance = new PlayerTaskBox();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setType(type);
		instance.setBoxId(boxId);
		instance.setIsOpen(isOpen);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_task_box (`id`,`player_id`,`type`,`box_id`,`is_open`) VALUES(:id,:playerId,:type,:boxId,:isOpen)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_task_box SET `player_id`=:playerId,`type`=:type,`box_id`=:boxId,`is_open`=:isOpen WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerTaskBox t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_task_box";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

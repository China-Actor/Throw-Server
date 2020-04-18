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
import com.playmore.dbobject.gameserver.OfferrewardTask;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class OfferrewardTaskDaoImpl extends SinglePrimaryKeyDBDaoImpl<OfferrewardTask>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected OfferrewardTask createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer taskId = rs.getInt("task_id");
		java.lang.Integer num = rs.getInt("num");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String camps = rs.getString("camps");
		java.lang.String executeHeros = rs.getString("execute_heros");
		java.lang.Integer status = rs.getInt("status");
		java.lang.String insertTime = rs.getString("insert_time");
		java.lang.String finishTime = rs.getString("finish_time");
		java.lang.String invalidTime = rs.getString("invalid_time");
		OfferrewardTask instance = new OfferrewardTask();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setTaskId(taskId);
		instance.setNum(num);
		instance.setType(type);
		instance.setCamps(camps);
		instance.setExecuteHeros(executeHeros);
		instance.setStatus(status);
		instance.setInsertTime(insertTime);
		instance.setFinishTime(finishTime);
		instance.setInvalidTime(invalidTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO offerReward_task (`id`,`player_id`,`task_id`,`num`,`type`,`camps`,`execute_heros`,`status`,`insert_time`,`finish_time`,`invalid_time`) VALUES(:id,:playerId,:taskId,:num,:type,:camps,:executeHeros,:status,:insertTime,:finishTime,:invalidTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE offerReward_task SET `player_id`=:playerId,`task_id`=:taskId,`num`=:num,`type`=:type,`camps`=:camps,`execute_heros`=:executeHeros,`status`=:status,`insert_time`=:insertTime,`finish_time`=:finishTime,`invalid_time`=:invalidTime WHERE id=:id";
	}
	protected java.lang.Long getKey(OfferrewardTask t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "offerReward_task";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

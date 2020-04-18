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
import com.playmore.dbobject.gameserver.RewardBattlePass;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RewardBattlePassDaoImpl extends SinglePrimaryKeyDBDaoImpl<RewardBattlePass>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final RewardBattlePassDaoImpl DEFAULT = new	RewardBattlePassDaoImpl();
	public static RewardBattlePassDaoImpl getDefault() {
		return DEFAULT;
	}
	protected RewardBattlePass createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String content = rs.getString("content");
		java.lang.Integer value = rs.getInt("value");
		java.lang.Boolean isProp = rs.getBoolean("is_prop");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String updateTime = rs.getString("update_time");
		RewardBattlePass instance = new RewardBattlePass();
		instance.setId(id);
		instance.setPid(pid);
		instance.setType(type);
		instance.setContent(content);
		instance.setValue(value);
		instance.setIsProp(isProp);
		instance.setCreateTime(createTime);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO reward_battle_pass (`id`,`pid`,`type`,`content`,`value`,`is_prop`,`create_time`,`update_time`) VALUES(:id,:pid,:type,:content,:value,:isProp,:createTime,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE reward_battle_pass SET `pid`=:pid,`type`=:type,`content`=:content,`value`=:value,`is_prop`=:isProp,`create_time`=:createTime,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(RewardBattlePass t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "reward_battle_pass";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

package com.playmore.dbobject.staticdb.dao;

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
import com.playmore.dbobject.staticdb.PlayerlevelS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerlevelSDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerlevelS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerlevelSDaoImpl DEFAULT = new	PlayerlevelSDaoImpl();
	public static PlayerlevelSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerlevelS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Long exp = rs.getLong("exp");
		java.lang.Integer reward = rs.getInt("reward");
		PlayerlevelS instance = new PlayerlevelS();
		instance.setId(id);
		instance.setLevel(level);
		instance.setExp(exp);
		instance.setReward(reward);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO playerlevel_s (`id`,`level`,`exp`,`reward`) VALUES(:id,:level,:exp,:reward)";
	}
	protected String getUpdateSql() {
		return "UPDATE playerlevel_s SET `level`=:level,`exp`=:exp,`reward`=:reward WHERE id=:id";
	}
	protected java.lang.Integer getKey(PlayerlevelS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "playerlevel_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

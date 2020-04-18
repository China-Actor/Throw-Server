package com.playmore.dbobject.configcenter.dao;

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
import com.playmore.dbobject.configcenter.GameServerMerge;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GameServerMergeDaoImpl extends SinglePrimaryKeyDBDaoImpl<GameServerMerge>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GameServerMergeDaoImpl DEFAULT = new	GameServerMergeDaoImpl();
	public static GameServerMergeDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GameServerMerge createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String mergeids = rs.getString("mergeids");
		java.util.Date createTime = rs.getTimestamp("create_time");
		GameServerMerge instance = new GameServerMerge();
		instance.setId(id);
		instance.setMergeids(mergeids);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO game_server_merge (`id`,`mergeids`,`create_time`) VALUES(:id,:mergeids,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE game_server_merge SET `mergeids`=:mergeids,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Integer getKey(GameServerMerge t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "game_server_merge";
	}
	public String getDbType(){
		return DbType.CONFIG_CENTER;
	}
}

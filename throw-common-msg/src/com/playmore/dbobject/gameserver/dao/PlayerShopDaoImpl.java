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
import com.playmore.dbobject.gameserver.PlayerShop;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerShopDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerShop>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerShopDaoImpl DEFAULT = new	PlayerShopDaoImpl();
	public static PlayerShopDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerShop createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long pid = rs.getLong("pid");
		java.lang.String content = rs.getString("content");
		PlayerShop instance = new PlayerShop();
		instance.setPid(pid);
		instance.setContent(content);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_shop (`pid`,`content`) VALUES(:pid,:content)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_shop SET `content`=:content WHERE pid=:pid";
	}
	protected java.lang.Long getKey(PlayerShop t){
		return t.getPid();
	}
	protected String getKeyName(){
		return "pid";
	}
	public String getDbName() {
		return "player_shop";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

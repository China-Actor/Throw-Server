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
import com.playmore.dbobject.usercenter.Player;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerDaoImpl extends SinglePrimaryKeyDBDaoImpl<Player>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerDaoImpl DEFAULT = new	PlayerDaoImpl();
	public static PlayerDaoImpl getDefault() {
		return DEFAULT;
	}
	protected Player createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long userid = rs.getLong("userid");
		java.lang.Integer serverid = rs.getInt("serverid");
		java.lang.String name = rs.getString("name");
		java.lang.Boolean sex = rs.getBoolean("sex");
		Player instance = new Player();
		instance.setId(id);
		instance.setUserid(userid);
		instance.setServerid(serverid);
		instance.setName(name);
		instance.setSex(sex);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player (`id`,`userid`,`serverid`,`name`,`sex`) VALUES(:id,:userid,:serverid,:name,:sex)";
	}
	protected String getUpdateSql() {
		return "UPDATE player SET `userid`=:userid,`serverid`=:serverid,`name`=:name,`sex`=:sex WHERE id=:id";
	}
	protected java.lang.Long getKey(Player t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

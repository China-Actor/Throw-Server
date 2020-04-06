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
import com.playmore.dbobject.staticdb.GuildiconS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildiconSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildiconS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildiconSDaoImpl DEFAULT = new	GuildiconSDaoImpl();
	public static GuildiconSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildiconS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String icon = rs.getString("icon");
		java.lang.Integer open = rs.getInt("open");
		GuildiconS instance = new GuildiconS();
		instance.setId(id);
		instance.setIcon(icon);
		instance.setOpen(open);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guildicon_s (`id`,`icon`,`open`) VALUES(:id,:icon,:open)";
	}
	protected String getUpdateSql() {
		return "UPDATE guildicon_s SET `icon`=:icon,`open`=:open WHERE id=:id";
	}
	protected java.lang.Integer getKey(GuildiconS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guildicon_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

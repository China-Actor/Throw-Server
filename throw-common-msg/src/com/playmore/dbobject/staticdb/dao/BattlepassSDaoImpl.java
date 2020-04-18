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
import com.playmore.dbobject.staticdb.BattlepassS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BattlepassSDaoImpl extends SinglePrimaryKeyDBDaoImpl<BattlepassS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final BattlepassSDaoImpl DEFAULT = new	BattlepassSDaoImpl();
	public static BattlepassSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected BattlepassS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer item = rs.getInt("item");
		java.lang.Integer num = rs.getInt("num");
		java.lang.Integer drop1 = rs.getInt("drop1");
		java.lang.Integer drop2 = rs.getInt("drop2");
		BattlepassS instance = new BattlepassS();
		instance.setId(id);
		instance.setType(type);
		instance.setItem(item);
		instance.setNum(num);
		instance.setDrop1(drop1);
		instance.setDrop2(drop2);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO battlepass_s (`id`,`type`,`item`,`num`,`drop1`,`drop2`) VALUES(:id,:type,:item,:num,:drop1,:drop2)";
	}
	protected String getUpdateSql() {
		return "UPDATE battlepass_s SET `type`=:type,`item`=:item,`num`=:num,`drop1`=:drop1,`drop2`=:drop2 WHERE id=:id";
	}
	protected java.lang.Integer getKey(BattlepassS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "battlepass_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

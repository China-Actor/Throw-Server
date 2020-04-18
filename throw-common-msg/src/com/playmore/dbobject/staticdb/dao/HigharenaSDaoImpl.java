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
import com.playmore.dbobject.staticdb.HigharenaS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class HigharenaSDaoImpl extends SinglePrimaryKeyDBDaoImpl<HigharenaS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final HigharenaSDaoImpl DEFAULT = new	HigharenaSDaoImpl();
	public static HigharenaSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected HigharenaS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer num = rs.getInt("num");
		java.lang.String name = rs.getString("name");
		java.lang.Integer reward1 = rs.getInt("reward1");
		java.lang.Integer reward2 = rs.getInt("reward2");
		java.lang.Integer dailyreward = rs.getInt("dailyreward");
		java.lang.Integer robot = rs.getInt("robot");
		HigharenaS instance = new HigharenaS();
		instance.setId(id);
		instance.setType(type);
		instance.setNum(num);
		instance.setName(name);
		instance.setReward1(reward1);
		instance.setReward2(reward2);
		instance.setDailyreward(dailyreward);
		instance.setRobot(robot);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO higharena_s (`id`,`type`,`num`,`name`,`reward1`,`reward2`,`dailyreward`,`robot`) VALUES(:id,:type,:num,:name,:reward1,:reward2,:dailyreward,:robot)";
	}
	protected String getUpdateSql() {
		return "UPDATE higharena_s SET `type`=:type,`num`=:num,`name`=:name,`reward1`=:reward1,`reward2`=:reward2,`dailyreward`=:dailyreward,`robot`=:robot WHERE id=:id";
	}
	protected java.lang.Integer getKey(HigharenaS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "higharena_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

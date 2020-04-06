package main.java.com.playmore.dbobject.staticdb.dao;

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
import main.java.com.playmore.dbobject.staticdb.TowerS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TowerSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TowerS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TowerSDaoImpl DEFAULT = new	TowerSDaoImpl();
	public static TowerSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TowerS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer time = rs.getInt("time");
		java.lang.Integer camp = rs.getInt("camp");
		java.lang.Integer nextStage = rs.getInt("next_stage");
		java.lang.Integer teamId = rs.getInt("team_id");
		java.lang.Integer maxTime = rs.getInt("max_time");
		java.lang.Integer heroNum = rs.getInt("hero_num");
		java.lang.Integer dropId1 = rs.getInt("drop_id1");
		java.lang.String desc = rs.getString("desc");
		TowerS instance = new TowerS();
		instance.setId(id);
		instance.setName(name);
		instance.setType(type);
		instance.setTime(time);
		instance.setCamp(camp);
		instance.setNextStage(nextStage);
		instance.setTeamId(teamId);
		instance.setMaxTime(maxTime);
		instance.setHeroNum(heroNum);
		instance.setDropId1(dropId1);
		instance.setDesc(desc);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO tower_s (`id`,`name`,`type`,`time`,`camp`,`next_stage`,`team_id`,`max_time`,`hero_num`,`drop_id1`,`desc`) VALUES(:id,:name,:type,:time,:camp,:nextStage,:teamId,:maxTime,:heroNum,:dropId1,:desc)";
	}
	protected String getUpdateSql() {
		return "UPDATE tower_s SET `name`=:name,`type`=:type,`time`=:time,`camp`=:camp,`next_stage`=:nextStage,`team_id`=:teamId,`max_time`=:maxTime,`hero_num`=:heroNum,`drop_id1`=:dropId1,`desc`=:desc WHERE id=:id";
	}
	protected java.lang.Integer getKey(TowerS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "tower_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

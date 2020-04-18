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
import com.playmore.dbobject.staticdb.DailyrewardS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DailyrewardSDaoImpl extends SinglePrimaryKeyDBDaoImpl<DailyrewardS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final DailyrewardSDaoImpl DEFAULT = new	DailyrewardSDaoImpl();
	public static DailyrewardSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected DailyrewardS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer time = rs.getInt("time");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer quality = rs.getInt("quality");
		java.lang.Integer star = rs.getInt("star");
		java.lang.Integer dropType = rs.getInt("drop_type");
		java.lang.Integer dropValue = rs.getInt("drop_value");
		java.lang.Integer dropNum = rs.getInt("drop_num");
		java.lang.Integer percent = rs.getInt("percent");
		java.lang.Integer appear = rs.getInt("appear");
		java.lang.Integer disappear = rs.getInt("disappear");
		java.lang.String desc = rs.getString("desc");
		java.lang.Integer heroNum = rs.getInt("hero_num");
		java.lang.Integer heroQuality = rs.getInt("hero_quality");
		java.lang.Integer heroQualityNum = rs.getInt("hero_quality_num");
		DailyrewardS instance = new DailyrewardS();
		instance.setId(id);
		instance.setName(name);
		instance.setTime(time);
		instance.setType(type);
		instance.setQuality(quality);
		instance.setStar(star);
		instance.setDropType(dropType);
		instance.setDropValue(dropValue);
		instance.setDropNum(dropNum);
		instance.setPercent(percent);
		instance.setAppear(appear);
		instance.setDisappear(disappear);
		instance.setDesc(desc);
		instance.setHeroNum(heroNum);
		instance.setHeroQuality(heroQuality);
		instance.setHeroQualityNum(heroQualityNum);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO dailyreward_s (`id`,`name`,`time`,`type`,`quality`,`star`,`drop_type`,`drop_value`,`drop_num`,`percent`,`appear`,`disappear`,`desc`,`hero_num`,`hero_quality`,`hero_quality_num`) VALUES(:id,:name,:time,:type,:quality,:star,:dropType,:dropValue,:dropNum,:percent,:appear,:disappear,:desc,:heroNum,:heroQuality,:heroQualityNum)";
	}
	protected String getUpdateSql() {
		return "UPDATE dailyreward_s SET `name`=:name,`time`=:time,`type`=:type,`quality`=:quality,`star`=:star,`drop_type`=:dropType,`drop_value`=:dropValue,`drop_num`=:dropNum,`percent`=:percent,`appear`=:appear,`disappear`=:disappear,`desc`=:desc,`hero_num`=:heroNum,`hero_quality`=:heroQuality,`hero_quality_num`=:heroQualityNum WHERE id=:id";
	}
	protected java.lang.Integer getKey(DailyrewardS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "dailyreward_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

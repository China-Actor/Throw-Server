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
import com.playmore.dbobject.staticdb.MazeCardsS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeCardsSDaoImpl extends SinglePrimaryKeyDBDaoImpl<MazeCardsS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MazeCardsSDaoImpl DEFAULT = new	MazeCardsSDaoImpl();
	public static MazeCardsSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MazeCardsS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String cardsName = rs.getString("cards_name");
		java.lang.String cardsDesc = rs.getString("cards_desc");
		java.lang.Integer cardsType = rs.getInt("cards_type");
		java.lang.Integer cardsQuality = rs.getInt("cards_quality");
		java.lang.Integer cardsSkill = rs.getInt("cards_skill");
		java.lang.String cardsIcon = rs.getString("cards_icon");
		java.lang.String hero = rs.getString("hero");
		java.lang.String value = rs.getString("value");
		MazeCardsS instance = new MazeCardsS();
		instance.setId(id);
		instance.setCardsName(cardsName);
		instance.setCardsDesc(cardsDesc);
		instance.setCardsType(cardsType);
		instance.setCardsQuality(cardsQuality);
		instance.setCardsSkill(cardsSkill);
		instance.setCardsIcon(cardsIcon);
		instance.setHero(hero);
		instance.setValue(value);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO maze_cards_s (`id`,`cards_name`,`cards_desc`,`cards_type`,`cards_quality`,`cards_skill`,`cards_icon`,`hero`,`value`) VALUES(:id,:cardsName,:cardsDesc,:cardsType,:cardsQuality,:cardsSkill,:cardsIcon,:hero,:value)";
	}
	protected String getUpdateSql() {
		return "UPDATE maze_cards_s SET `cards_name`=:cardsName,`cards_desc`=:cardsDesc,`cards_type`=:cardsType,`cards_quality`=:cardsQuality,`cards_skill`=:cardsSkill,`cards_icon`=:cardsIcon,`hero`=:hero,`value`=:value WHERE id=:id";
	}
	protected java.lang.Integer getKey(MazeCardsS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "maze_cards_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

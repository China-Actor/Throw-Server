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
import com.playmore.dbobject.staticdb.LevelS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class LevelSDaoImpl extends SinglePrimaryKeyDBDaoImpl<LevelS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected LevelS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer gold = rs.getInt("gold");
		java.lang.Integer exp = rs.getInt("exp");
		java.lang.Integer item1 = rs.getInt("item1");
		java.lang.Long expsum = rs.getLong("expsum");
		java.lang.Integer limit = rs.getInt("limit");
		LevelS instance = new LevelS();
		instance.setId(id);
		instance.setLevel(level);
		instance.setGold(gold);
		instance.setExp(exp);
		instance.setItem1(item1);
		instance.setExpsum(expsum);
		instance.setLimit(limit);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO level_s (`id`,`level`,`gold`,`exp`,`item1`,`expsum`,`limit`) VALUES(:id,:level,:gold,:exp,:item1,:expsum,:limit)";
	}
	protected String getUpdateSql() {
		return "UPDATE level_s SET `level`=:level,`gold`=:gold,`exp`=:exp,`item1`=:item1,`expsum`=:expsum,`limit`=:limit WHERE id=:id";
	}
	protected java.lang.Integer getKey(LevelS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "level_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerCrystal;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerCrystalDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerCrystal>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerCrystal createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Integer crystalLevel = rs.getInt("crystal_level");
		PlayerCrystal instance = new PlayerCrystal();
		instance.setPid(pid);
		instance.setCrystalLevel(crystalLevel);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_crystal (`pid`,`crystal_level`) VALUES(:pid,:crystalLevel)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_crystal SET `crystal_level`=:crystalLevel WHERE pid=:pid";
	}
	protected java.lang.Long getKey(PlayerCrystal t){
		return t.getPid();
	}
	protected String getKeyName(){
		return "pid";
	}
	public String getDbName() {
		return "player_crystal";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

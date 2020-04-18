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
import com.playmore.dbobject.staticdb.BossstageS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class BossstageSDaoImpl extends SinglePrimaryKeyDBDaoImpl<BossstageS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected BossstageS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer bossid = rs.getInt("bossid");
		java.lang.Integer hp = rs.getInt("hp");
		java.lang.Integer drop1 = rs.getInt("drop1");
		java.lang.Integer drop2 = rs.getInt("drop2");
		java.lang.Integer drop3 = rs.getInt("drop3");
		BossstageS instance = new BossstageS();
		instance.setId(id);
		instance.setBossid(bossid);
		instance.setHp(hp);
		instance.setDrop1(drop1);
		instance.setDrop2(drop2);
		instance.setDrop3(drop3);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO bossstage_s (`id`,`bossid`,`hp`,`drop1`,`drop2`,`drop3`) VALUES(:id,:bossid,:hp,:drop1,:drop2,:drop3)";
	}
	protected String getUpdateSql() {
		return "UPDATE bossstage_s SET `bossid`=:bossid,`hp`=:hp,`drop1`=:drop1,`drop2`=:drop2,`drop3`=:drop3 WHERE id=:id";
	}
	protected java.lang.Integer getKey(BossstageS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "bossstage_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

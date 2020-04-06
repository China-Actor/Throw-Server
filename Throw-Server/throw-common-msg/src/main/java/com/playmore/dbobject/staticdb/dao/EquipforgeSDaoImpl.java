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
import com.playmore.dbobject.staticdb.EquipforgeS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class EquipforgeSDaoImpl extends SinglePrimaryKeyDBDaoImpl<EquipforgeS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected EquipforgeS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer exp1 = rs.getInt("exp1");
		java.lang.Integer exp2 = rs.getInt("exp2");
		java.lang.Integer exp3 = rs.getInt("exp3");
		java.lang.Integer exp4 = rs.getInt("exp4");
		java.lang.Integer exp5 = rs.getInt("exp5");
		EquipforgeS instance = new EquipforgeS();
		instance.setId(id);
		instance.setExp1(exp1);
		instance.setExp2(exp2);
		instance.setExp3(exp3);
		instance.setExp4(exp4);
		instance.setExp5(exp5);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO equipforge_s (`id`,`exp1`,`exp2`,`exp3`,`exp4`,`exp5`) VALUES(:id,:exp1,:exp2,:exp3,:exp4,:exp5)";
	}
	protected String getUpdateSql() {
		return "UPDATE equipforge_s SET `exp1`=:exp1,`exp2`=:exp2,`exp3`=:exp3,`exp4`=:exp4,`exp5`=:exp5 WHERE id=:id";
	}
	protected java.lang.Integer getKey(EquipforgeS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "equipforge_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

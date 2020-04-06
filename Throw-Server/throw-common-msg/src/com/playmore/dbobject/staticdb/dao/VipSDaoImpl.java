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
import com.playmore.dbobject.staticdb.VipS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class VipSDaoImpl extends SinglePrimaryKeyDBDaoImpl<VipS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final VipSDaoImpl DEFAULT = new	VipSDaoImpl();
	public static VipSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected VipS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer exp = rs.getInt("exp");
		java.lang.String desc = rs.getString("desc");
		java.lang.Integer reward = rs.getInt("reward");
		VipS instance = new VipS();
		instance.setId(id);
		instance.setLevel(level);
		instance.setExp(exp);
		instance.setDesc(desc);
		instance.setReward(reward);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO vip_s (`id`,`level`,`exp`,`desc`,`reward`) VALUES(:id,:level,:exp,:desc,:reward)";
	}
	protected String getUpdateSql() {
		return "UPDATE vip_s SET `level`=:level,`exp`=:exp,`desc`=:desc,`reward`=:reward WHERE id=:id";
	}
	protected java.lang.Integer getKey(VipS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "vip_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

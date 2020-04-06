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
import com.playmore.dbobject.staticdb.RobotequipS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RobotequipSDaoImpl extends SinglePrimaryKeyDBDaoImpl<RobotequipS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final RobotequipSDaoImpl DEFAULT = new	RobotequipSDaoImpl();
	public static RobotequipSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected RobotequipS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer quality = rs.getInt("quality");
		java.lang.Integer equipQuality = rs.getInt("equip_quality");
		java.lang.Integer equipLevel = rs.getInt("equip_level");
		RobotequipS instance = new RobotequipS();
		instance.setId(id);
		instance.setQuality(quality);
		instance.setEquipQuality(equipQuality);
		instance.setEquipLevel(equipLevel);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO robotequip_s (`id`,`quality`,`equip_quality`,`equip_level`) VALUES(:id,:quality,:equipQuality,:equipLevel)";
	}
	protected String getUpdateSql() {
		return "UPDATE robotequip_s SET `quality`=:quality,`equip_quality`=:equipQuality,`equip_level`=:equipLevel WHERE id=:id";
	}
	protected java.lang.Integer getKey(RobotequipS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "robotequip_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

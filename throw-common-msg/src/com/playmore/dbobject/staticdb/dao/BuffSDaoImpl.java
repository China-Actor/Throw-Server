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
import com.playmore.dbobject.staticdb.BuffS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class BuffSDaoImpl extends SinglePrimaryKeyDBDaoImpl<BuffS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final BuffSDaoImpl DEFAULT = new	BuffSDaoImpl();
	public static BuffSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected BuffS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer layer = rs.getInt("layer");
		java.lang.Integer clean = rs.getInt("clean");
		java.lang.Integer debuff = rs.getInt("debuff");
		java.lang.String buff1Type = rs.getString("buff1_type");
		java.lang.String buff1Param = rs.getString("buff1_param");
		java.lang.String buff1Value = rs.getString("buff1_value");
		java.lang.String buff1Show = rs.getString("buff1_show");
		java.lang.String buff2Type = rs.getString("buff2_type");
		java.lang.String buff2Param = rs.getString("buff2_param");
		java.lang.Integer buff2Value = rs.getInt("buff2_value");
		java.lang.String buff2Show = rs.getString("buff2_show");
		java.lang.String buff3Type = rs.getString("buff3_type");
		java.lang.String buff3Param = rs.getString("buff3_param");
		java.lang.Integer buff3Value = rs.getInt("buff3_value");
		java.lang.Integer buff3Show = rs.getInt("buff3_show");
		BuffS instance = new BuffS();
		instance.setId(id);
		instance.setLayer(layer);
		instance.setClean(clean);
		instance.setDebuff(debuff);
		instance.setBuff1Type(buff1Type);
		instance.setBuff1Param(buff1Param);
		instance.setBuff1Value(buff1Value);
		instance.setBuff1Show(buff1Show);
		instance.setBuff2Type(buff2Type);
		instance.setBuff2Param(buff2Param);
		instance.setBuff2Value(buff2Value);
		instance.setBuff2Show(buff2Show);
		instance.setBuff3Type(buff3Type);
		instance.setBuff3Param(buff3Param);
		instance.setBuff3Value(buff3Value);
		instance.setBuff3Show(buff3Show);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO buff_s (`id`,`layer`,`clean`,`debuff`,`buff1_type`,`buff1_param`,`buff1_value`,`buff1_show`,`buff2_type`,`buff2_param`,`buff2_value`,`buff2_show`,`buff3_type`,`buff3_param`,`buff3_value`,`buff3_show`) VALUES(:id,:layer,:clean,:debuff,:buff1Type,:buff1Param,:buff1Value,:buff1Show,:buff2Type,:buff2Param,:buff2Value,:buff2Show,:buff3Type,:buff3Param,:buff3Value,:buff3Show)";
	}
	protected String getUpdateSql() {
		return "UPDATE buff_s SET `layer`=:layer,`clean`=:clean,`debuff`=:debuff,`buff1_type`=:buff1Type,`buff1_param`=:buff1Param,`buff1_value`=:buff1Value,`buff1_show`=:buff1Show,`buff2_type`=:buff2Type,`buff2_param`=:buff2Param,`buff2_value`=:buff2Value,`buff2_show`=:buff2Show,`buff3_type`=:buff3Type,`buff3_param`=:buff3Param,`buff3_value`=:buff3Value,`buff3_show`=:buff3Show WHERE id=:id";
	}
	protected java.lang.Integer getKey(BuffS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "buff_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

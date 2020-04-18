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
import com.playmore.dbobject.staticdb.QualityS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class QualitySDaoImpl extends SinglePrimaryKeyDBDaoImpl<QualityS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected QualityS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer heroid = rs.getInt("heroid");
		java.lang.Integer consumeType = rs.getInt("consume_type");
		java.lang.Integer consumeTypeQuality = rs.getInt("consume_type_quality");
		java.lang.Integer value = rs.getInt("value");
		java.lang.Integer heroid2 = rs.getInt("heroid2");
		java.lang.Integer quality = rs.getInt("quality");
		java.lang.Integer levelMax = rs.getInt("level_max");
		java.lang.Integer open = rs.getInt("open");
		java.lang.Integer levelMaxShare = rs.getInt("level_max_share");
		QualityS instance = new QualityS();
		instance.setId(id);
		instance.setHeroid(heroid);
		instance.setConsumeType(consumeType);
		instance.setConsumeTypeQuality(consumeTypeQuality);
		instance.setValue(value);
		instance.setHeroid2(heroid2);
		instance.setQuality(quality);
		instance.setLevelMax(levelMax);
		instance.setOpen(open);
		instance.setLevelMaxShare(levelMaxShare);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO quality_s (`id`,`heroid`,`consume_type`,`consume_type_quality`,`value`,`heroid2`,`quality`,`level_max`,`open`,`level_max_share`) VALUES(:id,:heroid,:consumeType,:consumeTypeQuality,:value,:heroid2,:quality,:levelMax,:open,:levelMaxShare)";
	}
	protected String getUpdateSql() {
		return "UPDATE quality_s SET `heroid`=:heroid,`consume_type`=:consumeType,`consume_type_quality`=:consumeTypeQuality,`value`=:value,`heroid2`=:heroid2,`quality`=:quality,`level_max`=:levelMax,`open`=:open,`level_max_share`=:levelMaxShare WHERE id=:id";
	}
	protected java.lang.Integer getKey(QualityS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "quality_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

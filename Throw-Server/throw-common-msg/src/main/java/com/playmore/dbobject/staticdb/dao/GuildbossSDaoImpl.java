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
import com.playmore.dbobject.staticdb.GuildbossS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class GuildbossSDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildbossS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected GuildbossS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String bossid = rs.getString("bossid");
		java.lang.Integer quailty = rs.getInt("quailty");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer refresh = rs.getInt("refresh");
		java.lang.Integer cost = rs.getInt("cost");
		java.lang.Integer image = rs.getInt("image");
		java.lang.Integer preview = rs.getInt("preview");
		GuildbossS instance = new GuildbossS();
		instance.setId(id);
		instance.setBossid(bossid);
		instance.setQuailty(quailty);
		instance.setLevel(level);
		instance.setType(type);
		instance.setRefresh(refresh);
		instance.setCost(cost);
		instance.setImage(image);
		instance.setPreview(preview);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guildboss_s (`id`,`bossid`,`quailty`,`level`,`type`,`refresh`,`cost`,`image`,`preview`) VALUES(:id,:bossid,:quailty,:level,:type,:refresh,:cost,:image,:preview)";
	}
	protected String getUpdateSql() {
		return "UPDATE guildboss_s SET `bossid`=:bossid,`quailty`=:quailty,`level`=:level,`type`=:type,`refresh`=:refresh,`cost`=:cost,`image`=:image,`preview`=:preview WHERE id=:id";
	}
	protected java.lang.Integer getKey(GuildbossS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guildboss_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

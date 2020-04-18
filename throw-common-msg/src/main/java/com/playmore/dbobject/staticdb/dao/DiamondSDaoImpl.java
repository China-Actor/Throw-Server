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
import com.playmore.dbobject.staticdb.DiamondS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class DiamondSDaoImpl extends SinglePrimaryKeyDBDaoImpl<DiamondS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected DiamondS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer rechargetype = rs.getInt("rechargetype");
		java.lang.String title = rs.getString("title");
		java.lang.String tip = rs.getString("tip");
		java.lang.Integer diamond = rs.getInt("diamond");
		java.lang.Integer firstdiamond = rs.getInt("firstdiamond");
		java.lang.Integer giftdiamond = rs.getInt("giftdiamond");
		java.lang.Integer moneycost = rs.getInt("moneycost");
		java.lang.Integer vipexp = rs.getInt("vipexp");
		java.lang.Integer comments = rs.getInt("comments");
		DiamondS instance = new DiamondS();
		instance.setId(id);
		instance.setRechargetype(rechargetype);
		instance.setTitle(title);
		instance.setTip(tip);
		instance.setDiamond(diamond);
		instance.setFirstdiamond(firstdiamond);
		instance.setGiftdiamond(giftdiamond);
		instance.setMoneycost(moneycost);
		instance.setVipexp(vipexp);
		instance.setComments(comments);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO diamond_s (`id`,`rechargetype`,`title`,`tip`,`diamond`,`firstdiamond`,`giftdiamond`,`moneycost`,`vipexp`,`comments`) VALUES(:id,:rechargetype,:title,:tip,:diamond,:firstdiamond,:giftdiamond,:moneycost,:vipexp,:comments)";
	}
	protected String getUpdateSql() {
		return "UPDATE diamond_s SET `rechargetype`=:rechargetype,`title`=:title,`tip`=:tip,`diamond`=:diamond,`firstdiamond`=:firstdiamond,`giftdiamond`=:giftdiamond,`moneycost`=:moneycost,`vipexp`=:vipexp,`comments`=:comments WHERE id=:id";
	}
	protected java.lang.Integer getKey(DiamondS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "diamond_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

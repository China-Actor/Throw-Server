package com.playmore.dbobject.usercenter.dao;

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
import com.playmore.dbobject.usercenter.GiftCode;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GiftCodeDaoImpl extends SinglePrimaryKeyDBDaoImpl<GiftCode>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GiftCodeDaoImpl DEFAULT = new	GiftCodeDaoImpl();
	public static GiftCodeDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GiftCode createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String giftBatch = rs.getString("gift_batch");
		java.lang.String giftCode = rs.getString("gift_code");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.Integer type = rs.getInt("type");
		GiftCode instance = new GiftCode();
		instance.setId(id);
		instance.setGiftBatch(giftBatch);
		instance.setGiftCode(giftCode);
		instance.setCreateTime(createTime);
		instance.setType(type);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO gift_code (`id`,`gift_batch`,`gift_code`,`create_time`,`type`) VALUES(:id,:giftBatch,:giftCode,:createTime,:type)";
	}
	protected String getUpdateSql() {
		return "UPDATE gift_code SET `gift_batch`=:giftBatch,`gift_code`=:giftCode,`create_time`=:createTime,`type`=:type WHERE id=:id";
	}
	protected java.lang.Integer getKey(GiftCode t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "gift_code";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

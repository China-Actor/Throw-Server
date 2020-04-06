package com.playmore.dbobject.paycenter.dao;

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
import com.playmore.dbobject.paycenter.GodpetSellLog;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GodpetSellLogDaoImpl extends SinglePrimaryKeyDBDaoImpl<GodpetSellLog>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GodpetSellLogDaoImpl DEFAULT = new	GodpetSellLogDaoImpl();
	public static GodpetSellLogDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GodpetSellLog createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer sid = rs.getInt("sid");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.String petId = rs.getString("pet_id");
		java.lang.String extend = rs.getString("extend");
		java.util.Date createTime = rs.getTimestamp("create_time");
		GodpetSellLog instance = new GodpetSellLog();
		instance.setId(id);
		instance.setSid(sid);
		instance.setPlayerId(playerId);
		instance.setPetId(petId);
		instance.setExtend(extend);
		instance.setCreateTime(createTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO godpet_sell_log (`id`,`sid`,`player_id`,`pet_id`,`extend`,`create_time`) VALUES(:id,:sid,:playerId,:petId,:extend,:createTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE godpet_sell_log SET `sid`=:sid,`player_id`=:playerId,`pet_id`=:petId,`extend`=:extend,`create_time`=:createTime WHERE id=:id";
	}
	protected java.lang.Long getKey(GodpetSellLog t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "godpet_sell_log";
	}
	public String getDbType(){
		return DbType.PAY;
	}
}

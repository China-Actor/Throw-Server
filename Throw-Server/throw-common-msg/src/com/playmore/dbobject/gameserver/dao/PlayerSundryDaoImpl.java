package com.playmore.dbobject.gameserver.dao;

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
import com.playmore.dbobject.gameserver.PlayerSundry;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerSundryDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerSundry>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerSundryDaoImpl DEFAULT = new	PlayerSundryDaoImpl();
	public static PlayerSundryDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerSundry createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Integer cardSlotNum = rs.getInt("card_slot_num");
		java.lang.Integer cardSlotBuyCount = rs.getInt("card_slot_buy_count");
		java.lang.String createDate = rs.getString("create_date");
		java.lang.String updateDate = rs.getString("update_date");
		PlayerSundry instance = new PlayerSundry();
		instance.setPid(pid);
		instance.setCardSlotNum(cardSlotNum);
		instance.setCardSlotBuyCount(cardSlotBuyCount);
		instance.setCreateDate(createDate);
		instance.setUpdateDate(updateDate);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_sundry (`pid`,`card_slot_num`,`card_slot_buy_count`,`create_date`,`update_date`) VALUES(:pid,:cardSlotNum,:cardSlotBuyCount,:createDate,:updateDate)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_sundry SET `card_slot_num`=:cardSlotNum,`card_slot_buy_count`=:cardSlotBuyCount,`create_date`=:createDate,`update_date`=:updateDate WHERE pid=:pid";
	}
	protected java.lang.Long getKey(PlayerSundry t){
		return t.getPid();
	}
	protected String getKeyName(){
		return "pid";
	}
	public String getDbName() {
		return "player_sundry";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

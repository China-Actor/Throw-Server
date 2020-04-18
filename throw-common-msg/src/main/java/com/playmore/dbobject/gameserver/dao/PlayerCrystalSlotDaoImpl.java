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
import com.playmore.dbobject.gameserver.PlayerCrystalSlot;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerCrystalSlotDaoImpl extends MutiPrimaryKeyDBDaoImpl<PlayerCrystalSlot>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerCrystalSlot createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Integer slot = rs.getInt("slot");
		java.lang.Boolean status = rs.getBoolean("status");
		java.lang.Long playerCardId = rs.getLong("player_card_id");
		java.lang.String insertTime = rs.getString("insert_time");
		java.lang.Integer costType = rs.getInt("cost_type");
		PlayerCrystalSlot instance = new PlayerCrystalSlot();
		instance.setPid(pid);
		instance.setSlot(slot);
		instance.setStatus(status);
		instance.setPlayerCardId(playerCardId);
		instance.setInsertTime(insertTime);
		instance.setCostType(costType);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_crystal_slot (`pid`,`slot`,`status`,`player_card_id`,`insert_time`,`cost_type`) VALUES(:pid,:slot,:status,:playerCardId,:insertTime,:costType)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_crystal_slot SET `status`=:status,`player_card_id`=:playerCardId,`insert_time`=:insertTime,`cost_type`=:costType WHERE `pid`=:pid AND `slot`=:slot";
	}
	protected Object[] getKey(PlayerCrystalSlot t){
		return new Object[]{t.getPid(),t.getSlot()};
	}
	protected Collection<String> getKeyName() {
		Collection<String> list = new ArrayList<String>();
		list.add("pid");
		list.add("slot");
		return list;
	}
	public Collection<PlayerCrystalSlot> queryByPrimary(java.lang.Long pid,java.lang.Integer slot){
		return queryByKeys(getKeyName(),  String.valueOf(pid), String.valueOf(slot));
	}
	public String getDbName() {
		return "player_crystal_slot";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

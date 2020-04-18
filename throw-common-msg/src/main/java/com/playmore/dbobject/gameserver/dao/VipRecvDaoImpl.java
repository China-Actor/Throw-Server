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
import com.playmore.dbobject.gameserver.VipRecv;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class VipRecvDaoImpl extends MutiPrimaryKeyDBDaoImpl<VipRecv>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected VipRecv createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Integer level = rs.getInt("level");
		java.lang.String receiveTime = rs.getString("receive_time");
		VipRecv instance = new VipRecv();
		instance.setPid(pid);
		instance.setLevel(level);
		instance.setReceiveTime(receiveTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO vip_recv (`pid`,`level`,`receive_time`) VALUES(:pid,:level,:receiveTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE vip_recv SET `receive_time`=:receiveTime WHERE `pid`=:pid AND `level`=:level";
	}
	protected Object[] getKey(VipRecv t){
		return new Object[]{t.getPid(),t.getLevel()};
	}
	protected Collection<String> getKeyName() {
		Collection<String> list = new ArrayList<String>();
		list.add("pid");
		list.add("level");
		return list;
	}
	public Collection<VipRecv> queryByPrimary(java.lang.Long pid,java.lang.Integer level){
		return queryByKeys(getKeyName(),  String.valueOf(pid), String.valueOf(level));
	}
	public String getDbName() {
		return "vip_recv";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

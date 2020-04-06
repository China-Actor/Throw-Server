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
import com.playmore.dbobject.gameserver.PlayerGoodsItem;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerGoodsItemDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerGoodsItem>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerGoodsItem createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer goodsId = rs.getInt("goods_id");
		java.lang.Integer num = rs.getInt("num");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer bagType = rs.getInt("bag_type");
		java.lang.Integer star = rs.getInt("star");
		java.lang.Integer exp = rs.getInt("exp");
		PlayerGoodsItem instance = new PlayerGoodsItem();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setGoodsId(goodsId);
		instance.setNum(num);
		instance.setType(type);
		instance.setBagType(bagType);
		instance.setStar(star);
		instance.setExp(exp);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_goods_item (`id`,`player_id`,`goods_id`,`num`,`type`,`bag_type`,`star`,`exp`) VALUES(:id,:playerId,:goodsId,:num,:type,:bagType,:star,:exp)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_goods_item SET `player_id`=:playerId,`goods_id`=:goodsId,`num`=:num,`type`=:type,`bag_type`=:bagType,`star`=:star,`exp`=:exp WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerGoodsItem t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_goods_item";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

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
import com.playmore.dbobject.gameserver.PlayerEquipment;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerEquipmentDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerEquipment>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerEquipmentDaoImpl DEFAULT = new	PlayerEquipmentDaoImpl();
	public static PlayerEquipmentDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerEquipment createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Long playerCardId = rs.getLong("player_card_id");
		java.lang.Integer cardId = rs.getInt("card_id");
		java.lang.Long slotEquipId1 = rs.getLong("slot_equip_id_1");
		java.lang.Integer slotItemId1 = rs.getInt("slot_item_id_1");
		java.lang.Integer slotStar1 = rs.getInt("slot_star_1");
		java.lang.Integer slotExp1 = rs.getInt("slot_exp_1");
		java.lang.Long slotEquipId2 = rs.getLong("slot_equip_id_2");
		java.lang.Integer slotItemId2 = rs.getInt("slot_item_id_2");
		java.lang.Integer slotStar2 = rs.getInt("slot_star_2");
		java.lang.Integer slotExp2 = rs.getInt("slot_exp_2");
		java.lang.Long slotEquipId3 = rs.getLong("slot_equip_id_3");
		java.lang.Integer slotItemId3 = rs.getInt("slot_item_id_3");
		java.lang.Integer slotStar3 = rs.getInt("slot_star_3");
		java.lang.Integer slotExp3 = rs.getInt("slot_exp_3");
		java.lang.Long slotEquipId4 = rs.getLong("slot_equip_id_4");
		java.lang.Integer slotItemId4 = rs.getInt("slot_item_id_4");
		java.lang.Integer slotStar4 = rs.getInt("slot_star_4");
		java.lang.Integer slotExp4 = rs.getInt("slot_exp_4");
		java.lang.Long slotEquipId5 = rs.getLong("slot_equip_id_5");
		java.lang.Integer slotItemId5 = rs.getInt("slot_item_id_5");
		java.lang.Integer slotStar5 = rs.getInt("slot_star_5");
		java.lang.Integer slotExp5 = rs.getInt("slot_exp_5");
		java.lang.Long slotEquipId6 = rs.getLong("slot_equip_id_6");
		java.lang.Integer slotItemId6 = rs.getInt("slot_item_id_6");
		java.lang.Integer slotStar6 = rs.getInt("slot_star_6");
		java.lang.Integer slotExp6 = rs.getInt("slot_exp_6");
		java.lang.Long slotEquipId7 = rs.getLong("slot_equip_id_7");
		java.lang.Integer slotItemId7 = rs.getInt("slot_item_id_7");
		java.lang.Integer slotStar7 = rs.getInt("slot_star_7");
		java.lang.Integer slotExp7 = rs.getInt("slot_exp_7");
		java.lang.Long slotEquipId8 = rs.getLong("slot_equip_id_8");
		java.lang.Integer slotItemId8 = rs.getInt("slot_item_id_8");
		java.lang.Integer slotStar8 = rs.getInt("slot_star_8");
		java.lang.Integer slotExp8 = rs.getInt("slot_exp_8");
		java.lang.Long slotEquipId9 = rs.getLong("slot_equip_id_9");
		java.lang.Integer slotItemId9 = rs.getInt("slot_item_id_9");
		java.lang.Integer slotStar9 = rs.getInt("slot_star_9");
		java.lang.Integer slotExp9 = rs.getInt("slot_exp_9");
		java.lang.Long slotEquipId10 = rs.getLong("slot_equip_id_10");
		java.lang.Integer slotItemId10 = rs.getInt("slot_item_id_10");
		java.lang.Integer slotStar10 = rs.getInt("slot_star_10");
		java.lang.Integer slotExp10 = rs.getInt("slot_exp_10");
		PlayerEquipment instance = new PlayerEquipment();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setPlayerCardId(playerCardId);
		instance.setCardId(cardId);
		instance.setSlotEquipId1(slotEquipId1);
		instance.setSlotItemId1(slotItemId1);
		instance.setSlotStar1(slotStar1);
		instance.setSlotExp1(slotExp1);
		instance.setSlotEquipId2(slotEquipId2);
		instance.setSlotItemId2(slotItemId2);
		instance.setSlotStar2(slotStar2);
		instance.setSlotExp2(slotExp2);
		instance.setSlotEquipId3(slotEquipId3);
		instance.setSlotItemId3(slotItemId3);
		instance.setSlotStar3(slotStar3);
		instance.setSlotExp3(slotExp3);
		instance.setSlotEquipId4(slotEquipId4);
		instance.setSlotItemId4(slotItemId4);
		instance.setSlotStar4(slotStar4);
		instance.setSlotExp4(slotExp4);
		instance.setSlotEquipId5(slotEquipId5);
		instance.setSlotItemId5(slotItemId5);
		instance.setSlotStar5(slotStar5);
		instance.setSlotExp5(slotExp5);
		instance.setSlotEquipId6(slotEquipId6);
		instance.setSlotItemId6(slotItemId6);
		instance.setSlotStar6(slotStar6);
		instance.setSlotExp6(slotExp6);
		instance.setSlotEquipId7(slotEquipId7);
		instance.setSlotItemId7(slotItemId7);
		instance.setSlotStar7(slotStar7);
		instance.setSlotExp7(slotExp7);
		instance.setSlotEquipId8(slotEquipId8);
		instance.setSlotItemId8(slotItemId8);
		instance.setSlotStar8(slotStar8);
		instance.setSlotExp8(slotExp8);
		instance.setSlotEquipId9(slotEquipId9);
		instance.setSlotItemId9(slotItemId9);
		instance.setSlotStar9(slotStar9);
		instance.setSlotExp9(slotExp9);
		instance.setSlotEquipId10(slotEquipId10);
		instance.setSlotItemId10(slotItemId10);
		instance.setSlotStar10(slotStar10);
		instance.setSlotExp10(slotExp10);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_equipment (`id`,`player_id`,`player_card_id`,`card_id`,`slot_equip_id_1`,`slot_item_id_1`,`slot_star_1`,`slot_exp_1`,`slot_equip_id_2`,`slot_item_id_2`,`slot_star_2`,`slot_exp_2`,`slot_equip_id_3`,`slot_item_id_3`,`slot_star_3`,`slot_exp_3`,`slot_equip_id_4`,`slot_item_id_4`,`slot_star_4`,`slot_exp_4`,`slot_equip_id_5`,`slot_item_id_5`,`slot_star_5`,`slot_exp_5`,`slot_equip_id_6`,`slot_item_id_6`,`slot_star_6`,`slot_exp_6`,`slot_equip_id_7`,`slot_item_id_7`,`slot_star_7`,`slot_exp_7`,`slot_equip_id_8`,`slot_item_id_8`,`slot_star_8`,`slot_exp_8`,`slot_equip_id_9`,`slot_item_id_9`,`slot_star_9`,`slot_exp_9`,`slot_equip_id_10`,`slot_item_id_10`,`slot_star_10`,`slot_exp_10`) VALUES(:id,:playerId,:playerCardId,:cardId,:slotEquipId1,:slotItemId1,:slotStar1,:slotExp1,:slotEquipId2,:slotItemId2,:slotStar2,:slotExp2,:slotEquipId3,:slotItemId3,:slotStar3,:slotExp3,:slotEquipId4,:slotItemId4,:slotStar4,:slotExp4,:slotEquipId5,:slotItemId5,:slotStar5,:slotExp5,:slotEquipId6,:slotItemId6,:slotStar6,:slotExp6,:slotEquipId7,:slotItemId7,:slotStar7,:slotExp7,:slotEquipId8,:slotItemId8,:slotStar8,:slotExp8,:slotEquipId9,:slotItemId9,:slotStar9,:slotExp9,:slotEquipId10,:slotItemId10,:slotStar10,:slotExp10)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_equipment SET `player_id`=:playerId,`player_card_id`=:playerCardId,`card_id`=:cardId,`slot_equip_id_1`=:slotEquipId1,`slot_item_id_1`=:slotItemId1,`slot_star_1`=:slotStar1,`slot_exp_1`=:slotExp1,`slot_equip_id_2`=:slotEquipId2,`slot_item_id_2`=:slotItemId2,`slot_star_2`=:slotStar2,`slot_exp_2`=:slotExp2,`slot_equip_id_3`=:slotEquipId3,`slot_item_id_3`=:slotItemId3,`slot_star_3`=:slotStar3,`slot_exp_3`=:slotExp3,`slot_equip_id_4`=:slotEquipId4,`slot_item_id_4`=:slotItemId4,`slot_star_4`=:slotStar4,`slot_exp_4`=:slotExp4,`slot_equip_id_5`=:slotEquipId5,`slot_item_id_5`=:slotItemId5,`slot_star_5`=:slotStar5,`slot_exp_5`=:slotExp5,`slot_equip_id_6`=:slotEquipId6,`slot_item_id_6`=:slotItemId6,`slot_star_6`=:slotStar6,`slot_exp_6`=:slotExp6,`slot_equip_id_7`=:slotEquipId7,`slot_item_id_7`=:slotItemId7,`slot_star_7`=:slotStar7,`slot_exp_7`=:slotExp7,`slot_equip_id_8`=:slotEquipId8,`slot_item_id_8`=:slotItemId8,`slot_star_8`=:slotStar8,`slot_exp_8`=:slotExp8,`slot_equip_id_9`=:slotEquipId9,`slot_item_id_9`=:slotItemId9,`slot_star_9`=:slotStar9,`slot_exp_9`=:slotExp9,`slot_equip_id_10`=:slotEquipId10,`slot_item_id_10`=:slotItemId10,`slot_star_10`=:slotStar10,`slot_exp_10`=:slotExp10 WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerEquipment t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_equipment";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

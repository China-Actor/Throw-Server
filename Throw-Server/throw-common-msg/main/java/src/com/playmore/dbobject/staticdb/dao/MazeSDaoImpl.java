package main.java.com.playmore.dbobject.staticdb.dao;

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
import main.java.com.playmore.dbobject.staticdb.MazeS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeSDaoImpl extends SinglePrimaryKeyDBDaoImpl<MazeS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MazeSDaoImpl DEFAULT = new	MazeSDaoImpl();
	public static MazeSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MazeS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer mazeTitleId = rs.getInt("maze_title_id");
		java.lang.Integer gateId = rs.getInt("gate_id");
		java.lang.Integer layerId = rs.getInt("layer_id");
		java.lang.Integer gateType = rs.getInt("gate_type");
		java.lang.Integer nextGateId1 = rs.getInt("next_gate_id1");
		java.lang.Integer nextGateId2 = rs.getInt("next_gate_id2");
		java.lang.Integer eventGroup = rs.getInt("event_group");
		java.lang.Integer mazeCoin = rs.getInt("maze_coin");
		java.lang.Integer normalMin = rs.getInt("normal_min");
		java.lang.Integer normalMax = rs.getInt("normal_max");
		java.lang.Integer normalGold = rs.getInt("normal_gold");
		java.lang.Integer normalExp = rs.getInt("normal_exp");
		java.lang.Integer eliteMin = rs.getInt("elite_min");
		java.lang.Integer eliteMax = rs.getInt("elite_max");
		java.lang.Integer eliteGold = rs.getInt("elite_gold");
		java.lang.Integer eliteExp = rs.getInt("elite_exp");
		java.lang.Integer diamond = rs.getInt("diamond");
		java.lang.Integer normalCards = rs.getInt("normal_cards");
		java.lang.Integer eliteCards = rs.getInt("elite_cards");
		java.lang.Integer dropBox = rs.getInt("drop_box");
		java.lang.Integer battlepass = rs.getInt("battlepass");
		MazeS instance = new MazeS();
		instance.setId(id);
		instance.setMazeTitleId(mazeTitleId);
		instance.setGateId(gateId);
		instance.setLayerId(layerId);
		instance.setGateType(gateType);
		instance.setNextGateId1(nextGateId1);
		instance.setNextGateId2(nextGateId2);
		instance.setEventGroup(eventGroup);
		instance.setMazeCoin(mazeCoin);
		instance.setNormalMin(normalMin);
		instance.setNormalMax(normalMax);
		instance.setNormalGold(normalGold);
		instance.setNormalExp(normalExp);
		instance.setEliteMin(eliteMin);
		instance.setEliteMax(eliteMax);
		instance.setEliteGold(eliteGold);
		instance.setEliteExp(eliteExp);
		instance.setDiamond(diamond);
		instance.setNormalCards(normalCards);
		instance.setEliteCards(eliteCards);
		instance.setDropBox(dropBox);
		instance.setBattlepass(battlepass);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO maze_s (`id`,`maze_title_id`,`gate_id`,`layer_id`,`gate_type`,`next_gate_id1`,`next_gate_id2`,`event_group`,`maze_coin`,`normal_min`,`normal_max`,`normal_gold`,`normal_exp`,`elite_min`,`elite_max`,`elite_gold`,`elite_exp`,`diamond`,`normal_cards`,`elite_cards`,`drop_box`,`battlepass`) VALUES(:id,:mazeTitleId,:gateId,:layerId,:gateType,:nextGateId1,:nextGateId2,:eventGroup,:mazeCoin,:normalMin,:normalMax,:normalGold,:normalExp,:eliteMin,:eliteMax,:eliteGold,:eliteExp,:diamond,:normalCards,:eliteCards,:dropBox,:battlepass)";
	}
	protected String getUpdateSql() {
		return "UPDATE maze_s SET `maze_title_id`=:mazeTitleId,`gate_id`=:gateId,`layer_id`=:layerId,`gate_type`=:gateType,`next_gate_id1`=:nextGateId1,`next_gate_id2`=:nextGateId2,`event_group`=:eventGroup,`maze_coin`=:mazeCoin,`normal_min`=:normalMin,`normal_max`=:normalMax,`normal_gold`=:normalGold,`normal_exp`=:normalExp,`elite_min`=:eliteMin,`elite_max`=:eliteMax,`elite_gold`=:eliteGold,`elite_exp`=:eliteExp,`diamond`=:diamond,`normal_cards`=:normalCards,`elite_cards`=:eliteCards,`drop_box`=:dropBox,`battlepass`=:battlepass WHERE id=:id";
	}
	protected java.lang.Integer getKey(MazeS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "maze_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

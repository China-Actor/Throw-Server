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
import com.playmore.dbobject.gameserver.PlayerDraw;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerDrawDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerDraw>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerDraw createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long pid = rs.getLong("pid");
		java.lang.Integer drawId = rs.getInt("draw_id");
		java.lang.Integer leastNum = rs.getInt("least_num");
		java.lang.Integer totalNum = rs.getInt("total_num");
		java.lang.Integer taskAccumulate = rs.getInt("task_accumulate");
		java.lang.Boolean raceFlag = rs.getBoolean("race_flag");
		java.lang.String raceUpdateTime = rs.getString("race_update_time");
		PlayerDraw instance = new PlayerDraw();
		instance.setId(id);
		instance.setPid(pid);
		instance.setDrawId(drawId);
		instance.setLeastNum(leastNum);
		instance.setTotalNum(totalNum);
		instance.setTaskAccumulate(taskAccumulate);
		instance.setRaceFlag(raceFlag);
		instance.setRaceUpdateTime(raceUpdateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_draw (`id`,`pid`,`draw_id`,`least_num`,`total_num`,`task_accumulate`,`race_flag`,`race_update_time`) VALUES(:id,:pid,:drawId,:leastNum,:totalNum,:taskAccumulate,:raceFlag,:raceUpdateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_draw SET `pid`=:pid,`draw_id`=:drawId,`least_num`=:leastNum,`total_num`=:totalNum,`task_accumulate`=:taskAccumulate,`race_flag`=:raceFlag,`race_update_time`=:raceUpdateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerDraw t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_draw";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

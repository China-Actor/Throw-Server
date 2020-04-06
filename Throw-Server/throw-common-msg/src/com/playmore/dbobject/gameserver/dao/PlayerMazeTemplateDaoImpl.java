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
import com.playmore.dbobject.gameserver.PlayerMazeTemplate;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerMazeTemplateDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerMazeTemplate>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerMazeTemplateDaoImpl DEFAULT = new	PlayerMazeTemplateDaoImpl();
	public static PlayerMazeTemplateDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerMazeTemplate createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer stageType = rs.getInt("stage_type");
		java.lang.Integer stageId = rs.getInt("stage_id");
		java.lang.String mazeData = rs.getString("maze_data");
		java.lang.String mazeCardData = rs.getString("maze_card_data");
		java.lang.String mazeBagData = rs.getString("maze_bag_data");
		java.lang.String createDate = rs.getString("create_date");
		java.lang.String path = rs.getString("path");
		java.lang.Integer cellStatus = rs.getInt("cell_status");
		java.lang.Double lifeRation = rs.getDouble("life_ration");
		java.lang.Boolean winStatus = rs.getBoolean("win_status");
		PlayerMazeTemplate instance = new PlayerMazeTemplate();
		instance.setId(id);
		instance.setStageType(stageType);
		instance.setStageId(stageId);
		instance.setMazeData(mazeData);
		instance.setMazeCardData(mazeCardData);
		instance.setMazeBagData(mazeBagData);
		instance.setCreateDate(createDate);
		instance.setPath(path);
		instance.setCellStatus(cellStatus);
		instance.setLifeRation(lifeRation);
		instance.setWinStatus(winStatus);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_maze_template (`id`,`stage_type`,`stage_id`,`maze_data`,`maze_card_data`,`maze_bag_data`,`create_date`,`path`,`cell_status`,`life_ration`,`win_status`) VALUES(:id,:stageType,:stageId,:mazeData,:mazeCardData,:mazeBagData,:createDate,:path,:cellStatus,:lifeRation,:winStatus)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_maze_template SET `stage_type`=:stageType,`stage_id`=:stageId,`maze_data`=:mazeData,`maze_card_data`=:mazeCardData,`maze_bag_data`=:mazeBagData,`create_date`=:createDate,`path`=:path,`cell_status`=:cellStatus,`life_ration`=:lifeRation,`win_status`=:winStatus WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerMazeTemplate t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_maze_template";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

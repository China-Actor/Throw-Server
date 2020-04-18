package com.playmore.dbobject.staticdb.dao;

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
import com.playmore.dbobject.staticdb.TimePeakS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class TimePeakSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TimePeakS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected TimePeakS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String title = rs.getString("title");
		java.lang.String stage = rs.getString("stage");
		java.lang.String describe = rs.getString("describe");
		java.lang.String backGround1 = rs.getString("back_ground1");
		java.lang.String backGround2 = rs.getString("back_ground2");
		java.lang.Integer titleOrder = rs.getInt("title_order");
		java.lang.Integer mapId = rs.getInt("map_id");
		java.lang.String clientName = rs.getString("client_name");
		java.lang.String serverNae = rs.getString("server_nae");
		java.lang.String map = rs.getString("map");
		java.lang.Integer nextStage = rs.getInt("next_stage");
		java.lang.Integer stageId = rs.getInt("stage_id");
		java.lang.Integer progress = rs.getInt("progress");
		TimePeakS instance = new TimePeakS();
		instance.setId(id);
		instance.setTitle(title);
		instance.setStage(stage);
		instance.setDescribe(describe);
		instance.setBackGround1(backGround1);
		instance.setBackGround2(backGround2);
		instance.setTitleOrder(titleOrder);
		instance.setMapId(mapId);
		instance.setClientName(clientName);
		instance.setServerNae(serverNae);
		instance.setMap(map);
		instance.setNextStage(nextStage);
		instance.setStageId(stageId);
		instance.setProgress(progress);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO time_peak_s (`id`,`title`,`stage`,`describe`,`back_ground1`,`back_ground2`,`title_order`,`map_id`,`client_name`,`server_nae`,`map`,`next_stage`,`stage_id`,`progress`) VALUES(:id,:title,:stage,:describe,:backGround1,:backGround2,:titleOrder,:mapId,:clientName,:serverNae,:map,:nextStage,:stageId,:progress)";
	}
	protected String getUpdateSql() {
		return "UPDATE time_peak_s SET `title`=:title,`stage`=:stage,`describe`=:describe,`back_ground1`=:backGround1,`back_ground2`=:backGround2,`title_order`=:titleOrder,`map_id`=:mapId,`client_name`=:clientName,`server_nae`=:serverNae,`map`=:map,`next_stage`=:nextStage,`stage_id`=:stageId,`progress`=:progress WHERE id=:id";
	}
	protected java.lang.Integer getKey(TimePeakS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "time_peak_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

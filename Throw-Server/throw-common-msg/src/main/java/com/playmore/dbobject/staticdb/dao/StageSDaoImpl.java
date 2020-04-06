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
import com.playmore.dbobject.staticdb.StageS;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class StageSDaoImpl extends SinglePrimaryKeyDBDaoImpl<StageS>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected StageS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer chapterId = rs.getInt("chapter_id");
		java.lang.Integer nextStage = rs.getInt("next_stage");
		java.lang.Integer stageNum = rs.getInt("stage_num");
		java.lang.Integer stageF = rs.getInt("stage_f");
		java.lang.Integer stageSon = rs.getInt("stage_son");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer teamId = rs.getInt("team_id");
		java.lang.Integer maxTime = rs.getInt("max_time");
		java.lang.Integer heroNum = rs.getInt("hero_num");
		java.lang.Integer dropId1 = rs.getInt("drop_id1");
		java.lang.Integer gold = rs.getInt("gold");
		java.lang.Integer heroExp = rs.getInt("hero_exp");
		java.lang.Integer exp = rs.getInt("exp");
		java.lang.Integer item1 = rs.getInt("item1");
		java.lang.Integer item2 = rs.getInt("item2");
		java.lang.Integer item3 = rs.getInt("item3");
		java.lang.Integer equipDrop = rs.getInt("equip_drop");
		java.lang.Integer orderId = rs.getInt("order_id");
		java.lang.String desc = rs.getString("desc");
		StageS instance = new StageS();
		instance.setId(id);
		instance.setName(name);
		instance.setChapterId(chapterId);
		instance.setNextStage(nextStage);
		instance.setStageNum(stageNum);
		instance.setStageF(stageF);
		instance.setStageSon(stageSon);
		instance.setType(type);
		instance.setTeamId(teamId);
		instance.setMaxTime(maxTime);
		instance.setHeroNum(heroNum);
		instance.setDropId1(dropId1);
		instance.setGold(gold);
		instance.setHeroExp(heroExp);
		instance.setExp(exp);
		instance.setItem1(item1);
		instance.setItem2(item2);
		instance.setItem3(item3);
		instance.setEquipDrop(equipDrop);
		instance.setOrderId(orderId);
		instance.setDesc(desc);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO stage_s (`id`,`name`,`chapter_id`,`next_stage`,`stage_num`,`stage_f`,`stage_son`,`type`,`team_id`,`max_time`,`hero_num`,`drop_id1`,`gold`,`hero_exp`,`exp`,`item1`,`item2`,`item3`,`equip_drop`,`order_id`,`desc`) VALUES(:id,:name,:chapterId,:nextStage,:stageNum,:stageF,:stageSon,:type,:teamId,:maxTime,:heroNum,:dropId1,:gold,:heroExp,:exp,:item1,:item2,:item3,:equipDrop,:orderId,:desc)";
	}
	protected String getUpdateSql() {
		return "UPDATE stage_s SET `name`=:name,`chapter_id`=:chapterId,`next_stage`=:nextStage,`stage_num`=:stageNum,`stage_f`=:stageF,`stage_son`=:stageSon,`type`=:type,`team_id`=:teamId,`max_time`=:maxTime,`hero_num`=:heroNum,`drop_id1`=:dropId1,`gold`=:gold,`hero_exp`=:heroExp,`exp`=:exp,`item1`=:item1,`item2`=:item2,`item3`=:item3,`equip_drop`=:equipDrop,`order_id`=:orderId,`desc`=:desc WHERE id=:id";
	}
	protected java.lang.Integer getKey(StageS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "stage_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

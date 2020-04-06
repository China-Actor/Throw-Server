package com.playmore.dbobject.guild.dao;

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
import com.playmore.dbobject.guild.Guild;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildDaoImpl extends SinglePrimaryKeyDBDaoImpl<Guild>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildDaoImpl DEFAULT = new	GuildDaoImpl();
	public static GuildDaoImpl getDefault() {
		return DEFAULT;
	}
	protected Guild createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer icon = rs.getInt("icon");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer state = rs.getInt("state");
		java.lang.String leaderName = rs.getString("leader_name");
		java.lang.Integer member = rs.getInt("member");
		java.lang.Integer money = rs.getInt("money");
		java.lang.Integer boom = rs.getInt("boom");
		java.lang.Integer nowTaskActive = rs.getInt("now_task_active");
		java.lang.Integer totalTaskActive = rs.getInt("total_task_active");
		java.lang.Integer permitPower = rs.getInt("permit_power");
		java.lang.Integer applyCount = rs.getInt("apply_count");
		java.lang.String outNotice = rs.getString("out_notice");
		java.lang.String inNotice = rs.getString("in_notice");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String updateTime = rs.getString("update_time");
		java.lang.String updateTaskActiveTime = rs.getString("update_task_active_time");
		java.lang.Integer joinLevel = rs.getInt("join_level");
		java.lang.Integer specialBossId = rs.getInt("special_boss_id");
		java.lang.String specialBossStartTime = rs.getString("special_boss_start_time");
		java.lang.Boolean specialBossMailFlag = rs.getBoolean("special_boss_mail_flag");
		Guild instance = new Guild();
		instance.setId(id);
		instance.setName(name);
		instance.setIcon(icon);
		instance.setLevel(level);
		instance.setState(state);
		instance.setLeaderName(leaderName);
		instance.setMember(member);
		instance.setMoney(money);
		instance.setBoom(boom);
		instance.setNowTaskActive(nowTaskActive);
		instance.setTotalTaskActive(totalTaskActive);
		instance.setPermitPower(permitPower);
		instance.setApplyCount(applyCount);
		instance.setOutNotice(outNotice);
		instance.setInNotice(inNotice);
		instance.setCreateTime(createTime);
		instance.setUpdateTime(updateTime);
		instance.setUpdateTaskActiveTime(updateTaskActiveTime);
		instance.setJoinLevel(joinLevel);
		instance.setSpecialBossId(specialBossId);
		instance.setSpecialBossStartTime(specialBossStartTime);
		instance.setSpecialBossMailFlag(specialBossMailFlag);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild (`id`,`name`,`icon`,`level`,`state`,`leader_name`,`member`,`money`,`boom`,`now_task_active`,`total_task_active`,`permit_power`,`apply_count`,`out_notice`,`in_notice`,`create_time`,`update_time`,`update_task_active_time`,`join_level`,`special_boss_id`,`special_boss_start_time`,`special_boss_mail_flag`) VALUES(:id,:name,:icon,:level,:state,:leaderName,:member,:money,:boom,:nowTaskActive,:totalTaskActive,:permitPower,:applyCount,:outNotice,:inNotice,:createTime,:updateTime,:updateTaskActiveTime,:joinLevel,:specialBossId,:specialBossStartTime,:specialBossMailFlag)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild SET `name`=:name,`icon`=:icon,`level`=:level,`state`=:state,`leader_name`=:leaderName,`member`=:member,`money`=:money,`boom`=:boom,`now_task_active`=:nowTaskActive,`total_task_active`=:totalTaskActive,`permit_power`=:permitPower,`apply_count`=:applyCount,`out_notice`=:outNotice,`in_notice`=:inNotice,`create_time`=:createTime,`update_time`=:updateTime,`update_task_active_time`=:updateTaskActiveTime,`join_level`=:joinLevel,`special_boss_id`=:specialBossId,`special_boss_start_time`=:specialBossStartTime,`special_boss_mail_flag`=:specialBossMailFlag WHERE id=:id";
	}
	protected java.lang.Long getKey(Guild t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

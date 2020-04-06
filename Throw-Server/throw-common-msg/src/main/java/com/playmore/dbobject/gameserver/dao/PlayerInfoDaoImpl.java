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
import com.playmore.dbobject.gameserver.PlayerInfo;
import java.util.List;
import com.playmore.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PlayerInfoDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerInfo>{

	@Autowired
	NamedParameterJdbcDaoSupport DaoSupport;

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return this.DaoSupport;
	}
	protected PlayerInfo createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.String name = rs.getString("name");
		java.lang.Long userid = rs.getLong("userid");
		java.lang.String thirdChannel = rs.getString("third_channel");
		java.lang.Boolean sex = rs.getBoolean("sex");
		java.lang.Integer head = rs.getInt("head");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Long heroExp = rs.getLong("hero_exp");
		java.lang.Long leadExp = rs.getLong("lead_exp");
		java.lang.Integer nobleExp = rs.getInt("noble_exp");
		java.lang.Integer vipLevel = rs.getInt("vip_level");
		java.lang.Integer vipExp = rs.getInt("vip_exp");
		java.lang.Integer offerrewardLevel = rs.getInt("offerreward_level");
		java.lang.Integer singleExp = rs.getInt("single_exp");
		java.lang.Integer teamExp = rs.getInt("team_exp");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String lastLoginTime = rs.getString("last_login_time");
		java.lang.String logoutTime = rs.getString("logout_time");
		java.lang.String idleRewardTime = rs.getString("idle_reward_time");
		java.lang.String idleBeforeRewardTime = rs.getString("idle_before_reward_time");
		java.lang.Integer todayOnlineSecond = rs.getInt("today_online_second");
		java.lang.String resetTime = rs.getString("reset_time");
		java.lang.Integer idleCount = rs.getInt("idle_count");
		java.lang.Integer isRobot = rs.getInt("is_robot");
		java.lang.Boolean chatStatus = rs.getBoolean("chat_status");
		java.lang.Integer chatChannelId = rs.getInt("chat_channel_id");
		java.lang.Integer languageId = rs.getInt("language_id");
		java.lang.Integer age = rs.getInt("age");
		PlayerInfo instance = new PlayerInfo();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setName(name);
		instance.setUserid(userid);
		instance.setThirdChannel(thirdChannel);
		instance.setSex(sex);
		instance.setHead(head);
		instance.setLevel(level);
		instance.setHeroExp(heroExp);
		instance.setLeadExp(leadExp);
		instance.setNobleExp(nobleExp);
		instance.setVipLevel(vipLevel);
		instance.setVipExp(vipExp);
		instance.setOfferrewardLevel(offerrewardLevel);
		instance.setSingleExp(singleExp);
		instance.setTeamExp(teamExp);
		instance.setCreateTime(createTime);
		instance.setLastLoginTime(lastLoginTime);
		instance.setLogoutTime(logoutTime);
		instance.setIdleRewardTime(idleRewardTime);
		instance.setIdleBeforeRewardTime(idleBeforeRewardTime);
		instance.setTodayOnlineSecond(todayOnlineSecond);
		instance.setResetTime(resetTime);
		instance.setIdleCount(idleCount);
		instance.setIsRobot(isRobot);
		instance.setChatStatus(chatStatus);
		instance.setChatChannelId(chatChannelId);
		instance.setLanguageId(languageId);
		instance.setAge(age);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_info (`id`,`server_id`,`name`,`userid`,`third_channel`,`sex`,`head`,`level`,`hero_exp`,`lead_exp`,`noble_exp`,`vip_level`,`vip_exp`,`offerreward_level`,`single_exp`,`team_exp`,`create_time`,`last_login_time`,`logout_time`,`idle_reward_time`,`idle_before_reward_time`,`today_online_second`,`reset_time`,`idle_count`,`is_robot`,`chat_status`,`chat_channel_id`,`language_id`,`age`) VALUES(:id,:serverId,:name,:userid,:thirdChannel,:sex,:head,:level,:heroExp,:leadExp,:nobleExp,:vipLevel,:vipExp,:offerrewardLevel,:singleExp,:teamExp,:createTime,:lastLoginTime,:logoutTime,:idleRewardTime,:idleBeforeRewardTime,:todayOnlineSecond,:resetTime,:idleCount,:isRobot,:chatStatus,:chatChannelId,:languageId,:age)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_info SET `server_id`=:serverId,`name`=:name,`userid`=:userid,`third_channel`=:thirdChannel,`sex`=:sex,`head`=:head,`level`=:level,`hero_exp`=:heroExp,`lead_exp`=:leadExp,`noble_exp`=:nobleExp,`vip_level`=:vipLevel,`vip_exp`=:vipExp,`offerreward_level`=:offerrewardLevel,`single_exp`=:singleExp,`team_exp`=:teamExp,`create_time`=:createTime,`last_login_time`=:lastLoginTime,`logout_time`=:logoutTime,`idle_reward_time`=:idleRewardTime,`idle_before_reward_time`=:idleBeforeRewardTime,`today_online_second`=:todayOnlineSecond,`reset_time`=:resetTime,`idle_count`=:idleCount,`is_robot`=:isRobot,`chat_status`=:chatStatus,`chat_channel_id`=:chatChannelId,`language_id`=:languageId,`age`=:age WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerInfo t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_info";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}

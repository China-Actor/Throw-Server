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
import com.playmore.dbobject.guild.PlayerInfoData;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class PlayerInfoDataDaoImpl extends SinglePrimaryKeyDBDaoImpl<PlayerInfoData>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final PlayerInfoDataDaoImpl DEFAULT = new	PlayerInfoDataDaoImpl();
	public static PlayerInfoDataDaoImpl getDefault() {
		return DEFAULT;
	}
	protected PlayerInfoData createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.String name = rs.getString("name");
		java.lang.Long userid = rs.getLong("userid");
		java.lang.String thirdChannel = rs.getString("third_channel");
		java.lang.Boolean sex = rs.getBoolean("sex");
		java.lang.Integer head = rs.getInt("head");
		java.lang.Integer level = rs.getInt("level");
		java.lang.Integer vipLevel = rs.getInt("vip_level");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String lastLoginTime = rs.getString("last_login_time");
		java.lang.String logoutTime = rs.getString("logout_time");
		java.lang.Integer todayOnlineSecond = rs.getInt("today_online_second");
		java.lang.Integer isOnline = rs.getInt("is_online");
		java.lang.String stageStr = rs.getString("stage_str");
		java.lang.String descript = rs.getString("descript");
		java.lang.String cardInfo = rs.getString("card_info");
		java.lang.String guildName = rs.getString("guild_name");
		java.lang.Integer guildDuty = rs.getInt("guild_duty");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Long totalPower = rs.getLong("total_power");
		java.lang.Long formationPower = rs.getLong("formation_power");
		java.lang.String updateTime = rs.getString("update_time");
		PlayerInfoData instance = new PlayerInfoData();
		instance.setId(id);
		instance.setServerId(serverId);
		instance.setName(name);
		instance.setUserid(userid);
		instance.setThirdChannel(thirdChannel);
		instance.setSex(sex);
		instance.setHead(head);
		instance.setLevel(level);
		instance.setVipLevel(vipLevel);
		instance.setCreateTime(createTime);
		instance.setLastLoginTime(lastLoginTime);
		instance.setLogoutTime(logoutTime);
		instance.setTodayOnlineSecond(todayOnlineSecond);
		instance.setIsOnline(isOnline);
		instance.setStageStr(stageStr);
		instance.setDescript(descript);
		instance.setCardInfo(cardInfo);
		instance.setGuildName(guildName);
		instance.setGuildDuty(guildDuty);
		instance.setGuildId(guildId);
		instance.setTotalPower(totalPower);
		instance.setFormationPower(formationPower);
		instance.setUpdateTime(updateTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO player_info_data (`id`,`server_id`,`name`,`userid`,`third_channel`,`sex`,`head`,`level`,`vip_level`,`create_time`,`last_login_time`,`logout_time`,`today_online_second`,`is_online`,`stage_str`,`descript`,`card_info`,`guild_name`,`guild_duty`,`guild_id`,`total_power`,`formation_power`,`update_time`) VALUES(:id,:serverId,:name,:userid,:thirdChannel,:sex,:head,:level,:vipLevel,:createTime,:lastLoginTime,:logoutTime,:todayOnlineSecond,:isOnline,:stageStr,:descript,:cardInfo,:guildName,:guildDuty,:guildId,:totalPower,:formationPower,:updateTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE player_info_data SET `server_id`=:serverId,`name`=:name,`userid`=:userid,`third_channel`=:thirdChannel,`sex`=:sex,`head`=:head,`level`=:level,`vip_level`=:vipLevel,`create_time`=:createTime,`last_login_time`=:lastLoginTime,`logout_time`=:logoutTime,`today_online_second`=:todayOnlineSecond,`is_online`=:isOnline,`stage_str`=:stageStr,`descript`=:descript,`card_info`=:cardInfo,`guild_name`=:guildName,`guild_duty`=:guildDuty,`guild_id`=:guildId,`total_power`=:totalPower,`formation_power`=:formationPower,`update_time`=:updateTime WHERE id=:id";
	}
	protected java.lang.Long getKey(PlayerInfoData t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "player_info_data";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

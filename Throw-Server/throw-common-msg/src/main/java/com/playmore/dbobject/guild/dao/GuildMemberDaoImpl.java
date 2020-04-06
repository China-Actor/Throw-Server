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
import com.playmore.dbobject.guild.GuildMember;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildMemberDaoImpl extends SinglePrimaryKeyDBDaoImpl<GuildMember>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GuildMemberDaoImpl DEFAULT = new	GuildMemberDaoImpl();
	public static GuildMemberDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GuildMember createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Long id = rs.getLong("id");
		java.lang.Long playerId = rs.getLong("player_id");
		java.lang.Integer serverId = rs.getInt("server_id");
		java.lang.Long guildId = rs.getLong("guild_id");
		java.lang.Integer duty = rs.getInt("duty");
		java.lang.Integer dedication = rs.getInt("dedication");
		java.lang.Integer weekDedication = rs.getInt("week_dedication");
		java.lang.Integer totalDedication = rs.getInt("total_dedication");
		java.lang.String drawBoxs = rs.getString("draw_boxs");
		java.lang.String signTime = rs.getString("sign_time");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.Integer teamReward = rs.getInt("team_reward");
		java.lang.String teamRewardTime = rs.getString("team_reward_time");
		java.lang.String dedicationTime = rs.getString("dedication_time");
		java.lang.Integer dailyMail = rs.getInt("daily_mail");
		java.lang.Integer dailyMailGroup = rs.getInt("daily_mail_group");
		java.lang.Integer bossBattleCount = rs.getInt("boss_battle_count");
		java.lang.Integer specialBossBattleCount = rs.getInt("special_boss_battle_count");
		GuildMember instance = new GuildMember();
		instance.setId(id);
		instance.setPlayerId(playerId);
		instance.setServerId(serverId);
		instance.setGuildId(guildId);
		instance.setDuty(duty);
		instance.setDedication(dedication);
		instance.setWeekDedication(weekDedication);
		instance.setTotalDedication(totalDedication);
		instance.setDrawBoxs(drawBoxs);
		instance.setSignTime(signTime);
		instance.setCreateTime(createTime);
		instance.setTeamReward(teamReward);
		instance.setTeamRewardTime(teamRewardTime);
		instance.setDedicationTime(dedicationTime);
		instance.setDailyMail(dailyMail);
		instance.setDailyMailGroup(dailyMailGroup);
		instance.setBossBattleCount(bossBattleCount);
		instance.setSpecialBossBattleCount(specialBossBattleCount);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO guild_member (`id`,`player_id`,`server_id`,`guild_id`,`duty`,`dedication`,`week_dedication`,`total_dedication`,`draw_boxs`,`sign_time`,`create_time`,`team_reward`,`team_reward_time`,`dedication_time`,`daily_mail`,`daily_mail_group`,`boss_battle_count`,`special_boss_battle_count`) VALUES(:id,:playerId,:serverId,:guildId,:duty,:dedication,:weekDedication,:totalDedication,:drawBoxs,:signTime,:createTime,:teamReward,:teamRewardTime,:dedicationTime,:dailyMail,:dailyMailGroup,:bossBattleCount,:specialBossBattleCount)";
	}
	protected String getUpdateSql() {
		return "UPDATE guild_member SET `player_id`=:playerId,`server_id`=:serverId,`guild_id`=:guildId,`duty`=:duty,`dedication`=:dedication,`week_dedication`=:weekDedication,`total_dedication`=:totalDedication,`draw_boxs`=:drawBoxs,`sign_time`=:signTime,`create_time`=:createTime,`team_reward`=:teamReward,`team_reward_time`=:teamRewardTime,`dedication_time`=:dedicationTime,`daily_mail`=:dailyMail,`daily_mail_group`=:dailyMailGroup,`boss_battle_count`=:bossBattleCount,`special_boss_battle_count`=:specialBossBattleCount WHERE id=:id";
	}
	protected java.lang.Long getKey(GuildMember t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "guild_member";
	}
	public String getDbType(){
		return DbType.GUILD_CENTER;
	}
}

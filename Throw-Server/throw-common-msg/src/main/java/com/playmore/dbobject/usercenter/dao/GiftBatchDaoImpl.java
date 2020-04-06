package com.playmore.dbobject.usercenter.dao;

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
import com.playmore.dbobject.usercenter.GiftBatch;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GiftBatchDaoImpl extends SinglePrimaryKeyDBDaoImpl<GiftBatch>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final GiftBatchDaoImpl DEFAULT = new	GiftBatchDaoImpl();
	public static GiftBatchDaoImpl getDefault() {
		return DEFAULT;
	}
	protected GiftBatch createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.String giftBatch = rs.getString("gift_batch");
		java.lang.String createTime = rs.getString("create_time");
		java.lang.String starTime = rs.getString("star_time");
		java.lang.String endTime = rs.getString("end_time");
		java.lang.String rewardStr = rs.getString("reward_str");
		java.lang.String channelStr = rs.getString("channel_str");
		java.lang.String serveridStr = rs.getString("serverid_str");
		GiftBatch instance = new GiftBatch();
		instance.setId(id);
		instance.setType(type);
		instance.setGiftBatch(giftBatch);
		instance.setCreateTime(createTime);
		instance.setStarTime(starTime);
		instance.setEndTime(endTime);
		instance.setRewardStr(rewardStr);
		instance.setChannelStr(channelStr);
		instance.setServeridStr(serveridStr);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO gift_batch (`id`,`type`,`gift_batch`,`create_time`,`star_time`,`end_time`,`reward_str`,`channel_str`,`serverid_str`) VALUES(:id,:type,:giftBatch,:createTime,:starTime,:endTime,:rewardStr,:channelStr,:serveridStr)";
	}
	protected String getUpdateSql() {
		return "UPDATE gift_batch SET `type`=:type,`gift_batch`=:giftBatch,`create_time`=:createTime,`star_time`=:starTime,`end_time`=:endTime,`reward_str`=:rewardStr,`channel_str`=:channelStr,`serverid_str`=:serveridStr WHERE id=:id";
	}
	protected java.lang.Integer getKey(GiftBatch t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "gift_batch";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

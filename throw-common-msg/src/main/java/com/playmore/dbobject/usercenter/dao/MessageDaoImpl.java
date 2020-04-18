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
import com.playmore.dbobject.usercenter.Message;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MessageDaoImpl extends SinglePrimaryKeyDBDaoImpl<Message>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MessageDaoImpl DEFAULT = new	MessageDaoImpl();
	public static MessageDaoImpl getDefault() {
		return DEFAULT;
	}
	protected Message createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.String id = rs.getString("id");
		java.lang.String message = rs.getString("message");
		java.lang.String starTime = rs.getString("star_time");
		java.lang.String endTime = rs.getString("end_time");
		Message instance = new Message();
		instance.setId(id);
		instance.setMessage(message);
		instance.setStarTime(starTime);
		instance.setEndTime(endTime);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO message (`id`,`message`,`star_time`,`end_time`) VALUES(:id,:message,:starTime,:endTime)";
	}
	protected String getUpdateSql() {
		return "UPDATE message SET `message`=:message,`star_time`=:starTime,`end_time`=:endTime WHERE id=:id";
	}
	protected java.lang.String getKey(Message t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "message";
	}
	public String getDbType(){
		return DbType.USER_CENTER;
	}
}

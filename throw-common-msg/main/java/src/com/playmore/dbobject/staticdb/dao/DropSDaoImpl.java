package main.java.com.playmore.dbobject.staticdb.dao;

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
import main.java.com.playmore.dbobject.staticdb.DropS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DropSDaoImpl extends SinglePrimaryKeyDBDaoImpl<DropS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final DropSDaoImpl DEFAULT = new	DropSDaoImpl();
	public static DropSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected DropS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer dropId = rs.getInt("drop_id");
		java.lang.Integer dropGroupType = rs.getInt("drop_group_type");
		java.lang.Integer isShow = rs.getInt("is_show");
		java.lang.Integer dropType = rs.getInt("drop_type");
		java.lang.Integer dropValue = rs.getInt("drop_value");
		java.lang.Integer dropNum = rs.getInt("drop_num");
		java.lang.Integer percent = rs.getInt("percent");
		DropS instance = new DropS();
		instance.setId(id);
		instance.setDropId(dropId);
		instance.setDropGroupType(dropGroupType);
		instance.setIsShow(isShow);
		instance.setDropType(dropType);
		instance.setDropValue(dropValue);
		instance.setDropNum(dropNum);
		instance.setPercent(percent);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO drop_s (`id`,`drop_id`,`drop_group_type`,`is_show`,`drop_type`,`drop_value`,`drop_num`,`percent`) VALUES(:id,:dropId,:dropGroupType,:isShow,:dropType,:dropValue,:dropNum,:percent)";
	}
	protected String getUpdateSql() {
		return "UPDATE drop_s SET `drop_id`=:dropId,`drop_group_type`=:dropGroupType,`is_show`=:isShow,`drop_type`=:dropType,`drop_value`=:dropValue,`drop_num`=:dropNum,`percent`=:percent WHERE id=:id";
	}
	protected java.lang.Integer getKey(DropS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "drop_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

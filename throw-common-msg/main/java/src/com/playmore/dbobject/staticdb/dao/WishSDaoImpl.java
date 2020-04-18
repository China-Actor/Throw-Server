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
import main.java.com.playmore.dbobject.staticdb.WishS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class WishSDaoImpl extends SinglePrimaryKeyDBDaoImpl<WishS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final WishSDaoImpl DEFAULT = new	WishSDaoImpl();
	public static WishSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected WishS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer weight = rs.getInt("weight");
		java.lang.String content = rs.getString("content");
		java.lang.Integer type = rs.getInt("type");
		WishS instance = new WishS();
		instance.setId(id);
		instance.setWeight(weight);
		instance.setContent(content);
		instance.setType(type);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO wish_s (`id`,`weight`,`content`,`type`) VALUES(:id,:weight,:content,:type)";
	}
	protected String getUpdateSql() {
		return "UPDATE wish_s SET `weight`=:weight,`content`=:content,`type`=:type WHERE id=:id";
	}
	protected java.lang.Integer getKey(WishS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "wish_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

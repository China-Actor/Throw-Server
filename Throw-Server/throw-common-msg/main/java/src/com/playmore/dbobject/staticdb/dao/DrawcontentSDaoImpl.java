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
import main.java.com.playmore.dbobject.staticdb.DrawcontentS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DrawcontentSDaoImpl extends SinglePrimaryKeyDBDaoImpl<DrawcontentS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final DrawcontentSDaoImpl DEFAULT = new	DrawcontentSDaoImpl();
	public static DrawcontentSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected DrawcontentS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer content = rs.getInt("content");
		java.lang.Integer dropType = rs.getInt("drop_type");
		java.lang.Integer dropValue = rs.getInt("drop_value");
		java.lang.Integer dropNum = rs.getInt("drop_num");
		java.lang.Integer weight = rs.getInt("weight");
		java.lang.Integer least = rs.getInt("least");
		java.lang.Integer firstLeast = rs.getInt("first_least");
		java.lang.Integer wish = rs.getInt("wish");
		DrawcontentS instance = new DrawcontentS();
		instance.setId(id);
		instance.setContent(content);
		instance.setDropType(dropType);
		instance.setDropValue(dropValue);
		instance.setDropNum(dropNum);
		instance.setWeight(weight);
		instance.setLeast(least);
		instance.setFirstLeast(firstLeast);
		instance.setWish(wish);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO drawcontent_s (`id`,`content`,`drop_type`,`drop_value`,`drop_num`,`weight`,`least`,`first_least`,`wish`) VALUES(:id,:content,:dropType,:dropValue,:dropNum,:weight,:least,:firstLeast,:wish)";
	}
	protected String getUpdateSql() {
		return "UPDATE drawcontent_s SET `content`=:content,`drop_type`=:dropType,`drop_value`=:dropValue,`drop_num`=:dropNum,`weight`=:weight,`least`=:least,`first_least`=:firstLeast,`wish`=:wish WHERE id=:id";
	}
	protected java.lang.Integer getKey(DrawcontentS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "drawcontent_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

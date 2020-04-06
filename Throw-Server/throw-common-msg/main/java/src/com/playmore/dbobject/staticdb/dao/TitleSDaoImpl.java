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
import main.java.com.playmore.dbobject.staticdb.TitleS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TitleSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TitleS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TitleSDaoImpl DEFAULT = new	TitleSDaoImpl();
	public static TitleSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TitleS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String title = rs.getString("title");
		java.lang.Integer order = rs.getInt("order");
		java.lang.Integer stageNum = rs.getInt("stage_num");
		java.lang.Integer image = rs.getInt("image");
		java.lang.Integer condition = rs.getInt("condition");
		java.lang.Integer conditionValue1 = rs.getInt("condition_value1");
		java.lang.Integer conditionValue2 = rs.getInt("condition_value2");
		java.lang.Integer hangMonster = rs.getInt("hang_monster");
		TitleS instance = new TitleS();
		instance.setId(id);
		instance.setName(name);
		instance.setTitle(title);
		instance.setOrder(order);
		instance.setStageNum(stageNum);
		instance.setImage(image);
		instance.setCondition(condition);
		instance.setConditionValue1(conditionValue1);
		instance.setConditionValue2(conditionValue2);
		instance.setHangMonster(hangMonster);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO title_s (`id`,`name`,`title`,`order`,`stage_num`,`image`,`condition`,`condition_value1`,`condition_value2`,`hang_monster`) VALUES(:id,:name,:title,:order,:stageNum,:image,:condition,:conditionValue1,:conditionValue2,:hangMonster)";
	}
	protected String getUpdateSql() {
		return "UPDATE title_s SET `name`=:name,`title`=:title,`order`=:order,`stage_num`=:stageNum,`image`=:image,`condition`=:condition,`condition_value1`=:conditionValue1,`condition_value2`=:conditionValue2,`hang_monster`=:hangMonster WHERE id=:id";
	}
	protected java.lang.Integer getKey(TitleS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "title_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

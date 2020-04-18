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
import main.java.com.playmore.dbobject.staticdb.DrawS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DrawSDaoImpl extends SinglePrimaryKeyDBDaoImpl<DrawS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final DrawSDaoImpl DEFAULT = new	DrawSDaoImpl();
	public static DrawSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected DrawS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer order = rs.getInt("order");
		java.lang.Integer start = rs.getInt("start");
		java.lang.Integer end = rs.getInt("end");
		java.lang.Integer content = rs.getInt("content");
		java.lang.Integer least = rs.getInt("least");
		java.lang.Integer num = rs.getInt("num");
		java.lang.String costOne1 = rs.getString("cost_one_1");
		java.lang.String costOne2 = rs.getString("cost_one_2");
		java.lang.String costTen1 = rs.getString("cost_ten_1");
		java.lang.String costTen2 = rs.getString("cost_ten_2");
		java.lang.Integer accumulate = rs.getInt("accumulate");
		java.lang.Integer wish = rs.getInt("wish");
		java.lang.Integer probability = rs.getInt("probability");
		java.lang.String imagebg = rs.getString("imagebg");
		java.lang.String imagehero = rs.getString("imagehero");
		java.lang.String imagefont = rs.getString("imagefont");
		java.lang.Integer imageicon = rs.getInt("imageicon");
		java.lang.Integer firstLeast = rs.getInt("first_least");
		java.lang.Integer firstLeastNum = rs.getInt("first_least_num");
		DrawS instance = new DrawS();
		instance.setId(id);
		instance.setName(name);
		instance.setType(type);
		instance.setOrder(order);
		instance.setStart(start);
		instance.setEnd(end);
		instance.setContent(content);
		instance.setLeast(least);
		instance.setNum(num);
		instance.setCostOne1(costOne1);
		instance.setCostOne2(costOne2);
		instance.setCostTen1(costTen1);
		instance.setCostTen2(costTen2);
		instance.setAccumulate(accumulate);
		instance.setWish(wish);
		instance.setProbability(probability);
		instance.setImagebg(imagebg);
		instance.setImagehero(imagehero);
		instance.setImagefont(imagefont);
		instance.setImageicon(imageicon);
		instance.setFirstLeast(firstLeast);
		instance.setFirstLeastNum(firstLeastNum);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO draw_s (`id`,`name`,`type`,`order`,`start`,`end`,`content`,`least`,`num`,`cost_one_1`,`cost_one_2`,`cost_ten_1`,`cost_ten_2`,`accumulate`,`wish`,`probability`,`imagebg`,`imagehero`,`imagefont`,`imageicon`,`first_least`,`first_least_num`) VALUES(:id,:name,:type,:order,:start,:end,:content,:least,:num,:costOne1,:costOne2,:costTen1,:costTen2,:accumulate,:wish,:probability,:imagebg,:imagehero,:imagefont,:imageicon,:firstLeast,:firstLeastNum)";
	}
	protected String getUpdateSql() {
		return "UPDATE draw_s SET `name`=:name,`type`=:type,`order`=:order,`start`=:start,`end`=:end,`content`=:content,`least`=:least,`num`=:num,`cost_one_1`=:costOne1,`cost_one_2`=:costOne2,`cost_ten_1`=:costTen1,`cost_ten_2`=:costTen2,`accumulate`=:accumulate,`wish`=:wish,`probability`=:probability,`imagebg`=:imagebg,`imagehero`=:imagehero,`imagefont`=:imagefont,`imageicon`=:imageicon,`first_least`=:firstLeast,`first_least_num`=:firstLeastNum WHERE id=:id";
	}
	protected java.lang.Integer getKey(DrawS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "draw_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

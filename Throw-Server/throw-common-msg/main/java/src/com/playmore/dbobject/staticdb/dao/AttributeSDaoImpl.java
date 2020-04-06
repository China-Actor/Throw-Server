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
import main.java.com.playmore.dbobject.staticdb.AttributeS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AttributeSDaoImpl extends SinglePrimaryKeyDBDaoImpl<AttributeS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final AttributeSDaoImpl DEFAULT = new	AttributeSDaoImpl();
	public static AttributeSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected AttributeS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer quality1 = rs.getInt("quality1");
		java.lang.Integer quality2 = rs.getInt("quality2");
		java.lang.Integer quality3 = rs.getInt("quality3");
		java.lang.Integer quality4 = rs.getInt("quality4");
		java.lang.Integer quality5 = rs.getInt("quality5");
		java.lang.Integer quality6 = rs.getInt("quality6");
		java.lang.Integer quality7 = rs.getInt("quality7");
		java.lang.Integer quality8 = rs.getInt("quality8");
		java.lang.Integer quality9 = rs.getInt("quality9");
		java.lang.Integer quality10 = rs.getInt("quality10");
		java.lang.Integer quality11 = rs.getInt("quality11");
		java.lang.Integer quality12 = rs.getInt("quality12");
		java.lang.Integer quality13 = rs.getInt("quality13");
		java.lang.Integer quality14 = rs.getInt("quality14");
		java.lang.Integer quality15 = rs.getInt("quality15");
		AttributeS instance = new AttributeS();
		instance.setId(id);
		instance.setQuality1(quality1);
		instance.setQuality2(quality2);
		instance.setQuality3(quality3);
		instance.setQuality4(quality4);
		instance.setQuality5(quality5);
		instance.setQuality6(quality6);
		instance.setQuality7(quality7);
		instance.setQuality8(quality8);
		instance.setQuality9(quality9);
		instance.setQuality10(quality10);
		instance.setQuality11(quality11);
		instance.setQuality12(quality12);
		instance.setQuality13(quality13);
		instance.setQuality14(quality14);
		instance.setQuality15(quality15);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO attribute_s (`id`,`quality1`,`quality2`,`quality3`,`quality4`,`quality5`,`quality6`,`quality7`,`quality8`,`quality9`,`quality10`,`quality11`,`quality12`,`quality13`,`quality14`,`quality15`) VALUES(:id,:quality1,:quality2,:quality3,:quality4,:quality5,:quality6,:quality7,:quality8,:quality9,:quality10,:quality11,:quality12,:quality13,:quality14,:quality15)";
	}
	protected String getUpdateSql() {
		return "UPDATE attribute_s SET `quality1`=:quality1,`quality2`=:quality2,`quality3`=:quality3,`quality4`=:quality4,`quality5`=:quality5,`quality6`=:quality6,`quality7`=:quality7,`quality8`=:quality8,`quality9`=:quality9,`quality10`=:quality10,`quality11`=:quality11,`quality12`=:quality12,`quality13`=:quality13,`quality14`=:quality14,`quality15`=:quality15 WHERE id=:id";
	}
	protected java.lang.Integer getKey(AttributeS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "attribute_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

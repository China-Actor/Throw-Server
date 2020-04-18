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
import main.java.com.playmore.dbobject.staticdb.ArenarewardS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ArenarewardSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ArenarewardS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ArenarewardSDaoImpl DEFAULT = new	ArenarewardSDaoImpl();
	public static ArenarewardSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ArenarewardS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer region1 = rs.getInt("region1");
		java.lang.Integer region2 = rs.getInt("region2");
		java.lang.Integer reward1 = rs.getInt("reward1");
		java.lang.Integer reward2 = rs.getInt("reward2");
		ArenarewardS instance = new ArenarewardS();
		instance.setId(id);
		instance.setRegion1(region1);
		instance.setRegion2(region2);
		instance.setReward1(reward1);
		instance.setReward2(reward2);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO arenareward_s (`id`,`region1`,`region2`,`reward1`,`reward2`) VALUES(:id,:region1,:region2,:reward1,:reward2)";
	}
	protected String getUpdateSql() {
		return "UPDATE arenareward_s SET `region1`=:region1,`region2`=:region2,`reward1`=:reward1,`reward2`=:reward2 WHERE id=:id";
	}
	protected java.lang.Integer getKey(ArenarewardS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "arenareward_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

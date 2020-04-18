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
import main.java.com.playmore.dbobject.staticdb.ArenaS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ArenaSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ArenaS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ArenaSDaoImpl DEFAULT = new	ArenaSDaoImpl();
	public static ArenaSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ArenaS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer region1 = rs.getInt("region1");
		java.lang.Integer region2 = rs.getInt("region2");
		java.lang.Integer elo = rs.getInt("elo");
		java.lang.Integer winReward = rs.getInt("win_reward");
		java.lang.Integer inherit = rs.getInt("inherit");
		ArenaS instance = new ArenaS();
		instance.setId(id);
		instance.setRegion1(region1);
		instance.setRegion2(region2);
		instance.setElo(elo);
		instance.setWinReward(winReward);
		instance.setInherit(inherit);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO arena_s (`id`,`region1`,`region2`,`elo`,`win_reward`,`inherit`) VALUES(:id,:region1,:region2,:elo,:winReward,:inherit)";
	}
	protected String getUpdateSql() {
		return "UPDATE arena_s SET `region1`=:region1,`region2`=:region2,`elo`=:elo,`win_reward`=:winReward,`inherit`=:inherit WHERE id=:id";
	}
	protected java.lang.Integer getKey(ArenaS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "arena_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

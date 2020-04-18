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
import main.java.com.playmore.dbobject.staticdb.RewardlevelS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class RewardlevelSDaoImpl extends SinglePrimaryKeyDBDaoImpl<RewardlevelS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final RewardlevelSDaoImpl DEFAULT = new	RewardlevelSDaoImpl();
	public static RewardlevelSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected RewardlevelS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer singleQuailty = rs.getInt("single_quailty");
		java.lang.Integer singleNum = rs.getInt("single_num");
		java.lang.Integer teamQuailty = rs.getInt("team_quailty");
		java.lang.Integer teamNum = rs.getInt("team_num");
		java.lang.String taskQuality = rs.getString("task_quality");
		RewardlevelS instance = new RewardlevelS();
		instance.setId(id);
		instance.setSingleQuailty(singleQuailty);
		instance.setSingleNum(singleNum);
		instance.setTeamQuailty(teamQuailty);
		instance.setTeamNum(teamNum);
		instance.setTaskQuality(taskQuality);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO rewardlevel_s (`id`,`single_quailty`,`single_num`,`team_quailty`,`team_num`,`task_quality`) VALUES(:id,:singleQuailty,:singleNum,:teamQuailty,:teamNum,:taskQuality)";
	}
	protected String getUpdateSql() {
		return "UPDATE rewardlevel_s SET `single_quailty`=:singleQuailty,`single_num`=:singleNum,`team_quailty`=:teamQuailty,`team_num`=:teamNum,`task_quality`=:taskQuality WHERE id=:id";
	}
	protected java.lang.Integer getKey(RewardlevelS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "rewardlevel_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

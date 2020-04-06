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
import main.java.com.playmore.dbobject.staticdb.MazeGateS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeGateSDaoImpl extends SinglePrimaryKeyDBDaoImpl<MazeGateS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MazeGateSDaoImpl DEFAULT = new	MazeGateSDaoImpl();
	public static MazeGateSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MazeGateS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer eventGroup = rs.getInt("event_group");
		java.lang.Integer eventId = rs.getInt("event_id");
		java.lang.Integer percent = rs.getInt("percent");
		MazeGateS instance = new MazeGateS();
		instance.setId(id);
		instance.setEventGroup(eventGroup);
		instance.setEventId(eventId);
		instance.setPercent(percent);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO maze_gate_s (`id`,`event_group`,`event_id`,`percent`) VALUES(:id,:eventGroup,:eventId,:percent)";
	}
	protected String getUpdateSql() {
		return "UPDATE maze_gate_s SET `event_group`=:eventGroup,`event_id`=:eventId,`percent`=:percent WHERE id=:id";
	}
	protected java.lang.Integer getKey(MazeGateS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "maze_gate_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

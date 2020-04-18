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
import main.java.com.playmore.dbobject.staticdb.TimePeakEventS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TimePeakEventSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TimePeakEventS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TimePeakEventSDaoImpl DEFAULT = new	TimePeakEventSDaoImpl();
	public static TimePeakEventSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TimePeakEventS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer mapId = rs.getInt("map_id");
		java.lang.String controlName = rs.getString("control_name");
		java.lang.String eventInfo = rs.getString("event_info");
		java.lang.Integer eventType = rs.getInt("event_type");
		java.lang.Integer eventLog = rs.getInt("event_log");
		java.lang.Integer param1 = rs.getInt("param1");
		java.lang.Integer param2 = rs.getInt("param2");
		java.lang.Integer param3 = rs.getInt("param3");
		java.lang.Integer param4 = rs.getInt("param4");
		TimePeakEventS instance = new TimePeakEventS();
		instance.setId(id);
		instance.setMapId(mapId);
		instance.setControlName(controlName);
		instance.setEventInfo(eventInfo);
		instance.setEventType(eventType);
		instance.setEventLog(eventLog);
		instance.setParam1(param1);
		instance.setParam2(param2);
		instance.setParam3(param3);
		instance.setParam4(param4);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO time_peak_event_s (`id`,`map_id`,`control_name`,`event_info`,`event_type`,`event_log`,`param1`,`param2`,`param3`,`param4`) VALUES(:id,:mapId,:controlName,:eventInfo,:eventType,:eventLog,:param1,:param2,:param3,:param4)";
	}
	protected String getUpdateSql() {
		return "UPDATE time_peak_event_s SET `map_id`=:mapId,`control_name`=:controlName,`event_info`=:eventInfo,`event_type`=:eventType,`event_log`=:eventLog,`param1`=:param1,`param2`=:param2,`param3`=:param3,`param4`=:param4 WHERE id=:id";
	}
	protected java.lang.Integer getKey(TimePeakEventS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "time_peak_event_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

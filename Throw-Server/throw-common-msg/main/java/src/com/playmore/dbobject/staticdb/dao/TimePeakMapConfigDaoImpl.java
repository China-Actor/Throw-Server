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
import main.java.com.playmore.dbobject.staticdb.TimePeakMapConfig;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TimePeakMapConfigDaoImpl extends SinglePrimaryKeyDBDaoImpl<TimePeakMapConfig>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TimePeakMapConfigDaoImpl DEFAULT = new	TimePeakMapConfigDaoImpl();
	public static TimePeakMapConfigDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TimePeakMapConfig createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String mapText = rs.getString("map_text");
		TimePeakMapConfig instance = new TimePeakMapConfig();
		instance.setId(id);
		instance.setMapText(mapText);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO time_peak_map_config (`id`,`map_text`) VALUES(:id,:mapText)";
	}
	protected String getUpdateSql() {
		return "UPDATE time_peak_map_config SET `map_text`=:mapText WHERE id=:id";
	}
	protected java.lang.Integer getKey(TimePeakMapConfig t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "time_peak_map_config";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

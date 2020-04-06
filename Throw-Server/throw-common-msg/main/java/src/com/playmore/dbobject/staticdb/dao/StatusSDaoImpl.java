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
import main.java.com.playmore.dbobject.staticdb.StatusS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class StatusSDaoImpl extends SinglePrimaryKeyDBDaoImpl<StatusS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final StatusSDaoImpl DEFAULT = new	StatusSDaoImpl();
	public static StatusSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected StatusS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer show = rs.getInt("show");
		java.lang.Integer immuneControl = rs.getInt("immune_control");
		java.lang.Integer immuneHurt = rs.getInt("immune_hurt");
		StatusS instance = new StatusS();
		instance.setId(id);
		instance.setName(name);
		instance.setShow(show);
		instance.setImmuneControl(immuneControl);
		instance.setImmuneHurt(immuneHurt);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO status_s (`id`,`name`,`show`,`immune_control`,`immune_hurt`) VALUES(:id,:name,:show,:immuneControl,:immuneHurt)";
	}
	protected String getUpdateSql() {
		return "UPDATE status_s SET `name`=:name,`show`=:show,`immune_control`=:immuneControl,`immune_hurt`=:immuneHurt WHERE id=:id";
	}
	protected java.lang.Integer getKey(StatusS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "status_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

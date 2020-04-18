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
import main.java.com.playmore.dbobject.staticdb.CmdCodeS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class CmdCodeSDaoImpl extends SinglePrimaryKeyDBDaoImpl<CmdCodeS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final CmdCodeSDaoImpl DEFAULT = new	CmdCodeSDaoImpl();
	public static CmdCodeSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected CmdCodeS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.String id = rs.getString("id");
		java.lang.String c2s = rs.getString("c2s");
		java.lang.String c2sDesc = rs.getString("c2s_desc");
		java.lang.String s2c = rs.getString("s2c");
		java.lang.String s2cDesc = rs.getString("s2c_desc");
		CmdCodeS instance = new CmdCodeS();
		instance.setId(id);
		instance.setC2s(c2s);
		instance.setC2sDesc(c2sDesc);
		instance.setS2c(s2c);
		instance.setS2cDesc(s2cDesc);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO cmd_code_s (`id`,`c2s`,`c2s_desc`,`s2c`,`s2c_desc`) VALUES(:id,:c2s,:c2sDesc,:s2c,:s2cDesc)";
	}
	protected String getUpdateSql() {
		return "UPDATE cmd_code_s SET `c2s`=:c2s,`c2s_desc`=:c2sDesc,`s2c`=:s2c,`s2c_desc`=:s2cDesc WHERE id=:id";
	}
	protected java.lang.String getKey(CmdCodeS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "cmd_code_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

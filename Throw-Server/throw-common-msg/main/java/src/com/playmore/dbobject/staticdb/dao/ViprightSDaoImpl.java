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
import main.java.com.playmore.dbobject.staticdb.ViprightS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ViprightSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ViprightS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ViprightSDaoImpl DEFAULT = new	ViprightSDaoImpl();
	public static ViprightSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ViprightS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer vipright = rs.getInt("vipright");
		java.lang.String desc = rs.getString("desc");
		java.lang.Integer vip0value = rs.getInt("vip0value");
		java.lang.Integer vip1value = rs.getInt("vip1value");
		java.lang.Integer vip2value = rs.getInt("vip2value");
		java.lang.Integer vip3value = rs.getInt("vip3value");
		java.lang.Integer vip4value = rs.getInt("vip4value");
		java.lang.Integer vip5value = rs.getInt("vip5value");
		java.lang.Integer vip6value = rs.getInt("vip6value");
		java.lang.Integer vip7value = rs.getInt("vip7value");
		java.lang.Integer vip8value = rs.getInt("vip8value");
		java.lang.Integer vip9value = rs.getInt("vip9value");
		java.lang.Integer vip10value = rs.getInt("vip10value");
		java.lang.Integer vip11value = rs.getInt("vip11value");
		java.lang.Integer vip12value = rs.getInt("vip12value");
		java.lang.Integer vip13value = rs.getInt("vip13value");
		java.lang.Integer vip14value = rs.getInt("vip14value");
		java.lang.Integer vip15value = rs.getInt("vip15value");
		ViprightS instance = new ViprightS();
		instance.setId(id);
		instance.setVipright(vipright);
		instance.setDesc(desc);
		instance.setVip0value(vip0value);
		instance.setVip1value(vip1value);
		instance.setVip2value(vip2value);
		instance.setVip3value(vip3value);
		instance.setVip4value(vip4value);
		instance.setVip5value(vip5value);
		instance.setVip6value(vip6value);
		instance.setVip7value(vip7value);
		instance.setVip8value(vip8value);
		instance.setVip9value(vip9value);
		instance.setVip10value(vip10value);
		instance.setVip11value(vip11value);
		instance.setVip12value(vip12value);
		instance.setVip13value(vip13value);
		instance.setVip14value(vip14value);
		instance.setVip15value(vip15value);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO vipright_s (`id`,`vipright`,`desc`,`vip0value`,`vip1value`,`vip2value`,`vip3value`,`vip4value`,`vip5value`,`vip6value`,`vip7value`,`vip8value`,`vip9value`,`vip10value`,`vip11value`,`vip12value`,`vip13value`,`vip14value`,`vip15value`) VALUES(:id,:vipright,:desc,:vip0value,:vip1value,:vip2value,:vip3value,:vip4value,:vip5value,:vip6value,:vip7value,:vip8value,:vip9value,:vip10value,:vip11value,:vip12value,:vip13value,:vip14value,:vip15value)";
	}
	protected String getUpdateSql() {
		return "UPDATE vipright_s SET `vipright`=:vipright,`desc`=:desc,`vip0value`=:vip0value,`vip1value`=:vip1value,`vip2value`=:vip2value,`vip3value`=:vip3value,`vip4value`=:vip4value,`vip5value`=:vip5value,`vip6value`=:vip6value,`vip7value`=:vip7value,`vip8value`=:vip8value,`vip9value`=:vip9value,`vip10value`=:vip10value,`vip11value`=:vip11value,`vip12value`=:vip12value,`vip13value`=:vip13value,`vip14value`=:vip14value,`vip15value`=:vip15value WHERE id=:id";
	}
	protected java.lang.Integer getKey(ViprightS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "vipright_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

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
import main.java.com.playmore.dbobject.staticdb.TaskBoxS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TaskBoxSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TaskBoxS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TaskBoxSDaoImpl DEFAULT = new	TaskBoxSDaoImpl();
	public static TaskBoxSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TaskBoxS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer stage = rs.getInt("stage");
		java.lang.Integer type1 = rs.getInt("type1");
		java.lang.Integer value1 = rs.getInt("value1");
		java.lang.Integer size1 = rs.getInt("size1");
		java.lang.Integer type2 = rs.getInt("type2");
		java.lang.Integer value2 = rs.getInt("value2");
		java.lang.Integer size2 = rs.getInt("size2");
		java.lang.Integer type3 = rs.getInt("type3");
		java.lang.Integer value3 = rs.getInt("value3");
		java.lang.Integer size3 = rs.getInt("size3");
		TaskBoxS instance = new TaskBoxS();
		instance.setId(id);
		instance.setType(type);
		instance.setStage(stage);
		instance.setType1(type1);
		instance.setValue1(value1);
		instance.setSize1(size1);
		instance.setType2(type2);
		instance.setValue2(value2);
		instance.setSize2(size2);
		instance.setType3(type3);
		instance.setValue3(value3);
		instance.setSize3(size3);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO task_box_s (`id`,`type`,`stage`,`type1`,`value1`,`size1`,`type2`,`value2`,`size2`,`type3`,`value3`,`size3`) VALUES(:id,:type,:stage,:type1,:value1,:size1,:type2,:value2,:size2,:type3,:value3,:size3)";
	}
	protected String getUpdateSql() {
		return "UPDATE task_box_s SET `type`=:type,`stage`=:stage,`type1`=:type1,`value1`=:value1,`size1`=:size1,`type2`=:type2,`value2`=:value2,`size2`=:size2,`type3`=:type3,`value3`=:value3,`size3`=:size3 WHERE id=:id";
	}
	protected java.lang.Integer getKey(TaskBoxS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "task_box_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

package com.playmore.dbobject.staticdb.dao;

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
import com.playmore.dbobject.staticdb.TaskS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TaskSDaoImpl extends SinglePrimaryKeyDBDaoImpl<TaskS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final TaskSDaoImpl DEFAULT = new	TaskSDaoImpl();
	public static TaskSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected TaskS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer type = rs.getInt("type");
		java.lang.Integer sort = rs.getInt("sort");
		java.lang.Integer tasktype = rs.getInt("tasktype");
		java.lang.Integer taskgroup = rs.getInt("taskgroup");
		java.lang.Integer groupsort = rs.getInt("groupsort");
		java.lang.String title = rs.getString("title");
		java.lang.String desc = rs.getString("desc");
		java.lang.Integer taskprogress = rs.getInt("taskprogress");
		java.lang.Integer value1 = rs.getInt("value1");
		java.lang.Integer value2 = rs.getInt("value2");
		java.lang.Integer value3 = rs.getInt("value3");
		java.lang.Integer dropid = rs.getInt("dropid");
		java.lang.Integer taskactivity = rs.getInt("taskactivity");
		java.lang.Integer systemid = rs.getInt("systemid");
		java.lang.Integer systemvalue = rs.getInt("systemvalue");
		java.lang.Integer unlock = rs.getInt("unlock");
		TaskS instance = new TaskS();
		instance.setId(id);
		instance.setType(type);
		instance.setSort(sort);
		instance.setTasktype(tasktype);
		instance.setTaskgroup(taskgroup);
		instance.setGroupsort(groupsort);
		instance.setTitle(title);
		instance.setDesc(desc);
		instance.setTaskprogress(taskprogress);
		instance.setValue1(value1);
		instance.setValue2(value2);
		instance.setValue3(value3);
		instance.setDropid(dropid);
		instance.setTaskactivity(taskactivity);
		instance.setSystemid(systemid);
		instance.setSystemvalue(systemvalue);
		instance.setUnlock(unlock);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO task_s (`id`,`type`,`sort`,`tasktype`,`taskgroup`,`groupsort`,`title`,`desc`,`taskprogress`,`value1`,`value2`,`value3`,`dropid`,`taskactivity`,`systemid`,`systemvalue`,`unlock`) VALUES(:id,:type,:sort,:tasktype,:taskgroup,:groupsort,:title,:desc,:taskprogress,:value1,:value2,:value3,:dropid,:taskactivity,:systemid,:systemvalue,:unlock)";
	}
	protected String getUpdateSql() {
		return "UPDATE task_s SET `type`=:type,`sort`=:sort,`tasktype`=:tasktype,`taskgroup`=:taskgroup,`groupsort`=:groupsort,`title`=:title,`desc`=:desc,`taskprogress`=:taskprogress,`value1`=:value1,`value2`=:value2,`value3`=:value3,`dropid`=:dropid,`taskactivity`=:taskactivity,`systemid`=:systemid,`systemvalue`=:systemvalue,`unlock`=:unlock WHERE id=:id";
	}
	protected java.lang.Integer getKey(TaskS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "task_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}

package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TaskBoxS;
import com.playmore.dbobject.staticdb.dao.TaskBoxSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import com.playmore.annotation.DataSource;
import com.playmore.opsconfig.DataSourceNames;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class TaskBoxSManager extends AbstractManager<java.lang.Integer,TaskBoxS> {

	@Autowired
	TaskBoxSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TaskBoxS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TaskBoxS t) {
		return t.getId();
	}
}

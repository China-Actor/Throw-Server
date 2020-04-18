package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TaskS;
import com.playmore.dbobject.staticdb.dao.TaskSDaoImpl;
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
public class TaskSManager extends AbstractManager<java.lang.Integer,TaskS> {

	@Autowired
	TaskSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TaskS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TaskS t) {
		return t.getId();
	}
}

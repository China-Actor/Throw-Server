package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.SystemS;
import com.playmore.dbobject.staticdb.dao.SystemSDaoImpl;
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
public class SystemSManager extends AbstractManager<java.lang.Integer,SystemS> {

	@Autowired
	SystemSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<SystemS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(SystemS t) {
		return t.getId();
	}
}

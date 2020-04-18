package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.StatusS;
import com.playmore.dbobject.staticdb.dao.StatusSDaoImpl;
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
public class StatusSManager extends AbstractManager<java.lang.Integer,StatusS> {

	@Autowired
	StatusSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<StatusS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(StatusS t) {
		return t.getId();
	}
}

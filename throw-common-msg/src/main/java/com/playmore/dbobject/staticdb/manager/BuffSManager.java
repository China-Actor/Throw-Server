package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.BuffS;
import com.playmore.dbobject.staticdb.dao.BuffSDaoImpl;
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
public class BuffSManager extends AbstractManager<java.lang.Integer,BuffS> {

	@Autowired
	BuffSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<BuffS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(BuffS t) {
		return t.getId();
	}
}

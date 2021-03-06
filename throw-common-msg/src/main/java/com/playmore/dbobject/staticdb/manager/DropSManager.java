package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.DropS;
import com.playmore.dbobject.staticdb.dao.DropSDaoImpl;
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
public class DropSManager extends AbstractManager<java.lang.Integer,DropS> {

	@Autowired
	DropSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<DropS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(DropS t) {
		return t.getId();
	}
}

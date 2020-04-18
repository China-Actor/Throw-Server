package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ArenaS;
import com.playmore.dbobject.staticdb.dao.ArenaSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;

import javax.annotation.PostConstruct;

import com.playmore.annotation.DataSource;
import com.playmore.opsconfig.DataSourceNames;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ArenaSManager extends AbstractManager<java.lang.Integer,ArenaS> {

	@Autowired
	ArenaSDaoImpl daoImpl;

	@Override 
	public void load() {
	}
	
	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	
	@Override
	public Collection<ArenaS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArenaS t) {
		return t.getId();
	}
}

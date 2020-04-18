package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TowerS;
import com.playmore.dbobject.staticdb.dao.TowerSDaoImpl;
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
public class TowerSManager extends AbstractManager<java.lang.Integer,TowerS> {

	@Autowired
	TowerSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TowerS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TowerS t) {
		return t.getId();
	}
}

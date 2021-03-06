package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ShieldS;
import com.playmore.dbobject.staticdb.dao.ShieldSDaoImpl;
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
public class ShieldSManager extends AbstractManager<java.lang.Integer,ShieldS> {

	@Autowired
	ShieldSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<ShieldS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ShieldS t) {
		return t.getId();
	}
}

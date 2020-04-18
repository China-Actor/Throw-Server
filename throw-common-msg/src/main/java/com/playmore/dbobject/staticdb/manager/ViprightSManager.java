package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ViprightS;
import com.playmore.dbobject.staticdb.dao.ViprightSDaoImpl;
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
public class ViprightSManager extends AbstractManager<java.lang.Integer,ViprightS> {

	@Autowired
	ViprightSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<ViprightS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ViprightS t) {
		return t.getId();
	}
}

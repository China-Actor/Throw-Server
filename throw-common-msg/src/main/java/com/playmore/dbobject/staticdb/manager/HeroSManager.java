package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.HeroS;
import com.playmore.dbobject.staticdb.dao.HeroSDaoImpl;
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
public class HeroSManager extends AbstractManager<java.lang.Integer,HeroS> {

	@Autowired
	HeroSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<HeroS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(HeroS t) {
		return t.getId();
	}
}

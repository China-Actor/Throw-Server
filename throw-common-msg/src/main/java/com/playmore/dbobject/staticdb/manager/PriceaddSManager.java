package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.PriceaddS;
import com.playmore.dbobject.staticdb.dao.PriceaddSDaoImpl;
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
public class PriceaddSManager extends AbstractManager<java.lang.Integer,PriceaddS> {

	@Autowired
	PriceaddSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<PriceaddS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(PriceaddS t) {
		return t.getId();
	}
}

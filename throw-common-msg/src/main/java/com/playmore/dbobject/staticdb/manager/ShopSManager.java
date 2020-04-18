package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ShopS;
import com.playmore.dbobject.staticdb.dao.ShopSDaoImpl;
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
public class ShopSManager extends AbstractManager<java.lang.Integer,ShopS> {

	@Autowired
	ShopSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<ShopS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ShopS t) {
		return t.getId();
	}
}

package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.AttributeS;
import com.playmore.dbobject.staticdb.dao.AttributeSDaoImpl;
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
public class AttributeSManager extends AbstractManager<java.lang.Integer,AttributeS> {

	@Autowired
	AttributeSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<AttributeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(AttributeS t) {
		return t.getId();
	}
}

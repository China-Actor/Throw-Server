package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ParamS;
import com.playmore.dbobject.staticdb.dao.ParamSDaoImpl;
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
public class ParamSManager extends AbstractManager<java.lang.Integer,ParamS> {

	@Autowired
	ParamSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<ParamS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ParamS t) {
		return t.getId();
	}
}

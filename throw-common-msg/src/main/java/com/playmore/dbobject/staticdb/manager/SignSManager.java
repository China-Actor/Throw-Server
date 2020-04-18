package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.SignS;
import com.playmore.dbobject.staticdb.dao.SignSDaoImpl;
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
public class SignSManager extends AbstractManager<java.lang.Integer,SignS> {

	@Autowired
	SignSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<SignS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(SignS t) {
		return t.getId();
	}
}

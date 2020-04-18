package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.SensitiveWordS;
import com.playmore.dbobject.staticdb.dao.SensitiveWordSDaoImpl;
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
public class SensitiveWordSManager extends AbstractManager<java.lang.Integer,SensitiveWordS> {

	@Autowired
	SensitiveWordSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<SensitiveWordS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(SensitiveWordS t) {
		return t.getId();
	}
}

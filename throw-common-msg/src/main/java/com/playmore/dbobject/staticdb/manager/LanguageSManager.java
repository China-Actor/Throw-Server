package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.LanguageS;
import com.playmore.dbobject.staticdb.dao.LanguageSDaoImpl;
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
public class LanguageSManager extends AbstractManager<java.lang.Integer,LanguageS> {

	@Autowired
	LanguageSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<LanguageS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(LanguageS t) {
		return t.getId();
	}
}

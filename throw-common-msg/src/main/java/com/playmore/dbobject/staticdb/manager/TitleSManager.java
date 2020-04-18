package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TitleS;
import com.playmore.dbobject.staticdb.dao.TitleSDaoImpl;
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
public class TitleSManager extends AbstractManager<java.lang.Integer,TitleS> {

	@Autowired
	TitleSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TitleS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TitleS t) {
		return t.getId();
	}
}

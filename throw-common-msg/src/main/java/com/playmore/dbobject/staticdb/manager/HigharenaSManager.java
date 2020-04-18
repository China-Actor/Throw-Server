package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.HigharenaS;
import com.playmore.dbobject.staticdb.dao.HigharenaSDaoImpl;
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
public class HigharenaSManager extends AbstractManager<java.lang.Integer,HigharenaS> {

	@Autowired
	HigharenaSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<HigharenaS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(HigharenaS t) {
		return t.getId();
	}
}

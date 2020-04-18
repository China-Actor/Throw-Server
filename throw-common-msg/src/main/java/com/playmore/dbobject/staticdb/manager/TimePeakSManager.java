package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TimePeakS;
import com.playmore.dbobject.staticdb.dao.TimePeakSDaoImpl;
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
public class TimePeakSManager extends AbstractManager<java.lang.Integer,TimePeakS> {

	@Autowired
	TimePeakSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TimePeakS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TimePeakS t) {
		return t.getId();
	}
}

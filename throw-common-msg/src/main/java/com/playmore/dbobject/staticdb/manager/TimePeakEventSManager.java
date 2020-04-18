package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TimePeakEventS;
import com.playmore.dbobject.staticdb.dao.TimePeakEventSDaoImpl;
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
public class TimePeakEventSManager extends AbstractManager<java.lang.Integer,TimePeakEventS> {

	@Autowired
	TimePeakEventSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TimePeakEventS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TimePeakEventS t) {
		return t.getId();
	}
}

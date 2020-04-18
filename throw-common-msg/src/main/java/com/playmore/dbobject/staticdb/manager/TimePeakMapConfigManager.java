package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TimePeakMapConfig;
import com.playmore.dbobject.staticdb.dao.TimePeakMapConfigDaoImpl;
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
public class TimePeakMapConfigManager extends AbstractManager<java.lang.Integer,TimePeakMapConfig> {

	@Autowired
	TimePeakMapConfigDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TimePeakMapConfig> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TimePeakMapConfig t) {
		return t.getId();
	}
}

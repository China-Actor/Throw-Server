package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TimePeakMapConfig;
import com.playmore.dbobject.staticdb.dao.TimePeakMapConfigDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class TimePeakMapConfigManager extends AbstractManager<java.lang.Integer,TimePeakMapConfig> {

	@Autowired
	TimePeakMapConfigDaoImpl daoImpl;

	private TimePeakMapConfigManager(){
	}
	private static final TimePeakMapConfigManager DEFAULT = new	TimePeakMapConfigManager();
	public static TimePeakMapConfigManager getDefault() {
		return DEFAULT;
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

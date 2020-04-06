package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.TimePeakMapConfig;
import com.playmore.dbobject.staticdb.dao.TimePeakMapConfigDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TimePeakMapConfigManager extends AbstractManager<java.lang.Integer,TimePeakMapConfig> {

	private TimePeakMapConfigManager(){
	}
	private static final TimePeakMapConfigManager DEFAULT = new	TimePeakMapConfigManager();
	public static TimePeakMapConfigManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TimePeakMapConfig> queryAllFromDb() {
		return TimePeakMapConfigDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TimePeakMapConfig t) {
		return t.getId();
	}
}

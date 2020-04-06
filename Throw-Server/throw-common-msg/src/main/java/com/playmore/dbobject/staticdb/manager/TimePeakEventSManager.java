package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TimePeakEventS;
import com.playmore.dbobject.staticdb.dao.TimePeakEventSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class TimePeakEventSManager extends AbstractManager<java.lang.Integer,TimePeakEventS> {

	@Autowired
	TimePeakEventSDaoImpl daoImpl;

	private TimePeakEventSManager(){
	}
	private static final TimePeakEventSManager DEFAULT = new	TimePeakEventSManager();
	public static TimePeakEventSManager getDefault() {
		return DEFAULT;
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

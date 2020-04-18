package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.TimePeakEventS;
import main.java.com.playmore.dbobject.staticdb.dao.TimePeakEventSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TimePeakEventSManager extends AbstractManager<java.lang.Integer,TimePeakEventS> {

	private TimePeakEventSManager(){
	}
	private static final TimePeakEventSManager DEFAULT = new	TimePeakEventSManager();
	public static TimePeakEventSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TimePeakEventS> queryAllFromDb() {
		return TimePeakEventSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TimePeakEventS t) {
		return t.getId();
	}
}

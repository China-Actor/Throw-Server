package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.TimePeakS;
import main.java.com.playmore.dbobject.staticdb.dao.TimePeakSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TimePeakSManager extends AbstractManager<java.lang.Integer,TimePeakS> {

	private TimePeakSManager(){
	}
	private static final TimePeakSManager DEFAULT = new	TimePeakSManager();
	public static TimePeakSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TimePeakS> queryAllFromDb() {
		return TimePeakSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TimePeakS t) {
		return t.getId();
	}
}

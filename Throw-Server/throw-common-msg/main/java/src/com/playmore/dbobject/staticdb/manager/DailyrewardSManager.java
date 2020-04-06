package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.DailyrewardS;
import main.java.com.playmore.dbobject.staticdb.dao.DailyrewardSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class DailyrewardSManager extends AbstractManager<java.lang.Integer,DailyrewardS> {

	private DailyrewardSManager(){
	}
	private static final DailyrewardSManager DEFAULT = new	DailyrewardSManager();
	public static DailyrewardSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DailyrewardS> queryAllFromDb() {
		return DailyrewardSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(DailyrewardS t) {
		return t.getId();
	}
}

package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.SystemS;
import main.java.com.playmore.dbobject.staticdb.dao.SystemSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class SystemSManager extends AbstractManager<java.lang.Integer,SystemS> {

	private SystemSManager(){
	}
	private static final SystemSManager DEFAULT = new	SystemSManager();
	public static SystemSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SystemS> queryAllFromDb() {
		return SystemSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(SystemS t) {
		return t.getId();
	}
}

package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.BuffS;
import main.java.com.playmore.dbobject.staticdb.dao.BuffSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class BuffSManager extends AbstractManager<java.lang.Integer,BuffS> {

	private BuffSManager(){
	}
	private static final BuffSManager DEFAULT = new	BuffSManager();
	public static BuffSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<BuffS> queryAllFromDb() {
		return BuffSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(BuffS t) {
		return t.getId();
	}
}

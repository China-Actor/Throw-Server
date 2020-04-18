package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.TowerS;
import main.java.com.playmore.dbobject.staticdb.dao.TowerSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TowerSManager extends AbstractManager<java.lang.Integer,TowerS> {

	private TowerSManager(){
	}
	private static final TowerSManager DEFAULT = new	TowerSManager();
	public static TowerSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TowerS> queryAllFromDb() {
		return TowerSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TowerS t) {
		return t.getId();
	}
}

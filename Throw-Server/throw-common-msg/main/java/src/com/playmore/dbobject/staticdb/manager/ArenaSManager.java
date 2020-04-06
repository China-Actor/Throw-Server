package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ArenaS;
import main.java.com.playmore.dbobject.staticdb.dao.ArenaSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ArenaSManager extends AbstractManager<java.lang.Integer,ArenaS> {

	private ArenaSManager(){
	}
	private static final ArenaSManager DEFAULT = new	ArenaSManager();
	public static ArenaSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ArenaS> queryAllFromDb() {
		return ArenaSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArenaS t) {
		return t.getId();
	}
}

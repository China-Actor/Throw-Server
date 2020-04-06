package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.PriceaddS;
import main.java.com.playmore.dbobject.staticdb.dao.PriceaddSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class PriceaddSManager extends AbstractManager<java.lang.Integer,PriceaddS> {

	private PriceaddSManager(){
	}
	private static final PriceaddSManager DEFAULT = new	PriceaddSManager();
	public static PriceaddSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<PriceaddS> queryAllFromDb() {
		return PriceaddSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(PriceaddS t) {
		return t.getId();
	}
}

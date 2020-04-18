package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.SummonedS;
import main.java.com.playmore.dbobject.staticdb.dao.SummonedSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class SummonedSManager extends AbstractManager<java.lang.Integer,SummonedS> {

	private SummonedSManager(){
	}
	private static final SummonedSManager DEFAULT = new	SummonedSManager();
	public static SummonedSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SummonedS> queryAllFromDb() {
		return SummonedSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(SummonedS t) {
		return t.getId();
	}
}

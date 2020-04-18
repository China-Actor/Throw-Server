package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ArenarewardS;
import main.java.com.playmore.dbobject.staticdb.dao.ArenarewardSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ArenarewardSManager extends AbstractManager<java.lang.Integer,ArenarewardS> {

	private ArenarewardSManager(){
	}
	private static final ArenarewardSManager DEFAULT = new	ArenarewardSManager();
	public static ArenarewardSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ArenarewardS> queryAllFromDb() {
		return ArenarewardSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArenarewardS t) {
		return t.getId();
	}
}

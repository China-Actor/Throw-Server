package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.WishS;
import main.java.com.playmore.dbobject.staticdb.dao.WishSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class WishSManager extends AbstractManager<java.lang.Integer,WishS> {

	private WishSManager(){
	}
	private static final WishSManager DEFAULT = new	WishSManager();
	public static WishSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<WishS> queryAllFromDb() {
		return WishSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(WishS t) {
		return t.getId();
	}
}

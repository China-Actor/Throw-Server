package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ShopS;
import main.java.com.playmore.dbobject.staticdb.dao.ShopSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ShopSManager extends AbstractManager<java.lang.Integer,ShopS> {

	private ShopSManager(){
	}
	private static final ShopSManager DEFAULT = new	ShopSManager();
	public static ShopSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ShopS> queryAllFromDb() {
		return ShopSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ShopS t) {
		return t.getId();
	}
}

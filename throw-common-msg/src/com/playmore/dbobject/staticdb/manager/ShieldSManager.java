package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.ShieldS;
import com.playmore.dbobject.staticdb.dao.ShieldSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ShieldSManager extends AbstractManager<java.lang.Integer,ShieldS> {

	private ShieldSManager(){
	}
	private static final ShieldSManager DEFAULT = new	ShieldSManager();
	public static ShieldSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ShieldS> queryAllFromDb() {
		return ShieldSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ShieldS t) {
		return t.getId();
	}
}

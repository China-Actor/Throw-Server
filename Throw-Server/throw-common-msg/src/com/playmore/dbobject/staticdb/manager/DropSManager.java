package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.DropS;
import com.playmore.dbobject.staticdb.dao.DropSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class DropSManager extends AbstractManager<java.lang.Integer,DropS> {

	private DropSManager(){
	}
	private static final DropSManager DEFAULT = new	DropSManager();
	public static DropSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DropS> queryAllFromDb() {
		return DropSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(DropS t) {
		return t.getId();
	}
}

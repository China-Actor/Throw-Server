package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.DiamondS;
import com.playmore.dbobject.staticdb.dao.DiamondSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class DiamondSManager extends AbstractManager<java.lang.Integer,DiamondS> {

	private DiamondSManager(){
	}
	private static final DiamondSManager DEFAULT = new	DiamondSManager();
	public static DiamondSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DiamondS> queryAllFromDb() {
		return DiamondSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(DiamondS t) {
		return t.getId();
	}
}

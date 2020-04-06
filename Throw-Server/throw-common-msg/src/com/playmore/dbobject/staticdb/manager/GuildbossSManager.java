package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.GuildbossS;
import com.playmore.dbobject.staticdb.dao.GuildbossSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GuildbossSManager extends AbstractManager<java.lang.Integer,GuildbossS> {

	private GuildbossSManager(){
	}
	private static final GuildbossSManager DEFAULT = new	GuildbossSManager();
	public static GuildbossSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildbossS> queryAllFromDb() {
		return GuildbossSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildbossS t) {
		return t.getId();
	}
}

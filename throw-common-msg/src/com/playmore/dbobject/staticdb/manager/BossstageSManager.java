package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.BossstageS;
import com.playmore.dbobject.staticdb.dao.BossstageSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class BossstageSManager extends AbstractManager<java.lang.Integer,BossstageS> {

	private BossstageSManager(){
	}
	private static final BossstageSManager DEFAULT = new	BossstageSManager();
	public static BossstageSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<BossstageS> queryAllFromDb() {
		return BossstageSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(BossstageS t) {
		return t.getId();
	}
}

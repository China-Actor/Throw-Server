package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.LevelS;
import com.playmore.dbobject.staticdb.dao.LevelSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class LevelSManager extends AbstractManager<java.lang.Integer,LevelS> {

	private LevelSManager(){
	}
	private static final LevelSManager DEFAULT = new	LevelSManager();
	public static LevelSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<LevelS> queryAllFromDb() {
		return LevelSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(LevelS t) {
		return t.getId();
	}
}

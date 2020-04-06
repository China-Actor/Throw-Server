package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.StageS;
import com.playmore.dbobject.staticdb.dao.StageSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class StageSManager extends AbstractManager<java.lang.Integer,StageS> {

	private StageSManager(){
	}
	private static final StageSManager DEFAULT = new	StageSManager();
	public static StageSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<StageS> queryAllFromDb() {
		return StageSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(StageS t) {
		return t.getId();
	}
}

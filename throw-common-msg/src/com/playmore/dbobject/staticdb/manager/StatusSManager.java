package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.StatusS;
import com.playmore.dbobject.staticdb.dao.StatusSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class StatusSManager extends AbstractManager<java.lang.Integer,StatusS> {

	private StatusSManager(){
	}
	private static final StatusSManager DEFAULT = new	StatusSManager();
	public static StatusSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<StatusS> queryAllFromDb() {
		return StatusSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(StatusS t) {
		return t.getId();
	}
}

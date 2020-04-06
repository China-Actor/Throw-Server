package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.CopymasterS;
import com.playmore.dbobject.staticdb.dao.CopymasterSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class CopymasterSManager extends AbstractManager<java.lang.Integer,CopymasterS> {

	private CopymasterSManager(){
	}
	private static final CopymasterSManager DEFAULT = new	CopymasterSManager();
	public static CopymasterSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<CopymasterS> queryAllFromDb() {
		return CopymasterSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(CopymasterS t) {
		return t.getId();
	}
}

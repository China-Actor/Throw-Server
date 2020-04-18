package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.SignS;
import com.playmore.dbobject.staticdb.dao.SignSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class SignSManager extends AbstractManager<java.lang.Integer,SignS> {

	private SignSManager(){
	}
	private static final SignSManager DEFAULT = new	SignSManager();
	public static SignSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SignS> queryAllFromDb() {
		return SignSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(SignS t) {
		return t.getId();
	}
}

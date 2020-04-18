package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.AttributeS;
import com.playmore.dbobject.staticdb.dao.AttributeSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class AttributeSManager extends AbstractManager<java.lang.Integer,AttributeS> {

	private AttributeSManager(){
	}
	private static final AttributeSManager DEFAULT = new	AttributeSManager();
	public static AttributeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<AttributeS> queryAllFromDb() {
		return AttributeSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(AttributeS t) {
		return t.getId();
	}
}

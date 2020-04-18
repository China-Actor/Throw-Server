package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.GoodsS;
import com.playmore.dbobject.staticdb.dao.GoodsSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GoodsSManager extends AbstractManager<java.lang.Integer,GoodsS> {

	private GoodsSManager(){
	}
	private static final GoodsSManager DEFAULT = new	GoodsSManager();
	public static GoodsSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GoodsS> queryAllFromDb() {
		return GoodsSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GoodsS t) {
		return t.getId();
	}
}

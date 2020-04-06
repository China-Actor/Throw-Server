package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.ItemS;
import com.playmore.dbobject.staticdb.dao.ItemSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ItemSManager extends AbstractManager<java.lang.Integer,ItemS> {

	private ItemSManager(){
	}
	private static final ItemSManager DEFAULT = new	ItemSManager();
	public static ItemSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ItemS> queryAllFromDb() {
		return ItemSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ItemS t) {
		return t.getId();
	}
}

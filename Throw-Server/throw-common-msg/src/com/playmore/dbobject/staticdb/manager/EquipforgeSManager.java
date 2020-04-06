package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.EquipforgeS;
import com.playmore.dbobject.staticdb.dao.EquipforgeSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class EquipforgeSManager extends AbstractManager<java.lang.Integer,EquipforgeS> {

	private EquipforgeSManager(){
	}
	private static final EquipforgeSManager DEFAULT = new	EquipforgeSManager();
	public static EquipforgeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<EquipforgeS> queryAllFromDb() {
		return EquipforgeSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(EquipforgeS t) {
		return t.getId();
	}
}

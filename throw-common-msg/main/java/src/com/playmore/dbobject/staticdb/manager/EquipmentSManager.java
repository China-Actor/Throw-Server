package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.EquipmentS;
import main.java.com.playmore.dbobject.staticdb.dao.EquipmentSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class EquipmentSManager extends AbstractManager<java.lang.Integer,EquipmentS> {

	private EquipmentSManager(){
	}
	private static final EquipmentSManager DEFAULT = new	EquipmentSManager();
	public static EquipmentSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<EquipmentS> queryAllFromDb() {
		return EquipmentSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(EquipmentS t) {
		return t.getId();
	}
}
